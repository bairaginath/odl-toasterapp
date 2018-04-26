package org.opendaylight.yang.gen.v1.urn.opendaylight.controller.basic.rpc.test.rev160120 ;
import org.opendaylight.yangtools.yang.binding.ResourceYangModuleInfo;
import org.opendaylight.yangtools.yang.binding.YangModuleInfo;
import org.opendaylight.yangtools.yang.common.QName;
import java.util.Set;
import java.util.Collections;
public final class $YangModuleInfoImpl extends ResourceYangModuleInfo {

    private static final YangModuleInfo INSTANCE = new $YangModuleInfoImpl();

    private final QName name = QName.create("urn:opendaylight:controller:basic-rpc-test", "2016-01-20", "basic-rpc-test").intern();
    private final Set<YangModuleInfo> importedModules;

    public static YangModuleInfo getInstance() {
        return INSTANCE;
    }

    private $YangModuleInfoImpl() {
        importedModules = Collections.emptySet();
    }
    
    @Override
    public QName getName() {
        return name;
    }
    
    @Override
    protected java.lang.String resourceName() {
        return "/META-INF/yang/basic-rpc-test@2016-01-20.yang";
    }
    
    @Override
    public Set<YangModuleInfo> getImportedModules() {
        return importedModules;
    }
    
    
}
