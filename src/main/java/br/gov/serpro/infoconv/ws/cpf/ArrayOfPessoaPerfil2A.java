
package br.gov.serpro.infoconv.ws.cpf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPessoaPerfil2A complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPessoaPerfil2A">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PessoaPerfil2A" type="{https://hom-infoconv.receita.fazenda.gov.br/ws/cpf/}PessoaPerfil2A" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPessoaPerfil2A", propOrder = {
    "pessoaPerfil2A"
})
public class ArrayOfPessoaPerfil2A {

    @XmlElement(name = "PessoaPerfil2A", nillable = true)
    protected List<PessoaPerfil2A> pessoaPerfil2A;

    /**
     * Gets the value of the pessoaPerfil2A property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pessoaPerfil2A property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPessoaPerfil2A().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PessoaPerfil2A }
     * 
     * 
     */
    public List<PessoaPerfil2A> getPessoaPerfil2A() {
        if (pessoaPerfil2A == null) {
            pessoaPerfil2A = new ArrayList<PessoaPerfil2A>();
        }
        return this.pessoaPerfil2A;
    }

}
