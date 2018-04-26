package org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.common.rev170215;
import org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.common.rev170215.OdlMdsalLowlevelCommonData;
import org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.common.rev170215.RpcContextKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Routed RPCs need to be registered with a path.It has to be an 
 * instance-identifier within an accessible model,but the instance does not have 
 * be present in data tree.This is config false to signal users they do not need 
 * create any instance.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>odl-mdsal-lowlevel-common</b>
 * <pre>
 * list rpc-context {
 *   config false;
 *   key identifier;
 *   leaf identifier {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>odl-mdsal-lowlevel-common/rpc-context</i>
 *
 * <p>To create instances of this class use {@link RpcContextBuilder}.
 * @see RpcContextBuilder
 * @see RpcContextKey
 *
 */
public interface RpcContext
    extends
    ChildOf<OdlMdsalLowlevelCommonData>,
    Augmentable<org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.common.rev170215.RpcContext>,
    Identifiable<RpcContextKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("tag:opendaylight.org,2017:controller:yang:lowlevel:common",
        "2017-02-15", "rpc-context").intern();

    /**
     * Users are free to refer to arbitrary stringsif they are testing RPC regstrations
     * to different paths.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>identifier</code>, or <code>null</code> if not present
     */
    java.lang.String getIdentifier();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.common.rev170215.RpcContextKey</code> <code>key</code>, or <code>null</code> if not present
     */
    RpcContextKey getKey();

}

