
package br.gov.serpro.infoconv.ws.cpf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConsultarCPFP1AResult" type="{https://hom-infoconv.receita.fazenda.gov.br/ws/cpf/}ArrayOfPessoaPerfil1A" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "consultarCPFP1AResult"
})
@XmlRootElement(name = "ConsultarCPFP1AResponse")
public class ConsultarCPFP1AResponse {

    @XmlElement(name = "ConsultarCPFP1AResult")
    protected ArrayOfPessoaPerfil1A consultarCPFP1AResult;

    /**
     * Gets the value of the consultarCPFP1AResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPessoaPerfil1A }
     *     
     */
    public ArrayOfPessoaPerfil1A getConsultarCPFP1AResult() {
        return consultarCPFP1AResult;
    }

    /**
     * Sets the value of the consultarCPFP1AResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPessoaPerfil1A }
     *     
     */
    public void setConsultarCPFP1AResult(ArrayOfPessoaPerfil1A value) {
        this.consultarCPFP1AResult = value;
    }

}
