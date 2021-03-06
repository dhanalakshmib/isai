//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.5-b16-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.07.10 at 05:31:30 PM PDT 
//


package com.google.checkout.schema._2;


/**
 * Java content class for Item complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/home/colinc/projects/apache-tomcat-5.5.12/apiv2.xsd line 85)
 * <p>
 * <pre>
 * &lt;complexType name="Item">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="item-description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="item-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="merchant-private-item-data" type="{http://checkout.google.com/schema/2}anyType" minOccurs="0"/>
 *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tax-table-selector" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unit-price" type="{http://checkout.google.com/schema/2}Money"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface Item {


    /**
     * Gets the value of the merchantPrivateItemData property.
     * 
     * @return
     *     possible object is
     *     {@link com.google.checkout.schema._2.AnyType}
     */
    com.google.checkout.schema._2.AnyType getMerchantPrivateItemData();

    /**
     * Sets the value of the merchantPrivateItemData property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.google.checkout.schema._2.AnyType}
     */
    void setMerchantPrivateItemData(com.google.checkout.schema._2.AnyType value);

    /**
     * Gets the value of the itemDescription property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getItemDescription();

    /**
     * Sets the value of the itemDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setItemDescription(java.lang.String value);

    /**
     * Gets the value of the itemName property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getItemName();

    /**
     * Sets the value of the itemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setItemName(java.lang.String value);

    /**
     * Gets the value of the taxTableSelector property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getTaxTableSelector();

    /**
     * Sets the value of the taxTableSelector property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setTaxTableSelector(java.lang.String value);

    /**
     * Gets the value of the unitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link com.google.checkout.schema._2.Money}
     */
    com.google.checkout.schema._2.Money getUnitPrice();

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.google.checkout.schema._2.Money}
     */
    void setUnitPrice(com.google.checkout.schema._2.Money value);

    /**
     * Gets the value of the quantity property.
     * 
     */
    int getQuantity();

    /**
     * Sets the value of the quantity property.
     * 
     */
    void setQuantity(int value);

}
