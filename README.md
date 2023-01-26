<h2>  <img align="center" height="50" src="images/univ.svg" width="50" alt=""/> University app </h2>

Welcome to the BotsCrew University app! 
It's a simple java project with console interface realized on SpringBoot. </br>
Here you can find some information about departments and lectors (employees). 
Lectors could have one degree (assistant, associate professor, professor) and work in more than one department.
All data is stored in the relational database.

**Technology solution**
* Spring Boot (v.3.0.1)
* Spring Data JPA
* Apache Tomcat (v.9.0.50)
* Java (JDK v.17)
* Maven + checkstyle plugin
* MySQL (v.8.0.22)
* Lombok
* IDE: IntelliJ Ultimate

<h2>  <img align="center" height="50" src="images/tool.png" width="50" alt=""/>  Configuration and running </h2>

1️⃣ Initialize your project by creating a fork (i.e. clone it from GitHub)</br>
2️⃣ Change datasource properties in [applications.properties](src/main/resources/application.properties) file</br>
3️⃣ Run the app</br>
4️⃣ Initialize test data to your DB running [init_test_data_to_db](src/main/resources/init_test_data_to_db.sql) file via IntelliJ Ultimate or directly in your RDBMS. You can add more test data to file </br>
5️⃣ Check greetings with some additional info in the console</br>
6️⃣️ Use commands below to pass your request and receive a response:</br>

- who is head of the department {department_name}
- show statistics of the department {department_name}
- show the average salary for the department {department_name}
- show count of employee for the department {department_name}
- global search by {template} </br>

🎉 Enjoy your time!</br>
