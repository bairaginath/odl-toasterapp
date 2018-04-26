package org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.target.rev170215.id.ints.id._int;
import com.google.common.base.MoreObjects;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.target.rev170215.id.ints.id._int.Item;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class ItemKey
 implements Identifier<Item> {
    private static final long serialVersionUID = -1044229619511440757L;
    private final java.lang.Integer _number;


    public ItemKey(java.lang.Integer _number) {
    
    
        this._number = _number;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public ItemKey(ItemKey source) {
        this._number = source._number;
    }


    public java.lang.Integer getNumber() {
        return _number;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_number);
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
        ItemKey other = (ItemKey) obj;
        if (!Objects.equals(_number, other._number)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.target.rev170215.id.ints.id._int.ItemKey.class);
        CodeHelpers.appendValue(helper, "_number", _number);
        return helper.toString();
    }
}

