
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
 *         &lt;element name="ConsultarCPFPDResult" type="{https://hom-infoconv.receita.fazenda.gov.br/ws/cpf/}ArrayOfPessoaPerfilD" minOccurs="0"/>
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
    "consultarCPFPDResult"
})
@XmlRootElement(name = "ConsultarCPFPDResponse")
public class ConsultarCPFPDResponse {

    @XmlElement(name = "ConsultarCPFPDResult")
    protected ArrayOfPessoaPerfilD consultarCPFPDResult;

    /**
     * Gets the value of the consultarCPFPDResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPessoaPerfilD }
     *     
     */
    public ArrayOfPessoaPerfilD getConsultarCPFPDResult() {
        return consultarCPFPDResult;
    }

    /**
     * Sets the value of the consultarCPFPDResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPessoaPerfilD }
     *     
     */
    public void setConsultarCPFPDResult(ArrayOfPessoaPerfilD value) {
        this.consultarCPFPDResult = value;
    }

}
