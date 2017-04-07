# PaymentCalc
[JavaEE, Spring, AngularJS] Simple JavaEE program as part of interview. <br><br>

 The app should only calculate Annuity value/per month (in javaEE back-end) from number of periods and payment amount 
 (set in front-end). And used REST as controller and JS framework for FE. <br><br>
 
 ## Architecture
 The architecture of the project is design with Facade pattern, which provides a simplified interface 
 to a larger body of code. The code has 3 basic layers, web (SpringMVC), api (DTO entities and
 facade interfaces) and service. Controllers in web layer use only facade interfaces and DTO objects. 
 The facade impl is in service layer and provide services and mapping object from DTO to service entities. 
 Service can not used DTO object and api can not used service entities (main rule). <br>
 Front-end is created with AngularJS and Bootstrap design. The basic functionality is creating 
 POST request in angular to Spring REST api and response calculated value.<br><br>
 
 ## Run
 To run application use commands: <br>
 `mvn clean install && cd payment-calc-web && mvn tomcat7:run`
 
 ## Development
 IDE: IntelliJ IDEA 2017.1 <br>
 Java: 1.8
