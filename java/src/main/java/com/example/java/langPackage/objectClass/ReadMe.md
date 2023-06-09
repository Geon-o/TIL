***
##### 23.06.03

# Object 클래스
### - 모든 클래스의 최고 조상, 11개의 메서드만 가지고 있다.
- clone() -> 객체 복사본 반환
- equals() -> 객체 비교
- finalize() -> 거의 사용하지 않음
- getClass() -> 객체 클래스 정보 반환
- hashCode()
- toString()
- notify() -> 스레드 관련
- wait() -> 스레드 관련

#### getClass()
- Reflection API
- class Class {} 와 같은 형태를 가짐
- 클래스 정보를 담기 위한 클래스
    - 객체 생성
    - 객체 정보를 얻을 수 있음


#### equals(Object obj)
- 객체 자기자신과 주어진 객체 비교
    - true, false 반환
- 객체의 주소를 비교
    - 주소가 같을떄에만 true
- 인스턴스 변수의 값을 비교하도록 오버라이딩해야함

***
##### 23.06.04

#### hashCode() = 객체의 지문
- ⭐equals의 결과가 true인 두 객체의 해시코드는 같아야하기 때문(중요)⭐
- 객체의 해시코드를 반환
  - 해시코드 -> 정수값
  - 해싱 알고리즘 사용(11장 참고)
  - 객체의 주소를 int로 변환해서 반환
  - equals를 오버라이딩하면 hashCode도 오버라이딩해야함
- 객체마다 다른 해시코드를 반환 -> System.identityHashCode() 사용
- 32bit JVM -> int
- 64nit JVM -> long
  - 주소값이 겹칠수도 있음

#### toString()
- 객체를 문자열로 변환
  - 객체 == iv(인스턴스 변수)
  - 객체를 문자열로 변환한다는 것 -> iv의 값을 문자열로 변환

***
##### 23.06.07

# String 클래스
- 문자열을 다루기 위한 클래스
- 데이터(문자배열(char[])) + 메서드(문자열 관련)
- 내용을 변경할 수 없음 -> immutable 클래스
- 문자열 결합 시 새로운 객체가 만들어짐
  -> 덧셈 연산자를 이용한 문자열 결합은 성능이 떨어짐
- 문자열의 결합이나 변경이 잦을땐 변경이 가능한 StringBuffer사용
- 문자열 리터럴로 정의 시 하나의 문자열을 여러 참조변수가 공유
  - new 연산자 사용시 항상 새로운 문자열이 생성됨

### 문자열 리터럴
- 프로그램 실행 시 자동으로 생성(constant pool에 저장)
- 같은 내용의 문자열 리터럴은 하나만 만들어짐

### 빈 문자열
- "" 형태
- 크기가 0인 char형 배열 -> 내용이 없음
- 어느 타입이나 크기가 0인 배열 생성가능

***
##### 23.06.10

# String 클래스 생성자와 메서드
- String(char[] value) 
  - char[] -> String
  - 반대
    - toCharArray()
  
    
- String(StringBuffer buf)
  - StringBuffer -> String
  - 매개변수로 StringBuffer를 받을 수 있음

  
- char charAt()
  - 지정된 인덱스 문자 1개 반환

  
- compareTo()
  - 두개의 문자를 사전 순서대로 비교
  - Dictionary Order
  - 같으면 0, 왼쪽이 작으면 -1, 오른쪽이 작으면 1
  - 첫번째꺼 부터 비교(순서대로 비교)
  - 정렬시 사용

  
- concat()
  - 문자열 뒤에 덧붙임

  
- contains()
  - 매개변수로 들어온 문자열이 포함되어있는지 확인(boolean)


- endsWith()
  - 지정된 문자열로 끝나는지 확인(boolean)


- equalsIsIgnoreCase()
  - 문자열 대소문자 구분없이 비교
***