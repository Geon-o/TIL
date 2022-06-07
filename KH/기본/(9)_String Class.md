# String Class

## 📍
  - java는 java.lang안에 있는 String 클래스 객체를 의미한다.
  - String은 문자열 관련의 필요한 처리 기능을 가각 메서드로 정리한 클래스이다.
<br/>

- String 클래스 두가지 선언 방법
    ```java
    String str = "Hello World"; //리터럴(전통적인 방법)
    String str = new String("Hello World"); // new연산자를 사용하여 선언
    ```
    <br/>
    
- String 클래스의 메서드
  - char charAt(int index) 
    - 해당 문자열의 특정 인덱스에 해당하는 문자를 반환한다.  
  - String[] split(String regex)
    - 해당 문자열을 전달된 정규 표현식(regular expression)에 따라 나눠서 반환한다.
  - length()
    - 해당 문자열의 길이를 반환한다.
  - boolean equals(Object anObject)
    - 객체 자신과 object가 같은 객체인지 true/false로 반환한다.
## 💡
  - 대표적으로 위와 같은 메서드를 사용하는데 더 많은 편리한 메서드들이 존재한다.
  - [JAVA API 17](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/String.html)
<br/>

- 문자열 비교
    - "==" 과 Sring.equals메서드 차이
        - 보통 우리가 비교 할때에는 "==" 를 사용하면 된다고 알고있다. 하지만 문자열을 비교할 떈 다르다
        - "=="            -> 기본자료형을 비교 할 때 사용된다.
        - String.equals() -> 문자열을 비교 할 때 사용된다.
    -  💡 String은 클래스형 즉 참조형이기 때문에 java 프로그래밍에서는 "==" 가 아닌 equals() 메서드를 사용한다.

