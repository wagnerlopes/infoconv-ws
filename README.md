# infoconv-ws

Cliente simples gerado pelo Apache CXF 2.3.1-patch-01

Com este projeto você poderá testar seu certificado nas diversas situações previstas nas classes de testes. 

## Como utilizar

 - Faça o clone do projeto.
 - Abra o projeto com sua IDE favorita.
 - Visualize a classe CPFTest
 - Atualize as informações de localização e senhas do seu certificado.
 - Execute os testes e confira se seu certificado está OK.

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




# Pré-requisitos
###JDK versão 6 ou superior
###Apache Maven versão 2.2 ou superior

