# 사용하려는 베이스 이미지
# Mac M1
# FROM azul/zulu-openjdk-alpine:17
# Mac Intel
# FROM openjdk:17-jdk-alpine
FROM azul/zulu-openjdk-alpine:17

# 작업 디렉토리 설정
WORKDIR /app

# 빌드된 JAR 파일을 컨테이너에 복사
COPY build/libs/external-api-1.0-SNAPSHOT.jar /app/external-api.jar

# Spring Boot 앱이 실행될 포트
EXPOSE 8081

# 애플리케이션 실행 명령어
ENTRYPOINT ["java", "-jar", "external-api.jar"]