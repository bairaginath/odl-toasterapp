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
 *   leaf all-not {
 *     type int64;
 *   }
 *   leaf id-not {
 *     type int64;
 *   }
 *   leaf err-not {
 *     type int64;
 *   }
 *   leaf local-number {
 *     type int64;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>odl-mdsal-lowlevel-control/unsubscribe-ynl/output</i>
 *
 * <p>To create instances of this class use {@link UnsubscribeYnlOutputBuilder}.
 * @see UnsubscribeYnlOutputBuilder
 *
 */
public interface UnsubscribeYnlOutput
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.UnsubscribeYnlOutput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("tag:opendaylight.org,2017:controller:yang:lowlevel:control",
        "2017-02-15", "output").intern();

    /**
     * Number of received id-sequence notifications of any id.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>allNot</code>, or <code>null</code> if not present
     */
    java.lang.Long getAllNot();
    
    /**
     * Number of received id-sequence notifications of matching idand any sequence 
     * number.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>idNot</code>, or <code>null</code> if not present
     */
    java.lang.Long getIdNot();
    
    /**
     * Number of received id-sequence notifications of matching id,but out-of-order 
     * sequence number.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>errNot</code>, or <code>null</code> if not present
     */
    java.lang.Long getErrNot();
    
    /**
     * Value of the local number, should be equal tothe sequence number of the last 
     * compatible id-sequence notification received.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>localNumber</code>, or <code>null</code> if not present
     */
    java.lang.Long getLocalNumber();

}

