//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-257 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.06.03 at 09:23:03 AM COT 
//


package org.nianet.plexil.plexilxml2maude.jaxbmodel;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.nianet.plexil.plexilxml2maude.jaxbmodel.ext.ArithmeticExpression;
import org.nianet.plexil.plexilxml2maude.jaxbmodel.ext.BooleanExpression;
import org.nianet.plexil.plexilxml2maude.jaxbmodel.ext.BooleanLiteral;
import org.nianet.plexil.plexilxml2maude.jaxbmodel.ext.NodeVariable;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{}BooleanExpression" maxOccurs="2" minOccurs="2"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "booleanExpression"
})
@XmlRootElement(name = "NEBoolean")
public class NEBoolean implements BooleanExpression{

    @Override
	public String getExpression(Map<String,String> variablesContext) {
    	Object o1=this.getBooleanExpression().get(0);
    	Object o2=this.getBooleanExpression().get(1);
    	
    	String leftExp=null;
    	String rightExp=null;
    	
    
    	if (o1 instanceof BooleanExpression){
    		leftExp=((BooleanExpression)o1).getExpression(variablesContext);
    	}
    	else if (o1 instanceof JAXBElement){
    		JAXBElement o1e=((JAXBElement)o1);
    		leftExp=o1e.getValue().toString();
    		
    		//is a boolean literal
    		if (o1e.getDeclaredType()==Boolean.class){
    			leftExp=new BooleanLiteral(leftExp).getExpression(variablesContext);
    		}   
    		else if (o1e.getDeclaredType()==String.class){
    			leftExp=new NodeVariable(leftExp).getExpression(variablesContext);
    		}
    	}    	
    	else{
    		throw new RuntimeException("Invalid datatype for boolean equivalence expression:"+o1.getClass());
    	}


    	
    	if (o2 instanceof LookupOnChange){
    		rightExp=((ArithmeticExpression)o1).getExpression(variablesContext);
    	}
    	else if (o2 instanceof BooleanExpression){
    		rightExp=((BooleanExpression)o1).getExpression(variablesContext);
    	}
    	else if (o2 instanceof JAXBElement){
    		JAXBElement o2e=((JAXBElement)o2);
    		rightExp=o2e.getValue().toString();
    		
    		//is a boolean literal
    		if (o2e.getDeclaredType()==Boolean.class){
    			rightExp=new BooleanLiteral(rightExp).getExpression(variablesContext);
    		}   
    		else if (o2e.getDeclaredType()==String.class){
    			rightExp=new NodeVariable(rightExp).getExpression(variablesContext);
    		}
    		else{
    			throw new RuntimeException("Invalid datatype for boolean equivalence expression:"+o2e.getValue().toString()+":"+o2e.getDeclaredType());
    		}
    	}    	
    	else{
    		throw new RuntimeException("Invalid datatype for boolean equivalence expression:"+o1.getClass());
    	}
    	
    	return "not("+leftExp+" equ "+rightExp+")";
	}

	@XmlElementRefs({
        @XmlElementRef(name = "IsKnown", type = IsKnown.class),
        @XmlElementRef(name = "OR", type = OR.class),
        @XmlElementRef(name = "GT", type = GT.class),
        @XmlElementRef(name = "LT", type = LT.class),
        @XmlElementRef(name = "XOR", type = XOR.class),
        @XmlElementRef(name = "EQString", type = EQString.class),
        @XmlElementRef(name = "EQNumeric", type = EQNumeric.class),
        @XmlElementRef(name = "BooleanVariable", type = JAXBElement.class),
        @XmlElementRef(name = "NEString", type = NEString.class),
        @XmlElementRef(name = "LookupOnChange", type = LookupOnChange.class),
        @XmlElementRef(name = "NEInternal", type = NEInternal.class),
        @XmlElementRef(name = "BooleanValue", type = JAXBElement.class),
        @XmlElementRef(name = "EQBoolean", type = EQBoolean.class),
        @XmlElementRef(name = "LookupNow", type = LookupNow.class),
        @XmlElementRef(name = "AND", type = AND.class),
        @XmlElementRef(name = "LE", type = LE.class),
        @XmlElementRef(name = "NENumeric", type = NENumeric.class),
        @XmlElementRef(name = "EQInternal", type = EQInternal.class),
        @XmlElementRef(name = "NEBoolean", type = NEBoolean.class),
        @XmlElementRef(name = "ArrayElement", type = ArrayElement.class),
        @XmlElementRef(name = "NOT", type = NOT.class),
        @XmlElementRef(name = "GE", type = GE.class)
    })
    protected List<Object> booleanExpression;

    /**
     * Gets the value of the booleanExpression property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the booleanExpression property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBooleanExpression().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IsKnown }
     * {@link OR }
     * {@link GT }
     * {@link LT }
     * {@link EQString }
     * {@link XOR }
     * {@link EQNumeric }
     * {@link NEString }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link LookupOnChange }
     * {@link NEInternal }
     * {@link EQBoolean }
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link LookupNow }
     * {@link AND }
     * {@link NENumeric }
     * {@link LE }
     * {@link ArrayElement }
     * {@link NEBoolean }
     * {@link EQInternal }
     * {@link GE }
     * {@link NOT }
     * 
     * 
     */
    public List<Object> getBooleanExpression() {
        if (booleanExpression == null) {
            booleanExpression = new ArrayList<Object>();
        }
        return this.booleanExpression;
    }

}
