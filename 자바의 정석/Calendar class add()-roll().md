# add() Method, roll() Method

### ๐ท add()
- ํ๋์ ๊ฐ์ ์ฆ๊ฐ์ํค๊ฑฐ๋ ๊ฐ์์ํฌ ์ ์๋ค.
- ๋จ ๊ฐ ํ๋์ ๊ฐ์ด ์ฆ๊ฐํ๊ฑฐ๋ ๊ฐ์ํ  ๋ ๋ค๋ฅธ ํ๋์ ๊ฐ์ ์ํฅ์ ์ค๋ค.
<br/>

### ๐ท roll()
- add์ ๊ฐ์ ํน์ง์ ๊ฐ์ง๊ณ  ์์ง๋ง ํ๋์ ๋ณํ๊ฐ ๋ค๋ฅธ ํ๋๊ฐ์ ์ํฅ์ ์ฃผ์ง ์๋๋ค.
- ์ ์ฌ์ฉ๋์ง ์์!
<br/>

### ๐ท Date์ Calendar๊ฐ์ ๋ณํ
```java
// Calendar์ Date๋ก ๋ณํ
Calendar cal = Calendar.getInstance();
Date d = new Date(cal.getTimeInMillis());

// Date๋ฅผ Calendar๋ก ๋ณํ
Date d = new Date();
Calendar cal = Calendar.getInstance();
cal.setTime(d);
```
<br/>

### ๐ก java 8๋ฒ์ ๋ถํด java.timeํจํค์ง๋ก ๊ฐํธํ๊ฒ ์ฌ์ฉํ  ์ ์๋ค.
