package org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.target.rev170215.id.ints;
import java.util.List;
import org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.common.rev170215.IdGrouping;
import org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.target.rev170215.IdInts;
import org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.target.rev170215.id.ints.IdIntKey;
import org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.target.rev170215.id.ints.id._int.Item;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * A list of integers nested in list of ids.Ids are there to avoid 
 * OptimisticLockFailures from different writers.Typical use of the int list is to 
 * generate data change notifications.Config is true, in order to allow Restconf 
 * reset content at will.Expected writes should create and delete items at random, 
 * values 0 .. 2^20.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>odl-mdsal-lowlevel-target</b>
 * <pre>
 * list id-int {
 *   key id;
 *   uses llc:id-grouping;
 *   list item {
 *     key number;
 *     leaf number {
 *       type int32;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>odl-mdsal-lowlevel-target/id-ints/id-int</i>
 *
 * <p>To create instances of this class use {@link IdIntBuilder}.
 * @see IdIntBuilder
 * @see IdIntKey
 *
 */
public interface IdInt
    extends
    ChildOf<IdInts>,
    Augmentable<org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.target.rev170215.id.ints.IdInt>,
    IdGrouping,
    Identifiable<IdIntKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("tag:opendaylight.org,2017:controller:yang:lowlevel:target",
        "2017-02-15", "id-int").intern();

    /**
     * Unsorted keyed list item. One write should create or delete up to one item.
     *
     *
     *
     * @return <code>java.util.List</code> <code>item</code>, or <code>null</code> if not present
     */
    List<Item> getItem();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.target.rev170215.id.ints.IdIntKey</code> <code>key</code>, or <code>null</code> if not present
     */
    IdIntKey getKey();

}

