
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
 *         &lt;element name="ConsultarCPFP2AResult" type="{https://hom-infoconv.receita.fazenda.gov.br/ws/cpf/}ArrayOfPessoaPerfil2A" minOccurs="0"/>
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
    "consultarCPFP2AResult"
})
@XmlRootElement(name = "ConsultarCPFP2AResponse")
public class ConsultarCPFP2AResponse {

    @XmlElement(name = "ConsultarCPFP2AResult")
    protected ArrayOfPessoaPerfil2A consultarCPFP2AResult;

    /**
     * Gets the value of the consultarCPFP2AResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPessoaPerfil2A }
     *     
     */
    public ArrayOfPessoaPerfil2A getConsultarCPFP2AResult() {
        return consultarCPFP2AResult;
    }

    /**
     * Sets the value of the consultarCPFP2AResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPessoaPerfil2A }
     *     
     */
    public void setConsultarCPFP2AResult(ArrayOfPessoaPerfil2A value) {
        this.consultarCPFP2AResult = value;
    }

}
