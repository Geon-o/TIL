# Date & Time

### 🏷 java.util.Date
 - java가 만들어질 시기에 만들어진 클래스로 날짜와 시간을 다룰 목적을 가진 클래스이다.
    - 하지만 부적합한 부분들이 존재하여 더이상 사용하지 않을 것을 권장하였다.
<br/>

### 🏷 java.util.Calendar
 - Date클래스의 부적합한 부분들을 개선한 클래스이다.
 - 다음 버전에서 개선되기까지 매우 오래 사용되었다.
    - 하지만 여전히 불편하고 단점이 존재하였다.
<br/>

### 🏷 java.time 패키지
 - Date와 Calendar의 단점을 개선하여 새로운 클래스를 제공하였다.
 - 항상 날짜와 시간을 같이 다뤄야 했던 Date와 Calendar 클래스의 단점을 보환하여 각각 따로 사용할 수 있게되었다.
    - LocalDate(날짜)
    - LocalTime(시간)
    - LocalDateTime(같이 사용할때)
<br/>

### 🏷 Calendar 클래스
 - 추상 클래스이므로 객체를 생성할 수 없어 getInstance()메소드를 통해 객체를 얻어야만 한다.
 - getInstance()메소드는 기본적으로 현재 날짜와 시간으로 설정된다.
 ```java
 Calendar cal = new Calendar; // 에러 발생
 Calendar cal = Calendar.getInstance();
 ```
 - getInstance() 메소드를 호출하면 메소드가 사용자 시스템에 있는 정보를 읽어 무엇을 사용할 지 판단하여 반환해준다.
    1. 서양력 => GregorianCanlendar
    2. 불교력 => BuddhistCalendar
    3. 일본력
 <br/>
 
 - get() 메소드
    - get()메소드를 통해 시간과 날짜를 가지고 올 수 있다.
    - get()메소드에 매개변수로 사용할 수 있는 여러 필드들이 존재한다.
