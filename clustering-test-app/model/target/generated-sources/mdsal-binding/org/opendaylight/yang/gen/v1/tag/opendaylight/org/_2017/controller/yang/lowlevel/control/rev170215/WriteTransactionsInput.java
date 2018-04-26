package org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215;
import org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.common.rev170215.IdGrouping;
import org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.TransactionsParams;
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
 *   uses transactions-params;
 *   leaf chained-transactions {
 *     type boolean;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>odl-mdsal-lowlevel-control/write-transactions/input</i>
 *
 * <p>To create instances of this class use {@link WriteTransactionsInputBuilder}.
 * @see WriteTransactionsInputBuilder
 *
 */
public interface WriteTransactionsInput
    extends
    TransactionsParams,
    IdGrouping,
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.WriteTransactionsInput>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("tag:opendaylight.org,2017:controller:yang:lowlevel:control",
        "2017-02-15", "input").intern();

    /**
     * If true, write transactions shall be created on a transaction chain,(created at 
     * start of the RPC call, and deleted at at its end).If false, write transactions 
     * shall be created separately.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>chainedTransactions</code>, or <code>null</code> if not present
     */
    java.lang.Boolean isChainedTransactions();

}

