FROM openjdk:19
COPY out/production/repo-github/ /tmp
WORKDIR /tmp
CMD java Main