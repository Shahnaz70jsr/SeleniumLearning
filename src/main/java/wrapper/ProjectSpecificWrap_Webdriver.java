package wrapper;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class ProjectSpecificWrap_Webdriver {
public WebDriver driver;

@BeforeMethod

	public void login() {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\16308\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	//maximize
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	Actions action = new Actions(driver);
	//action.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();

	driver.findElement(By.className("decorativeSubmit")).click();
	
	driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();

	}
	@AfterMethod
	public void logout() {
	driver.close();	
	}
	}






