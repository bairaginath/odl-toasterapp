package org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>odl-mdsal-lowlevel-control</b>
 * <pre>
 * output {
 *   leaf flap-count {
 *     type int64;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>odl-mdsal-lowlevel-control/unregister-flapping-singleton/output</i>
 *
 * <p>To create instances of this class use {@link UnregisterFlappingSingletonOutputBuilder}.
 * @see UnregisterFlappingSingletonOutputBuilder
 *
 */
public interface UnregisterFlappingSingletonOutput
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.UnregisterFlappingSingletonOutput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("tag:opendaylight.org,2017:controller:yang:lowlevel:control",
        "2017-02-15", "output").intern();

    /**
     * Number of successful re-registrations. If negative,(minus) cycle number when a 
     * failure occured.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>flapCount</code>, or <code>null</code> if not present
     */
    java.lang.Long getFlapCount();

}

