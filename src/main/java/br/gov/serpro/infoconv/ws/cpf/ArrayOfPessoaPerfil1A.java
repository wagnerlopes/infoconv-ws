
package br.gov.serpro.infoconv.ws.cpf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPessoaPerfil1A complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPessoaPerfil1A">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PessoaPerfil1A" type="{https://hom-infoconv.receita.fazenda.gov.br/ws/cpf/}PessoaPerfil1A" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPessoaPerfil1A", propOrder = {
    "pessoaPerfil1A"
})
public class ArrayOfPessoaPerfil1A {

    @XmlElement(name = "PessoaPerfil1A", nillable = true)
    protected List<PessoaPerfil1A> pessoaPerfil1A;

    /**
     * Gets the value of the pessoaPerfil1A property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pessoaPerfil1A property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPessoaPerfil1A().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PessoaPerfil1A }
     * 
     * 
     */
    public List<PessoaPerfil1A> getPessoaPerfil1A() {
        if (pessoaPerfil1A == null) {
            pessoaPerfil1A = new ArrayList<PessoaPerfil1A>();
        }
        return this.pessoaPerfil1A;
    }

}
