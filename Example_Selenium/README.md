
# **What is mean by Selenium ?** <br/>

    Selenium is a free (open source) automated testing suite for web applications.

## **Pre-requisites** 

 - Java  ( JAV8 or higher For selenium-3)
 - maven
 - Eclipse
 - Selenium jar files 
   [Download selenium For java](http://www.seleniumhq.org/download/ )
    - For selenium jar files , download the following: 
      1) selenium-server-3.9.1.zip
      2) selenium-server-standalone-3.9.1.jar      
 - Firefox Driver/Google Chrome Driver
 
 ## EX: BasicExample.java
In This Example ,
- **driver.get("url")** used to enter itno a web browser page.
- **driver.findElement(By.id("search-inp")).sendKeys("Java");** 
  Used to find element in the browser page based on "id" we provided and we can send data using "sendKeys".
- **driver.findElement(By.id("search-button-bottom")).click();**
  Used to click the event.

