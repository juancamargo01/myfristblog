# Myfristblog  API em java
 criando meu primeiro projeto de blog 


<h2>Tecnologias:</h2>
As tecnologias usada no porjeto sao :
Sprintg-boot
Spring-mvc
Spring-data
Spring-security
JPA
h2 postgress
thymeleaf

criada um api para post de um blog:

1 aplicação Spring boot utilizando spring MVC.

2 camada de segurança com spring security.

3 Template engine thymeleaf para renderizara spagins Html com Bootstrap.

4 Banco de dados Postgress.

5 Deploy da Aplicação feito na AWS elastic beanstalk.

6 Utilizando ums RDS na AWS usando na aplicação em cloud.



Para executar o projeto, será necessário instalar os seguintes programas:

JDK 11: Necessário para executar o projeto Java
Maven 3.5.3: Necessário para realizar o build e as  importações das bibliotecas do projeto Java
Intellij: Para desenvolvimento do projeto

Construção
Para construir o projeto com o Maven, executar os comando abaixo:

```shell script
mvn clean install
```
O comando irá baixar todas as dependências do projeto e criar um diretório target com os
artefatos construídos, que incluem o arquivo jar do projeto. 


```shell script
mvn spring-boot:run
```

O comando ira levantar um servidor H2 um banco de dados relacional escrito em Java
a aplicação ira rodar na url: 

```shell script
 http://localhost:8080/
```



