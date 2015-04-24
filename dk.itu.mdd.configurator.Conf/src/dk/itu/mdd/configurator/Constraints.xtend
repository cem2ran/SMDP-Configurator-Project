package dk.itu.mdd.configurator

import modelMDD2.Feature
import modelMDD2.Group
import modelMDD2.Binary
import modelMDD2.Constrain
import modelMDD2.Mandatory
import modelMDD2.Grouped
import modelMDD2.Range
import modelMDD2.impl.RangeImpl

class Constraints {
	def static featureStartsWithCapital(Feature feature) {
		return Character.isUpperCase(feature.name.charAt(0))
	}
	
	def static featureNameDifferentFromGroupName(Group it){
		return grouped.forall[t|t.name!=it.name];
	}
	
	def static typeCheck(Binary exp){
		var leftPath = getPath(exp.leftExp);
		var rightPath = getPath(exp.rightExp);
		
		return (leftPath as String).equalsIgnoreCase((rightPath as String));
	}
	
	def static getPath(Constrain exp){
		var path = exp.constrainFeatures.map[name + (if(eContainer instanceof Group) '.'+(eContainer as Group).name else '')].reduce[iterator, accumulator| accumulator + '.'+iterator];
		return path.substring(path.indexOf('.') +1 );
	}
	
	def static featureNameAreDistinct(Group it) {
		return grouped.forall[f1 | grouped.filter[f2 | f1.name.equalsIgnoreCase(f2.name)].length == 1]
	}
	
	def static isEmpty(Mandatory feature){
		return (feature.subfeature.size == 0) && (feature.groups.size == 0)
	}
	
	def static checkRangeValidity(Feature f){			
			// First filter all features that are not a RangeImpl. Then check forall, that lower value is less than upper value.
	 		return f.attributes.filter[f.attributes.forall[a  | a instanceof RangeImpl ]].forall[a | (a as RangeImpl).upper > (a as RangeImpl).lower];	
	}
	
}