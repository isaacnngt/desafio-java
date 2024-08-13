
# Projeto de Autorização de Procedimentos

O sistema de Autorização de Procedimentos é uma aplicação web que permite a gestão de regras de autorização para a realização de procedimentos médicos, bem como o registro e consulta de solicitações de autorização.

## Funcionalidades

### 1. Gerenciamento de Regras de Autorização

* Cadastro de novas regras de autorização, contendo:
    * Código do procedimento
    * Faixa etária do paciente
    * Sexo do paciente
    * Informação sobre a autorização ou não do procedimento
* Listagem de todas as regras de autorização cadastradas

### 2. Solicitação de Autorização

* Cadastro de uma nova solicitação de autorização, informando:
    * Código do procedimento
    * Idade do paciente
    * Sexo do paciente
* Verificação automática se a solicitação está de acordo com as regras de autorização cadastradas
* Exibição de mensagem informando se a solicitação foi aprovada ou negada

### 3. Consulta de Solicitações

* Listagem de todas as solicitações de autorização registradas no sistema
## Tecnologias utilizadas:

* **Java** 
* **Banco Oracle**
* [HTML5](https://developer.mozilla.org/pt-BR/docs/Web/HTML)
* [CSS3](https://developer.mozilla.org/pt-BR/docs/Web/CSS)

* [JSP](https://docs.oracle.com/javaee/5/tutorial/doc/bnajo.html)
* [HTTP Servlet](https://docs.oracle.com/javaee/7/api/javax/servlet/http/HttpServlet.html)
* [Tomcat 9](https://tomcat.apache.org/)## Estrutura do Projeto

O projeto está organizado da seguinte forma:

projeto-autorizacao/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── br/
│   │   │       └── com/
│   │   │           └── zitrus/
│   │   │               ├── controller/
│   │   │               │   └── ServletAutorizacao.java
│   │   │               ├── model/
│   │   │               │   ├── RegraAutorizacao.java
│   │   │               │   └── SolicitacaoAutorizacao.java
│   │   │               ├── repository/
│   │   │               │   ├── ImplementacaoRepositorioRegraAutorizacao.java
│   │   │               │   └── ImplementacaoRepositorioSolicitacaoAutorizacao.java
│   │   │               └── service/
│   │   │                   ├── ImplementacaoServicoAutorizacao.java
│   │   │                   └── ServicoAutorizacao.java
│   │   └── resources/
│   │       └── META-INF/
│   │           └── persistence.xml
│   └── webapp/
│       ├── WEB-INF/
│       │   ├── views/
│       │   │   ├── listarRegras.jsp
│       │   │   └── listarSolicitacoes.jsp
│       │   └── web.xml
│       └── solicitarAutorizacao.jsp
├── pom.xml
└── README.md
