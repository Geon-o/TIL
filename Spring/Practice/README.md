### ๐ Setting
- properties
    - MySQL ์ค์ 
        - spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
    - DB Source URL ์ค์ 
        - spring.datasource.url=jdbc:mysql//IP:PORT/DB NAME?useSSL=false&useUnicode=true&serverTimezone=Asia/Seoul
    - DB ์ฌ์ฉ์ ์ด๋ฆ ์ค์ 
        - spring.datasource.username=root
    - DB ์ฌ์ฉ์ ์ด๋ฆ์ ๋ํ ์ํธ
        - spring.datasource.password=๋ณธ์ธ ํจ์ค์๋
    - JPA ์ฟผ๋ฆฌ๋ฌธ ํ์ธ
        - spring.jpa.show-sql=true -> true์ผ๊ฒฝ์ฐ ์ฟผ๋ฆฌ๋ฌธ ํ์ธ์ด ๊ฐ๋ฅํ๋ค
    - DDL(create, alter, drop) ์ ์
        - spring.jpa.hibernate.ddl-auto=update
    - Hibernate๊ฐ ๋์ํ๋ฉด์ SQL์ ๊ฐ๋์ฑ์ ๋์ฌ์ค
        - spring.jpa.properties.hibernate.format_sql=ture
  - ๐ก yml๋ฐฉ์์ผ๋ก๋ ์ค์ ์ ํ๋๋ฐ ์ค์ ๋ฐฉ๋ฒ์ ์ถํ์ ์ถ๊ฐํ๋๋ก ํ๊ฒ ๋ค.
  <br/>
  
- ๐ Test
    - ์ค์ ์ ํด๋์์ผ๋๊น ์ ๋์๊ฐ๋์ง ํ์ธํด๋ณด์๋ค.
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
  -์ด๋ธํ์ด์ ์ ๋ฆฌ
      - @Entity -> DB์ ํ์ด๋ธ์ ๋ปํ๋ค.(spring Data JPA์์  ๋ฐ๋์ @Entity์ด๋ธํ์ด์์ ์ถ๊ฐํด์ผํ๋ค.)
      - @Table() -> name์ ์ค์ ๋ ๊ฐ์ด DBํ์ด๋ธ์ ์ด๋ฆ์ผ๋ก ๋ช์๋๋ค.
      - @Id -> ๊ธฐ๋ณธํค๋ฅผ ๋ปํ๋ค.
      - @GeneratedValue -> ๊ธฐ๋ณธํค ์์ฑ ์ ๋ต์ ์ค์ ํ๋ค.(๋ด๋ถ์ ์ผ๋ก ์ฌ๋ฌ ์ค์ ์ด๊ฐ๋ฅํ๋ค.)
      - @Column -> DB Column์ ๋ช์ํ๋ค.
 <br/>
  
  - ๐ก ์ด์๊ฐ์ด ์์ค์ฝ๋๋ฅผ ์๋ ฅํ๊ณ  ์คํํ๋ฉด MySQL์ ์ค์ ๋ DB์ ํ์ด๋ธ์ด ์์ฑ๋๋๊ฑธ ํ์ธํ  ์ ์๋ค.
  <br/>
  
  - ์ฐธ๊ณ 
      - https://dev-coco.tistory.com/85
