package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.rev140818;
import java.util.concurrent.Future;
import javax.annotation.CheckReturnValue;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.rev140818.RegisterOwnershipInput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.rev140818.StopStressTestOutput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.rev140818.StressTestInput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.rev140818.UnregisterOwnershipInput;
import org.opendaylight.yangtools.yang.binding.RpcService;
import org.opendaylight.yangtools.yang.common.RpcResult;

/**
 * Interface for implementing the following YANG RPCs defined in module <b>car</b>
 * <pre>
 * rpc register-ownership {
 *   input {
 *     leaf car-id {
 *       type string;
 *     }
 *   }
 *   output;
 * }
 * rpc unregister-commit-cohort {
 *   input;
 *   output;
 * }
 * rpc stop-stress-test {
 *   output {
 *     leaf success-count {
 *       type uint32;
 *       default 0;
 *     }
 *     leaf failure-count {
 *       type uint32;
 *       default 0;
 *     }
 *   }
 *   input;
 * }
 * rpc register-logging-dtcl {
 *   input;
 *   output;
 * }
 * rpc register-commit-cohort {
 *   input;
 *   output;
 * }
 * rpc unregister-logging-dtcls {
 *   input;
 *   output;
 * }
 * rpc stress-test {
 *   input {
 *     leaf rate {
 *       type uint16;
 *     }
 *     leaf count {
 *       type uint32;
 *       default 0;
 *     }
 *   }
 *   output;
 * }
 * rpc unregister-ownership {
 *   input {
 *     leaf car-id {
 *       type string;
 *     }
 *   }
 *   output;
 * }
 * </pre>
 *
 */
public interface CarService
    extends
    RpcService
{




    @CheckReturnValue
    Future<RpcResult<java.lang.Void>> registerOwnership(RegisterOwnershipInput input);
    
    /**
     * Unregisters the sample commit cohort.
     *
     */
    @CheckReturnValue
    Future<RpcResult<java.lang.Void>> unregisterCommitCohort();
    
    @CheckReturnValue
    Future<RpcResult<StopStressTestOutput>> stopStressTest();
    
    /**
     * Registers a basic logging DTCL on the cars container. This is useful for 
     * analyzing the effects of DTCL on a long, flat list.
     *
     */
    @CheckReturnValue
    Future<RpcResult<java.lang.Void>> registerLoggingDtcl();
    
    /**
     * Registers a sample commit cohort that validates car entry input.
     *
     */
    @CheckReturnValue
    Future<RpcResult<java.lang.Void>> registerCommitCohort();
    
    /**
     * Unregisters the logging DTCL(s) for the cars container.
     *
     */
    @CheckReturnValue
    Future<RpcResult<java.lang.Void>> unregisterLoggingDtcls();
    
    @CheckReturnValue
    Future<RpcResult<java.lang.Void>> stressTest(StressTestInput input);
    
    @CheckReturnValue
    Future<RpcResult<java.lang.Void>> unregisterOwnership(UnregisterOwnershipInput input);

}

