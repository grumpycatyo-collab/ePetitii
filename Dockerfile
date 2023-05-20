FROM maven:3.8.5-openjdk-17
WORKDIR /code

COPY . /code

CMD mvn package && java -jar target/back-1.0-SNAPSHOT.jar
