/**
 * generated by Xtext
 */
package dk.itu.mdd.configurator.formatting2;

import dk.itu.mdd.configurator.services.ConfGrammarAccess;
import java.util.Arrays;

@SuppressWarnings("all")
public class ConfFormatter /* implements AbstractFormatter2  */{
  /* @Inject
   */private ConfGrammarAccess _confGrammarAccess;
  
  protected void _format(final /* Model */Object model, final /* IFormattableDocument */Object document) {
    throw new Error("Unresolved compilation problems:"
      + "\ngetRoot cannot be resolved");
  }
  
  protected void _format(final /* Binary */Object binary, final /* IFormattableDocument */Object document) {
    throw new Error("Unresolved compilation problems:"
      + "\ngetRightExp cannot be resolved"
      + "\ngetLeftExp cannot be resolved");
  }
  
  protected void _format(final /* Unary */Object unary, final /* IFormattableDocument */Object document) {
    throw new Error("Unresolved compilation problems:"
      + "\ngetExp cannot be resolved");
  }
  
  protected void _format(final /* Feature */Object feature, final /* IFormattableDocument */Object document) {
    throw new Error("Unresolved compilation problems:"
      + "\nSolitary cannot be resolved to a type."
      + "\nConstrain cannot be resolved to a type."
      + "\ngetSubfeature cannot be resolved"
      + "\ngetConstrains cannot be resolved");
  }
  
  protected void _format(final /* Grouped */Object grouped, final /* IFormattableDocument */Object document) {
    throw new Error("Unresolved compilation problems:"
      + "\nConstrain cannot be resolved to a type."
      + "\ngetConstrains cannot be resolved");
  }
  
  protected void _format(final /* Mandatory */Object mandatory, final /* IFormattableDocument */Object document) {
    throw new Error("Unresolved compilation problems:"
      + "\nSolitary cannot be resolved to a type."
      + "\nConstrain cannot be resolved to a type."
      + "\nGroup cannot be resolved to a type."
      + "\ngetSubfeature cannot be resolved"
      + "\ngetConstrains cannot be resolved"
      + "\ngetGroups cannot be resolved");
  }
  
  protected void _format(final /* Optional */Object optional, final /* IFormattableDocument */Object document) {
    throw new Error("Unresolved compilation problems:"
      + "\nSolitary cannot be resolved to a type."
      + "\nConstrain cannot be resolved to a type."
      + "\nGroup cannot be resolved to a type."
      + "\ngetSubfeature cannot be resolved"
      + "\ngetConstrains cannot be resolved"
      + "\ngetGroups cannot be resolved");
  }
  
  protected void _format(final /* Or */Object or, final /* IFormattableDocument */Object document) {
    throw new Error("Unresolved compilation problems:"
      + "\nGrouped cannot be resolved to a type."
      + "\ngetGrouped cannot be resolved");
  }
  
  protected void _format(final /* Xor */Object xor, final /* IFormattableDocument */Object document) {
    throw new Error("Unresolved compilation problems:"
      + "\nGrouped cannot be resolved to a type."
      + "\ngetGrouped cannot be resolved");
  }
  
  public void format(final Model model, final IFormattableDocument document) {
    if (model != null
         && document != null) {
      _format(model, document);
      return; else {
        throw new IllegalArgumentException("Unhandled parameter types: " +
          Arrays.<Object>asList(model, document).toString());
      }
    }
  }
  