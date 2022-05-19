# 镜像出处
FROM openjdk:8
# 维护者信息
MAINTAINER MENGDEDOG
# 镜像操作指令
RUN mkdir /common
VOLUME /tmp
WORKDIR /tmp
ADD target/*.jar /eureka-server.jar
EXPOSE 8848
ENTRYPOINT ["java","-jar","/eureka-server.jar"]