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
 *   leaf aborted {
 *     type boolean;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>odl-mdsal-lowlevel-control/is-client-aborted/output</i>
 *
 * <p>To create instances of this class use {@link IsClientAbortedOutputBuilder}.
 * @see IsClientAbortedOutputBuilder
 *
 */
public interface IsClientAbortedOutput
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.IsClientAbortedOutput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("tag:opendaylight.org,2017:controller:yang:lowlevel:control",
        "2017-02-15", "output").intern();

    /**
     * True if the local client is aborted (or unreachable), false otherwise.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>aborted</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isAborted();

}

