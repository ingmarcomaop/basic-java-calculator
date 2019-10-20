FROM openjdk:8-jdk-alpine

EXPOSE 80
VOLUME /tmp

WORKDIR /basic-java-calculator

COPY ./build/libs/basic-java-calculator.jar ./app.jar

ENTRYPOINT ["java","-jar","/basic-java-calculator/app.jar"]