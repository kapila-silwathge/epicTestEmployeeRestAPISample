# epicTestEmployeeRestAPISample
epic tech test - practical coding challenge : Rest API
Spring Boot 2 + Basicauth + Spring Data JPA + Hibernate + MySQL + SpringBootTest 

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

## Testing

SpringBootTest: integraton test are done for all

todo: configuring in-memory db for tests
