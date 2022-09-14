FROM openjdk:18
ADD  target/spring_boot_demo_sample.jar spring_boot_demo_sample.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/spring_boot_demo_sample.jar"]