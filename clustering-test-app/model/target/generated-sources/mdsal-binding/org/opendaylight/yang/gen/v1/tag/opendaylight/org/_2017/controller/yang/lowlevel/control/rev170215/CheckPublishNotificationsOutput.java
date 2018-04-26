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
 *   leaf active {
 *     type boolean;
 *   }
 *   leaf publish-count {
 *     mandatory false;
 *     type int64;
 *   }
 *   leaf last-error {
 *     mandatory false;
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>odl-mdsal-lowlevel-control/check-publish-notifications/output</i>
 *
 * <p>To create instances of this class use {@link CheckPublishNotificationsOutputBuilder}.
 * @see CheckPublishNotificationsOutputBuilder
 *
 */
public interface CheckPublishNotificationsOutput
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.CheckPublishNotificationsOutput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("tag:opendaylight.org,2017:controller:yang:lowlevel:control",
        "2017-02-15", "output").intern();

    /**
     * True if a publishing task for this id is running, false otherwise.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>active</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isActive();
    
    /**
     * How many notifications were published for this id since last start.If there was 
     * no start-publish-notifications call for this id, this leaf is absent.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>publishCount</code>, or <code>null</code> if not present
     */
    java.lang.Long getPublishCount();
    
    /**
     * If no task has been started by start-publish-notifications for this id,or if the
     * last such call has not encountered an error, this leaf is absent.Otherwise it 
     * contains a string message from the last error, including stacktrace if possible.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>lastError</code>, or <code>null</code> if not present
     */
    java.lang.String getLastError();

}

