
package br.gov.serpro.infoconv.ws.cpf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPessoaPerfil3A complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPessoaPerfil3A">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PessoaPerfil3A" type="{https://hom-infoconv.receita.fazenda.gov.br/ws/cpf/}PessoaPerfil3A" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPessoaPerfil3A", propOrder = {
    "pessoaPerfil3A"
})
public class ArrayOfPessoaPerfil3A {

    @XmlElement(name = "PessoaPerfil3A", nillable = true)
    protected List<PessoaPerfil3A> pessoaPerfil3A;

    /**
     * Gets the value of the pessoaPerfil3A property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pessoaPerfil3A property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPessoaPerfil3A().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PessoaPerfil3A }
     * 
     * 
     */
    public List<PessoaPerfil3A> getPessoaPerfil3A() {
        if (pessoaPerfil3A == null) {
            pessoaPerfil3A = new ArrayList<PessoaPerfil3A>();
        }
        return this.pessoaPerfil3A;
    }

}
