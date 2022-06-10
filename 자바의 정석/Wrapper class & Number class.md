# Wrapper class

### 8개의 기본형은 객체가 아니므로 객체로 다뤄야 할때에 사용하는 클래스이다.

 - 매개변수로 객체를 요구할 때
 - 기본형 값이 아닌 객체로 저장해야할 때
 - 객체간의 비교가필요할 때
 - 위와 같은 상황에서 기본형을 사용할 수 없으므로 객체로 변환하여 사용해야한다.

### 변환
1. int -> Integer
2. char -> Character
3. short -> Short
4. long -> Long
5. double -> Double
- 등등 기본형 모두 래퍼클래스로 변환이 가능하다.
<br/>

# Number class

### 추상클래스로 모든 숫자 래퍼클래스의 상위 클래스이다.
- 자손클래스
    - 기본적인 Byte~Double까지 내부에 존재하며 BigInteger과 BigDecimal이 존재한다.
<br/>

- BigInteger
    - long으로 다룰 수 없는 큰 범위의 정수를 다룰 때 사용한다.
- BigDecimal
    - double로 다룰 수 없는 큰 범위의 실수를 다룰 때 사용한다.
<br/>

### ✏ 내부적으로 보았을 때 숫자관련된 래퍼클래스들은 모두 Number클래스 하위 클래스라는걸 알 수 있다.
