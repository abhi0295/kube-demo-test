FROM openjdk:17

COPY target/kube-demo-test.jar kube-demo-test.jar

EXPOSE :8080

ENTRYPOINT ["java", "-jar", "kube-demo-test.jar"]