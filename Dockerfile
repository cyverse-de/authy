FROM clojure
COPY ./docker/profiles.clj /root/.lein/profiles.clj
WORKDIR /usr/src/authy

COPY project.clj /usr/src/authy/
RUN lein deps

COPY . /usr/src/authy
CMD ["lein", "test"]
