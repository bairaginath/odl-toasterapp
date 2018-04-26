package org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.common.rev170215;
import com.google.common.base.MoreObjects;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.common.rev170215.RpcContext;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class RpcContextKey
 implements Identifier<RpcContext> {
    private static final long serialVersionUID = 6479899203065667003L;
    private final java.lang.String _identifier;


    public RpcContextKey(java.lang.String _identifier) {
    
    
        this._identifier = _identifier;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public RpcContextKey(RpcContextKey source) {
        this._identifier = source._identifier;
    }


    public java.lang.String getIdentifier() {
        return _identifier;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_identifier);
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
        RpcContextKey other = (RpcContextKey) obj;
        if (!Objects.equals(_identifier, other._identifier)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.common.rev170215.RpcContextKey.class);
        CodeHelpers.appendValue(helper, "_identifier", _identifier);
        return helper.toString();
    }
}

