FROM openjdk:11.0.14.1-slim-buster
COPY lib/ /opt/lib/
COPY admin.json /opt/admin.json
COPY glowroot.jar /opt/glowroot.jar
COPY target/metricsdemo-0.0.1-SNAPSHOT.jar /opt/metricsdemo-0.0.1-SNAPSHOT.jar
EXPOSE 4000 8080
ENTRYPOINT ["java","-jar","-javaagent:/opt/glowroot.jar","/opt/metricsdemo-0.0.1-SNAPSHOT.jar"]