FROM jenkins/jenkins:latest
MAINTAINER 479979298@qq.com
ADD apache-maven-3.5.3  /usr/local
ADD apache-ant-1.9.11   /usr/local
ENV MAVEN_HOME /usr/local/apache-maven-3.5.3
ENV ANT_HOME   /usr/local/apache-ant-1.9.11
ENV PATH $MAVEN_HOME/bin:$PATH
ENV PATH $ANT_HOME/bin:$PATH