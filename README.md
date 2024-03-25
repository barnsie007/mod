# ModResorts Demo Application

## Building
This version of ModResorts has a dependency on WAS APIs. Currently using the was runtime jar to satisfy this. The jar is available in this repo in the was-dependency directory. This dependency is referenced in the pom.xml via maven coordinates. You can install the file in your local maven repo with the following command:

```
mvn install:install-file -Dfile=com.ibm.ws.runtime.jar -DgroupId=com.ibm.websphere -DartifactId=runtime -Dversion=1.0 -Dpackaging=jar
```
# mod
