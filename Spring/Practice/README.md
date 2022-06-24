### 📌 Setting
- properties
    - MySQL 설정
        - spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
    - DB Source URL 설정
        - spring.datasource.url=jdbc:mysql//<IP>:<PORT>/<DB NAME>?useSSL=false&useUnicode=true&serverTimezone=Asia/Seoul
    - DB 사용자 이름 설정
        - spring.datasource.username=root
    - DB 사용자 이름에 대한 암호
        - spring.datasource.password=본인 패스워드
    - JPA 쿼리문 확인
        - spring.jpa.show-sql=true -> true일경우 쿼리문 확인이 가능하다
    - DDL(create, alter, drop) 정의
        - spring.jpa.hibernate.ddl-auto=update
    - Hibernate가 동작하면서 SQL의 가독성을 높여줌
        - spring.jpa.properties.hibernate.format_sql=ture
  - 💡 yml방식으로도 설정을 하는데 설정방법은 추후에 추가하도록 하겠다.
  <br/>
  
- 📌 Test
    - 설정을 해놓았으니깐 잘 돌아가는지 확인해보았다.
      ```java
      mport javax.persistence.*;

      @Entity
      @Table(name = "table1_Example")
      public class memo {

      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Long id;

      @Column(length = 200, nullable = false)
      private String memoTextselet;
      }
      ```
  -어노테이션 정리
      - @Entity -> DB의 테이블을 뜻한다.(spring Data JPA에선 반드시 @Entity어노테이션을 추가해야한다.)
      - @Table() -> name에 설정된 값이 DB테이블의 이름으로 명시된다.
      - @Id -> 기본키를 뜻한다.
      - @GeneratedValue -> 기본키 생성 전략을 설정한다.(내부적으로 여러 설정이가능하다.)
      - @Column -> DB Column을 명시한다.
 <br/>
  
  - 💡 이와같이 소스코드를 입력하고 실행하면 MySQL에 설정된 DB에 테이블이 생성되는걸 확인할 수 있다.
  <br/>
  
  - 참고
      - https://dev-coco.tistory.com/85
