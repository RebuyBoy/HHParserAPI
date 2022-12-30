FROM openjdk:17
COPY /target/HHparserAPI-0.0.1.jar parser/hhParser.jar
ENTRYPOINT ["java","-jar","/hhParser.jar"]
