FROM mcr.microsoft.com/azure-app-service/java:11-java11_stable
ENV APP_HOME=/app
ENV APP_JAR_FILE=testspringboot-0.0.1-SNAPSHOT.jar
WORKDIR ${APP_HOME}
COPY ./build/libs/${APP_JAR_FILE} /app.jar
ENV PORT 80
EXPOSE 80

ENTRYPOINT ["java", "-Dserver.port=80", "-jar", "/app.jar"]
