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
 * Class that builds {@link org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.CheckPublishNotificationsOutput} instances.
 *
 * @see org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.CheckPublishNotificationsOutput
 *
 */
public class CheckPublishNotificationsOutputBuilder implements Builder<org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.CheckPublishNotificationsOutput> {

    private java.lang.String _lastError;
    private java.lang.Long _publishCount;
    private java.lang.Boolean _active;

    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("tag:opendaylight.org,2017:controller:yang:lowlevel:control",
        "2017-02-15", "output").intern();

    Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.CheckPublishNotificationsOutput>>, Augmentation<org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.CheckPublishNotificationsOutput>> augmentation = Collections.emptyMap();

    public CheckPublishNotificationsOutputBuilder() {
    }

    public CheckPublishNotificationsOutputBuilder(CheckPublishNotificationsOutput base) {
        this._lastError = base.getLastError();
        this._publishCount = base.getPublishCount();
        this._active = base.isActive();
        if (base instanceof CheckPublishNotificationsOutputImpl) {
            CheckPublishNotificationsOutputImpl impl = (CheckPublishNotificationsOutputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            AugmentationHolder<org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.CheckPublishNotificationsOutput> casted =(AugmentationHolder<org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.CheckPublishNotificationsOutput>) base;
            if (!casted.augmentations().isEmpty()) {
                this.augmentation = new HashMap<>(casted.augmentations());
            }
        }
    }


    public java.lang.String getLastError() {
        return _lastError;
    }
    
    public java.lang.Long getPublishCount() {
        return _publishCount;
    }
    
    public java.lang.Boolean isActive() {
        return _active;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.CheckPublishNotificationsOutput>> E getAugmentation(java.lang.Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public CheckPublishNotificationsOutputBuilder setLastError(final java.lang.String value) {
        this._lastError = value;
        return this;
    }
    
    public CheckPublishNotificationsOutputBuilder setPublishCount(final java.lang.Long value) {
        this._publishCount = value;
        return this;
    }
    
    public CheckPublishNotificationsOutputBuilder setActive(final java.lang.Boolean value) {
        this._active = value;
        return this;
    }
    
    public CheckPublishNotificationsOutputBuilder addAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.CheckPublishNotificationsOutput>> augmentationType, Augmentation<org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.CheckPublishNotificationsOutput> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public CheckPublishNotificationsOutputBuilder removeAugmentation(java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.CheckPublishNotificationsOutput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public CheckPublishNotificationsOutput build() {
        return new CheckPublishNotificationsOutputImpl(this);
    }

    private static final class CheckPublishNotificationsOutputImpl implements CheckPublishNotificationsOutput {

        @Override
        public java.lang.Class<org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.CheckPublishNotificationsOutput> getImplementedInterface() {
            return org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.CheckPublishNotificationsOutput.class;
        }

        private final java.lang.String _lastError;
        private final java.lang.Long _publishCount;
        private final java.lang.Boolean _active;

        private Map<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.CheckPublishNotificationsOutput>>, Augmentation<org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.CheckPublishNotificationsOutput>> augmentation = Collections.emptyMap();

        private CheckPublishNotificationsOutputImpl(CheckPublishNotificationsOutputBuilder base) {
            this._lastError = base.getLastError();
            this._publishCount = base.getPublishCount();
            this._active = base.isActive();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }

        @Override
        public java.lang.String getLastError() {
            return _lastError;
        }
        
        @Override
        public java.lang.Long getPublishCount() {
            return _publishCount;
        }
        
        @Override
        public java.lang.Boolean isActive() {
            return _active;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.CheckPublishNotificationsOutput>> E getAugmentation(java.lang.Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_lastError);
            result = prime * result + Objects.hashCode(_publishCount);
            result = prime * result + Objects.hashCode(_active);
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
            if (!org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.CheckPublishNotificationsOutput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.CheckPublishNotificationsOutput other = (org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.CheckPublishNotificationsOutput)obj;
            if (!Objects.equals(_lastError, other.getLastError())) {
                return false;
            }
            if (!Objects.equals(_publishCount, other.getPublishCount())) {
                return false;
            }
            if (!Objects.equals(_active, other.isActive())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                CheckPublishNotificationsOutputImpl otherImpl = (CheckPublishNotificationsOutputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<java.lang.Class<? extends Augmentation<org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.CheckPublishNotificationsOutput>>, Augmentation<org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215.CheckPublishNotificationsOutput>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("CheckPublishNotificationsOutput");
            CodeHelpers.appendValue(helper, "_lastError", _lastError);
            CodeHelpers.appendValue(helper, "_publishCount", _publishCount);
            CodeHelpers.appendValue(helper, "_active", _active);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }

}
