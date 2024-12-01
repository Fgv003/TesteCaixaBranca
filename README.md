# Teste de Caixa Branca - UX | UI

# **Etapa 1: Erros no código**

## váriavel global  :

As variáveis foram declaradas como public, tornando a classe desprotegida, podendo comprometer a integridade dos dados

## driver MySQL :

A classe driver não está conectada de maneira correta, trazendo erros para funcionalidade do sistema


## exceções :

O tratamento de erros está genérico e basicamente omitido, agravando a manutenção do software. A utilização de classe genérica Exception, dificulta o tratamento de erros e exceções


## Url :

Faltam parâmetros essências como useSSL e ServerTimezone, podendo trazer problemas no ambiente de produção


## conexão :

A função responsável por lidar com a conexão não realiza a verificação de maneira clara e funcional. Trazendo problemas e possíveis falhas de conexão, ja que a mesma não é instanciada direto na classe.

##  MySQL Injection :

A forma como as querys estão sendo passadas, abrem brecha para comandos inadequados inseridos pelo usuários

## falta de Indentação :

A falta de indentação prejudica demais o código, dificultando a percepção e leitura do sistema. O ideal seria que o programador se preocupe com isso e siga as boas práticas de código.

# **Etapa 2: Preenchimento do Formulário :**

Planilha preenchida e inseria na branch Main.


# **Etapa 3: Grafo de Fluxo :**



# **Etapa 4: Javadoc :**

O Javadoc gerado para o código detalha as responsabilidades de cada método e atributo, permitindo que desenvolvedores compreendam facilmente a funcionalidade e a forma de uso da classe. A documentação explica o propósito de cada componente, como o tratamento das credenciais, a conexão com o banco e o uso de bibliotecas Java para realizar operações de banco de dados. Este repositório pode ser expandido e aprimorado com medidas de segurança, como a utilização de Prepared Statements para prevenir SQL Injection, e melhor tratamento de exceções para lidar com erros de forma mais robusta.

