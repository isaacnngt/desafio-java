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
2. Instalar o Java Development Kit (JDK):
   * Baixe o JDK da página oficial da Oracle: https://www.oracle.com/java/technologies/javase/jdk.html
   * Siga as instruções de instalação para o seu sistema operacional.

3. Instalar o Apache Tomcat:
   * Baixe o Tomcat da página oficial: https://tomcat.apache.org/
   * Descompacte o arquivo baixado em um diretório de sua preferência.

4. Configurar as variáveis de ambiente:

   JAVA_HOME:
   * No Windows:
     * Acesse as Propriedades do Sistema (botão direito em "Meu Computador" > Propriedades > Configurações avançadas do sistema > Variáveis de Ambiente).
     * Na seção "Variáveis do sistema", clique em "Novo".
     * Nome da variável: JAVA_HOME
     * Valor da variável: Caminho para a pasta onde o JDK está instalado (ex: C:\Program Files\Java\jdk-17.0.1)
     * Clique em "OK".

   CATALINA_HOME:
   * Similar ao JAVA_HOME, crie uma variável de sistema chamada CATALINA_HOME e defina o valor como o caminho para a pasta onde o Tomcat está instalado (ex: C:\Aplicativos\apache-tomcat-9.0.93).

   PATH:
   * Edite a variável de sistema PATH e adicione os seguintes caminhos:
     * %JAVA_HOME%\bin (Windows)
     * %CATALINA_HOME%\bin (Windows) ou $CATALINA_HOME/bin (Linux/macOS)

5. Configuração no IntelliJ

   Importar o projeto:
   1. Abra o IntelliJ e clique em "Open or Import".
   2. Selecione a pasta raiz do seu projeto e clique em "OK".
   3. Escolha "Import project from external model" e selecione "Maven".
   4. Clique em "Next" e siga as instruções para importar o projeto.

   Configurar o Tomcat:
   1. Vá em "Run" > "Edit Configurations".
   2. Clique no botão "+" e selecione "Tomcat Server" > "Local".
   3. Dê um nome à configuração (ex: "Tomcat 9.0.93").
   4. Em "Application server", clique em "Configure" e selecione o diretório de instalação do Tomcat.
   5. Na aba "Deployment", clique em "+" e adicione seu artefato WAR (geralmente chamado de "nome-do-projeto:war exploded").
   6. Clique em "OK" para salvar a configuração.

6. Configurar o banco de dados:
   * Certifique-se de que você tem o banco de dados Oracle instalado e configurado.
   * No IntelliJ, abra a janela "Database" (geralmente na barra lateral direita).
   * Clique no botão "+" e selecione "Data Source" > "Oracle".
   * Preencha os detalhes da conexão com o banco de dados (URL, usuário, senha).
   * Clique em "Test Connection" para verificar se a conexão está funcionando.
   * Salve a configuração.

7. Executar o projeto
   * Selecione a configuração do Tomcat: Na barra de ferramentas superior, selecione a configuração do Tomcat que você criou (ex: "Tomcat 9.0.93").
   * Clique no botão "Run" (ícone de play verde): O IntelliJ irá construir e implantar sua aplicação no Tomcat.
   * Acesse a aplicação no navegador: Abra seu navegador e acesse a URL http://localhost:8080/nome-do-seu-contexto/ (substitua "nome-do-seu-contexto" pelo nome do contexto da sua aplicação, que você pode encontrar no arquivo web.xml ou na configuração do Tomcat).
      
## **📄 Licença**
Este projeto está sob a Isaac Nunes. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

## **🤝 Contribuindo**
Contribuições são bem-vindas! Sinta-se à vontade para abrir uma issue ou enviar um pull request. 

## **📄 Demonstração e instalação do projeto - Youtube (Só clicar no vídeo)**
Este projeto foi desenvolvidor por Isaac Nunes.


[![Demonstração do meu projeto](https://img.youtube.com/vi/N4Y1JPBYStU/0.jpg)](https://youtu.be/N4Y1JPBYStU)

