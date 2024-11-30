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

Planilha preenchida e inserida nos arquivos acima.

