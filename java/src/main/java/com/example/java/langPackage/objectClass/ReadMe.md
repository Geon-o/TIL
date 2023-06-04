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