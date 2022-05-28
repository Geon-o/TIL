# StringBuffer 클래스

## 📍
 - StringBuffer클래스는 문자열을 저장하고 다루기 위한 클래스이다.
 - String 처럼 문자열 배열을 내부적으로 가지고 있다. 그러기에 여러개의 문자들을 저장할 수 있다.
<br>

## 💡 String과 StringBuffer의 차이
 ### ❓ 먼저 String과 StringBuffer는 둘다 문자열을 다루기 위함에 사용된다는 정의를 가지고 있다. 하지만 내부적으로 다음과 같은 차이를 보여준다.
 
 - String은 불변이다. 즉 변경이 불가능하다.
 - StringBuffer는 가변이다. 변경이 가능하다는 얘기다.
 <br/>
 
 ### ❓ 그렇다면 무엇이 변경이 불가능한지 가능한지 예제를 통해 알아보자. 
 ```java
 StringBuffer test = new StringBuffer("123"); // 객체배열 생성
 test.append("ABC");                          // 생성된 배열에 "ABC"추가
 ```
 
  - 예제와 같이 StringBuffer를 통해 객체를 만들어주고 "123" 이라는 값을 넣어주게 되면 char[] 배열이 만들어지면서 배열안으로 해당 문자열이 문자단위로 쪼개져서 들어가게된다. 그 다음줄 코드에서 append()메서드를 통해 문자열을 배열안으로 추가할 수 있다.
  - 이말은 즉 위에서 말 했듯이 가변적! 배열의 내용이 변경가능하다는 것이다.
<br/>

### ❓ 그럼 StringBuffer는 어느 때에 사용하면 좋을까.

  - 문자열을 가지고 조작을 많이 할 때 즉 문자열 추가, 변경이 필요할 때 StringBuffer를 사용하면 유용하다.
<br/>

### ❓ String 클래스는 완전히 배열의 길이를 설정하지 못하나.
  - 알다시피 String은 배열의 길이를 변경하지 못한다. 따라서 공간이 부족하면 새로운 배열을 생성해야된다.
  1. 배열생성
  2. 기존 배열의 데이터를 새로운 배열에 복사
  3. 새로 만들어진 배열로 참조변경(주소값 변경)
  -이와 같은 루티으로 생성하는게 반복적이면 성능이 떨어진다.
<br/>

### 📍
  - StringBuffer를 사용할 때 저장할 문자열의 길이를 고려하여 적절한 크기고 생성해야한다.
  - 크기를 지정하지 않으면 지정된 초기값 16으로 설정된다.
  - 문자열을 저장하면 저장된 문자열 길이 + 16으로, 지정한 문자열의 길이보다 16더 큰 배열을 생성한다.
<br/>

### 💡 StringBuffer메서드
  - append(); -> 파라미터의 문자열 값이 저장된 데이터 끝에 추가
  - delete(); -> 삭제
  - inselt(); -> 삽입
 <br/>
 
### 📍
  - StringBuffer의 메서드는 위에 말고도 여러가지를 가지고 있다.
  - 이러한 메서들은 반환 타입이 StringBuffer이다.
  - 이러한 반환타입을 가지고 있어 다음과 같은 코드를 작성할 수 있다.
  ```java
  //데이터 추가
  StirngBuffer test = new StringBuffer("123");
    test.append("ABC").append("DEF"); // 이와같이 작성가능
  ```
  <br/>

### 🚨 주의!
  - StringBuffer는 equals()메서드가 오버라이딩 되어있지 않다. 즉 주소비교를 한다.
  - 내용이 같아도 equals 결과는 false를 반환한다.
  <br/>
  
  > StringBuffer는 다음과 같이 String으로 변환한 후 equals()로 비교해야한다.
  ```java
  String t = test.toString(); // StringBuffer test를 toString으로 변환
  ```
  - 이와 같이 변경한 뒤 equals()사용하면 내용을 비교해 결과를 반환한다.
