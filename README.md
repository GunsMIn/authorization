# authorization
JWT TOKEN

### @PostMapping("/api/v1/users/join") : 회원가입 비밀번호 BCryptPasswordEncoder 암호화
> request :{
   "userName":String,
   "password":String,
   "emailAddress":String}


### @PostMapping("/api/v1/users/login") : JWT 토큰 발행 
> request :{
   "userName":String,
   "password":String}
# Spring Security + JWT Token
### [Spring Security 병원리뷰 프로젝트 적용 (Velog 정리본)](https://velog.io/@guns95/Spring-Security%EC%99%80-JWT-%ED%86%A0%ED%81%B0%EC%9D%98-%EC%9D%B8%EC%A6%9D%EC%9D%B8%EA%B0%80-%EB%A1%9C%EA%B7%B8%EC%9D%B8)
### @PostMapping("/api/v1/reviews") : 인증된 User만이 리뷰 쓸 수 있는 API
> request :{
   "hospitalId":Integer,
   "title":String,
   "content":String,
   "userName":String}

</BR></BR></BR>

## User RestApi(회원) - JWT 로그인 구현
### @PostMapping("/api/users/join") : 회원가입 api -> BCryptPasswordEncoder를 사용하여 비밀번호 암호화 후 DB저장
#### 🆗회원가입 성공 시
<img width="400" alt="캡처2" src="https://user-images.githubusercontent.com/104709432/204977035-f6ff4669-d473-4d0e-923b-80fcc24129db.PNG"> <br>
- **BCryptPasswordEncoder 암호화된 PassWord로 저장⬇**<br><br>
<img width="779" alt="캡처9" src="https://user-images.githubusercontent.com/104709432/204985692-b9c6ed6a-5616-47b8-a6ba-6ec36b8aa69f.PNG"> <br>
#### 🆖회원가입 실패 시<br>
- **중복되는 userName존재 할 때 ExceptionHandeler에서 HttpStatus.CONFLICT(409), message = "User name is duplicated errorCode"처리**
<img width="550" alt="캡처4" src="https://user-images.githubusercontent.com/104709432/204979030-d5385eec-7a57-45ec-90ae-c561b77e3598.PNG">

### @PostMapping("/api/users/login") : 로그인 -> 로그인 성공 시 Jwt토큰 반환
#### 🆗로그인 성공 시 - > JWT토큰 (인증,인가)
<img width="750" alt="캡처5" src="https://user-images.githubusercontent.com/104709432/204987426-c4ea9a39-a668-4ff1-b16c-a66af691a7a3.PNG"><br>
#### 🆖로그인 실패 시<br>
- **1.userName 존재 X 로그인 실패->HttpStatus.NOT_FOUND(404), message = "Not Found errorCode"처리**
<img width="550" alt="캡처7" src="https://user-images.githubusercontent.com/104709432/204981292-1375306f-966a-4b19-8f80-c15d5b97d5a0.PNG"><br>
- **2.비밀번호 틀릴 시 로그인 실패->HttpStatus.BAD_REQUEST(400), message = "Not correct password errorCode"처리**
<img width="550" alt="캡처6" src="https://user-images.githubusercontent.com/104709432/204980562-6777a266-6046-480a-bed1-be44673ac462.PNG"><br>



