# Projeto de Autorização de Procedimentos

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)
![Oracle](https://img.shields.io/badge/Oracle-F80000?style=for-the-badge&logo=oracle&logoColor=white)
![HTML5](https://img.shields.io/badge/html5-%23E34F26.svg?style=for-the-badge&logo=html5&logoColor=white)
![CSS3](https://img.shields.io/badge/css3-%231572B6.svg?style=for-the-badge&logo=css3&logoColor=white)
![Apache Tomcat](https://img.shields.io/badge/apache%20tomcat-%23F8DC75.svg?style=for-the-badge&logo=apache-tomcat&logoColor=black)

O sistema de Autorização de Procedimentos é uma aplicação web que permite a gestão de regras de autorização para a realização de procedimentos médicos, bem como o registro e consulta de solicitações de autorização.

## 🚀 Funcionalidades

### 1. Gerenciamento de Regras de Autorização

- Cadastro de novas regras de autorização, contendo:
  - Código do procedimento
  - Faixa etária do paciente
  - Sexo do paciente
  - Informação sobre a autorização ou não do procedimento
- Listagem de todas as regras de autorização cadastradas

### 2. Solicitação de Autorização

- Cadastro de uma nova solicitação de autorização, informando:
  - Código do procedimento
  - Idade do paciente
  - Sexo do paciente
- Verificação automática se a solicitação está de acordo com as regras de autorização cadastradas
- Exibição de mensagem informando se a solicitação foi aprovada ou negada

### 3. Consulta de Solicitações

- Listagem de todas as solicitações de autorização registradas no sistema

## 🛠️ Tecnologias utilizadas

- Java 17
- Banco Oracle
- [HTML5](https://developer.mozilla.org/pt-BR/docs/Web/HTML)
- [CSS3](https://developer.mozilla.org/pt-BR/docs/Web/CSS)
- [JSP](https://docs.oracle.com/javaee/5/tutorial/doc/bnajo.html)
- [HTTP Servlet](https://docs.oracle.com/javaee/7/api/javax/servlet/http/HttpServlet.html)
- [Tomcat 9](https://tomcat.apache.org/)

## 📋 Pré-requisitos

- Java Development Kit (JDK) 17
- Apache Tomcat 9
- IntelliJ IDEA
- Banco de dados Oracle

## 🔧 Instalação e Execução (Windows)

1. Clone o repositório:
   ```bash
   git clone https://github.com/isaacnngt/desafio-java.git
2. Instale o JDK 17: 
   1. Baixe o [JDK](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
   2. Siga as instruções de instalação
3. Instale o Apache Tomcat 9: 
   1. Baixe o [Tomcat](https://tomcat.apache.org/download-90.cgi)
   2. Descompacte o arquivo em um diretório de sua preferência
4. Configure as variáveis de ambiente: 
   1. JAVA\_HOME: Caminho para a pasta do JDK
   2. CATALINA\_HOME: Caminho para a pasta do Tomcat
   3. PATH: Adicione %JAVA\_HOME%\bin e %CATALINA\_HOME%\bin
5. Configuração no IntelliJ IDEA: 
   1. Importe o projeto
   1. Configure o Tomcat no IntelliJ
   1. Configure a conexão com o banco de dados Oracle
6. Execute o projeto: 
   1. Selecione a configuração do Tomcat
   1. Clique no botão "Run"
   1. Acesse a aplicação em http://localhost:8080/nome-do-seu-contexto/
      
## **📄 Licença**
Este projeto está sob a Isaac Nunes. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

## **🤝 Contribuindo**
Contribuições são bem-vindas! Sinta-se à vontade para abrir uma issue ou enviar um pull request.

Desenvolvido por Isaac Nunes

