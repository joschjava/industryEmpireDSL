/**
 * generated by Xtext 2.13.0
 */
package org.xtext.industryempire.tests;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.xtext.industryempire.myDsl.ClazzModel;
import org.xtext.industryempire.tests.MyDslInjectorProvider;

@RunWith(XtextRunner.class)
@InjectWith(MyDslInjectorProvider.class)
@SuppressWarnings("all")
public class MyDslParsingTest {
  @Inject
  @Extension
  private ParseHelper<ClazzModel> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void resourceTest() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Resources:");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("FirstResource [cost -> 50]");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("SecondResource [cost -> 100]");
      _builder.newLine();
      this._validationTestHelper.assertNoErrors(this._parseHelper.parse(_builder));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void factoryTest() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Resources:");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("FirstResource [cost -> 15]");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("SecondResource [cost -> 15]");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("Factories:");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("testFactory [:]");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("testFactory2 [in->FirstResource:out->SecondResource]");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("Vehicles:");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("test [spee -> 30]");
      _builder.newLine();
      _builder.newLine();
      this._validationTestHelper.assertNoErrors(this._parseHelper.parse(_builder));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void vehicleTest() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Vehicles:");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("PowerLoader [speed->40:load->110:tankSize->42:fuelConsumption->2.3]");
      _builder.newLine();
      this._validationTestHelper.assertNoErrors(this._parseHelper.parse(_builder));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void unresolvedProblems() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Resources:");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("FirstResource [cost:50]");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("SecondResource [cost:100]");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("Factories:");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("testFactory [FirstResource:SecondResource]");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("testFactory2 [FirstResource:SecondResource]");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("Cities: ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Berlin [50:20:testFactory, testFactory2]");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("BombedBerlin [50:20:]");
      _builder.newLine();
      this._validationTestHelper.assertNoErrors(this._parseHelper.parse(_builder));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void doubleResourceTest() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Cities:");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("Berlin [x->50:y->20:]");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("Resources:");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("FirstResource [cost -> 50]");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("SecondResource [cost -> 100]");
      _builder.newLine();
      this._validationTestHelper.assertNoErrors(this._parseHelper.parse(_builder));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
