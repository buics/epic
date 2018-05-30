FROM java:8
VOLUME /tmp
ADD target/Epic*.jar Epic.jar
RUN sh -c 'touch /Epic.jar'
ENV JAVA_OPTS="-Xmx256m -Xms128m"
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /Epic.jar"]
