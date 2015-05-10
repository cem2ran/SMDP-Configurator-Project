package dk.itu.mdd.configurator.validation;

import modelMDD2.ModelMDD2Package
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import dk.itu.mdd.configurator.Constraints;

public class Main{

	static val filename = "test-files/testEqualsNotEquals.xmi"
	static val fileExtension = "xmi"

	def static void main(String[] args) {

		// register the file extension to be read as XMI
		Resource.Factory.Registry::INSTANCE.extensionToFactoryMap.put(fileExtension, new XMIResourceFactoryImpl)

		// register our meta-model package
		ModelMDD2Package.eINSTANCE.eClass()

		// load the file 
		val resourceSet = new ResourceSetImpl

		// change file name here to try other files
		val uri = URI::createURI(filename)
		val resource = resourceSet.getResource(uri, true)
		
		// check constraints
		if (EcoreUtil.getAllProperContents(resource, false).forall [
			Constraints.constraint(it)
		])
			println("All constraints are satisfied!")
		else
			println("Some constraint is violated")
	}
}
