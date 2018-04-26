package org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.target.rev170215.id.ints;
import com.google.common.base.MoreObjects;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.target.rev170215.id.ints.IdInt;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class IdIntKey
 implements Identifier<IdInt> {
    private static final long serialVersionUID = -4008468233213511294L;
    private final java.lang.String _id;


    public IdIntKey(java.lang.String _id) {
    
    
        this._id = _id;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public IdIntKey(IdIntKey source) {
        this._id = source._id;
    }


    public java.lang.String getId() {
        return _id;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_id);
        return result;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        IdIntKey other = (IdIntKey) obj;
        if (!Objects.equals(_id, other._id)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.target.rev170215.id.ints.IdIntKey.class);
        CodeHelpers.appendValue(helper, "_id", _id);
        return helper.toString();
    }
}

