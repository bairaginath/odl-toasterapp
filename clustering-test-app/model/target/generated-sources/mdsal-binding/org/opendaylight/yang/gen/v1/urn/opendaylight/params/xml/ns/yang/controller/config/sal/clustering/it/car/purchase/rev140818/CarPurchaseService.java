package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.purchase.rev140818;
import java.util.concurrent.Future;
import javax.annotation.CheckReturnValue;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.purchase.rev140818.BuyCarInput;
import org.opendaylight.yangtools.yang.binding.RpcService;
import org.opendaylight.yangtools.yang.common.RpcResult;

/**
 * Interface for implementing the following YANG RPCs defined in module <b>car-purchase</b>
 * <pre>
 * rpc buy-car {
 *   input {
 *     leaf person {
 *       ext:context-reference person:person-context;
 *       type person:person-ref;
 *     }
 *     leaf car-id {
 *       type car:car-id;
 *     }
 *     leaf person-id {
 *       type person:person-id;
 *     }
 *   }
 *   output;
 * }
 * </pre>
 *
 */
public interface CarPurchaseService
    extends
    RpcService
{




    /**
     * buy a new car
     *
     */
    @CheckReturnValue
    Future<RpcResult<java.lang.Void>> buyCar(BuyCarInput input);

}

