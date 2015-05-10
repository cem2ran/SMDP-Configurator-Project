package dk.itu.mdd.configurator.validation;

import dk.itu.mdd.configurator.Constraints;
import java.util.Map;
import modelMDD2.ModelMDD2Package;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class Main {
  private final static String filename = "test-files/testEqualsNotEquals.xmi";
  
  private final static String fileExtension = "xmi";
  
  public static void main(final String[] args) {
    Map<String, Object> _extensionToFactoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
    XMIResourceFactoryImpl _xMIResourceFactoryImpl = new XMIResourceFactoryImpl();
    _extensionToFactoryMap.put(Main.fileExtension, _xMIResourceFactoryImpl);
    ModelMDD2Package.eINSTANCE.eClass();
    final ResourceSetImpl resourceSet = new ResourceSetImpl();
    final URI uri = URI.createURI(Main.filename);
    final Resource resource = resourceSet.getResource(uri, true);
    TreeIterator<EObject> _allProperContents = EcoreUtil.<EObject>getAllProperContents(resource, false);
    final Function1<EObject, Boolean> _function = (EObject it) -> {
      return Constraints.constraint(it);
    };
    boolean _forall = IteratorExtensions.<EObject>forall(_allProperContents, _function);
    if (_forall) {
      InputOutput.<String>println("All constraints are satisfied!");
    } else {
      InputOutput.<String>println("Some constraint is violated");
    }
  }
}
