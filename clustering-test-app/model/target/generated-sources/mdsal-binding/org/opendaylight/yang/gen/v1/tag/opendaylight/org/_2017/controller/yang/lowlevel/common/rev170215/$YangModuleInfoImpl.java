package org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.common.rev170215 ;
import org.opendaylight.yangtools.yang.binding.ResourceYangModuleInfo;
import org.opendaylight.yangtools.yang.binding.YangModuleInfo;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.Set;
import java.util.HashSet;
import com.google.common.collect.ImmutableSet;
public final class $YangModuleInfoImpl extends ResourceYangModuleInfo {

    private static final YangModuleInfo INSTANCE = new $YangModuleInfoImpl();

    private final QName name = QName.create("tag:opendaylight.org,2017:controller:yang:lowlevel:common", "2017-02-15", "odl-mdsal-lowlevel-common").intern();
    private final Set<YangModuleInfo> importedModules;

    public static YangModuleInfo getInstance() {
        return INSTANCE;
    }

    private $YangModuleInfoImpl() {
        Set<YangModuleInfo> set = new HashSet<>();
        set.add(org.opendaylight.yang.gen.v1.urn.opendaylight.yang.extension.yang.ext.rev130709.$YangModuleInfoImpl.getInstance());
        importedModules = ImmutableSet.copyOf(set);
    }
    
    @Override
    public QName getName() {
        return name;
    }
    
    @Override
    protected java.lang.String resourceName() {
        return "/META-INF/yang/odl-mdsal-lowlevel-common@2017-02-15.yang";
    }
    
    @Override
    public Set<YangModuleInfo> getImportedModules() {
        return importedModules;
    }
    
    
}
