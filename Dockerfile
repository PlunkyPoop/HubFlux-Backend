FROM openjdk:17-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8080

#FROM node:10-alpine
#WORKDIR /usr/src/app
#COPY package*.json ./
#RUN npm install
#COPY . .
#EXPOSE 3000
#CMD ["npm", "start"]
#
## set working directory
#WORKDIR /usr/src/app
#
## install node_modules
#ADD package.json /usr/src/app/package.json
#RUN npm instal
#
## copy codebase to docker codebase
#ADD . /usr/src/app