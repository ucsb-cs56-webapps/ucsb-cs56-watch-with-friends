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
