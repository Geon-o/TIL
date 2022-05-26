# String.join()와 String.valuOf()

##  join()
- 설명
    - Stirng.join() 이와 같이 사용하며 배열이나 컬렉션에서 사용된다.
    - 문자열 사이에 구분자를 넣어준다.
```java
String name = "가,나,다";
String[] arr = name.split(",") //split메서드에 속한 구분자를 기준으로 데이터를 나눈다.
String str = String.join("+", arr); //join메서드에 나눠놓은 데이터가 들어간 arr과 구분자 "+"를 넣어 구분해서 결합시켜줌
System.out.println(str); //결과: 가+나+다
```
- String.join()을 사용하면 속도를 향상 시킬 수 있다.
- 간단한건 괜찮지만 조금 많은 문자열은 String.join()을 사용하는 것을 권장

## valuOf()
- 설명
    - 문자열과 기본형 간의 변환이 가능하다.
    - 기본적으로 숫자에 빈문자열을 넣게되면 문자열이 된다.
    - 또 String클래스의 valuOf()를 사용하여 변환이 가능하다.
    - 반환 타입은 int가 아니라 Integer즉 참조형인데 오토박싱이 기본형으로 자동 변환시켜준다.
```java
int num = Integer.parseInt("20");
int num2 = Integer.valueOf("20");
```

- 이와 같이 두가지 형태로 사용이 가능하다.
- 래퍼클래스의 parse메서드에 이름이 제각각이여서 valueOf()로 통합하였다.
- 성능향상이 필요할 때만 사용하는 것을 권장한다.
