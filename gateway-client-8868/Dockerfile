# 镜像出处
FROM openjdk:8
# 维护者信息
MAINTAINER MENGDEDOG
# 镜像操作指令
RUN mkdir /common
VOLUME /tmp
WORKDIR /tmp
ADD target/*.jar /gateway-client.jar
EXPOSE 8868
ENTRYPOINT ["java","-jar","/gateway-client.jar"]