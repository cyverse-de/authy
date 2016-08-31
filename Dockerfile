FROM clojure
COPY . /usr/src/authy
COPY ./docker/profiles.clj /root/.lein/profiles.clj
WORKDIR /usr/src/authy
RUN lein deps
CMD ["lein", "test"]
