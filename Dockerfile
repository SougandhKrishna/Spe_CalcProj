FROM openjdk:17 
COPY ./target/spe_calc-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-cp", "spe_calc-1.0-SNAPSHOT.jar", "com.example.App"]