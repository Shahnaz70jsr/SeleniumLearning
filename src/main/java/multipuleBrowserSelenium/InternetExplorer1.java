package multipuleBrowserSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InternetExplorer1 {

public static void main(String[] args) {
		// TODO Auto-generated method stub		
			WebDriverManager.iedriver().setup();
			WebDriver driver = new InternetExplorerDriver();
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.findElement(By.cssSelector("input[id='username']")).sendKeys("DemoSalesManager");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
			Actions action = new Actions (driver);
			action.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
			driver.quit();
	

	}
}
	

