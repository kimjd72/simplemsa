# simplemsa
```
20200130.스터디.msa.txt
```

## 참고 : 
```
https://daddyprogrammer.org/post/4347/spring-cloud-msa-configuration-server/    # for spring msa
https://gwonsungjun.github.io/articles/2019-04/gradle_multi_module	        # for gradle multi module
https://comnic.tistory.com/23                                                   # [MSA]3. 마이크로 서비스 간 호출 #1 - Feign
```

## 프로젝트구성
```
* @EnableConfigServer @SpringBootApplication ConfigurationServerApplication # for configuration
* @EnableZuulProxy @SpringBootApplication GatewayApplication # for gateway
* @EnableEurekaServer @SpringBootApplication EurekaApplication # for Service Discovery by Eureka
* @SpringBootApplication MemberServiceApplication # service example
* @SpringBootApplication ContentsServiceApplication # service example
```


## Spring Cloud MSA(1) – Configuration server 구성

#### Configuration Server Application 구성 
```
* 서비스appliction의 설정(*.properties)을 관리할 수 있다.
* dependency : spring-cloud-config-server
```

#### Service Application 구성 
```
* cloud.config.uri: http://localhost:9000 # Configuration Server Application
```


## Spring Cloud MSA(2) – Gateway(Routing & Filter) Server by Netflix zuul
#### Configuration 서버에 Gateway Router 설정 추가
```
* router to service
* 로컬 환경 설정
	${user.home}/server-configs/zuul-gateway-local.yml
* alpha 환경 설정 추가
```


-------------------------- Spring Cloud MSA(2) – Gateway(Routing & Filter) Server by Netflix zuul

