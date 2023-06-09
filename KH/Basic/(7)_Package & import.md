# 패키지 와 import

### 📍 java에서는 클래스와 인터페이스의 집합을 Package라고 정의한다.

## - 패키지(package)
   - 패키지는 서로 관련있는 클래스와 인터페이스를 모아두어 파일을 효과적으로 관리할 수 있다.
   - 대규모 응용 프로그램을 개발하고 관리할 때 용이하게 사용된다.
   - 협업 시 작성된 클래스의 이름이 같을때 일어나는 충돌의 경우도 면할 수 있다.
<br/>

- 사용 시 유용한 점
    - 클래스가 가지고 있는 의미파악이 쉬워진다.
    - 같은 이름을 갖는 클래스의 충돌을 피할 수 있다.
<br/>

- 이름이 없는 패키지
    - 패키지에 이름이 포함되어 있지 않은 경우 자동으로 이름이 없는 패키지를 포함시켜준다. 
    하지만 이름이 없는 패키지 같은 경우 작은 규모의 프로그램에서는 사용하는데 지장이 없지만 대규모 프로그램에서는 파일관리와 클래스 이름 충돌제어를 할 수 없다.
<br/>

- 패키지 이용
    - 보통 다른 패키지의 속한 클래스를 사용하는 경우 클래스 이름 앞에 패키지의 경로를 포함하여 풀 네임을 작성해야한다.
 
```java
package ExamplePackage;

public class Testclass{
  ...
}

=======================

package ExamplePackage2;

public class Testclass2{
  ExamplePackage.Testclass test = new ExamplePackage.Testclass(); // 패키지명을 이용하여 사용
  ...
}
```
##  📝 
   - 위와 같은 간단한 예제를 만들어보았는데 지금은 간단하지만 만약 큰사이즈라면 매번 사용할 떄마다 긴 이름을 사용해야한다는건 얼마나 비효율적인가
   - 그리하여 java에서는 import 키워드를 제공한다.
<br/>

## - import
   - java 컴파일러에 코드에서 사용할 클래스의 패키지에 대한 정보를 미리 제공하는 역할을 한다.
   - import문을 사용하게 되면 다른 패키지에 속한 클래스를 사용할 수 있게 된다.
 
 ```java
 package ExamplePackage;
 
 import ExamplePackage2.Testclass2 //특정 클래스만 사용함
 import ExamplePackage2.*          //해당 패키지의 모든 클래스를 사용함
 ```
 <br/>
 
 ##  🚨
   - import문 선언시 "*" 는 해당 패키지에 포함된 다른 하위 패키지 클래스까지 포함해 주는 것이 아니기떄문에 주의해야한다.
 
