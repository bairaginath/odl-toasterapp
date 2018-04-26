package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.people.rev140818.people;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.people.rev140818.People;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.people.rev140818.people.PersonKey;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * A list of people (as defined by the 'grouping person').
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>people</b>
 * <pre>
 * list person {
 *   key id;
 *   uses person;
 * }
 * </pre>The schema path to identify an instance is
 * <i>people/people/person</i>
 *
 * <p>To create instances of this class use {@link PersonBuilder}.
 * @see PersonBuilder
 * @see PersonKey
 *
 */
public interface Person
    extends
    ChildOf<People>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.people.rev140818.people.Person>,
    org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.people.rev140818.Person,
    Identifiable<PersonKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:config:sal-clustering-it:people",
        "2014-08-18", "person").intern();

    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.people.rev140818.people.PersonKey</code> <code>key</code>, or <code>null</code> if not present
     */
    PersonKey getKey();

}

