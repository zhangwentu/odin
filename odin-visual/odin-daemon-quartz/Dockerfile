FROM pig4cloud/java:8-jre

MAINTAINER wangiegie@gmail.com

ENV TZ=Asia/Shanghai
ENV JAVA_OPTS="-Xms128m -Xmx256m -Djava.security.egd=file:/dev/./urandom"

RUN ln -sf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

RUN mkdir -p /odin-daemon-quartz

WORKDIR /odin-daemon-quartz

EXPOSE 5007

ADD ./target/odin-daemon-quartz.jar ./

CMD sleep 120;java $JAVA_OPTS -jar odin-daemon-quartz.jar
