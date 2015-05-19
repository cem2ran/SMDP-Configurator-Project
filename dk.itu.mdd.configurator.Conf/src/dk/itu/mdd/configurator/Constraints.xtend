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
import modelMDD2.Model
import modelMDD2.impl.ConstrainImpl
import modelMDD2.Grouped
import modelMDD2.BinaryOperator
import modelMDD2.Attribute

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
	
def static Boolean checkAttributesType(Attribute left, Attribute right){
		if((left instanceof modelMDD2.Number && right instanceof modelMDD2.Number) ||
				(left instanceof modelMDD2.CString && right instanceof modelMDD2.CString) ||
				(left instanceof modelMDD2.Range && right instanceof modelMDD2.Range) ||
				(left instanceof modelMDD2.CBoolean && right instanceof modelMDD2.CBoolean) )
				return true
			else return false
	}
	
	def static dispatch Boolean constraint(Binary exp)
	{
		val lexp=exp.leftExp;
		val rexp=exp.rightExp;
		
		if((rexp as ConstrainImpl).featureReference instanceof Feature && (lexp as ConstrainImpl).featureReference instanceof Feature)
		{
		 	val left = (((lexp as ConstrainImpl).featureReference as Grouped) as Feature).attribute;
			val right = (((rexp as ConstrainImpl).featureReference as Grouped) as Feature).attribute;
			
			//we must typecheck when binary expression is composed by to "references" (out of time)
			return checkAttributesType(left, right) 
		}
		switch(BinaryOperator.getByName(exp.operator.getName()).getName.toString){
				case "lessThan" :
				if((lexp as ConstrainImpl).constrainValue instanceof modelMDD2.Number && (rexp as ConstrainImpl).constrainValue instanceof modelMDD2.Number)
				{	val lval = ((lexp as ConstrainImpl).constrainValue as modelMDD2.Number).value;
					val rval = ((rexp as ConstrainImpl).constrainValue as modelMDD2.Number).value;
					new Boolean(lval < rval);
				}
				else if ((rexp as ConstrainImpl).featureReference instanceof Feature){			 	
				 	if(!checkAttributesType((lexp as ConstrainImpl).constrainValue, (((rexp as ConstrainImpl).featureReference as Grouped) as Feature).attribute)){
				 	new Boolean(false);
				 	}
				 	else{
				 	val lval = ((lexp as ConstrainImpl).constrainValue as modelMDD2.Number).value;
				 	val rval = ((rexp as ConstrainImpl).featureReference as Grouped);				 	 
				 	new Boolean(lval < ((rval as Feature).attribute as modelMDD2.Number).value);
					}
					}
					else if ((lexp as ConstrainImpl).featureReference instanceof Feature){
				 	if(!checkAttributesType((rexp as ConstrainImpl).constrainValue, (((lexp as ConstrainImpl).featureReference as Grouped) as Feature).attribute)){
				 	new Boolean(false);
				 	}
				 	else{
					val rval = ((rexp as ConstrainImpl).constrainValue as modelMDD2.Number).value;
				 	val lval = ((lexp as ConstrainImpl).featureReference as Grouped);				 	 
				 		new Boolean(((lval as Feature).attribute as modelMDD2.Number).value < rval);	
				 		}
				 }
				 
				 case "greaterThan" :
				 if((lexp as ConstrainImpl).constrainValue instanceof modelMDD2.Number && (rexp as ConstrainImpl).constrainValue instanceof modelMDD2.Number)
				{
					val lval = ((lexp as ConstrainImpl).constrainValue as modelMDD2.Number).value;
					val rval = ((rexp as ConstrainImpl).constrainValue as modelMDD2.Number).value;
					new Boolean(lval > rval);
				}
				else if ((rexp as ConstrainImpl).featureReference instanceof Feature){			 	
				 	if(!checkAttributesType((lexp as ConstrainImpl).constrainValue, (((rexp as ConstrainImpl).featureReference as Grouped) as Feature).attribute)){
				 	new Boolean(false);
				 	}
				 	else{
				 	val lval = ((lexp as ConstrainImpl).constrainValue as modelMDD2.Number).value;
				 	val rval = ((rexp as ConstrainImpl).featureReference as Grouped);				 	 
				 	new Boolean(lval > ((rval as Feature).attribute as modelMDD2.Number).value);
				 	}
					}
					else if ((lexp as ConstrainImpl).featureReference instanceof Feature){
				 	if(!checkAttributesType((rexp as ConstrainImpl).constrainValue, (((lexp as ConstrainImpl).featureReference as Grouped) as Feature).attribute)){
				 	new Boolean(false);
				 	}
				 	else{
					val rval = ((rexp as ConstrainImpl).constrainValue as modelMDD2.Number).value;
				 	val lval = ((lexp as ConstrainImpl).featureReference as Grouped);				 	 
				 		new Boolean(((lval as Feature).attribute as modelMDD2.Number).value > rval);	
				 		}
				 }
				 
				 case "lessOrEquals" :
				 if((lexp as ConstrainImpl).constrainValue instanceof modelMDD2.Number && (rexp as ConstrainImpl).constrainValue instanceof modelMDD2.Number)
				{
					val lval = ((lexp as ConstrainImpl).constrainValue as modelMDD2.Number).value;
					val rval = ((rexp as ConstrainImpl).constrainValue as modelMDD2.Number).value;
					new Boolean(lval <= rval);
				}
				else if ((rexp as ConstrainImpl).featureReference instanceof Feature){			 	
				 	if(!checkAttributesType((lexp as ConstrainImpl).constrainValue, (((rexp as ConstrainImpl).featureReference as Grouped) as Feature).attribute)){
				 	new Boolean(false);
				 	}
				 	else{
				 	val lval = ((lexp as ConstrainImpl).constrainValue as modelMDD2.Number).value;
				 	val rval = ((rexp as ConstrainImpl).featureReference as Grouped);				 	 
				 	new Boolean(lval <= ((rval as Feature).attribute as modelMDD2.Number).value);
				 	}
					}
					else if ((lexp as ConstrainImpl).featureReference instanceof Feature){
				 	if(!checkAttributesType((rexp as ConstrainImpl).constrainValue, (((lexp as ConstrainImpl).featureReference as Grouped) as Feature).attribute)){
				 	new Boolean(false);
				 	}
				 	else{
					val rval = ((rexp as ConstrainImpl).constrainValue as modelMDD2.Number).value;
				 	val lval = ((lexp as ConstrainImpl).featureReference as Grouped);				 	 
				 		new Boolean(((lval as Feature).attribute as modelMDD2.Number).value <= rval);	
				 		}
				 }
				 
				 case "greaterOrEquals" :
				  if((lexp as ConstrainImpl).constrainValue instanceof modelMDD2.Number && (rexp as ConstrainImpl).constrainValue instanceof modelMDD2.Number)
				{
					val lval = ((lexp as ConstrainImpl).constrainValue as modelMDD2.Number).value;
					val rval = ((rexp as ConstrainImpl).constrainValue as modelMDD2.Number).value;
					new Boolean(lval >= rval);
				}
				else if ((rexp as ConstrainImpl).featureReference instanceof Feature){			 	
				 	if(!checkAttributesType((lexp as ConstrainImpl).constrainValue, (((rexp as ConstrainImpl).featureReference as Grouped) as Feature).attribute)){
				 	new Boolean(false);
				 	}
				 	else{
				 	val lval = ((lexp as ConstrainImpl).constrainValue as modelMDD2.Number).value;
				 	val rval = ((rexp as ConstrainImpl).featureReference as Grouped);				 	 
				 	new Boolean(lval >= ((rval as Feature).attribute as modelMDD2.Number).value);
				 	}
					}
					else if ((lexp as ConstrainImpl).featureReference instanceof Feature){
				 	if(!checkAttributesType((rexp as ConstrainImpl).constrainValue, (((lexp as ConstrainImpl).featureReference as Grouped) as Feature).attribute)){
				 	new Boolean(false);
				 	}
				 	else{
					val rval = ((rexp as ConstrainImpl).constrainValue as modelMDD2.Number).value;
				 	val lval = ((lexp as ConstrainImpl).featureReference as Grouped);				 	 
				 		new Boolean(((lval as Feature).attribute as modelMDD2.Number).value >= rval);	
				 		}
				 }
				 
				 case "equals" :
				 if((lexp as ConstrainImpl).constrainValue instanceof modelMDD2.Number && (rexp as ConstrainImpl).constrainValue instanceof modelMDD2.Number)
				{
					val lval = ((lexp as ConstrainImpl).constrainValue as modelMDD2.Number).value;
					val rval = ((rexp as ConstrainImpl).constrainValue as modelMDD2.Number).value;
					new Boolean(lval == rval);
				}
				else if ((rexp as ConstrainImpl).featureReference instanceof Feature){			 	
				 	if(!checkAttributesType((lexp as ConstrainImpl).constrainValue, (((rexp as ConstrainImpl).featureReference as Grouped) as Feature).attribute)){
				 	new Boolean(false);
				 	}
				 	else{
				 	val lval = ((lexp as ConstrainImpl).constrainValue as modelMDD2.Number).value;
				 	val rval = ((rexp as ConstrainImpl).featureReference as Grouped);				 	 
					new Boolean(lval == ((rval as Feature).attribute as modelMDD2.Number).value);
				 	}
					}
					else if ((lexp as ConstrainImpl).featureReference instanceof Feature){
				 	if(!checkAttributesType((rexp as ConstrainImpl).constrainValue, (((lexp as ConstrainImpl).featureReference as Grouped) as Feature).attribute)){
				 	new Boolean(false);
				 	}
				 	else{
				 	val rval = ((rexp as ConstrainImpl).constrainValue as modelMDD2.Number).value;
				 	val lval = ((lexp as ConstrainImpl).featureReference as Grouped);				 	 
				 	new Boolean(((lval as Feature).attribute as modelMDD2.Number).value == rval);	
				 		}
				 }
				 
				 case "notEquals" :
				 if((lexp as ConstrainImpl).constrainValue instanceof modelMDD2.Number && (rexp as ConstrainImpl).constrainValue instanceof modelMDD2.Number)
				{
					val lval = ((lexp as ConstrainImpl).constrainValue as modelMDD2.Number).value;
					val rval = ((rexp as ConstrainImpl).constrainValue as modelMDD2.Number).value;
					new Boolean(lval != rval);
				}
				else if ((rexp as ConstrainImpl).featureReference instanceof Feature){			 	
				 	if(!checkAttributesType((lexp as ConstrainImpl).constrainValue, (((rexp as ConstrainImpl).featureReference as Grouped) as Feature).attribute)){
				 	new Boolean(false);
				 	}
				 	else{
				 		val lval = ((lexp as ConstrainImpl).constrainValue as modelMDD2.Number).value;
				 	val rval = ((rexp as ConstrainImpl).featureReference as Grouped);				 	 
				 	new Boolean(lval != ((rval as Feature).attribute as modelMDD2.Number).value);
				 	}
					}
					 else if ((lexp as ConstrainImpl).featureReference instanceof Feature){
				 	if(!checkAttributesType((rexp as ConstrainImpl).constrainValue, (((lexp as ConstrainImpl).featureReference as Grouped) as Feature).attribute)){
				 	new Boolean(false);
				 	}
				 	else{
					val rval = ((rexp as ConstrainImpl).constrainValue as modelMDD2.Number).value;
				 	val lval = ((lexp as ConstrainImpl).featureReference as Grouped);				 	 
				 		new Boolean(((lval as Feature).attribute as modelMDD2.Number).value != rval);	
				 		}
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
	
	def static dispatch constraint(Grouped it){
		checkRangeValidity
	}
	
	def static checkRangeValidity(Grouped it){			
			// First filter all features that are not a RangeImpl. Then check forall, that lower value is less than upper value.
			//return f.attributes.filter[f.attributes.forall[a  | a instanceof RangeImpl ]].forall[a | (a as RangeImpl).upper > (a as RangeImpl).lower];
			if(attribute instanceof RangeImpl){
				val atr = (attribute as RangeImpl);
				var result = atr.upper > atr.lower
				return result
			}
	}
	
}