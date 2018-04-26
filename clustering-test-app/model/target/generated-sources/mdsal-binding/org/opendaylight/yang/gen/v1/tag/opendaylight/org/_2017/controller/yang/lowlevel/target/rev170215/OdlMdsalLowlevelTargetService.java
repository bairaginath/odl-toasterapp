package org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.target.rev170215;
import java.util.concurrent.Future;
import javax.annotation.CheckReturnValue;
import org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.target.rev170215.GetConstantOutput;
import org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.target.rev170215.GetContextedConstantInput;
import org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.target.rev170215.GetContextedConstantOutput;
import org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.target.rev170215.GetSingletonConstantOutput;
import org.opendaylight.yangtools.yang.binding.RpcService;
import org.opendaylight.yangtools.yang.common.RpcResult;

/**
 * Interface for implementing the following YANG RPCs defined in module <b>odl-mdsal-lowlevel-target</b>
 * <pre>
 * rpc get-constant {
 *   output {
 *     uses llc:constant-grouping;
 *   }
 *   input;
 * }
 * rpc get-singleton-constant {
 *   output {
 *     uses llc:constant-grouping;
 *   }
 *   input;
 * }
 * rpc get-contexted-constant {
 *   input {
 *     uses llc:context-grouping;
 *   }
 *   output {
 *     uses llc:constant-grouping;
 *   }
 * }
 * </pre>
 *
 */
public interface OdlMdsalLowlevelTargetService
    extends
    RpcService
{




    /**
     * Return the constant string provided by the previously registered 
     * implementation.Propagate appropriate error if no, unreachable, or failing 
     * implementation is found.
     *
     *
     *
     * @return <code>java.util.concurrent.Future</code> <code>constant</code>, or <code>null</code> if not present
     */
    @CheckReturnValue
    Future<RpcResult<GetConstantOutput>> getConstant();
    
    /**
     * Return the constant string provided by the previously registered 
     * implementation.Propagate appropriate error if no, unreachable, or failing 
     * implementation is found.This is basically the same as get-constant, but it can 
     * have a differentimplementation registered, thus allowing to track both 
     * implementations in longevity jobs.
     *
     *
     *
     * @return <code>java.util.concurrent.Future</code> <code>singletonConstant</code>, or <code>null</code> if not present
     */
    @CheckReturnValue
    Future<RpcResult<GetSingletonConstantOutput>> getSingletonConstant();
    
    /**
     * Return the constant corresponding to a registered implementation (either bound 
     * or default).Propagate appropriate error if no, unreachable, or failing 
     * implementation is found.
     *
     *
     *
     * @return <code>java.util.concurrent.Future</code> <code>contextedConstant</code>, or <code>null</code> if not present
     */
    @CheckReturnValue
    Future<RpcResult<GetContextedConstantOutput>> getContextedConstant(GetContextedConstantInput input);

}

