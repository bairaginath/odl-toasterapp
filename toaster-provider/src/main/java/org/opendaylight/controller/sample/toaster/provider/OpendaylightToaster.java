/*
 * Copyright (c) 2014 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.controller.sample.toaster.provider;

import static org.opendaylight.controller.md.sal.common.api.data.LogicalDatastoreType.OPERATIONAL;
import static org.opendaylight.yangtools.yang.common.RpcError.ErrorType.APPLICATION;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

import org.opendaylight.controller.md.sal.binding.api.DataBroker;
import org.opendaylight.controller.md.sal.binding.api.ReadWriteTransaction;
import org.opendaylight.controller.md.sal.binding.api.WriteTransaction;
import org.opendaylight.controller.md.sal.common.api.data.OptimisticLockFailedException;
import org.opendaylight.controller.md.sal.common.api.data.TransactionCommitFailedException;
import org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.DisplayString;
import org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.MakeToastInput;
import org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.Toaster;
import org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.Toaster.ToasterStatus;
import org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.ToasterBuilder;
import org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.ToasterService;
//import org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.ToasterOutOfBreadBuilder;

import org.opendaylight.yangtools.yang.binding.InstanceIdentifier;
import org.opendaylight.yangtools.yang.common.RpcError;
import org.opendaylight.yangtools.yang.common.RpcError.ErrorType;
import org.opendaylight.yangtools.yang.common.RpcResult;
import org.opendaylight.yangtools.yang.common.RpcResultBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Function;
import com.google.common.base.Optional;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;




public class OpendaylightToaster implements ToasterService, AutoCloseable {
	  
	   private static final InstanceIdentifier<Toaster> TOASTER_IID = InstanceIdentifier.builder(Toaster.class).build();
	   private static final DisplayString TOASTER_MANUFACTURER = new DisplayString("Opendaylight");
	   private static final DisplayString TOASTER_MODEL_NUMBER = new DisplayString("Model 1 - Binding Aware");
	    
	   private static final Logger LOG = LoggerFactory.getLogger(OpendaylightToaster.class);
	   private DataBroker dataBroker;
	   
	   private final AtomicReference<Future<?>> currentMakeToastTask = new AtomicReference<>();
	   private final AtomicLong amountOfBreadInStock = new AtomicLong(100);
	    private final AtomicLong toastsMade = new AtomicLong(0);
	    private final AtomicLong darknessFactor = new AtomicLong(1000);
	   public OpendaylightToaster() {
	   }
	   
	   
	   
	   public void setDataBroker(final DataBroker dataBroker) {
	       this.dataBroker = dataBroker;
	   }
	  
	   public void init() {
	       setToasterStatusUp(null);
	   }
	 
	   /**
	    * Implemented from the AutoCloseable interface.
	    */
	   @Override
	   public void close() {
	       if (dataBroker != null) {
	           WriteTransaction tx = dataBroker.newWriteOnlyTransaction();
	           tx.delete(OPERATIONAL,TOASTER_IID);
	           Futures.addCallback(tx.submit(), new FutureCallback<Void>() {
	               @Override
	               public void onSuccess( final Void result ) {
	                   LOG.debug("Delete Toaster commit result: " + result);
	               }
	 
	               @Override
	               public void onFailure( final Throwable failure) {
	                   LOG.error("Delete of Toaster failed", failure);
	               }
	           } );
	       }
	   }
	   
	   private Toaster buildToaster( ToasterStatus status ) {
	       // note - we are simulating a device whose manufacture and model are
	       // fixed (embedded) into the hardware.
	       // This is why the manufacture and model number are hardcoded.
	       return new ToasterBuilder().setToasterManufacturer(TOASTER_MANUFACTURER).setToasterModelNumber(TOASTER_MODEL_NUMBER)
	               .setToasterStatus( status ).build();
	   }
	 
	   private void setToasterStatusUp( final Function<Boolean,Void> resultCallback ) {
	       WriteTransaction tx = dataBroker.newWriteOnlyTransaction();
	       tx.put(OPERATIONAL,TOASTER_IID, buildToaster(ToasterStatus.Up));

	       Futures.addCallback(tx.submit(), new FutureCallback<Void>() {
	           @Override
	           public void onSuccess(final Void result) {
	               notifyCallback(true);
	           }

	           @Override
	           public void onFailure(final Throwable failure) {
	               // We shouldn't get an OptimisticLockFailedException (or any ex) as no
	               // other component should be updating the operational state.
	               LOG.error("Failed to update toaster status", failure);

	               notifyCallback(false);
	           }

	           void notifyCallback(final boolean result) {
	               if (resultCallback != null) {
	                   resultCallback.apply(result);
	               }
	           }
	       });
	   }

	@Override
	public Future<RpcResult<Void>> makeToast(MakeToastInput input) {
		final SettableFuture<RpcResult<Void>> futureResult = SettableFuture.create();

	       //checkStatusAndMakeToast(input, futureResult, toasterAppConfig.getMaxMakeToastTries());
	       checkStatusAndMakeToast(input, futureResult,5);

	       return futureResult;
	}

	@Override
	public Future<RpcResult<Void>> cancelToast() {
		Future<?> current = currentMakeToastTask.getAndSet(null);
	       if (current != null) {
	           current.cancel(true);
	       }

	       // Always return success from the cancel toast call
	       return Futures.immediateFuture(RpcResultBuilder.<Void> success().build());
	}
	
	
	private void checkStatusAndMakeToast(final MakeToastInput input, final SettableFuture<RpcResult<Void>> futureResult,
            final int tries) {
        // Read the ToasterStatus and, if currently Up, try to write the status to Down.
        // If that succeeds, then we essentially have an exclusive lock and can proceed
        // to make toast.
        final ReadWriteTransaction tx = dataBroker.newReadWriteTransaction();
        ListenableFuture<Optional<Toaster>> readFuture = tx.read(OPERATIONAL, TOASTER_IID);

        final ListenableFuture<Void> commitFuture =
            Futures.transformAsync(readFuture, toasterData -> {
                ToasterStatus toasterStatus = ToasterStatus.Up;
                if (toasterData.isPresent()) {
                    toasterStatus = toasterData.get().getToasterStatus();
                }

                LOG.debug("Read toaster status: {}", toasterStatus);

                if (toasterStatus == ToasterStatus.Up) {

                    if (outOfBread()) {
                        LOG.debug("Toaster is out of bread");
                        return Futures.immediateFailedCheckedFuture(
                                new TransactionCommitFailedException("", makeToasterOutOfBreadError()));
                    }

                    LOG.debug("Setting Toaster status to Down");

                    // We're not currently making toast - try to update the status to Down
                    // to indicate we're going to make toast. This acts as a lock to prevent
                    // concurrent toasting.
                    tx.put(OPERATIONAL, TOASTER_IID, buildToaster(ToasterStatus.Down));
                    return tx.submit();
                }

                LOG.debug("Oops - already making toast!");

                // Return an error since we are already making toast. This will get
                // propagated to the commitFuture below which will interpret the null
                // TransactionStatus in the RpcResult as an error condition.
                return Futures.immediateFailedCheckedFuture(
                        new TransactionCommitFailedException("", makeToasterInUseError()));
            });

        Futures.addCallback(commitFuture, new FutureCallback<Void>() {
            @Override
            public void onSuccess(final Void result) {
                // OK to make toast
                //currentMakeToastTask.set(executor.submit(new MakeToastTask(input, futureResult)));
            }

            @Override
            public void onFailure(final Throwable ex) {
                if (ex instanceof OptimisticLockFailedException) {

                    // Another thread is likely trying to make toast simultaneously and updated the
                    // status before us. Try reading the status again - if another make toast is
                    // now in progress, we should get ToasterStatus.Down and fail.

                    if (tries - 1 > 0) {
                        LOG.debug("Got OptimisticLockFailedException - trying again");
                        checkStatusAndMakeToast(input, futureResult, tries - 1);
                    } else {
                        futureResult.set(RpcResultBuilder.<Void>failed()
                                .withError(ErrorType.APPLICATION, ex.getMessage()).build());
                    }
                } else if (ex instanceof TransactionCommitFailedException) {
                    LOG.debug("Failed to commit Toaster status", ex);

                    // Probably already making toast.
                    futureResult.set(RpcResultBuilder.<Void>failed()
                            .withRpcErrors(((TransactionCommitFailedException)ex).getErrorList()).build());
                } else {
                    LOG.debug("Unexpected error committing Toaster status", ex);
                    futureResult.set(RpcResultBuilder.<Void>failed().withError(ErrorType.APPLICATION,
                            "Unexpected error committing Toaster status", ex).build());
                }
            }
        });
    }
	
	private boolean outOfBread() {
        return amountOfBreadInStock.get() == 0;
    }
	
	private RpcError makeToasterOutOfBreadError() {
        return RpcResultBuilder.newError(APPLICATION, "resource-denied", "Toaster is out of bread", "out-of-stock",
                null, null);
    }
	
	private RpcError makeToasterInUseError() {
        return RpcResultBuilder.newWarning(APPLICATION, "in-use", "Toaster is busy", null, null, null);
    }
	
	
	
	
	
	
}

	  
	