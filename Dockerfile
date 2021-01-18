FROM openjdk:11
COPY ./target/jmsx.jar  /usr/src/jms/
WORKDIR /usr/src/jms
EXPOSE 8080
CMD ["java","-jar", "jmsx.jar"]