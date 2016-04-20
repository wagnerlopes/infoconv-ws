# infoconv-ws

Cliente simples gerado pelo Apache CXF 2.3.1-patch-01

Com este projeto você poderá testar seu certificado nas diversas situações previstas nas classes de testes. 

# Pré-requisitos
 - JDK versão 6 ou superior
 - Apache Maven versão 2.2 ou superior
 - Possuir certificados do tipo e-equipamento

## Como utilizar

 - Faça o clone do projeto.
 - Abra o projeto com sua IDE favorita.
 - Visualize a classe CPFTest
 - Atualize as informações de localização e senhas do seu certificado.
 - Execute os testes e confira se seu certificado está OK.

# Mensagens de Erro de acesso

 - "ACS - Erro 01 - Acesso negado. CPF do usuário que está
fazendo a requisição é inválido."
Quando o CPF do usuário fornecido na requisição tem sua estrutura
inválida quanto a sua formação, provavelmente ele foi enviado com
máscara. Deve-se mandar apenas um CPF do usuário e somente os 11
dígitos sem a máscara.

 - "ACS - Erro 02 - Acesso negado. CNPJ do convenente não
informado."
O campo destinado ao CNPJ no certificado pode estar em branco.
Pode ocorrer se o certificado não for do tipo e-Equipamento ou se for
26Manual Técnico do Sistema InfoConv-WS
Capítulo 5 – Mensagens de
erro
gerado para testes em homologação e, por alguma configuração, o
campo CNPJ está em branco ou foi suprido.

 - "ACS - Erro 03 - Acesso negado. CNPJ não cadastrado e sem
acesso ao sistema."
O convenente não está devidamente cadastrado no sistema.

 - "ACS - Erro 04 - Acesso negado. Endereço IP não habilitado."
O endereço IP de onde partiu a requisição não está habilitado. Será
necessário informar o IP do computador ou Servidor que esteja
conectado a Internet, ou seja, será necessário informar os IPs
“quentes”.

 - "ACS - Erro 05 - Acesso negado. CNPJ não habilitado e sem
acesso à esse sistema/perfil."
O convenente não está habilitado para acessar este sistema e/ou perfil.

 - "ACS - Erro 06 - Acesso negado. CNPJ sem informações de
contrato para esse sistema."
O convenente não tem informações de contrato com o SERPRO para
acesso a esse sistema.

 - "ACS - Erro 07 - Acesso negado. Data de término do convênio
não informada."
Não foi informada no cadastro a data de término do convênio com a
Secretaria da Receita Federal do Brasil.
27Manual Técnico do Sistema InfoConv-WS

 - "ACS - Erro 08 - Acesso negado. Convênio expirado."
Tentativa de acesso por um convênio já expirado (data de término já
passada).

 - "ACS - Erro 09 - Acesso negado. Convênio suspenso."
Tentativa de acesso por um convênio suspenso pela Secretaria da
Receita Federal do Brasil.

 - "ACS - Erro 10 - Acesso negado. Convênio revogado."
Tentativa de acesso de um convênio revogado pela Secretaria da
Receita Federal do Brasil.

 - "ACS - Erro 11 - Acesso negado. Tipo de ônus não informado
para esse convênio."
Não foi informado no cadastro se o convênio tem ônus para a
Secretaria da Receita Federal do Brasil ou não.

 - "ACS - Erro 12 - Acesso negado. Data de início do contrato não
informada."
Não foi informada no cadastro a data de início do contrato com o
SERPRO.

 - "ACS - Erro 13 - Acesso negado. Contrato fora do período de
vigência."
Tentativa de acesso anterior ao início do período de vigência do
contrato.

 - "ACS - Erro 14 - Acesso negado. Data de término do contrato
não informada."
Não foi informada no cadastro a data de término do contrato com o
SERPRO.

 - "ACS - Erro 15 - Acesso negado. Contrato fora do período de
vigência."
Tentativa de acesso posterior ao final do período de vigência do
contrato.

 - "ACS - Erro 16 - Acesso negado. Data de assinatura do termo de
responsabilidade não informada para esse convênio."
Não foi informada no cadastro a data de assinatura do termo de
responsabilidade.

 - "ACS - Erro 17 - Acesso negado. Data de assinatura do termo de
responsabilidade não permite esse acesso."
Tentativa de acesso anterior à assinatura do termo de
responsabilidade.

 - "ACS - Erro 17 - Acesso negado. Data de assinatura do termo de
responsabilidade não permite esse acesso."
Tentativa de acesso anterior à assinatura do termo de
responsabilidade.

 - “ACS - Erro 96 - Ocorreu um erro no processamento dessa
requisição. Erro na localização das informações de contrato para
esse convênio.”
Este erro ocorre quando não é possível encontrar referência à entidade
convenente na tabela de contratos. Não deve ocorrer.
 - “ACS - Erro 97 - Ocorreu um erro no processamento dessa
requisição. Persistindo o problema, entre em contato com a CAS -
Central de Atendimento do SERPRO.”
Houve um erro na conexão com o banco de dados. Caso o erro
persista, favor entrar em contato com a CAS.

 - "ACS - Erro 98 - Nenhum identificador foi informado para
registrar o acesso."
Ocorre quando houve um erro na chamada no registro de acesso. Não
deve ocorrer.

 - "ACS - Erro 99 - Ocorreu um erro no processamento dessa
requisição."
Ocorre quando houve um erro no processamento da requisição, mas o
banco para registro do erro encontra-se fora do ar. Caso o erro
persista, favor entrar em contato com a CAS.

 - "ACS - Erro 00 - Erro " numErro "desconhecido. Persistindo o
erro, favor entrar em contato com a CAS."

# Mensagens de Erro do Sistema CPF

 - "CPF - Erro 01 - Ocorreu um erro no processamento dessa
requisição. Erro na conexão com o banco de dados servidor."
Erro no momento da conexão com o banco de dados servidor. A
requisição não pode ser atendida.

 - "CPF - Erro 02 - Nenhum identificador informado para
consulta."
A lista de números de CPF consultada está vazia.

 - "CPF - Erro 03 - Ocorreu um erro no processamento dessa
requisição. Erro na consulta das informações do CPF."
Ocorreu um erro na consulta às informações de CPF. A requisição
não pode ser atendida.

 - "CPF - Erro 04 – CPF não encontrado."
Ocorre quando o CPF enviado na requisição não existe.

 - "CPF - Erro 05 – CPF já informado nessa consulta."
Ocorre quando o CPF já foi consultado na mesma requisição.

 - "CPF - Erro 06 – CPF inválido."
Ocorre quando o CPF informado para consulta está com o dígito
verificador incorreto ou quando o CPF informado não está dentro do
padrão indicado no manual.

 - "CPF - Erro 07 – No máximo 50 itens podem ser consultados de
cada vez."
Ocorre no qüinquagésimo primeiro CPF, quando são consultados
mais de 50 CPFs de uma única vez. Os CPF excedentes são
ignorados.

 - "CPF - Erro 08 - Certificado Digital deve ser do Tipo e-
Equipamento.”
Ocorre quando a requisição é feita usando um certificado que não é
do tipo e-Equipamento/e-Servidor (um certificado do tipo e-CPF ou
e-CNPJ, por exemplo).

 - "CPF - Erro 00 - Erro " numErro "desconhecido. Persistindo o
erro, favor entrar em contato com a CAS."
Indica que houve um erro não catalogado. Caso o erro persista, favor
entrar em contato com a CAS.

# Mensagens de Erro do Sistema CNPJ
 - "CPJ - Erro 01 - Ocorreu um erro no processamento dessa
requisição. Erro na conexão com o banco de dados servidor."
Erro no momento da conexão com o banco de dados servidor. A
requisição não pode ser atendida.
 -  "CPJ - Erro 02 - Nenhum identificador informado para
consulta."
Não foi informado nenhum número de CNPJ para consulta.
 -  "CPJ - Erro 03 - Ocorreu um erro no processamento dessa
requisição. Erro na consulta das informações do CNPJ."
Ocorreu um erro na consulta às informações de CNPJ. A requisição
não pode ser atendida.
 -  "CPJ - Erro 04 – CNPJ não encontrado. "
Ocorre quando o CNPJ enviado na requisição não existe.
 - "CPJ - Erro 05 – CNPJ já informado nessa consulta. "
Ocorre quando o CNPJ já foi consultado na mesma requisição.
 - "CPJ - Erro 06 – CNPJ inválido. "
Ocorre quando o CNPJ informado para consulta está com o dígito
verificador incorreto ou quando o CNPJ informado não está dentro do
padrão indicado no manual.
 - "CPJ - Erro 07 – No máximo 50 itens podem ser consultados de
cada vez para este perfil."
Ocorre no qüinquagésimo primeiro CNPJ para os perfis 1 e 2, quando
são consultados mais de 50 itens de uma única vez. Os CNPJ
excedentes são ignorados.
 - "CPJ - Erro 08 – Registro indisponível no momento."
Pode ocorrer quando apenas o registro encontra-se indisponível no
momento da requisição.
 - "CPJ - Erro 09 – Sistema (CNPJ) indisponível no momento."
Pode ocorrer quando toda a base CNPJ encontra-se indisponível no
momento da requisição.
 - "CPJ - Erro 10 – Este perfil não permite consulta por lote."
Ocorre no perfil 3 do CNPJ ao tentar fazer uma requisição com mais
de 1 CNPJ.
 - "CPJ - Erro 11 - Certificado Digital deve ser do Tipo e-
Equipamento."
Ocorre quando a requisição é feita usando um certificado que não é
do tipo e-Equipamento/e-Servidor (um certificado do tipo e-CPF ou
e-CNPJ, por exemplo).
 - CPJ - Erro 00 - Erro " & numErro & "desconhecido. Persistindo
o erro, favor entrar em contato com a CAS."
Indica que houve um erro não catalogado. Caso o erro persista, favor
entrar em contato com a CAS.


