# kotlin-greeter

Kotlin function example for riff

## Pre-requisits

First, install Projectriff - https://projectriff.io/

Add the Java invoker - https://projectriff.io/invokers/java/

## Build

```
mvn clean package
```

## Create the riff function

Replace `springdeveloper` with your own Docker account. Add `--push` if you are running on GKE.

```
riff create java -n kotlin-greeter -i greeter -a target/greeter-1.0.0-jar-with-dependencies.jar --handler functions.Greeter --useraccount springdeveloper
```

## Test the function

```
$ riff publish -i greeter -d Kotlin -r
Posting to http://35.231.168.181:80/requests/greeter
Hello Kotlin
```
