# epicTestEmployeeRestAPISample
epic tech test - practical coding challenge : Rest API

## db


expects Mysql db 'epictest' running on localhost on port 3306

* schema : epictest

* host   : localhost

* port   : 3306


(jdbc:mysql://localhost:3306/epictest?useSSL=false)

### Update db username and password in application.properties file

* spring.datasource.username = xxxxx

* spring.datasource.password = xxxxx

#### Uses  Spring Boot Data JPA with Hibernate


## Security

All REST API calls are secured with basicauth

Basicauth is implemented with Spring Boot Security

Configured user credentials :

  * user name = epictest
  
  * user password = password
  
optional todo : OAuth or JWT implementation 
