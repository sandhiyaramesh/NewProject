package org.test;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import com.beust.jcommander.Parameter;

public class Sample {
	static WebDriver driver;
	
@BeforeClass
  private void beforeClass() {
		
		
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\Desktop\\New Workspace\\J Unit\\Div\\chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.get("https://www.facebook.com/");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
       System.out.println("Before Class");
}
  
@AfterClass
  private void afterClass() {
  driver.quit();
  System.out.println("After Class");
}
  
 @BeforeMethod
  private void beforeMethod() {
  System.out.println("BeforeMethod");
  Date d = new Date();
  System.out.println("Test Start....."+d);
}
    
 @AfterMethod
  private void afterMethod() {
  System.out.println("AfterMethod");
  Date d = new Date();
  System.out.println("Test End......."+d);
}
  
 @Test(enabled=true, invocationCount=3)
    private void Test1() {
	   driver.get("https://www.facebook.com/");
	   WebElement txtUser = driver.findElement(By.id("email"));
	   txtUser.sendKeys("Sandy");
	   WebElement txtPass = driver.findElement(By.id("pass"));
	   txtPass.sendKeys("805617");
	   WebElement btnLogin = driver.findElement(By.name("login"));
	   btnLogin.click();
	   System.out.println("Test 1");
  }
  
}

