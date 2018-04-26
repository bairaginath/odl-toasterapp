package org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Class that builds {@link org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.UnsubscribeYnlOutput} instances.
 *
 * @see org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.UnsubscribeYnlOutput
 *
 */
public class UnsubscribeYnlOutputBuilder implements Builder<org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.UnsubscribeYnlOutput> {

    private java.lang.Long _allNot;
    private java.lang.Long _errNot;
    private java.lang.Long _idNot;
    private java.lang.Long _localNumber;

    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("tag:opendaylight.org,2017:controller:yang:lowlevel:control",
        "2017-02-15", "output").intern();

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.UnsubscribeYnlOutput>>, Augmentation<org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.UnsubscribeYnlOutput>> augmentation = Collections.emptyMap();

    public UnsubscribeYnlOutputBuilder() {
    }

    public UnsubscribeYnlOutputBuilder(UnsubscribeYnlOutput base) {
        this._allNot = base.getAllNot();
        this._errNot = base.getErrNot();
        this._idNot = base.getIdNot();
        this._localNumber = base.getLocalNumber();
        if (base instanceof UnsubscribeYnlOutputImpl) {
            UnsubscribeYnlOutputImpl impl = (UnsubscribeYnlOutputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.UnsubscribeYnlOutput> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.UnsubscribeYnlOutput>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public java.lang.Long getAllNot() {
        return _allNot;
    }
    
    public java.lang.Long getErrNot() {
        return _errNot;
    }
    
    public java.lang.Long getIdNot() {
        return _idNot;
    }
    
    public java.lang.Long getLocalNumber() {
        return _localNumber;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.UnsubscribeYnlOutput>> E getAugmentation(java.lang.Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public UnsubscribeYnlOutputBuilder setAllNot(final java.lang.Long value) {
        this._allNot = value;
        return this;
    }
    
    public UnsubscribeYnlOutputBuilder setErrNot(final java.lang.Long value) {
        this._errNot = value;
        return this;
    }
    
    public UnsubscribeYnlOutputBuilder setIdNot(final java.lang.Long value) {
        this._idNot = value;
        return this;
    }
    
    public UnsubscribeYnlOutputBuilder setLocalNumber(final java.lang.Long value) {
        this._localNumber = value;
        return this;
    }
    
    public UnsubscribeYnlOutputBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.UnsubscribeYnlOutput>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.UnsubscribeYnlOutput> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public UnsubscribeYnlOutputBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.UnsubscribeYnlOutput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public UnsubscribeYnlOutput build() {
        return new UnsubscribeYnlOutputImpl(this);
    }

    private static final class UnsubscribeYnlOutputImpl implements UnsubscribeYnlOutput {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.UnsubscribeYnlOutput> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.UnsubscribeYnlOutput.class;
        }

        private final java.lang.Long _allNot;
        private final java.lang.Long _errNot;
        private final java.lang.Long _idNot;
        private final java.lang.Long _localNumber;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.UnsubscribeYnlOutput>>, Augmentation<org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.UnsubscribeYnlOutput>> augmentation = Collections.emptyMap();

        private UnsubscribeYnlOutputImpl(UnsubscribeYnlOutputBuilder base) {
            this._allNot = base.getAllNot();
            this._errNot = base.getErrNot();
            this._idNot = base.getIdNot();
            this._localNumber = base.getLocalNumber();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public java.lang.Long getAllNot() {
            return _allNot;
        }
        
        @Override
        public java.lang.Long getErrNot() {
            return _errNot;
        }
        
        @Override
        public java.lang.Long getIdNot() {
            return _idNot;
        }
        
        @Override
        public java.lang.Long getLocalNumber() {
            return _localNumber;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.UnsubscribeYnlOutput>> E getAugmentation(java.lang.Class<E> augmentationType) {
            return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
        }

        private int hash = 0;
        private volatile boolean hashValid = false;
        
        @Override
        public int hashCode() {
            if (hashValid) {
                return hash;
            }
        
            final int prime = 31;
            int result = 1;
            result = prime * result + Objects.hashCode(_allNot);
            result = prime * result + Objects.hashCode(_errNot);
            result = prime * result + Objects.hashCode(_idNot);
            result = prime * result + Objects.hashCode(_localNumber);
            result = prime * result + Objects.hashCode(augmentation);
        
            hash = result;
            hashValid = true;
            return result;
        }

        @Override
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DataObject)) {
                return false;
            }
            if (!org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.UnsubscribeYnlOutput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.UnsubscribeYnlOutput other = (org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.UnsubscribeYnlOutput)obj;
            if (!Objects.equals(_allNot, other.getAllNot())) {
                return false;
            }
            if (!Objects.equals(_errNot, other.getErrNot())) {
                return false;
            }
            if (!Objects.equals(_idNot, other.getIdNot())) {
                return false;
            }
            if (!Objects.equals(_localNumber, other.getLocalNumber())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                UnsubscribeYnlOutputImpl otherImpl = (UnsubscribeYnlOutputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.UnsubscribeYnlOutput>>, Augmentation<org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.UnsubscribeYnlOutput>> e : augmentation.entrySet()) {
                    if (!e.getValue().equals(other.getAugmentation(e.getKey()))) {
                        return false;
                    }
                }
                // .. and give the other one the chance to do the same
                if (!obj.equals(this)) {
                    return false;
                }
            }
            return true;
        }

        @Override
        public java.lang.String toString() {
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("UnsubscribeYnlOutput");
            CodeHelpers.appendValue(helper, "_allNot", _allNot);
            CodeHelpers.appendValue(helper, "_errNot", _errNot);
            CodeHelpers.appendValue(helper, "_idNot", _idNot);
            CodeHelpers.appendValue(helper, "_localNumber", _localNumber);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
