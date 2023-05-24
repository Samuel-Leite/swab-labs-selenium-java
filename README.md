# PROJETO AUTOMAÇÃO SELENIUM COM JAVA UTILIZANDO CUCUMBER E GHERKIN

O projeto foi desenvolvido com o proposito de treinamento visando automatizar as funcionalidades da plataforma Swag Labs.

## Pre-Requisitos
* Java 11 JDK
* Maven 3.8.6
* Navegadores Web: Chrome, Edge e o Firefox
* Intellij IDE
* Plugins do Intellij IDE:
  * Cucumber for Java
  * Gherkin
  * Ideolog
  * Selenium plugin
  * Lombok
  * SonarLint

## Estrutura do Projeto
| Diretório                      | Finalidade                                                                                                        |
|--------------------------------|-------------------------------------------------------------------------------------------------------------------|
| src/main/java/pageObjects      | Local para criar as pages objects visando a manutenção do projeto                                                 |
| src/main/java/steps            | Local para criar as classes que representam os steps definitions do cucumber                                      |
| src/main/java/utils            | Local para criar as classes para gerar dados fakes e a configuração base de todo o projeto                        |
| src/test/java/runner           | Local para iniciar os testes via cucumber                                                                         |
| src/test/resources             | Local com os arquivos referenciando as credenciais e browsers assim como a configuração do relatório Extent Spark |
| src/test/resources/drivers     | Local com os arquivos dos drivers dos respectivos browsers                                                        |
| src/test/resources/features    | Local informando os cenários de testes em linguagem Gherkin                                                       |
