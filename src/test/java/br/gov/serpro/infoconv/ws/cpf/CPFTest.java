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
	private static String MSG_05 = "CPF - Erro 05 - CPF já informado nessa consulta.";
	private static String MSG_06 = "CPF - Erro 06 - CPF Inválido.";
	private static String MSG_07 = "CPF - Erro 07 - No máximo 50 itens podem ser pesquisados de cada vez.";
	private static String MSG_08 = "CPF - Erro 08 - Certificado Digital deve ser do Tipo e- Equipamento.";

	private static String CPF_CONSULTANTE = "79506240949";

	private static String LISTA_CPFS = "31544622287;31544630115;31544649304;31544886268;31580572200;31581676468;33722277353;33760241387;83121064053;00305727036;31545688834;31545866791;31547931000;31548660787;31549080806;31549756834;31549861700;31545912300;31550630768;31561900125;31544622104;31544622368;31544622791;31544622872;31544630700;31544649215;31544649487;31544649649;31544657234;31544657668;31546153772;31546986715;31547869887;31548180815;31554172853;31555195849;31556221800;31544894791;31553737768;31558410872;31545190097;31545220263;31545840644;31546650300;31549578472;31549713787;31551521091;31552218791;31553907787;31554652553;31544622520;31544649134;31544690363;31544827253;31544886349;31545033820;31545041504;31545068100;31545122253;31545165300;31648991220;33433763020;33533024091;34013750759;34118730278;34155279720;34354301849;34354476800;34504125315;34687041191;31545262268;31545521700;31547087315;31549136291;31550576291;31556590334;31558852387;31559620706;31560989220;31562523015";

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

		ArrayOfPessoaPerfil1 aPerfil1 = this.consultarCPFSoap.consultarCPFP1("31544649304;31544649304;82546010549",
				CPF_CONSULTANTE);
		PessoaPerfil1 pessoa = aPerfil1.getPessoaPerfil1().get(1);
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
		ArrayOfPessoaPerfil1 aPerfil1 = this.consultarCPFSoap.consultarCPFP1(LISTA_CPFS, CPF_CONSULTANTE);
		assertEquals(51, aPerfil1.getPessoaPerfil1().size());
		PessoaPerfil1 pessoa = aPerfil1.getPessoaPerfil1().get(50);		
		assertEquals(MSG_07.substring(0, 13), pessoa.getErro().substring(0, 13));
	}

}
