package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.people.rev140818;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.people.rev140818.CarPeopleData;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.people.rev140818.car.people.CarPerson;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Top-level container for all people car map
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>car-people</b>
 * <pre>
 * container car-people {
 *   list car-person {
 *     key "car-id person-id";
 *     leaf car-id {
 *       type c:car-id;
 *     }
 *     leaf person-id {
 *       type people:person-id;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>car-people/car-people</i>
 *
 * <p>To create instances of this class use {@link CarPeopleBuilder}.
 * @see CarPeopleBuilder
 *
 */
public interface CarPeople
    extends
    ChildOf<CarPeopleData>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.people.rev140818.CarPeople>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:config:sal-clustering-it:car-people",
        "2014-08-18", "car-people").intern();

    /**
     * A mapping of cars and people.
     *
     *
     *
     * @return <code>java.util.List</code> <code>carPerson</code>, or <code>null</code> if not present
     */
    List<CarPerson> getCarPerson();

}

