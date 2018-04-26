package org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.target.rev170215.id.ints.id._int;
import org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.target.rev170215.id.ints.IdInt;
import org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.target.rev170215.id.ints.id._int.ItemKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Unsorted keyed list item. One write should create or delete up to one item.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>odl-mdsal-lowlevel-target</b>
 * <pre>
 * list item {
 *   key number;
 *   leaf number {
 *     type int32;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>odl-mdsal-lowlevel-target/id-ints/id-int/item</i>
 *
 * <p>To create instances of this class use {@link ItemBuilder}.
 * @see ItemBuilder
 * @see ItemKey
 *
 */
public interface Item
    extends
    ChildOf<IdInt>,
    Augmentable<org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.target.rev170215.id.ints.id._int.Item>,
    Identifiable<ItemKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("tag:opendaylight.org,2017:controller:yang:lowlevel:target",
        "2017-02-15", "item").intern();

    /**
     * The integer value of this item.Not range restricted, to allow more scenarios.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>number</code>, or <code>null</code> if not present
     */
    java.lang.Integer getNumber();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.target.rev170215.id.ints.id._int.ItemKey</code> <code>key</code>, or <code>null</code> if not present
     */
    ItemKey getKey();

}

