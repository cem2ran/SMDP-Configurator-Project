package dk.itu.mdd.configurator

import modelMDD2.Binary
import modelMDD2.ComparativeOperator
import modelMDD2.Constrain
import modelMDD2.Feature
import modelMDD2.Group
import modelMDD2.Mandatory
import modelMDD2.impl.FeatureImpl
import modelMDD2.impl.MandatoryImpl
import modelMDD2.impl.ModelImpl
import modelMDD2.impl.OptionalImpl
import modelMDD2.impl.OrImpl
import modelMDD2.impl.RangeImpl
import modelMDD2.impl.XorImpl
import org.eclipse.emf.ecore.EObject
import modelMDD2.impl.ConstrainImpl
import modelMDD2.Grouped
import modelMDD2.BinaryOperator

public class Constraints {
	def static featureStartsWithCapital(Feature feature) {
		return Character.isUpperCase(feature.name.charAt(0))
	}
	
	def static featureNameDifferentFromGroupName(Group it){
		return grouped.forall[t|t.name!=it.name];
	}
	
	def static typeCheck(Binary exp){
		if(ComparativeOperator.getByName(exp.operator.getName()) != null){
			var leftPath = getPath(exp.leftExp);
			var rightPath = getPath(exp.rightExp);
		(leftPath as String).equalsIgnoreCase((rightPath as String));	
		}else true
	}
	
	def static dispatch Boolean constraint(Binary exp)
	{
		val lexp=exp.leftExp;
		val rexp=exp.rightExp;
									
			switch(BinaryOperator.getByName(exp.operator.getName()).getName.toString){
				case "lessThan" :
				 if ((lexp as ConstrainImpl).constrainValue instanceof modelMDD2.Number && (rexp as ConstrainImpl).featureReference instanceof Feature){
				 	val lval = ((lexp as ConstrainImpl).constrainValue as modelMDD2.Number).value;
				 	val rval = ((rexp as ConstrainImpl).featureReference as Grouped);				 	 
				 	if(rval.selected)
				 	{
				 		new Boolean(lval < ((rval as Feature).attribute as modelMDD2.Number).value);
				 	}
				 	new Boolean(false)
				 }
				 else if ((lexp as ConstrainImpl).featureReference instanceof Feature && (rexp as ConstrainImpl).constrainValue instanceof modelMDD2.Number){
				 	val rval = ((rexp as ConstrainImpl).constrainValue as modelMDD2.Number).value;
				 	val lval = ((lexp as ConstrainImpl).featureReference as Grouped);				 	 
				 	if(lval.selected)
				 	{
				 		new Boolean(((lval as Feature).attribute as modelMDD2.Number).value < rval);
				 	}
				 	else{
				 		new Boolean(false);
				 	}
				 }
				 case "greaterThan" :
				 if ((lexp as ConstrainImpl).constrainValue instanceof modelMDD2.Number && (rexp as ConstrainImpl).featureReference instanceof Feature){
				 	val lval = ((lexp as ConstrainImpl).constrainValue as modelMDD2.Number).value;
				 	val rval = ((rexp as ConstrainImpl).featureReference as Grouped);				 	 
				 	if(rval.selected)
				 	{
				 		new Boolean(lval > ((rval as Feature).attribute as modelMDD2.Number).value);
				 	}
				 	new Boolean(false)
				 }
				 else if ((lexp as ConstrainImpl).featureReference instanceof Feature && (rexp as ConstrainImpl).constrainValue instanceof modelMDD2.Number){
				 	val rval = ((rexp as ConstrainImpl).constrainValue as modelMDD2.Number).value;
				 	val lval = ((lexp as ConstrainImpl).featureReference as Grouped);				 	 
				 	if(lval.selected)
				 	{
				 		new Boolean(((lval as Feature).attribute as modelMDD2.Number).value > rval);
				 	}
				 	else{
				 		new Boolean(false);
				 	}
				 }
				 case "lessOrEquals" :
				 if ((lexp as ConstrainImpl).constrainValue instanceof modelMDD2.Number && (rexp as ConstrainImpl).featureReference instanceof Feature){
				 	val lval = ((lexp as ConstrainImpl).constrainValue as modelMDD2.Number).value;
				 	val rval = ((rexp as ConstrainImpl).featureReference as Grouped);				 	 
				 	if(rval.selected)
				 	{
				 		new Boolean(lval <= ((rval as Feature).attribute as modelMDD2.Number).value);
				 	}
				 	new Boolean(false)
				 }
				 else if ((lexp as ConstrainImpl).featureReference instanceof Feature && (rexp as ConstrainImpl).constrainValue instanceof modelMDD2.Number){
				 	val rval = ((rexp as ConstrainImpl).constrainValue as modelMDD2.Number).value;
				 	val lval = ((lexp as ConstrainImpl).featureReference as Grouped);				 	 
				 	if(lval.selected)
				 	{
				 		new Boolean(((lval as Feature).attribute as modelMDD2.Number).value <= rval);
				 	}
				 	else{
				 		new Boolean(false);
				 	}
				 }
				 case "greaterOrEquals" :
				 if ((lexp as ConstrainImpl).constrainValue instanceof modelMDD2.Number && (rexp as ConstrainImpl).featureReference instanceof Feature){
				 	val lval = ((lexp as ConstrainImpl).constrainValue as modelMDD2.Number).value;
				 	val rval = ((rexp as ConstrainImpl).featureReference as Grouped);				 	 
				 	if(rval.selected)
				 	{
				 		new Boolean(lval >= ((rval as Feature).attribute as modelMDD2.Number).value);
				 	}
				 	new Boolean(false)
				 }
				 else if ((lexp as ConstrainImpl).featureReference instanceof Feature && (rexp as ConstrainImpl).constrainValue instanceof modelMDD2.Number){
				 	val rval = ((rexp as ConstrainImpl).constrainValue as modelMDD2.Number).value;
				 	val lval = ((lexp as ConstrainImpl).featureReference as Grouped);				 	 
				 	if(lval.selected)
				 	{
				 		new Boolean(((lval as Feature).attribute as modelMDD2.Number).value >= rval);
				 	}
				 	else{
				 		new Boolean(false);
				 	}
				 }
				 case "equals" :
				 if ((lexp as ConstrainImpl).constrainValue instanceof modelMDD2.Number && (rexp as ConstrainImpl).featureReference instanceof Feature){
				 	val lval = ((lexp as ConstrainImpl).constrainValue as modelMDD2.Number).value;
				 	val rval = ((rexp as ConstrainImpl).featureReference as Grouped);				 	 
				 	if(rval.selected)
				 	{
				 		new Boolean(lval == ((rval as Feature).attribute as modelMDD2.Number).value);
				 	}
				 	new Boolean(false)
				 }
				 else if ((lexp as ConstrainImpl).featureReference instanceof Feature && (rexp as ConstrainImpl).constrainValue instanceof modelMDD2.Number){
				 	val rval = ((rexp as ConstrainImpl).constrainValue as modelMDD2.Number).value;
				 	val lval = ((lexp as ConstrainImpl).featureReference as Grouped);				 	 
				 	if(lval.selected)
				 	{
				 		new Boolean(((lval as Feature).attribute as modelMDD2.Number).value == rval);
				 	}
				 	else{
				 		new Boolean(false);
				 	}
				}
				 case "notEquals" :
				 if ((lexp as ConstrainImpl).constrainValue instanceof modelMDD2.Number && (rexp as ConstrainImpl).featureReference instanceof Feature){
				 	val lval = ((lexp as ConstrainImpl).constrainValue as modelMDD2.Number).value;
				 	val rval = ((rexp as ConstrainImpl).featureReference as Grouped);				 	 
				 	if(rval.selected)
				 	{
				 		new Boolean(lval != ((rval as Feature).attribute as modelMDD2.Number).value);
				 	}
				 	new Boolean(false)
				 }
				 else if ((lexp as ConstrainImpl).featureReference instanceof Feature && (rexp as ConstrainImpl).constrainValue instanceof modelMDD2.Number){
				 	val rval = ((rexp as ConstrainImpl).constrainValue as modelMDD2.Number).value;
				 	val lval = ((lexp as ConstrainImpl).featureReference as Grouped);				 	 
				 	if(lval.selected)
				 	{
				 		new Boolean(((lval as Feature).attribute as modelMDD2.Number).value != rval);
				 	}
				 	else{
				 		new Boolean(false);
				 	}
				 }
				 case "disjunction":
				 if ((lexp as ConstrainImpl).featureReference instanceof Feature && (rexp as ConstrainImpl).featureReference instanceof Feature){
				 	val lval = ((lexp as ConstrainImpl).featureReference as Grouped).selected;
				 	val rval = ((rexp as ConstrainImpl).featureReference as Grouped).selected;				 	 
				 	new Boolean(lval || rval);
				 }
				 case "conjunction" :
				 if ((lexp as ConstrainImpl).featureReference instanceof Feature && (rexp as ConstrainImpl).featureReference instanceof Feature){
				 	val lval = ((lexp as ConstrainImpl).featureReference as Grouped).selected;
				 	val rval = ((rexp as ConstrainImpl).featureReference as Grouped).selected;				 	 
				 	new Boolean(lval && rval);				 	
				 }
			}
			
		}
	
	
	def static getPath(Constrain exp){
		var feature = exp.featureReference;
		var path = "" + getPath(feature.eContainer, "" /*feature.name*/);//.map[name + (if(eContainer instanceof Group) '.'+(eContainer as Group).name else '')].reduce[iterator, accumulator| accumulator + '.'+iterator];
		return path.substring(path.indexOf('.') +1 );
	}
	
	def static getPath(EObject obj, String path){
		if(obj.eContainer == null) 
			path 
		else
		getPath(obj.eContainer, switch (obj){
			XorImpl : obj.name
			OrImpl : obj.name
			OptionalImpl : obj.name
			MandatoryImpl : obj.name
			FeatureImpl : obj.name
			ModelImpl : obj.name
			default: ''
		} + "." + path)
	}
	
	def static dispatch constraint(EObject it){
		true
	}
	
	def static dispatch constraint(Group it){
		featureNameAreDistinct && featureNameDifferentFromGroupName
	}
	
	
	def static featureNameAreDistinct(Group it) {
		return grouped.forall[f1 | grouped.filter[f2 | f1.name.equalsIgnoreCase(f2.name)].length == 1]
	}
	
	def static isEmpty(Mandatory feature){
		return (feature.subfeature.size == 0) && (feature.groups.size == 0)
	}
	
	def static checkRangeValidity(Feature f){			
			// First filter all features that are not a RangeImpl. Then check forall, that lower value is less than upper value.
			//return f.attributes.filter[f.attributes.forall[a  | a instanceof RangeImpl ]].forall[a | (a as RangeImpl).upper > (a as RangeImpl).lower];	
			if(f.attribute instanceof RangeImpl){
				val atr = (f.attribute as RangeImpl);
				return atr.upper > atr.lower
			}
	}
	
}