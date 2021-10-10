FROM java:8-jdk

ARG app_version

ADD libs/demo-${app_version}-all.jar /app/app.jar

CMD ["java", "-jar", "/app/app.jar"]

EXPOSE 8080 8081 9875
