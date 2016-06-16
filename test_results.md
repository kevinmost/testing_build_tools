# Results

### Gradle

#### Without daemon

`./gradlew clean build --no-daemon` takes between 2.8 and 2.95 seconds.

`./gradlew build --no-daemon` after a successful build takes between 2.5 and 2.65 seconds.

#### With daemon

`./gradlew clean build` takes between 0.6 and 0.7 seconds.

`./gradlew build` after a successful build takes between 0.55 and 0.65 seconds.

----

### Maven

`mvn clean install` takes between 1.1 and 1.2 seconds.

`mvn install` after a successful build takes between 0.7 and 0.8 seconds.
