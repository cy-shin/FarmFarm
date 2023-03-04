# FarmFarm
> 농자재 쇼핑몰, 작물 거래 중개 플랫폼

</br>

## 1. 제작 기간 & 참여 인원
- 2022.12.13 ~ 2023.01.11
- 팀프로젝트, 6명

</br>

## 2. 사용 기술

> #### Back-end
- Java 11
- Spring 3.9.18
- Maven
- Oracle 21C
- Apache Tomcat 9.0
- Spring Security
- Mybatis

</br>

> #### Front-end
- HTML/CSS
- Javascript

</br>

## 3. ERD 설계
<img width="80%" src="https://github.com/cy-shin/FarmFarm/blob/16b4e3c232a17d9e0596a3f17a727d6a2150019e/FarmFarm%20ERD.png"/>


</br>


## 4. 핵심 기능
<details>
<summary> 상세 보기 </summary>
</details>
</br>


## 5. 트러블 슈팅
<details>
<summary> 채팅 날짜 출력 오류 </summary>
- 해당 날짜에 처음으로 채팅을 보낸 경우에, 구분선과 함께 표시되는 날짜가 이상하게 출력되는 현상
</br>
- 날짜를 만들 때 사용한 패턴 문자가 잘못 입력되어 있었음

</details>

<details>
<summary> 사진 삭제 오류 </summary>
- 사진 형식의 채팅 전송 직후 해당 채팅을 삭제할 수 없는 문제
</br>
- 사진 형식의 채팅 전송 직후 채팅번호를 가져오지 않아서 생긴 현상이었음
</br></br>
- 채팅번호와 이미지경로를 한 번에 가져오기 위해 서비스 단에서 두 값을 map에 담은 후 가져왔으나 
</br>
  <strong>"디코드된 텍스트 메시지가 출력 버퍼에 비해 너무 크며, 해당 엔드포인트는 partial 메시지들을 지원하지 않습니다."</strong>라는 메세지와 함께 웹소켓 서버가 종료되는 문제가 발생
</br></br>
- map 대신 list에 담아서 가져와 해결

</details>



</br>
