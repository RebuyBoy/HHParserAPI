FROM openjdk:17
COPY /target/HHparserAPI-0.0.1.jar parser.jar
ENTRYPOINT ["java","-jar","parser.jar"]
