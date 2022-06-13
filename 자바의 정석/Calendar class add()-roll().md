# add() Method, roll() Method

### 🏷 add()
- 필드의 값을 증가시키거나 감소시킬 수 있다.
- 단 각 필드의 값이 증가하거나 감소할 때 다른 필드의 값에 영향을 준다.
<br/>

### 🏷 roll()
- add와 같은 특징을 가지고 있지만 필드의 변화가 다른 필드값에 영향을 주지 않는다.
- 잘 사용되지 않음!
<br/>

### 🏷 Date와 Calendar간의 변환
```java
// Calendar을 Date로 변환
Calendar cal = Calendar.getInstance();
Date d = new Date(cal.getTimeInMillis());

// Date를 Calendar로 변환
Date d = new Date();
Calendar cal = Calendar.getInstance();
cal.setTime(d);
```
<br/>

### 💡 java 8버전부턴 java.time패키지로 간편하게 사용할 수 있다.
