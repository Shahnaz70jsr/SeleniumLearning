package learnTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AsatTest {
	
	
	static WebDriver driver;
	
	@BeforeTest
	public static void testBefore(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\16308\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Driver Set up");
	}
	@BeforeMethod
	public static  void openWebpage() {
		driver.get("http://leaftaps.com/opentaps/control/main");
		System.out.println("Open the website");
	}
	@Test
	void name1(){
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	}
	
	@Test
	void name2() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	}
	@Test
	void name3() {
		driver.findElement(By.className("decorativeSubmit")).click();
		
	}
	@Test()
	void name4() {
		String WEbName = driver.getTitle();
		
		// Verified the Web Site is Leaftop
		if (WEbName.equals("Leaftaps - TestLeaf Automation Platform")) {
			System.out.println("Name is Matched");
		} else {
			System.out.println("Not Match");
		}
		
	}
	
	@AfterTest
	public static void testAfter(){
		
		driver.close();
		System.out.println("Account Loging");
	}
}
