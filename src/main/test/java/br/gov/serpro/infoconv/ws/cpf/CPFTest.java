package br.gov.serpro.infoconv.ws.cpf;

import static org.junit.Assert.*;

import java.net.URL;
import java.util.Properties;

import org.junit.Before;
import org.junit.Test;

public class CPFTest {

	private ConsultarCPFSoap consultarCPFSoap;
	
	private static String MSG_04 = "CPF - Erro 04 - CPF não encontrado.";
	
	@Before
	public void setUp() throws Exception {
		
		URL keyStoreUrl = ConsultarCPFSoap.class.getResource("/META-INF/store/infoconv.jks");
		URL trustStoreUrl = ConsultarCPFSoap.class.getResource("/META-INF/store/truststore.jks");

		Properties props = new Properties();
		props.setProperty("javax.net.ssl.keyStore", keyStoreUrl.getPath());
		props.setProperty("javax.net.ssl.keyStorePassword", "123456");
		props.setProperty("javax.net.ssl.keyStoreType", "JKS");
		props.setProperty("javax.net.ssl.trustStore", trustStoreUrl.getPath());
		props.setProperty("javax.net.ssl.trustStorePassword", "123456");
		props.setProperty("javax.net.ssl.trustStoreType", "JKS");
		props.setProperty("javax.net.debug", "ssl");
		
		System.getProperties().putAll(props);
		
		ConsultarCPF service1 = new ConsultarCPF();
        this.consultarCPFSoap = service1.getConsultarCPFSoap12();
	}

	@Test
	public void consultarCPFPerfil1() {
		
		ArrayOfPessoaPerfil1 aPerfil1 = this.consultarCPFSoap.consultarCPFP1("79506240949", "79506240949");
		PessoaPerfil1 pessoa = aPerfil1.getPessoaPerfil1().get(0);
		assertEquals(pessoa.getErro(), MSG_04);
	}

}
