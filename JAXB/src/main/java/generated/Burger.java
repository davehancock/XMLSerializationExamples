//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7-b41 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.18 at 10:13:06 PM BST 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for burger complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="burger">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="meatWeight" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="meatType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sauce" type="{}sauce"/>
 *         &lt;element name="withBread" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "burger", propOrder = {
    "meatWeight",
    "meatType",
    "sauce",
    "withBread"
})
public class Burger {

    protected int meatWeight;
    @XmlElement(required = true)
    protected String meatType;
    @XmlElement(required = true)
    protected Sauce sauce;
    protected boolean withBread;

    /**
     * Gets the value of the meatWeight property.
     * 
     */
    public int getMeatWeight() {
        return meatWeight;
    }

    /**
     * Sets the value of the meatWeight property.
     * 
     */
    public void setMeatWeight(int value) {
        this.meatWeight = value;
    }

    /**
     * Gets the value of the meatType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeatType() {
        return meatType;
    }

    /**
     * Sets the value of the meatType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeatType(String value) {
        this.meatType = value;
    }

    /**
     * Gets the value of the sauce property.
     * 
     * @return
     *     possible object is
     *     {@link Sauce }
     *     
     */
    public Sauce getSauce() {
        return sauce;
    }

    /**
     * Sets the value of the sauce property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sauce }
     *     
     */
    public void setSauce(Sauce value) {
        this.sauce = value;
    }

    /**
     * Gets the value of the withBread property.
     * 
     */
    public boolean isWithBread() {
        return withBread;
    }

    /**
     * Sets the value of the withBread property.
     * 
     */
    public void setWithBread(boolean value) {
        this.withBread = value;
    }

}