package multipuleBrowserSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;


		public class FireFoxBrowser {

			public static void main(String[] args) {

			WebDriverManager.firefoxdriver().setup();
			WebDriver driver = new FirefoxDriver();
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.findElement(By.cssSelector("input[id='username']")).sendKeys("DemoSalesManager");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
			Actions action = new Actions (driver);
			action.sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
			driver.quit();



	}

}






