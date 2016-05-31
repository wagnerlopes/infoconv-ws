package br.gov.serpro.infoconv.ws.cpf;

import static org.junit.Assert.assertEquals;

import java.net.URL;
import java.util.Properties;

import org.junit.Before;
import org.junit.Test;

/**
 * Esta classe tem como finalidade testar os casos de falha no acesso ao
 * sistema.
 * 
 * "ACS - Erro 01 - Acesso negado. CPF do usuário que está fazendo a requisição é inválido."
 * Quando o CPF do usuário fornecido na requisição tem sua estrutura inválida
 * quanto a sua formação, provavelmente ele foi enviado com máscara. Deve-se
 * mandar apenas um CPF do usuário e somente os 11 dígitos sem a máscara.
 * 
 * "ACS - Erro 02 - Acesso negado. CNPJ do convenente não informado." O campo
 * destinado ao CNPJ no certificado pode estar em branco. Pode ocorrer se o
 * certificado não for do tipo e-Equipamento ou se for 26Manual Técnico do
 * Sistema InfoConv-WS Capítulo 5 – Mensagens de erro gerado para testes em
 * homologação e, por alguma configuração, o campo CNPJ está em branco ou foi
 * suprido.
 * 
 * "ACS - Erro 03 - Acesso negado. CNPJ não cadastrado e sem acesso ao sistema."
 * O convenente não está devidamente cadastrado no sistema.
 * 
 * "ACS - Erro 04 - Acesso negado. Endereço IP não habilitado." O endereço IP de
 * onde partiu a requisição não está habilitado. Será necessário informar o IP
 * do computador ou Servidor que esteja conectado a Internet, ou seja, será
 * necessário informar os IPs “quentes”.
 * 
 * "ACS - Erro 05 - Acesso negado. CNPJ não habilitado e sem acesso à esse
 * sistema/perfil." O convenente não está habilitado para acessar este sistema
 * e/ou perfil.
 * 
 * "ACS - Erro 06 - Acesso negado. CNPJ sem informações de contrato para esse
 * sistema." O convenente não tem informações de contrato com o SERPRO para
 * acesso a esse sistema.
 * 
 * "ACS - Erro 07 - Acesso negado. Data de término do convênio não informada."
 * Não foi informada no cadastro a data de término do convênio com a Secretaria
 * da Receita Federal do Brasil. 27Manual Técnico do Sistema InfoConv-WS
 * 
 * Capítulo 5 – Mensagens de erro
 * "ACS - Erro 08 - Acesso negado. Convênio expirado." Tentativa de acesso por
 * um convênio já expirado (data de término já passada).
 * 
 * "ACS - Erro 09 - Acesso negado. Convênio suspenso." Tentativa de acesso por
 * um convênio suspenso pela Secretaria da Receita Federal do Brasil.
 * 
 * "ACS - Erro 10 - Acesso negado. Convênio revogado." Tentativa de acesso de um
 * convênio revogado pela Secretaria da Receita Federal do Brasil.
 * 
 * "ACS - Erro 11 - Acesso negado. Tipo de ônus não informado para esse
 * convênio." Não foi informado no cadastro se o convênio tem ônus para a
 * Secretaria da Receita Federal do Brasil ou não.
 * 
 * "ACS - Erro 12 - Acesso negado. Data de início do contrato não informada."
 * Não foi informada no cadastro a data de início do contrato com o SERPRO.
 * 
 * "ACS - Erro 13 - Acesso negado. Contrato fora do período de vigência."
 * Tentativa de acesso anterior ao início do período de vigência do contrato.
 * 28Manual Técnico do Sistema InfoConv-WS
 * 
 * Capítulo 5 – Mensagens de erro "ACS - Erro 14 - Acesso negado. Data de
 * término do contrato não informada." Não foi informada no cadastro a data de
 * término do contrato com o SERPRO.
 * 
 * "ACS - Erro 15 - Acesso negado. Contrato fora do período de vigência."
 * Tentativa de acesso posterior ao final do período de vigência do contrato.
 * 
 * "ACS - Erro 16 - Acesso negado. Data de assinatura do termo de
 * responsabilidade não informada para esse convênio." Não foi informada no
 * cadastro a data de assinatura do termo de responsabilidade.
 * 
 * "ACS - Erro 17 - Acesso negado. Data de assinatura do termo de
 * responsabilidade não permite esse acesso." Tentativa de acesso anterior à
 * assinatura do termo de responsabilidade.
 * 
 * "ACS - Erro 17 - Acesso negado. Data de assinatura do termo de
 * responsabilidade não permite esse acesso." Tentativa de acesso anterior à
 * assinatura do termo de responsabilidade. 29Manual Técnico do Sistema
 * InfoConv-WS
 * 
 * Capítulo 5 – Mensagens de erro “ACS - Erro 96 - Ocorreu um erro no
 * processamento dessa requisição. Erro na localização das informações de
 * contrato para esse convênio.” Este erro ocorre quando não é possível
 * encontrar referência à entidade convenente na tabela de contratos. Não deve
 * ocorrer.
 * 
 * “ACS - Erro 97 - Ocorreu um erro no processamento dessa requisição.
 * Persistindo o problema, entre em contato com a CAS - Central de Atendimento
 * do SERPRO.” Houve um erro na conexão com o banco de dados. Caso o erro
 * persista, favor entrar em contato com a CAS.
 * 
 * "ACS - Erro 98 - Nenhum identificador foi informado para registrar o acesso."
 * Ocorre quando houve um erro na chamada no registro de acesso. Não deve
 * ocorrer.
 * 
 * "ACS - Erro 99 - Ocorreu um erro no processamento dessa requisição." Ocorre
 * quando houve um erro no processamento da requisição, mas o banco para
 * registro do erro encontra-se fora do ar. Caso o erro persista, favor entrar
 * em contato com a CAS.
 * 
 * "ACS - Erro 00 - Erro " numErro "desconhecido. Persistindo o erro, favor
 * entrar em contato com a CAS."
 * 
 * 
 *
 */
public class ErrosDeAcessoTest {

	private ConsultarCPFSoap consultarCPFSoap;

	private static String ACS_01 = "ACS - Erro 01 - Acesso negado. CPF do usuário que está fazendo a requisição é inválido.";

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
	public void consultarCPFDoConsultanteInvalido() {
		
		String CPF_INVALIDO = "";

		ArrayOfPessoaPerfil1 aPerfil1 = this.consultarCPFSoap.consultarCPFP1("79506240949", CPF_INVALIDO);
		PessoaPerfil1 pessoa = aPerfil1.getPessoaPerfil1().get(0);
		assertEquals(pessoa.getErro(), ACS_01);
	}
	

}
