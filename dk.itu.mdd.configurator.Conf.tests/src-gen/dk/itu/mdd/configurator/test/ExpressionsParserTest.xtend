package dk.itu.mdd.configurator.test

import org.eclipse.xtext.junit4.XtextRunner
import org.junit.runner.RunWith
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.util.ParseHelper
import modelMDD2.Model
import com.google.inject.Inject
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.junit.Test
import dk.itu.mdd.configurator.ConfInjectorProvider

@RunWith(typeof(XtextRunner))
@InjectWith(typeof(ConfInjectorProvider))
class ExpressionsParserTest {
	
	@Inject extension ParseHelper<Model>
	@Inject extension ValidationTestHelper
	
	@Test
	def void testRoot() {
		'''Feature Car'''.parse.assertNoErrors
	}
	
	@Test
	def void TestMandatoryFeature() {
		'''
		Feature Car
		Engine
		Xor HosePower
 		HP120 (120 140)
 		HP150
		'''.parse.assertNoErrors
	}
	
	@Test
	def void TestOptionalWithORGroupedFeature() {
		'''
		Feature Car
		?Rims
	Or Color
		Red
		Black
		'''.parse.assertNoErrors
	}
	
	@Test
	def void TestOptionalWithXORGroupedFeature() {
		'''
		Feature Car
		?Rims
	Xor Color
		Red [HP120 && HP150]
		Black
		'''.parse.assertNoErrors
	}

	@Test
	def void TestOptionalWithConstrain() {
		'''
		Feature Car
		
		Engine
 		Xor HosePower
 		HP120 (120)
 		HP150 (150)
		
		?Rims
		Xor Color
		Red [HP120 && HP150]
		Black
		'''.parse.assertNoErrors
	}

}