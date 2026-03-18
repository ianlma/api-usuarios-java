FROM eclipse-temurin:17-jdk-jammy AS build
COPY . .
RUN ./gradlew bootJar --no-daemon

FROM eclipse-temurin:17-jre-jammy
COPY --from=build /build/libs/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]