package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.rev140818;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>car</b>
 * <pre>
 * output {
 *   leaf success-count {
 *     type uint32;
 *     default 0;
 *   }
 *   leaf failure-count {
 *     type uint32;
 *     default 0;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>car/stop-stress-test/output</i>
 *
 * <p>To create instances of this class use {@link StopStressTestOutputBuilder}.
 * @see StopStressTestOutputBuilder
 *
 */
public interface StopStressTestOutput
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.rev140818.StopStressTestOutput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:config:sal-clustering-it:car",
        "2014-08-18", "output").intern();

    /**
     * Total number of cars created when running stess-test rpc
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>successCount</code>, or <code>null</code> if not present
     */
    java.lang.Long getSuccessCount();
    
    /**
     * Total number of cars failed when running stess-test rpc
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>failureCount</code>, or <code>null</code> if not present
     */
    java.lang.Long getFailureCount();

}

