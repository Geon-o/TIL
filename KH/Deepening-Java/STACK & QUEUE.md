# Stack & Queue

### ๐ก Stack
 - ๋ฐ์ดํฐ๋ฅผ ์ฐจ๊ณก์ฐจ๊ณก ์์ ์ํ์์ ๊ฐ์ฅ ๋ง์ง๋ง์ ๋ฃ์ ๊ฒ์ ๋จผ์  ๊บผ๋ด๋ ๋ฐฉ์์ด๋ค.
 - Stack์ ๊ฐ์ ๊ตฌ์กฐ์ ํฌ๊ธฐ์ ์๋ฃ๋ฅผ ์ ํด์ง ๋ฐฉํฅ์ผ๋ก๋ง ์์ ์ ์๋ค.
 - top์ด๋ผํ์ฌ ๊ฐ์ฅ ์ต๊ทผ์ ๋ค์ด์จ ๋ฐ์ดํฐ๋ฅผ ๊ฐ๋ฆฌํค๊ณ  ์์ผ๋ฉฐ push(๋ฃ๊ธฐ) / pop(๊บผ๋ด๊ธฐ) ๋ฅผ ์ฌ์ฉํ์ฌ ์ ์ดํ  ์ ์๋ค.
 - ์ด๋ฌํ ๊ตฌ์กฐ๋ฅผ ํ์์ ์ถ LIFO๊ตฌ์กฐ๋ผ๊ณ  ํ๋ค.
<br/>

### ๐ก Queue
 - ํฐ๋ ํํ์ ์, ๋ค๊ฐ ์ด๋ ค์๋ ํํ๋ฅผ ๋๊ณ  ์์ผ๋ฉฐ ํ์ชฝ ๋์์๋ ์ฝ์ ์์(push), ๋ค๋ฅธ์ชฝ์์๋ ์ญ์  ์์(pop)์ด ์ด๋ฃจ์ด์ง๋ค.
 - ์ฝ์ ์์๋ง ํ๋ ๊ณณ์ front๋ผ ํ๋ฉฐ, ์ญ์  ์์ํ๋ ๊ณณ์ rear๋ผ ํ๋ค.
 - ์ด๋ฌํ ํํ๋ ์ฒ์๋ค์ด๊ฐ ๋ฐ์ดํฐ๋ฅผ ๊ฐ์ฅ ๋จผ์  ๊บผ๋ด๋ ๋ฐฉ์์ผ๋ก ์ ์์ ์ถ FIFO๊ตฌ์กฐ๋ผ๊ณ  ํ๋ค.
<br/>

### ๐ก DFS(๊น์ด ์ฐ์  ํ์)
 - ์ต๋ํ ๊น์ด ๋ด๋ ค๊ฐ ๋ค ๋ ์ด์ ๊ฐ ๊ณณ์ด ์์ผ๋ฉด ์์ผ๋ก ์ด๋ํ๋ค.
 - ๋ชจ๋  ๋ธ๋๋ฅผ ๋ฐฉ๋ฌธํ๋ฉด์ ์งํํ๊ธฐ ๋๋ฌธ์ ๊ฒ์ ์๋๋ ๋ค์ ๋๋ฆฌ๋ค.
 - Stack์ ์ฌ์ฉํ์ฌ ๊ตฌํ์ด ๊ฐ๋ฅํ๋ค.
<br/>

### ๐ก BFS(๋๋น ์ฐ์  ํ์)
 - ์ต๋ํ ๋๊ฒ ์ด๋ํ ๋ค ๋ ์ด์ ๊ฐ ๊ณณ์ด ์์ผ๋ฉด ์๋๋ก ์ด๋ํ๋ค.
 - ๋ฃจํธ ๋ธ๋(์์์ )์์ ๊ฐ์ฅ ์ธ์ ํ ๋ธ๋๋ก ์ด๋ํ๊ธฐ ๋๋ฌธ์ ๊ฒ์์๋๊ฐ ๋น ๋ฅด๋ฉฐ ์ต๋จ ๊ฒฝ๋ก๋ฅผ ์ ์ ์๋ค.
 - Queue๋ฅผ ์ฌ์ฉํ์ฌ ๊ตฌํ์ด ๊ฐ๋ฅํ๋ค.
<br/>

#### โ ํ๋ก๊ทธ๋จ์์๋ BFS๋ณด๋ค DFS๋ฅผ ๋ง์ด ์ฌ์ฉํ๋ ๊ฒฝ์ฐ๊ฐ ์๋ค
  
