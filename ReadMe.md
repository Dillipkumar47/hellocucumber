# Skeleton Cucumber project
## Create cucumber-java project from command line
```shell
mvn archetype:generate                      \
   "-DarchetypeGroupId=io.cucumber"           \
   "-DarchetypeArtifactId=cucumber-archetype" \
   "-DarchetypeVersion=7.12.1"               \
   "-DgroupId=stepdefs"                  \
   "-DartifactId=stepdefs"               \
   "-Dpackage=stepdefs"                  \
   "-Dversion=1.0.0-SNAPSHOT"                 \
   "-DinteractiveMode=false"

```

## Execute cucumber tests with maven command
```text
- mvn test -Dcucumber.filter.tags="@final" #filter tests with tag
- mvn test -Dcucumber.options="--plugin html:target/cucumber-html-report.html"


```
 