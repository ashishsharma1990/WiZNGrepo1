package newtest;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Login {
  @Test
  public void test()  throws InterruptedException 
	{
	
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium soft\\chromedriver_win32\\chromedriver.exe");
		
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		driver.get("https://qa-bruins.wkdev.cloud");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.findElement(By.id("username")).clear();
      driver.findElement((By.id("username"))).sendKeys("ashish.sharma@wolterskluwer.com");
      Thread.sleep(1000);
      driver.findElement(By.id("password")).clear();
      driver.findElement(By.id("password")).sendKeys("~PCiwiz2#");
      Thread.sleep(1000);        
      driver.findElement(By.xpath("//button[@id='submitLogin']")).click();
      Thread.sleep(5000);
      if((driver.findElement(By.xpath(".//*[@id='n']")).getText()).equalsIgnoreCase("ashish.sharma@wolterskluwer.com")) {
      	System.out.println("Login Successful");
      }else {
      	System.out.println("Login failure");
      }
      
      Thread.sleep(200);
      
      driver.close();
    /*  driver.findElement(By.className(className)).click();
      WebElement userbtn=driver.findElement(By.xpath(".//*[@id='n']"));
      Actions act=new Actions(driver);
      act.moveToElement(userbtn).build().perform();
      Thread.sleep(1000);
      driver.findElement(By.xpath(".//*[@id='logout-link']")).click();
      
      Thread.sleep(4000); */
      
	}
	}
