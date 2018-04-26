package org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>odl-mdsal-lowlevel-control</b>
 * <pre>
 * grouping transactions-result {
 *   leaf all-tx {
 *     type int64;
 *   }
 *   leaf insert-tx {
 *     type int64;
 *   }
 *   leaf delete-tx {
 *     type int64;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>odl-mdsal-lowlevel-control/transactions-result</i>
 *
 */
public interface TransactionsResult
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("tag:opendaylight.org,2017:controller:yang:lowlevel:control",
        "2017-02-15", "transactions-result").intern();

    /**
     * Number of all transactions executed.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>allTx</code>, or <code>null</code> if not present
     */
    java.lang.Long getAllTx();
    
    /**
     * Number of transactions that inserted data.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>insertTx</code>, or <code>null</code> if not present
     */
    java.lang.Long getInsertTx();
    
    /**
     * Number of transactions that deleted data.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>deleteTx</code>, or <code>null</code> if not present
     */
    java.lang.Long getDeleteTx();

}

