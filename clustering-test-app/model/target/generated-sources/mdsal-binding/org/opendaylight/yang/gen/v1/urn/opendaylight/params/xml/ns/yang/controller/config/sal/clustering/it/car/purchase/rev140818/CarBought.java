package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.purchase.rev140818;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.rev140818.CarId;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.people.rev140818.PersonId;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Notification;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Indicates that a person bought a car.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>car-purchase</b>
 * <pre>
 * notification carBought {
 *   leaf car-id {
 *     type car:car-id;
 *   }
 *   leaf person-id {
 *     type person:person-id;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>car-purchase/carBought</i>
 *
 * <p>To create instances of this class use {@link CarBoughtBuilder}.
 * @see CarBoughtBuilder
 *
 */
public interface CarBought
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.purchase.rev140818.CarBought>,
    Notification
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:config:sal-clustering-it:car-purchase",
        "2014-08-18", "carBought").intern();

    /**
     * identifier of car.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.rev140818.CarId</code> <code>carId</code>, or <code>null</code> if not present
     */
    CarId getCarId();
    
    /**
     * identifier of person.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.people.rev140818.PersonId</code> <code>personId</code>, or <code>null</code> if not present
     */
    PersonId getPersonId();

}

