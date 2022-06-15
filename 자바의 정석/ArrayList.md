# ArrayList

### List 인터페이스 내부
1. Vector
2. ArrayList
3. LinkedList
<br/>

- ArrayList와 Vector의 차이는 그리 크지않다. 동기화의 차이일 뿐 별 차이는 없다.
    - Vector 동기화가 되어있다.
    - ArrayList 동기화 안되어있다.
<br/>

### 💡 ArrayList는 List인터페이스 구현체여서 같은 특징을 가지고 있다.
- 데이터 저장순서를 가지고 있다.
- 중복을 허용한다.

<br/>

### 🏷 ArrayList의 메소드
- ArrayList() -> 기본 생성자
- ArrayList(Collection c)
- ArrayList(int initialCapacity) -> 배열의 길이 설정
<br/>

### 🏷 추가 메서드
- 반환타입 add()
- add(int index) -> index값으로 데이터의 저장위치를 지정한다.
- addAll(Collection c) -> 컬렉션을 주면 요소를 저장한다.
- addAll(int index) -> index값으로 저장위치를 나타낸다.
<br/>

### 🏷 삭제 메서드
- remove()
- remove(int index)
- removeAll(Collection c) -> 컬렉션을 지정해주면 컬렉션에 있는 객체를 삭제한다.
- clear() -> 모든 객체를 삭제한다.
<br/>

### 🏷 검색 메서드
- indexOf() -> 객체의 위치를 반환한다.(찾지 못하면 -1을 반환한다)
    - 왼쪽을 시작으로 오른쪽으로 객체를 찾는다.
- lastIndexOf() -> 객체의 위치를 반환한다.
    - 오른쪽을 시작으로 왼쪽으로 객체를 찾는다.
- contains() -> 객체가 존재하는지 알 수 있는 메서드
- get() -> 특정 위치에 있는 객체를 반환한다. (객체를 읽어옴)
- set() -> 툭종 위치에 있는 객체를 다른 데이터로 변경이 가능하다.
<br/>

### 🏷 그 외의 메서드
- subList(int fromIndex, int toIndex)
    - formIndex위치부터 toIndex 위치 사이에 있는 객체를 뽑아 새로운 리스트를 만든다.
- toArray() -> ArrayList의 객체 비열을 반환한다.
- isEmpty() -> 배열이 비어있는지 확인한다.
- trimToSize() -> 빈공간을 제거한다.
- size() -> 저장된 객체의 개수를 반환한다.
<br/>

### 💡 ArrayList 객체 삭제과정
- remove() 호출하여 특정 index위치의 데이터를 삭제하면 삭제되는 데이터 아래의 데이터가 한 칸씩 위로 복사하여 덮어씌워진다.
- 모두 한 칸씩 이동하였으면 마지막 데이터는 NULL로 변경된다.
- 이로인해 데이터 개수가 줄어들어 배열의 size()를 호출하였을 떄 길이가 감소했다는걸 알 수 있다.
- 이동 과정(데이터가 목사되어 덮어씌워지는)이 부담을 많이 주기때문에 이동하지 않도록 하는 것이 좋다. 그리하여 배열의 마지막 객체부터 삭제하면 데이터가 남아있지도 않고 조금 더 빠르게 처리할 수 있다.
