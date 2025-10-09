# 1. JDK 21 기반 이미지 사용
FROM eclipse-temurin:21-jdk

# 2. 작업 디렉토리 생성
WORKDIR /app

# 3. 소스 복사
COPY . .

# 4. Gradle 빌드 (테스트는 스킵)
RUN ./gradlew clean build -x test

# 5. JAR 파일 실행
CMD ["java", "-jar", "SWE-Team6-0.0.1-SNAPSHOT.jar"]
