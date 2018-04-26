package org.opendaylight.yang.gen.v1.urn.opendaylight.controller.basic.rpc.test.rev160120;
import java.util.concurrent.Future;
import javax.annotation.CheckReturnValue;
import org.opendaylight.yangtools.yang.binding.RpcService;
import org.opendaylight.yangtools.yang.common.RpcResult;

/**
 * Interface for implementing the following YANG RPCs defined in module <b>basic-rpc-test</b>
 * <pre>
 * rpc basic-global {
 *   input;
 *   output;
 * }
 * </pre>
 *
 */
public interface BasicRpcTestService
    extends
    RpcService
{




    /**
     * Invoke a global rpc that should only have one implementation registered on one 
     * of the nodes.It has no input/output.
     *
     */
    @CheckReturnValue
    Future<RpcResult<java.lang.Void>> basicGlobal();

}

