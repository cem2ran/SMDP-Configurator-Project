/**
 * generated by Xtext
 */
package dk.itu.mdd.configurator.formatting2;

import com.google.inject.Inject;
import dk.itu.mdd.configurator.services.ConfGrammarAccess;
import java.util.Arrays;
import modelMDD2.Binary;
import modelMDD2.Constrain;
import modelMDD2.Feature;
import modelMDD2.Group;
import modelMDD2.Grouped;
import modelMDD2.Mandatory;
import modelMDD2.Model;
import modelMDD2.Optional;
import modelMDD2.Or;
import modelMDD2.Solitary;
import modelMDD2.Unary;
import modelMDD2.Xor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class ConfFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private ConfGrammarAccess _confGrammarAccess;
  
  protected void _format(final Model model, @Extension final IFormattableDocument document) {
    Feature _root = model.getRoot();
    this.format(_root, document);
  }
  
  protected void _format(final Binary binary, @Extension final IFormattableDocument document) {
    Constrain _rightExp = binary.getRightExp();
    this.format(_rightExp, document);
    Constrain _leftExp = binary.getLeftExp();
    this.format(_leftExp, document);
  }
  
  protected void _format(final Unary unary, @Extension final IFormattableDocument document) {
    Constrain _exp = unary.getExp();
    this.format(_exp, document);
  }
  
  protected void _format(final Feature feature, @Extension final IFormattableDocument document) {
    EList<Solitary> _subfeature = feature.getSubfeature();
    for (final Solitary subfeature : _subfeature) {
      this.format(subfeature, document);
    }
    EList<Constrain> _constrains = feature.getConstrains();
    for (final Constrain constrains : _constrains) {
      this.format(constrains, document);
    }
  }
  
  protected void _format(final Grouped grouped, @Extension final IFormattableDocument document) {
    EList<Constrain> _constrains = grouped.getConstrains();
    for (final Constrain constrains : _constrains) {
      this.format(constrains, document);
    }
  }
  
  protected void _format(final Mandatory mandatory, @Extension final IFormattableDocument document) {
    EList<Solitary> _subfeature = mandatory.getSubfeature();
    for (final Solitary subfeature : _subfeature) {
      this.format(subfeature, document);
    }
    EList<Constrain> _constrains = mandatory.getConstrains();
    for (final Constrain constrains : _constrains) {
      this.format(constrains, document);
    }
    EList<Group> _groups = mandatory.getGroups();
    for (final Group groups : _groups) {
      this.format(groups, document);
    }
  }
  
  protected void _format(final Optional optional, @Extension final IFormattableDocument document) {
    EList<Solitary> _subfeature = optional.getSubfeature();
    for (final Solitary subfeature : _subfeature) {
      this.format(subfeature, document);
    }
    EList<Constrain> _constrains = optional.getConstrains();
    for (final Constrain constrains : _constrains) {
      this.format(constrains, document);
    }
    EList<Group> _groups = optional.getGroups();
    for (final Group groups : _groups) {
      this.format(groups, document);
    }
  }
  
  protected void _format(final Or or, @Extension final IFormattableDocument document) {
    EList<Grouped> _grouped = or.getGrouped();
    for (final Grouped grouped : _grouped) {
      this.format(grouped, document);
    }
  }
  
  protected void _format(final Xor xor, @Extension final IFormattableDocument document) {
    EList<Grouped> _grouped = xor.getGrouped();
    for (final Grouped grouped : _grouped) {
      this.format(grouped, document);
    }
  }
  
  public void format(final Object mandatory, final IFormattableDocument document) {
    if (mandatory instanceof Mandatory) {
      _format((Mandatory)mandatory, document);
      return;
    } else if (mandatory instanceof Optional) {
      _format((Optional)mandatory, document);
      return;
    } else if (mandatory instanceof Or) {
      _format((Or)mandatory, document);
      return;
    } else if (mandatory instanceof Xor) {
      _format((Xor)mandatory, document);
      return;
    } else if (mandatory instanceof Binary) {
      _format((Binary)mandatory, document);
      return;
    } else if (mandatory instanceof Grouped) {
      _format((Grouped)mandatory, document);
      return;
    } else if (mandatory instanceof Unary) {
      _format((Unary)mandatory, document);
      return;
    } else if (mandatory instanceof XtextResource) {
      _format((XtextResource)mandatory, document);
      return;
    } else if (mandatory instanceof Feature) {
      _format((Feature)mandatory, document);
      return;
    } else if (mandatory instanceof Model) {
      _format((Model)mandatory, document);
      return;
    } else if (mandatory == null) {
      _format((Void)null, document);
      return;
    } else if (mandatory != null) {
      _format(mandatory, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(mandatory, document).toString());
    }
  }
}
