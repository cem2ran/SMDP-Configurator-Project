/*
 * generated by Xtext
 */
package dk.itu.mdd.configurator.formatting2;

import com.google.inject.Inject;
import dk.itu.mdd.configurator.services.ConfGrammarAccess;
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
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;

class ConfFormatter extends AbstractFormatter2 {
	
	@Inject extension ConfGrammarAccess

	def dispatch void format(Model model, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		format(model.getRoot(), document);
	}

	def dispatch void format(Binary binary, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		format(binary.getRightExp(), document);
		format(binary.getLeftExp(), document);
	}

	def dispatch void format(Unary unary, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		format(unary.getExp(), document);
	}

	def dispatch void format(Feature feature, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Solitary subfeature : feature.getSubfeature()) {
			format(subfeature, document);
		}
		for (Constrain constrains : feature.getConstrains()) {
			format(constrains, document);
		}
	}

	def dispatch void format(Grouped grouped, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Constrain constrains : grouped.getConstrains()) {
			format(constrains, document);
		}
	}

	def dispatch void format(Mandatory mandatory, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Solitary subfeature : mandatory.getSubfeature()) {
			format(subfeature, document);
		}
		for (Constrain constrains : mandatory.getConstrains()) {
			format(constrains, document);
		}
		for (Group groups : mandatory.getGroups()) {
			format(groups, document);
		}
	}

	def dispatch void format(Optional optional, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Solitary subfeature : optional.getSubfeature()) {
			format(subfeature, document);
		}
		for (Constrain constrains : optional.getConstrains()) {
			format(constrains, document);
		}
		for (Group groups : optional.getGroups()) {
			format(groups, document);
		}
	}

	def dispatch void format(Or or, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Grouped grouped : or.getGrouped()) {
			format(grouped, document);
		}
	}

	def dispatch void format(Xor xor, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (Grouped grouped : xor.getGrouped()) {
			format(grouped, document);
		}
	}
}