# ArrayList

## 📍 
  - ArrayList란 Collection 프레임워크의 일부이며 java.util 패키지에 소속되어 있다.
  - 표준 배열보다 느리지만 배열에서 많은 조직이 필요한 경우 유용하게 사용된다.
  - 크기가 가변적으로 변형하는 선형리스트이다.
<br/>

### 💡 
 - ArrayList와 배열의 차이점
   - 기본 배열은 한번 생성되면 크기가 변하지 않는다. 다만 ArrayList의 경우 데이터가 들어오고 저장 용량이 초과되면
   자동으로 부족한 크기만큼 증가한다.(이전 크기의 50%씩 증가)
   
   - ArrayList는 초기값이 10으로 정해져있다.
<br/>

### 💡
 - ArrayList 사용방법
   ```java
   ArrayList <자료형(래퍼클래스)> 객체변수명 = new ArrayList<자료형>(초기크기값);
   ```
   - 초기 크기값은 생략이 가능하다. (생략하게 되면 초기값 10으로 설정된다.)
   - 자료형에 기본 자료형은 정의 할 수 없기 떄문에 래퍼 클래스를 사용하여 정의하면된다.
   <br/>
   
1. ArrayList 배열에 데이터 저장
    - ArrayList의 자료형에 따라 설정이 가능하다.
    ```java
    ArrayList<String> str= new ArrayList<String>(); //String으로 정의할 경우
    strList.add("문자열"); //선언된 타입에 따라 들어가는 값은 한정적이다.
    ```
    <br/>
    
2. ArrayList 배열의 저장된 데이터 개수
    - ArrayList의 크기를 구하는 방법은 size()메서드를 사용하면 된다.
    ```java
    str.add("A");
    str.add("B");
    str.add("C");
    // 3개의 데이터가 들어가있을 경우
    
    System.out.println("크기 :" + str.size());
    ```
    - 다음과 같은 소스의 결과는 3을 출력해준다.
    <br/>
    
3. ArrayList 배열에 저장된 데이터 변경
    - 변경 방법은 set()메서드를 사용하면 된다.
    ```java
    str.add("A");
    str.add("B");
    str.add("C");
    // 위의 예제와 같이 3개의 데이터가 들어가 있을경우
    
    str.set(1, "D"); // 파라미터에 set(index번호, 원하는 값)을 넣으면 변경이된다.
    ```
    - 예제 소스의 결과는 "B"가 "D"로 변경되어 출력된다.
    <br/>

4. ArrayList 배열에 저장된 데이터 삭제
    - 삭제 방법은 remove()메서드를 사용하면 된다.
    - clear()메서드는 모든 데이터를 삭제한다.
    ```java
    str.add("A");
    str.add("B");
    str.add("C");
    
    str.remove(1); // 삭제하고싶은 인덱스 값을 파라미터에 넣어준다.
    ```
    - 예제 소스 결과는 "A"와 "C"만 출력된다.
    - 인덱스를 삭제하게 되면 바로 뒤 인덱스 부터 마지막 인덱스까지 모두 앞으로 1씩 당겨진다.
    <br/>
    
5. ArrayList 배열에 저장된 데이터 출력
    - get(index)메서드를 사용하면 된다.
    ```java
    System.out.println(str.get(0)); //0번째 인덱스 값 출력
    ```
    - 보통 for문을 사용하여 출력한다.
    <br/>
    
6. ArrayList 배열에 저장된 데이터 검색
    - indexOf(데이터값)메서드를 사용하면 된다.
<br/>
