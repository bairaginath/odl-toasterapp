package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.rev140818;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.rev140818.CarData;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.rev140818.cars.CarEntry;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Top-level container for all car objects.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>car</b>
 * <pre>
 * container cars {
 *   list car-entry {
 *     key id;
 *     uses car-entry;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>car/cars</i>
 *
 * <p>To create instances of this class use {@link CarsBuilder}.
 * @see CarsBuilder
 *
 */
public interface Cars
    extends
    ChildOf<CarData>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.rev140818.Cars>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:config:sal-clustering-it:car",
        "2014-08-18", "cars").intern();

    /**
     * A list of cars (as defined by the 'grouping car-entry').
     *
     *
     *
     * @return <code>java.util.List</code> <code>carEntry</code>, or <code>null</code> if not present
     */
    List<CarEntry> getCarEntry();

}

