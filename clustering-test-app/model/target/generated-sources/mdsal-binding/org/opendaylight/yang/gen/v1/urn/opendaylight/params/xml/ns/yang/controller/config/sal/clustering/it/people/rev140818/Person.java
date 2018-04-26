package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.people.rev140818;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.people.rev140818.PersonId;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Describes the details of the person
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>people</b>
 * <pre>
 * grouping person {
 *   leaf id {
 *     type person-id;
 *   }
 *   leaf gender {
 *     type string;
 *   }
 *   leaf age {
 *     type uint32;
 *   }
 *   leaf address {
 *     type string;
 *   }
 *   leaf contactNo {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>people/person</i>
 *
 */
public interface Person
    extends
    DataObject
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:config:sal-clustering-it:people",
        "2014-08-18", "person").intern();

    /**
     * identifier of single list of entries.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.people.rev140818.PersonId</code> <code>id</code>, or <code>null</code> if not present
     */
    PersonId getId();
    
    /**
     * @return <code>java.lang.String</code> <code>gender</code>, or <code>null</code> if not present
     */
    java.lang.String getGender();
    
    /**
     * @return <code>java.lang.Long</code> <code>age</code>, or <code>null</code> if not present
     */
    java.lang.Long getAge();
    
    /**
     * @return <code>java.lang.String</code> <code>address</code>, or <code>null</code> if not present
     */
    java.lang.String getAddress();
    
    /**
     * @return <code>java.lang.String</code> <code>contactNo</code>, or <code>null</code> if not present
     */
    java.lang.String getContactNo();

}

