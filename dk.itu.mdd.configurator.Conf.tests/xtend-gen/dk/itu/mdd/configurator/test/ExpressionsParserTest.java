package dk.itu.mdd.configurator.test;

import com.google.inject.Inject;
import dk.itu.mdd.configurator.ConfInjectorProvider;
import modelMDD2.Model;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(ConfInjectorProvider.class)
@SuppressWarnings("all")
public class ExpressionsParserTest {
  @Inject
  @Extension
  private ParseHelper<Model> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void testRoot() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Feature Car");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void TestMandatoryFeature() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Feature Car");
      _builder.newLine();
      _builder.append("Engine");
      _builder.newLine();
      _builder.append("Xor HosePower");
      _builder.newLine();
      _builder.append(" \t\t");
      _builder.append("HP120 (120 140)");
      _builder.newLine();
      _builder.append(" \t\t");
      _builder.append("HP150");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void TestOptionalWithORGroupedFeature() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("\t");
      _builder.append("Feature Car");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("?Rims");
      _builder.newLine();
      _builder.append("Or Color");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Red");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Black");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void TestOptionalWithXORGroupedFeature() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("\t");
      _builder.append("Feature Car");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("?Rims");
      _builder.newLine();
      _builder.append("Xor Color");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Red [HP120 && HP150]");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Black");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void TestOptionalWithConstrain() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Feature Car");
      _builder.newLine();
      _builder.newLine();
      _builder.append("Engine");
      _builder.newLine();
      _builder.append(" \t\t");
      _builder.append("Xor HosePower");
      _builder.newLine();
      _builder.append(" \t\t");
      _builder.append("HP120 (120)");
      _builder.newLine();
      _builder.append(" \t\t");
      _builder.append("HP150 (150)");
      _builder.newLine();
      _builder.newLine();
      _builder.append("?Rims");
      _builder.newLine();
      _builder.append("Xor Color");
      _builder.newLine();
      _builder.append("Red [HP120 && HP150]");
      _builder.newLine();
      _builder.append("Black");
      _builder.newLine();
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
