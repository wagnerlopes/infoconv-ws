
package br.gov.serpro.infoconv.ws.cpf;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfPessoaPerfilD complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPessoaPerfilD">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PessoaPerfilD" type="{https://hom-infoconv.receita.fazenda.gov.br/ws/cpf/}PessoaPerfilD" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPessoaPerfilD", propOrder = {
    "pessoaPerfilD"
})
public class ArrayOfPessoaPerfilD {

    @XmlElement(name = "PessoaPerfilD", nillable = true)
    protected List<PessoaPerfilD> pessoaPerfilD;

    /**
     * Gets the value of the pessoaPerfilD property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pessoaPerfilD property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPessoaPerfilD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PessoaPerfilD }
     * 
     * 
     */
    public List<PessoaPerfilD> getPessoaPerfilD() {
        if (pessoaPerfilD == null) {
            pessoaPerfilD = new ArrayList<PessoaPerfilD>();
        }
        return this.pessoaPerfilD;
    }

}
