# Stack & Queue

### 🏷 Stack
- 밑은 막히고 위는 뚫린 형태의 상자 개념이다.
- 데이터를 저장하는 순서대로 밑에서부터 쌓여지며 마지막에 저장된 데이터부터 꺼낸다.
- LIFO(Last In First Out)개념
- 데이터를 넣고 빼기만 가능하며 중간 변경은 불가능하다.
- 저장(push) / 추출(pop)을 사용
<br/>

### 🏷 Queue
- Stack의 형태와 달리 양 끝이 모두 뚫린 혇태의 상자 개념이다.
- 한쪽에서 데이터를 저장하면 반대편에서 꺼낸다.
- 그러므로 데이터를 저장하는 순서대로 꺼낼 수 있다.
- FIFO(First In First Out)개념
- 저장(offer) / 추출(poll)를 사용
<br/>

### 💡 배열과 LinkedList
- Stack은 배열로 구현하는게 좋다.
- Queue는 LinkedList로 구현하는게 좋다.
<br/>

### 🏷 Stack Method
- empty() [스택이 비어있는지 알려줌]
- peek() [매위의 데이터를 꺼내지 않고 볼 수 있다.]
- pop() [삭제]
- push() [추가]
- search() [찾기 (indexOf와 비슷하지만 1부터 찾기 시작한다.)]
<br/>

### 🏷 Queue Method
- 예외 발생 메소드
  - add()
  - remove()
  - element()
- 예외가 발생하지 않는 메서드
  - offer() [추가] -> true와 false반환
  - poll() [삭제] -> null반환
  - peek() [데이터를 꺼내지 않고 볼 수 있다.] -> null반환
<br/>

### 💡 java Queue는 인터페이스로 정의되어 큐를 직접 구현하거나 구현된 클래스를 사용하면된다.
- java API에 Queue를 구현한 클래스 목록이 있다.
- 그 중 LinkedList 존재
