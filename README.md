# springbootEurekaWithZuul
- This is an example of spring boot microservices with ***Eureka and Zuul*** gateway service integration. It is an enhancement of my previous project SpringbootwithJPA-H2 which is now integrated with ***Zuul gateway API***.

## Explanation
- This is an enhancement of my last project SpringbootwithJPA-H2, which is now ***Zuul gateway API enabled***.
- This project is a complete package of ***Springboot(microservices) + Eureka(with Feign) + JPA/Hibernate + H2-In memory DB + Zuul gateway service.***

## Steps to test the application
- Start all services and hit the URLs through Postman using Zuul ***port: 8762*** instead of individual services port.
- So, if you want to hit countryclient service, then you don't need to know countryclient port number. You can just hit Zuul port with the path for countryclient. Below is an example where Zuul port number provided with the path for countryclient as ***countryservices***.  The path value is defined in the zuulgatewayservice application.yml file for countries-service with a property called ***path*** and value as ***countryservices***.

  ***http://localhost:8762/countryservices/country/detail/44***
  
- Similarly, you can hit the below URL for userdata service,

  ***http://localhost:8762/userservices/user/country/detail/44***
