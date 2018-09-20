FROM node:latest
MAINTAINER 479979298@qq.com
WORKDIR /usr/local
RUN npm install -g mountebank
EXPOSE 2525
WORKDIR /usr/local/mountebank/bin
ENTRYPOINT ["mb"]