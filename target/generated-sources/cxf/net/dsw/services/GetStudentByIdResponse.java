
package net.dsw.services;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getStudentByIdResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getStudentByIdResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StudentContainer" type="{http://services.dsw.com}studentContainerData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getStudentByIdResponse", propOrder = {
    "studentContainer"
})
public class GetStudentByIdResponse {

    @XmlElement(name = "StudentContainer")
    protected StudentContainerData studentContainer;

    /**
     * Obtiene el valor de la propiedad studentContainer.
     * 
     * @return
     *     possible object is
     *     {@link StudentContainerData }
     *     
     */
    public StudentContainerData getStudentContainer() {
        return studentContainer;
    }

    /**
     * Define el valor de la propiedad studentContainer.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentContainerData }
     *     
     */
    public void setStudentContainer(StudentContainerData value) {
        this.studentContainer = value;
    }

}
