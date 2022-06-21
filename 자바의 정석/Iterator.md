# Iterator

### 🏷 컬렉션 클래스에 저장된 데이터를 접근할 수 있는 인터페이스이다.
- 📌 Iterator
    - hasNext() -> 컬렉션에 데이터가 존재하는지 여부 확인하는 메소드
    - next() -> 존재여부 확인 후 모든 데이터를 읽어오는 메소드
        - 컬렉션 클래스(List, Set, Map)마다 구조가 달라 데이터를 읽어오는 방법도 모두 다르다. 이러한 것을 표준화 한것이다.
        - 코드가 변경되어도 데이터에 무리없이 접근이 가능하다.
        - 사용방법은 Iterator()를 호출하여 Iterator를 구현한 객체를 얻어서 사용한다.
<br/>

- 📌 ListIterator
    - Iterator은 단방향으로만 데이터를 읽을 수 있다. 단방향의 불편함을 보완하고자 ListIterator을 사용하여 양방향으로 데이터를 접근 할 수 있다.

<br/>

- 📌 Map
    - List와 Set은 collction을 상속받고 있어 collection내부의 Iterator을 사용할 수 있지만 Map은 상속받고 있지 않아 사용할 수 없다.
    - keySet(), entrySet(), values()를 호출하여 데이터에 접근할 수 있다.

<br/>
