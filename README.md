# WATCH WITH FRIENDS

A webapp where people watch videos together and chat with friends

Webapp Url: http://cs56-f18-watch-with-friends.herokuapp.com/

---

Before running, please have a database in [MLab](https://mlab.com/home) ready with the credentials:  
`mongodb://<username>:<userpassword>@ds<host>.mlab.com:<port>/<databasename>`

---

Instructions (LOCALHOST): Clone this repository then update the credentials inside of localhost.json.SAMPLE with:
--
```  
{
 "spring.data.mongodb.database":"<databasename>",
 "spring.data.mongodb.host":"ds<host>.mlab.com",
 "spring.data.mongodb.password":"<userpassword>",
 "spring.data.mongodb.port":"<port>",
 "spring.data.mongodb.username":"<username>"
}
```
Afterwards, the commands to run are : 

1) `mv localhost.json.SAMPLE localhost.json`

2) `. env.sh`

3) `mvn compile`

4) `mvn spring-boot:run`

* NOTES:
1) if the `java.net.ConnectException: Connection refused (Connection refused)` error occurs, use command: `. env.sh` to rebuild environment file then use `mvn spring-boot:run`
2)  if an issue with the ```8080``` port occurs, please edit the `server.port` property inside `~/src/main/resources/application.properties` to change the port to ```8181```  
----
 

Instructions (HEROKUAPP): Clone this repository then navigate to application.properties to update credentials:
--
Pathway: `~/src/main/resources/application.properties`
```
server.port = 8080
server.contextPath = /api
spring.data.mongodb.database=<databasename>
spring.data.mongodb.host=ds<host>.mlab.com
spring.data.mongodb.password=<userpassword>
spring.data.mongodb.port=<port>
spring.data.mongodb.username=<username>
```
* NOTE: -- must be added as a collaborator on the heroku app to deploy --   
Afterwards, navigate back the top level directory. The commands to run are:

1) `mvn compile`

2) `mvn package heroku:deploy`

Optional Heroku Commands (FOR THE DEPLOYMENT ON HEROKU -- must be collaborator):

1) `heroku config:set MONGOLAB_URI=mongodb://<username>:<userpassword>@ds<host>.mlab.com:<port>/<databasename> --app cs56-f18-watch-with-friends`

2) `heroku config:get MONGOLAB_URI --app cs56-f18-watch-with-friends`

---

f18 final remarks
=

Technical things to know: Learn how the [@ResponseBody](https://www.baeldung.com/spring-request-response-body) works, and how to use the [MongoRepository](https://docs.spring.io/spring-data/mongodb/docs/current/api/org/springframework/data/mongodb/repository/MongoRepository.html).

Holistic things to know:  Work with your team, keep each other in check, attempt to understand the project as a group, and prepare time to overcome technical challenges.

~~Bugs~~ Features: When first creating a room on the webapp, the error page is called. However, subsequent creations of rooms will permanently work.

Features to add: Realtime-chat, Music sharing options, User accounts (personalization), Improved security, Syncing of videos, and a way to monitor current sessions.

What we used for this app:  
Spring-Boot
Herokuapp
MongoDB with MLab
Maven

The app is meant to create new or join existing rooms created by the app. Each room is uniquely identified by a name and hash. Existing room names cannot be created, but there is no way at the moment to stop users from simply entering the room that they guessed -- This could be a new issue to attempt. The code is divided into two parts: the User Interface (resources files) and Database (predominantly the java files). The way the two are connected is through the WatchController, which delivers response bodies to the html as well as makes calls to the database. Once you gain understanding of this process, continuing the app will be the next step. Good luck.


---
