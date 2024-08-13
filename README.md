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
