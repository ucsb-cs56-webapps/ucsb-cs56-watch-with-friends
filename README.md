# simple-json-mlab-demo

This demo shows:
* how to read JSON data from a file
* how to write data into a MongoDB database
* how to read that data from a MongoDB database

For how to set up a MongoDB database on Mlab, see:
* <https://ucsb-cs56-pconrad.github.io/topics/mongodb_mlab/>

# Running the JSON demo

The main for the JSON demo code can be run by doing:

```
mvn package
java -cp target/mlabdemo-1.0.jar edu.ucsb.cs56.pconrad.mlab.mlabdemo.JsonDemo
```

# Running the mlab demo

First, set up an mlab database following these instructions:
* <https://ucsb-cs56-pconrad.github.io/topics/mongodb_mlab/>

You need to set up, for example ,`locahost.json` with the needed properties to connect to your database.

Then, run:

```
mvn spring-boot:run
```

In this case,  the class `Application` defined in `Application.java`, in spite of having the `@SpringBootApplication` annotation and a `main` method, does NOT
run a webapp, because:

* the main `implements CommandLineRunner`
* the class overrides `public void run`

As a result, the Spring Boot application does all of the normal auto-wiring and dependency injection stuff (e.g. setting up a connection to a MongoDB database
from the properties defined in `application.properties`, or overridding in the environment variable `SPRING_APPLICATION_JSON`, but it then just
runs all of the code in the `run` method and then exits.

That code contains a demonstration of writing some values to a MongoDB database, and then reading those values back.

The class that is the basis of the data read is called `BuildingCode`,and it is set up with Lombok to avoid having to write boilerplate Java Code such as
* getters/setters
* constructors
* `.equals`, `.hashCode`, `.toString`

The requirement for the MongoDB code to work are that we have an `id` field that has the `@Id` annotation on it, for instance:


```
    @Id private String id;	
```

The applicable import for this annotation is:

```
import org.springframework.data.annotation.Id;
```

That field is generally required for any object that you want to serialize into a MongoDB database.

The requirements for the JSON code to work include:

* getters and setters for each field with the Java Bean naming convention (i.e. camel case)
* a no-args constructor

The Lombok code that makes that work are the `@Data` and `@NoArgsConstructor` annotations.

In addition, it's convenient to have a constructor that
just takes `code` and `name` (but not `id`), so we make that work by noting the fields that we want
to be in our constructor with the `@NonNull` annotation, and then add the `@RequiredArgsConstructor`
annotation.

The whole thing is therefore:

```
package edu.ucsb.cs56.pconrad.mlab.mlabdemo;

import lombok.Data;
import lombok.RequiredArgsConstructor; // generates constructor for fields marked with @NonNull                                                                              import lombok.NoArgsConstructor;  // @NonNull property ignored by this constructor                                                                                            
import lombok.NonNull;
import org.springframework.data.annotation.Id;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class BuildingCode {

    @Id private String id;
    @NonNull private String code;
    @NonNull private String name;
}
```





