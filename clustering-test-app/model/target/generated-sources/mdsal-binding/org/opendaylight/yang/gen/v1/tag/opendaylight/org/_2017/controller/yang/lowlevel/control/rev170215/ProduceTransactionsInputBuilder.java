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
 * Class that builds {@link org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.ProduceTransactionsInput} instances.
 *
 * @see org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.ProduceTransactionsInput
 *
 */
public class ProduceTransactionsInputBuilder implements Builder<org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.ProduceTransactionsInput> {

    private java.lang.String _id;
    private java.lang.Long _seconds;
    private java.lang.Long _transactionsPerSecond;
    private java.lang.Boolean _isolatedTransactions;

    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("tag:opendaylight.org,2017:controller:yang:lowlevel:control",
        "2017-02-15", "input").intern();

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.ProduceTransactionsInput>>, Augmentation<org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.ProduceTransactionsInput>> augmentation = Collections.emptyMap();

    public ProduceTransactionsInputBuilder() {
    }
    public ProduceTransactionsInputBuilder(org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.TransactionsParams arg) {
        this._seconds = arg.getSeconds();
        this._transactionsPerSecond = arg.getTransactionsPerSecond();
    }
    public ProduceTransactionsInputBuilder(org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.common.rev170215.IdGrouping arg) {
        this._id = arg.getId();
    }

    public ProduceTransactionsInputBuilder(ProduceTransactionsInput base) {
        this._id = base.getId();
        this._seconds = base.getSeconds();
        this._transactionsPerSecond = base.getTransactionsPerSecond();
        this._isolatedTransactions = base.isIsolatedTransactions();
        if (base instanceof ProduceTransactionsInputImpl) {
            ProduceTransactionsInputImpl impl = (ProduceTransactionsInputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.ProduceTransactionsInput> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.ProduceTransactionsInput>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.common.rev170215.IdGrouping</li>
     * <li>org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.TransactionsParams</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.common.rev170215.IdGrouping) {
            this._id = ((org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.common.rev170215.IdGrouping)arg).getId();
            isValidArg = true;
        }
        if (arg instanceof org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.TransactionsParams) {
            this._seconds = ((org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.TransactionsParams)arg).getSeconds();
            this._transactionsPerSecond = ((org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.TransactionsParams)arg).getTransactionsPerSecond();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.common.rev170215.IdGrouping, org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.TransactionsParams]");
    }

    public java.lang.String getId() {
        return _id;
    }
    
    public java.lang.Long getSeconds() {
        return _seconds;
    }
    
    public java.lang.Long getTransactionsPerSecond() {
        return _transactionsPerSecond;
    }
    
    public java.lang.Boolean isIsolatedTransactions() {
        return _isolatedTransactions;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.ProduceTransactionsInput>> E getAugmentation(java.lang.Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public ProduceTransactionsInputBuilder setId(final java.lang.String value) {
        this._id = value;
        return this;
    }
    private static void checkSecondsRange(final long value) {
        if (value >= 0L && value <= 4294967295L) {
            return;
        }
        CodeHelpers.throwInvalidRange("[[0..4294967295]]", value);
    }
    
    public ProduceTransactionsInputBuilder setSeconds(final java.lang.Long value) {
    if (value != null) {
        checkSecondsRange(value);
        
    }
        this._seconds = value;
        return this;
    }
    private static void checkTransactionsPerSecondRange(final long value) {
        if (value >= 0L && value <= 4294967295L) {
            return;
        }
        CodeHelpers.throwInvalidRange("[[0..4294967295]]", value);
    }
    
    public ProduceTransactionsInputBuilder setTransactionsPerSecond(final java.lang.Long value) {
    if (value != null) {
        checkTransactionsPerSecondRange(value);
        
    }
        this._transactionsPerSecond = value;
        return this;
    }
    
    public ProduceTransactionsInputBuilder setIsolatedTransactions(final java.lang.Boolean value) {
        this._isolatedTransactions = value;
        return this;
    }
    
    public ProduceTransactionsInputBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.ProduceTransactionsInput>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.ProduceTransactionsInput> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ProduceTransactionsInputBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.ProduceTransactionsInput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ProduceTransactionsInput build() {
        return new ProduceTransactionsInputImpl(this);
    }

    private static final class ProduceTransactionsInputImpl implements ProduceTransactionsInput {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.ProduceTransactionsInput> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.ProduceTransactionsInput.class;
        }

        private final java.lang.String _id;
        private final java.lang.Long _seconds;
        private final java.lang.Long _transactionsPerSecond;
        private final java.lang.Boolean _isolatedTransactions;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.ProduceTransactionsInput>>, Augmentation<org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.ProduceTransactionsInput>> augmentation = Collections.emptyMap();

        private ProduceTransactionsInputImpl(ProduceTransactionsInputBuilder base) {
            this._id = base.getId();
            this._seconds = base.getSeconds();
            this._transactionsPerSecond = base.getTransactionsPerSecond();
            this._isolatedTransactions = base.isIsolatedTransactions();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public java.lang.String getId() {
            return _id;
        }
        
        @Override
        public java.lang.Long getSeconds() {
            return _seconds;
        }
        
        @Override
        public java.lang.Long getTransactionsPerSecond() {
            return _transactionsPerSecond;
        }
        
        @Override
        public java.lang.Boolean isIsolatedTransactions() {
            return _isolatedTransactions;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.ProduceTransactionsInput>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_seconds);
            result = prime * result + Objects.hashCode(_transactionsPerSecond);
            result = prime * result + Objects.hashCode(_isolatedTransactions);
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
            if (!org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.ProduceTransactionsInput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.ProduceTransactionsInput other = (org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.ProduceTransactionsInput)obj;
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_seconds, other.getSeconds())) {
                return false;
            }
            if (!Objects.equals(_transactionsPerSecond, other.getTransactionsPerSecond())) {
                return false;
            }
            if (!Objects.equals(_isolatedTransactions, other.isIsolatedTransactions())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ProduceTransactionsInputImpl otherImpl = (ProduceTransactionsInputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.ProduceTransactionsInput>>, Augmentation<org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.ProduceTransactionsInput>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("ProduceTransactionsInput");
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_seconds", _seconds);
            CodeHelpers.appendValue(helper, "_transactionsPerSecond", _transactionsPerSecond);
            CodeHelpers.appendValue(helper, "_isolatedTransactions", _isolatedTransactions);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
