# this()
### 📍생성자로부터 다른 생성자를 호출할 떄에 this()를 사용한다.
<br/>

- 사용조건
    - 생성자 호출 시 호출하는 생성자의 이름을 클래스 이름대신 this()를 사용한다.
    - 생성자 호출 시 반드시 첫 줄에만 호출해야한다.
<br/>

- 사용예제
```java
public class Example{
  ...
}

public Example(){
  ...
}

public Example(int parameter, String parameter){
  this(); //16번 라인에 있는 생성자 호출
  this.parameter = parameter;
  this.parameter = parameter;
}
```

#### 📍위와 같은 예제로 사용하면 코드 중복 제거에 효율적이며 이러한 효과는 코드를 유지/보수하기에 수월하다.
