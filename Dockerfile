FROM gradle:7.6.0-jdk11
RUN echo "Final Project Mojix Bootcamp"
RUN mkdir /tmp/selenium
COPY ./build.gradle /tmp/selenium/build.gradle
COPY ./src /tmp/selenium/src
COPY ./launch.sh /tmp/launch.sh
RUN chmod 777 /tmp/launch.sh
ENTRYPOINT ["/bin/sh","/tmp/launch.sh"]