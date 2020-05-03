# springbootEurekaWithZuul
- This is an example of spring boot microservices with Eureka and Zuul gateway service integration. It is an enhancement of my previous project SpringbootwithJPA-H2 which is now integrated with Zuul gateway API

## Explanation
- This is an enhancement of my last project SpringbootwithJPA-H2, which is now Zuul gateway API enabled.
- This project is a complete package of ***Springboot(microservices) + Eureka(with Feign) + JPA/Hibernate + H2-In memory DB + Zuul gateway service.***

## Steps to test the application
- Start all services and hit the URLs through Postman by replacing Zuul's ***port: 8762***
- So, if you want to hit countryclient service, then you don't need the countryclient port number. You can just hit Zuul port with the prefix. Below is an example where Zuul port number provided with the prefix for countryclient as ***countryservices*** which is defined in the zuulgatewayservice application.yml file for countries-service as ***path***

  ***http://localhost:8762/countryservices/country/detail/44***
  
- Similarly, you can hit the below URL for userdata service,

  ***http://localhost:8762/userservices/user/country/detail/44***
