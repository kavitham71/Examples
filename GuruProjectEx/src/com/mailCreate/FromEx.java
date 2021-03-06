package com.mailCreate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class FromEx {
	public static WebDriver driver;
	public static String browser;
	public static String projectpath;

	public static void main(String[] args) {
		GetData.read();
		setbrowserConfig();
		runTest();
	}
	public static void setbrowserConfig() {
		if(browser.contains("chrome")) {
			try {
				
				System.setProperty("webdriver.chrome.driver", projectpath+"/lib/Drivers/chromedriver/chromedriver");
				driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(browser.contains("firefox")) {
			try {
				System.setProperty("webdriver.gecko.driver", projectpath+"/lib/Drivers/geckodriver/geckodriver");
				driver = new FirefoxDriver();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void runTest() {
		driver.navigate().to("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
		addEntries();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}
	public static void addEntries() {
		driver.findElement(By.id("firstName")).sendKeys("");
		WebElement TxtContent = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[1]/div[2]/form/div[2]/div/div[1]/div[1]/div[1]/div/div[2]/div[2]/div/span"));
		TxtContent.getText(); 
		Object obj= new Object(); 
		obj=driver.findElement(By.id("firstName")); 
		System.out.println("obj value"+obj);
		  if(obj==null)
		  {
		   System.out.println(TxtContent);   //Comparing First Name Blank Field.
		  }
		  try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*driver.findElement(By.id("lastName")).sendKeys("your lastname",Keys.ALT);
		driver.findElement(By.id("username")).sendKeys("new username", Keys.ALT);
		//driver.findElement(By.xpath("//*input[@type='Password']")).sendKeys("your password", Keys.ENTER);
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		WebDriverWait wait1 = new WebDriverWait(driver, 20);
		wait1.until(ExpectedConditions.elementToBeClickable(password));
		password.sendKeys("your password",Keys.ALT);
		
		WebElement cnfpwd = driver.findElement(By.xpath("//input[@name='ConfirmPasswd']"));
		WebDriverWait wait2 = new WebDriverWait(driver, 20);
		wait2.until(ExpectedConditions.elementToBeClickable(cnfpwd));
		cnfpwd.sendKeys("your password",Keys.ALT);
		
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		
		WebElement mblno = driver.findElement(By.xpath("//input[@id='phoneNumberId']"));
		WebDriverWait wait3 = new WebDriverWait(driver, 20);
		wait3.until(ExpectedConditions.elementToBeClickable(mblno));
		mblno.sendKeys("999999999",Keys.ALT);
		
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mail_id@gmail.com", Keys.ALT);
		*/
		
	} 

}
