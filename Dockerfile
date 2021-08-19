FROM bellsoft/liberica-openjdk-alpine:11 as hello-vaadin
COPY target/dtse-build-test-0.0.1-jar-with-dependencies.jar /app/app.jar
CMD ["java","-jar", "/app/app.jar"]
EXPOSE 8080