# StringBuffer 메소드

### StringBuffer 클래스는 문자열을 다루기 위한 것이다. 그리하여 Stirng클래스와 유사한 메서드를 많이 가지고 있다.
   > StringBuffer는 추가, 변경, 삭제로 저장된 내용을 변경할 수 있는 추가 메서드 제공
    
<br/>

- StringBuffer(int length)
    - 인수 값에 따라 문자를 담을 수 있는 버퍼가 생성된다.
<br/>

- append()
    - 매개변수 값에 여러 타입이 들어와도 문자열로 변환된다.
<br/>

- capacity()
    - char[]의 버퍼 크기를 알려줌
    > ❗ length는 버퍼에 담긴 문자열의 길이를 알려준다.
<br/>

- char charAt(int index)
    - 문자열에서 매개변수로 지정된 위치의 문자를 반환한다. 
<br/>

- delete(int start, int end)
    - 매개변수의 start부터 end 범위까지 삭제한다.(단 end 위치의 문자는 범위에서 제외)
        - 데이터가 삭제되면 삭제된 공간만큼 앞으로 당겨진다.
        - 문자 여러개를 제거할 때 유용하다.
<br/>

- deleteCharAt(int index)
    - 매개변수의 값의 위치에 존재하는 데이터를 삭제한다.
        - 1개의 문자만 삭제
<br/>

- insert(int pos, 다양한 타입의 매개변수)
    - 삽입 메서드로 매개변수에 다양한 타입을 지원한다.
    - pos로 지정된 위치에 추가해준다.
<br/>

- replace(int start, int end, String str)
    - start와 end 범위의 문자를 str문자로 치환함(end 위치의 문자는 범위에서 제외)
<br/>

- reverse()
    - 문자열의 위치를 뒤바꾼다.
        - ex) 123456의 문자열을 맨 끝자리부터 순서대로 위치를 변경한다.
        - => '654321'
<br/>

- setCharAt(int index, char ch)
    - 지정된 index값의 위치 문자를 ch로 바꾼다.
<br/>

- setlength(int newLength)
    - 문자열의 길이를 매개변수로 받은 값으로 변경한다.
        - 길이를 줄인 경우 줄어든 위치까지의 데이터만 보여진다.
        - 길이를 늘린 경우 나머지 빈 공간은 null문자로 채워진다.
        > null값을 채워진 경우 공백으로 출력되기 떄문에 .trim()메소드를 사용하여 양끝의 빈공간을 제거가 가능하다.
<br/>

- toString()
    - StringBuffer를 String으로 반환한다.
<br/>

- substring(int start)
- substring(int start, int end)
    - 문자의 일부를 잘라낸다.
        - 매개변수에 end가 안들어가는 경우의 메소드는 버퍼크기의 끝까지 범위를 지정한다.
<br/>

### ✏ 대부분의 메소드는 자기자신(StringBuffer)를 반환타입으로 하는 경우가 많다. 그리하여 '메소드 체이닝', 즉 메소드를 연결해서 호출하는 것이 가능하다.
### ✏ java에서는 일정 범위를 지정하게 되면 end부분의 범위는 포함하지 않는다.

