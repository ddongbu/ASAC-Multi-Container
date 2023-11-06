# ASAC-DockerCompose

## 실습

![스크린샷 2023-08-08 오후 1.18.07.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/ce35bf20-1e79-43a9-8415-3231cee79bf1/%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA_2023-08-08_%E1%84%8B%E1%85%A9%E1%84%92%E1%85%AE_1.18.07.png)

## docker 프로젝트 이름의 이미지를 만든상태

- Maven → spring-boot:build-image build.

- docker build . 효과

→ docker run -d --name docker-containers -p 8081:8080 docker:0.0.1-SNAPSHOT

- 도커의 컨테이너를 만들것이고 이름(—name)은 docker-containers
- 설정하고 컨테이너를 만들 이미지는 docker:0.0.1-SNAPSHOT을 사용할것이고 포트를 8081로 매핑할 것 이다.

---

오류들 → 

(오류해결)

Build를 했을때 jar이 아닌 war로 만들어져서 도커파일에서 읽지를 못했다

→war을 강제로 jar로 변환해서 실행

(미해결)

Gradlew build 후 jar로 이미지올리고 컨테이너 후 실행했을때

DB와 연결이 안되는 오류가 있다.

useSSL=false를 붙이면 된다는데 아직 미해결

![스크린샷 2023-08-09 오후 3.29.47.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/9ccd964c-c44f-42bb-905c-6d3e63c92991/%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA_2023-08-09_%E1%84%8B%E1%85%A9%E1%84%92%E1%85%AE_3.29.47.png)

컨테이너→

![스크린샷 2023-08-09 오후 3.24.02.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/6ce617c7-d421-4e76-b2ea-215832fabd7d/%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA_2023-08-09_%E1%84%8B%E1%85%A9%E1%84%92%E1%85%AE_3.24.02.png)

이미지→

![스크린샷 2023-08-09 오후 3.23.52.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/864861ca-27eb-4ddf-a56f-431457a4bbcf/%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA_2023-08-09_%E1%84%8B%E1%85%A9%E1%84%92%E1%85%AE_3.23.52.png)

Multi-Containers를 Docker Compose를 통해 구동했을시 →

![스크린샷 2023-08-09 오후 3.22.43.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/bcc2a80f-d4c6-4f24-ac46-41ad1350e2fd/%E1%84%89%E1%85%B3%E1%84%8F%E1%85%B3%E1%84%85%E1%85%B5%E1%86%AB%E1%84%89%E1%85%A3%E1%86%BA_2023-08-09_%E1%84%8B%E1%85%A9%E1%84%92%E1%85%AE_3.22.43.png)
