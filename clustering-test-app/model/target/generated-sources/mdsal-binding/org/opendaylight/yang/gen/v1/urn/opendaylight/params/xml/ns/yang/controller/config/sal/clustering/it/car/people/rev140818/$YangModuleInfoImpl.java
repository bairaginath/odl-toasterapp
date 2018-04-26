package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.people.rev140818 ;
import org.opendaylight.yangtools.yang.binding.ResourceYangModuleInfo;
import org.opendaylight.yangtools.yang.binding.YangModuleInfo;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.Set;
import java.util.HashSet;
import com.google.common.collect.ImmutableSet;
public final class $YangModuleInfoImpl extends ResourceYangModuleInfo {

    private static final YangModuleInfo INSTANCE = new $YangModuleInfoImpl();

    private final QName name = QName.create("urn:opendaylight:params:xml:ns:yang:controller:config:sal-clustering-it:car-people", "2014-08-18", "car-people").intern();
    private final Set<YangModuleInfo> importedModules;

    public static YangModuleInfo getInstance() {
        return INSTANCE;
    }

    private $YangModuleInfoImpl() {
        Set<YangModuleInfo> set = new HashSet<>();
        set.add(org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.$YangModuleInfoImpl.getInstance());
        set.add(org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.people.rev140818.$YangModuleInfoImpl.getInstance());
        set.add(org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.rev140818.$YangModuleInfoImpl.getInstance());
        importedModules = ImmutableSet.copyOf(set);
    }
    
    @Override
    public QName getName() {
        return name;
    }
    
    @Override
    protected java.lang.String resourceName() {
        return "/META-INF/yang/car-people@2014-08-18.yang";
    }
    
    @Override
    public Set<YangModuleInfo> getImportedModules() {
        return importedModules;
    }
    
    
}
