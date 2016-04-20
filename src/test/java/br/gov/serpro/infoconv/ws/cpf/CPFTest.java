package br.gov.serpro.infoconv.ws.cpf;

import static org.junit.Assert.*;

import java.net.URL;
import java.util.Properties;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 * Esta classe tem como finalidade cobrir todos os tipos de retorno previstos
 * pelo webservice de CPF.
 * 
 * "CPF - Erro 01 - Ocorreu um erro no processamento dessa requisição. Erro na
 * conexão com o banco de dados servidor." Erro no momento da conexão com o
 * banco de dados servidor. A requisição não pode ser atendida.
 * 
 * "CPF - Erro 02 - Nenhum identificador informado para consulta." A lista de
 * números de CPF consultada está vazia.
 * 
 * "CPF - Erro 03 - Ocorreu um erro no processamento dessa requisição. Erro na
 * consulta das informações do CPF." Ocorreu um erro na consulta às informações
 * de CPF. A requisição não pode ser atendida.
 * 
 * "CPF - Erro 04 – CPF não encontrado." Ocorre quando o CPF enviado na
 * requisição não existe.
 * 
 * "CPF - Erro 05 – CPF já informado nessa consulta." Ocorre quando o CPF já foi
 * consultado na mesma requisição.
 * 
 * "CPF - Erro 06 – CPF inválido." Ocorre quando o CPF informado para consulta
 * está com o dígito verificador incorreto ou quando o CPF informado não está
 * dentro do padrão indicado no manual. 32Manual Técnico do Sistema InfoConv-WS
 * Capítulo 5 – Mensagens de erro
 * 
 * "CPF - Erro 07 – No máximo 50 itens podem ser consultados de cada vez."
 * Ocorre no qüinquagésimo primeiro CPF, quando são consultados mais de 50 CPFs
 * de uma única vez. Os CPF excedentes são ignorados.
 * 
 * "CPF - Erro 08 - Certificado Digital deve ser do Tipo e- Equipamento.” Ocorre
 * quando a requisição é feita usando um certificado que não é do tipo
 * e-Equipamento/e-Servidor (um certificado do tipo e-CPF ou e-CNPJ, por
 * exemplo).
 * 
 * "CPF - Erro 00 - Erro " numErro "desconhecido. Persistindo o erro, favor
 * entrar em contato com a CAS." Indica que houve um erro não catalogado. Caso o
 * erro persista, favor entrar em contato com a CAS.
 *
 */
public class CPFTest {

	private ConsultarCPFSoap consultarCPFSoap;

	private static String MSG_00 = "CPF - Erro 00 - Erro \" numErro \"desconhecido. Persistindo o erro, favor entrar em contato com a CAS.";
	private static String MSG_01 = "CPF - Erro 01 - Ocorreu um erro no processamento dessa requisição. Erro na conexão com o banco de dados servidor.";
	private static String MSG_02 = "CPF - Erro 02 - Nenhum identificador informado para consulta.";
	private static String MSG_03 = "CPF - Erro 03 - Ocorreu um erro no processamento dessa requisição. Erro na consulta das informações do CPF.";
	private static String MSG_04 = "CPF - Erro 04 - CPF não encontrado.";
	private static String MSG_05 = "CPF - Erro 05 – CPF já informado nessa consulta.";
	private static String MSG_06 = "CPF - Erro 06 - CPF Inválido.";
	private static String MSG_07 = "CPF - Erro 07 – No máximo 50 itens podem ser consultados de cada vez.";
	private static String MSG_08 = "CPF - Erro 08 - Certificado Digital deve ser do Tipo e- Equipamento.";

	private static String CPF_CONSULTANTE = "79506240949";

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

	/**
	 * "CPF - Erro 02 - Nenhum identificador informado para consulta." A lista
	 * de números de CPF consultada está vazia.
	 */
	@Test
	public void consultarCPFNaoInformado() {

		ArrayOfPessoaPerfil1 aPerfil1 = this.consultarCPFSoap.consultarCPFP1("", CPF_CONSULTANTE);
		PessoaPerfil1 pessoa = aPerfil1.getPessoaPerfil1().get(0);
		assertEquals(MSG_02, pessoa.getErro());
	}

	/**
	 * "CPF - Erro 04 – CPF não encontrado." Ocorre quando o CPF enviado na
	 * requisição não existe.
	 */
	@Test
	public void consultarCPFInexistente() {

		ArrayOfPessoaPerfil1 aPerfil1 = this.consultarCPFSoap.consultarCPFP1("79506240949", CPF_CONSULTANTE);
		PessoaPerfil1 pessoa = aPerfil1.getPessoaPerfil1().get(0);
		assertEquals(MSG_04, pessoa.getErro());
	}

	/**
	 * "CPF - Erro 05 – CPF já informado nessa consulta." Ocorre quando o CPF já
	 * foi consultado na mesma requisição.
	 */
	@Test
	public void consultarCPFJaInformado() {

		ArrayOfPessoaPerfil1 aPerfil1 = this.consultarCPFSoap.consultarCPFP1("82546010549;82546010549;82546010549",
				CPF_CONSULTANTE);
		PessoaPerfil1 pessoa = aPerfil1.getPessoaPerfil1().get(0);
		assertEquals(MSG_05, pessoa.getErro());
	}

	/**
	 * "CPF - Erro 06 – CPF inválido." Ocorre quando o CPF informado para
	 * consulta está com o dígito verificador incorreto ou quando o CPF
	 * informado não está dentro do padrão indicado no manual. 32Manual Técnico
	 * do Sistema InfoConv-WS Capítulo 5 – Mensagens de erro
	 */
	@Test
	public void consultarCPFInvalido() {

		ArrayOfPessoaPerfil1 aPerfil1 = this.consultarCPFSoap.consultarCPFP1("12312312312", CPF_CONSULTANTE);
		PessoaPerfil1 pessoa = aPerfil1.getPessoaPerfil1().get(0);
		assertEquals(MSG_06, pessoa.getErro());
	}

	/**
	 * "CPF - Erro 07 – No máximo 50 itens podem ser consultados de cada vez."
	 * Ocorre no qüinquagésimo primeiro CPF, quando são consultados mais de 50
	 * CPFs de uma única vez. Os CPF excedentes são ignorados.
	 */
	@Test
	public void consultarCPFLimiteDe50CPFs() {

		// 60 cpfs nesta lista.
		String LISTA = "79506240949;79506240949;79506240949;79506240949;79506240949;79506240949;79506240949;79506240949;79506240949;79506240949;79506240949;79506240949;79506240949;79506240949;79506240949;79506240949;79506240949;79506240949;79506240949;79506240949;79506240949;79506240949;79506240949;79506240949;79506240949;79506240949;79506240949;79506240949;79506240949;79506240949;79506240949;79506240949;79506240949;79506240949;79506240949;79506240949;79506240949;79506240949;79506240949;79506240949;79506240949;79506240949;79506240949;79506240949;79506240949;79506240949;79506240949;79506240949;79506240949;79506240949;79506240949;79506240949;79506240949;79506240949;79506240949;79506240949;79506240949;79506240949;79506240949;79506240949";
		
		ArrayOfPessoaPerfil1 aPerfil1 = this.consultarCPFSoap.consultarCPFP1(LISTA, CPF_CONSULTANTE);
		PessoaPerfil1 pessoa = aPerfil1.getPessoaPerfil1().get(0);		
		assertEquals(MSG_07, pessoa.getErro());
		assertEquals(50, aPerfil1.getPessoaPerfil1().size());
	}

}
