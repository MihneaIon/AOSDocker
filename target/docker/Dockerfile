FROM openjdk:8
ADD appdocker-web.jar app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]
#ENTRYPOINT["java","-Djava.security.egd=file:/dev/./urandom", "-Dspring.profiles.active=container", "-jar", "appdocker-web.jar"]