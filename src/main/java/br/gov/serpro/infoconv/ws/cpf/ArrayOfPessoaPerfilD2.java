
package br.gov.serpro.infoconv.ws.cpf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPessoaPerfilD2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPessoaPerfilD2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PessoaPerfilD2" type="{https://hom-infoconv.receita.fazenda.gov.br/ws/cpf/}PessoaPerfilD2" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPessoaPerfilD2", propOrder = {
    "pessoaPerfilD2"
})
public class ArrayOfPessoaPerfilD2 {

    @XmlElement(name = "PessoaPerfilD2", nillable = true)
    protected List<PessoaPerfilD2> pessoaPerfilD2;

    /**
     * Gets the value of the pessoaPerfilD2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pessoaPerfilD2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPessoaPerfilD2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PessoaPerfilD2 }
     * 
     * 
     */
    public List<PessoaPerfilD2> getPessoaPerfilD2() {
        if (pessoaPerfilD2 == null) {
            pessoaPerfilD2 = new ArrayList<PessoaPerfilD2>();
        }
        return this.pessoaPerfilD2;
    }

}
