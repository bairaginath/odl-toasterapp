package org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215;
import org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.common.rev170215.IdGrouping;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>odl-mdsal-lowlevel-control</b>
 * <pre>
 * input {
 *   uses llc:id-grouping;
 *   leaf seconds {
 *     type uint32;
 *   }
 *   leaf notifications-per-second {
 *     type uint32;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>odl-mdsal-lowlevel-control/start-publish-notifications/input</i>
 *
 * <p>To create instances of this class use {@link StartPublishNotificationsInputBuilder}.
 * @see StartPublishNotificationsInputBuilder
 *
 */
public interface StartPublishNotificationsInput
    extends
    IdGrouping,
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.StartPublishNotificationsInput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("tag:opendaylight.org,2017:controller:yang:lowlevel:control",
        "2017-02-15", "input").intern();

    /**
     * This RPC has to work (roughly) this long.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>seconds</code>, or <code>null</code> if not present
     */
    java.lang.Long getSeconds();
    
    /**
     * An upper limit of publishes per second this RPC shall try to achieve.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>notificationsPerSecond</code>, or <code>null</code> if not present
     */
    java.lang.Long getNotificationsPerSecond();

}

