# epicTestEmployeeRestAPISample
epic tech test - practical coding challenge : Rest API

## db


expects Mysql db 'epictest' running on localhost on port 3306

schema : epictest

host   : localhost

port   : 3306


(jdbc:mysql://localhost:3306/epictest?useSSL=false)

### update db username and password in application.properties file

spring.datasource.username = xxxxx

spring.datasource.password = xxxxx


## Security

basicauth is implemented

  user name=epictest
  
  user password=password
  
optional todo : OAuth or JWT implementation 
