FROM openjdk:8-alpine
VOLUME /tmp
EXPOSE 9090
ADD ./target/customers-0.0.1-SNAPSHOT.jar customers-crud-app.jar
ENTRYPOINT ["java","-jar", "/customers-crud-app.jar"]
