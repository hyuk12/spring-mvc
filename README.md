# spring-mvc 인프런 영한님 강의
## 프로젝트 생성
**준비물**
- Java 11 설치
- IDE: Intelli j or Eclipse 설치
( 이 과정에서 나는 Intelli j 를 사용한다)

**스프링 부트 스타터 사이트로 이동해서 스프링 프로젝트 생성**
> https://start.spring.io

- 프로젝트 선택
  - Project: Gradle Project
  - Language: Java
  - Spring Boot: 2.4.x
  (현재 2022년 11월21일 기준 2.6.3 버전)
- Project Metadata
  - Group: hello
  - Artifact: servlet
  - Name: servlet
  - Package name: hello.servlet
  - Packaging: War -> 보통은 jar로 생성을 하지만 jsp를 실행하기위해서 war로 세팅
  - Java: 11
- Dependencies: Spring Web, Lombok

**롬복 적용**
1. Preferences -> plugin -> lombok 검색후 실행(재시작)
2. Preferences -> Annotation Processors 검색 -> Enable annotation processing 체크(재시작)
3. 임의의 테스트 클래스를 만들고 @Getter, @Setter 확인하기.

## 서블릿
> 본래에 서블릿을 스프링 부트 없이 시작을 하려면, 톰캣 같은 웹 어플리케이션 서버를 직접 설치하고,
그 위에 서블릿 코드를 클래스 파일로 빌드를 한 후에 톰캣 서버를 실행하면 되지만,
그 과정이 너무 번거롭기 때문에 톰캣 서버를 내장한 스프링 부트로 실습을 진행합니다.

`@WebServlet(name = "", urlPatterns = "")` 서블릿 어노테이션
이 어노테이션을 사용하여야 된다 서블릿에서는!
- name: 서블릿 이름
- urlPatterns: URL 매핑

## HTTP 요청 메세지를 로그로 확인하는 법
`application.properties` 
```java
logging.level.org.apache.coyote.http11=debug
```
위와 같이 application.properties에 코드를 작성해 주면 
서버가 받은 HTTP 요청 메세지를 출력해줍니다.
> 참고로 운영서버에서 이렇게 모든 요청을 다 남기게 되면 성능저하가 발생할 수 있기에 개발단계에서만 적용합니다!
