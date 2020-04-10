implement spring cloud gateway and spring cloud config

this is simple spring cloud gateway project, where i put router config file in repository. this project contain 4 sub project

sjf-gateway => spring cloud gateway
router-config => spring cloud config
first-service => simple micro services project
second-service => simple micro services project


we have 2 micro service, where both can only access through sjf-gateway.

first-service using port 8081 http://localhost:8081/employee/message

second-service using port 8082 http://localhost:8082/consumer/message

to access url above, we can access through sjf-gateway with url below :

http://localhost:8089/employee/message 

http://localhost:8089/consumer/message

router configuration under router-config project on port 8888


source :

https://www.javainuse.com/spring/cloud-gateway

https://spring.io/guides/gs/centralized-configuration/

https://cloud.spring.io/spring-cloud-gateway/reference/html/#gateway-starter

