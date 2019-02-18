# Examples
All Examples 


# **What is Selenium ?** <br/>

    Selenium is a free (open source) automated testing suite for web applications.


## **What are Features ?**

 - Flexible and extensible
 - Multiple lang. Supported
 - Supports multiple browsers & platforms.

## **What are Selenium Suite Of Tools (Components) ?**

 - Selenium RC (depreciated) - Remote Control
 - Selenium IDE
 - Selenium Grid
 - Selenium WebDriver -->Now Working on it

## **What you need ?** 

 - Java  ( JAV8 or higher For selenium-3)
 
 - Eclipse
 - Selenium jar files 
   [Download](http://www.seleniumhq.org/download/ )
    From  → select Java download link.
    - For selenium jar files , download the following: 
      1) selenium-server-3.9.1.zip
      2) selenium-server-standalone-3.9.1.jar      
 - Browser based drivers
 
## **How to Work with Drivers ?** 

 - Download Chrome/Firefox Driver
   - For Chrome:
      System.setProperty(“webdriver.chrome.driver ”, “ location of chrome driver”); <br/>
      Webdriver driver = new ChromeDriver();
   - For Firefox:
     System.setProperty(“webdriver.firefox.driver ”, “ location of firefox driver”); <br/>
     Webdriver driver = new FirefoxDriver();

## **What are WebElements ?** <br/>
    Web Elements are used to interact with webpages.Web Element is a class . <br/>
    We can get it from  “org.openqa.selenium.*” Package. <br/>
    We can Instantiate Web Element Object as Folows:  <br/>
    *WebElement myelement = driver.findElement(By.id(“username”));*  <br/>
    *myelement.sendKeys(“Give a Username‘);* 


