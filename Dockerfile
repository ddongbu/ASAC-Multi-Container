FROM openjdk:17
ARG JAR_FILE=build/libs/demo-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} demo-0.0.1-SNAPSHOT-COPY.jar
ENTRYPOINT ["java","-jar","/demo-0.0.1-SNAPSHOT-COPY.jar"]

#docker build -t ~~ .
#docker images -> 도커 이미지 확인
#레지스트리 / 레파지토리 명칭
#docker run -p 호스트:컨테이너 -ti ~~ /bin/sh
#-ti (인터렉티브 터미널)
#tail -f 특정 명령어 사용가능
#docker push
#docker pull -> 다운로드 가능
#docker rmi -> 이미지 삭제가능
#docker ps -> 동작하고 있는 이미지 확인 가능
#docker exec
#docker compose ->