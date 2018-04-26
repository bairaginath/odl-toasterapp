package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.people.rev140818;
import java.util.concurrent.Future;
import javax.annotation.CheckReturnValue;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.people.rev140818.AddPersonInput;
import org.opendaylight.yangtools.yang.binding.RpcService;
import org.opendaylight.yangtools.yang.common.RpcResult;

/**
 * Interface for implementing the following YANG RPCs defined in module <b>people</b>
 * <pre>
 * rpc add-person {
 *   input {
 *     uses person;
 *   }
 *   output;
 * }
 * </pre>
 *
 */
public interface PeopleService
    extends
    RpcService
{




    /**
     * Add a person entry into database
     *
     */
    @CheckReturnValue
    Future<RpcResult<java.lang.Void>> addPerson(AddPersonInput input);

}

