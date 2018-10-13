This is MVC web application, build by using Spring.

Brief description of the Project :

4 Class file 

    1. KeyService.java (Bean Class)
    
       Contains the logic for controller, Loads Data from CSV on startup
       
    2. Controller (HelloController.Java)
    
       responsible for controlling the flow of the application
       
    3. KeyModel.Java
    
       Responsible for managing the data of the application
       
    4. CSVReader.java
    
       Responsible for loading data from a CSV file.
 
 
Flow : 
1. Hit API (http://localhost:8080/SpringMVC/{KeyId})
2. Contoller will receive the request and will map the request to one of RequestMapping.
3. Contoller will call KeyService.java, 
   a. This class contains a static block in this block i have written code for CSV loading 
   b. This class contains an autowiring object
   c. Strores all CSV data in a map on loading time (on first time request)
   d. searches KeyId in map, if found then return a KeyModel object and if not then return null.
4. accordingly Controller will get either a null or a KeyModel object
   if -> null then return "Resource Not found"
   else -> Make a Json Object with Key Value and return JSON object.
   

How to run application :
1. Clone code from https://github.com/GrvJava/Goibibo/tree/master/SpringMVCMaven
2. import this maven project to eclipse 
3. run application 
4. Hit API : http://localhost:8080/SpringMVC/{KeyId}

or deploy war file on apache tomcat and hit API.
   
       
