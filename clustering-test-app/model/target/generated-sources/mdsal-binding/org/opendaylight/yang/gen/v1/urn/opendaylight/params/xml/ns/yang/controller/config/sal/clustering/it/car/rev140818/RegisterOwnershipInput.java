package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.rev140818;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>car</b>
 * <pre>
 * input {
 *   leaf car-id {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>car/register-ownership/input</i>
 *
 * <p>To create instances of this class use {@link RegisterOwnershipInputBuilder}.
 * @see RegisterOwnershipInputBuilder
 *
 */
public interface RegisterOwnershipInput
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.rev140818.RegisterOwnershipInput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:config:sal-clustering-it:car",
        "2014-08-18", "input").intern();

    /**
     * @return <code>java.lang.String</code> <code>carId</code>, or <code>null</code> if not present
     */
    java.lang.String getCarId();

}

