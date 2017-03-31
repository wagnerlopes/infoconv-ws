
package br.gov.serpro.infoconv.ws.cnpj;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

/**
 * This class was generated by Apache CXF 2.3.1-patch-01
 * Tue Apr 05 10:33:24 BRT 2016
 * Generated source version: 2.3.1-patch-01
 * 
 */


@WebServiceClient(name = "ConsultarCNPJ", 
                  wsdlLocation = "https://infoconv.receita.fazenda.gov.br/ws/cnpj/consultarcnpj.asmx?wsdl",
                  targetNamespace = "https://infoconv.receita.fazenda.gov.br/ws/cnpj/") 
public class ConsultarCNPJ extends Service {

    public final static URL WSDL_LOCATION;
    public final static QName SERVICE = new QName("https://infoconv.receita.fazenda.gov.br/ws/cnpj/", "ConsultarCNPJ");
    public final static QName ConsultarCNPJSoap = new QName("https://infoconv.receita.fazenda.gov.br/ws/cnpj/", "ConsultarCNPJSoap");
    public final static QName ConsultarCNPJSoap12 = new QName("https://infoconv.receita.fazenda.gov.br/ws/cnpj/", "ConsultarCNPJSoap12");
    static {
        URL url = null;
        url =  ConsultarCNPJ.class.getResource("/META-INF/wsdl/consultarcnpj.wsdl");
        WSDL_LOCATION = url;
    }

    public ConsultarCNPJ(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ConsultarCNPJ(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ConsultarCNPJ() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     * 
     * @return
     *     returns ConsultarCNPJSoap
     */
    @WebEndpoint(name = "ConsultarCNPJSoap")
    public ConsultarCNPJSoap getConsultarCNPJSoap() {
        return super.getPort(ConsultarCNPJSoap, ConsultarCNPJSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ConsultarCNPJSoap
     */
    @WebEndpoint(name = "ConsultarCNPJSoap")
    public ConsultarCNPJSoap getConsultarCNPJSoap(WebServiceFeature... features) {
        return super.getPort(ConsultarCNPJSoap, ConsultarCNPJSoap.class, features);
    }
    /**
     * 
     * @return
     *     returns ConsultarCNPJSoap
     */
    @WebEndpoint(name = "ConsultarCNPJSoap12")
    public ConsultarCNPJSoap getConsultarCNPJSoap12() {
        return super.getPort(ConsultarCNPJSoap12, ConsultarCNPJSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ConsultarCNPJSoap
     */
    @WebEndpoint(name = "ConsultarCNPJSoap12")
    public ConsultarCNPJSoap getConsultarCNPJSoap12(WebServiceFeature... features) {
        return super.getPort(ConsultarCNPJSoap12, ConsultarCNPJSoap.class, features);
    }

}
