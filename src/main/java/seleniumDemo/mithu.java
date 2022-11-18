package seleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mithu {

	
	public static void main(String[] args) {
		 
	System.setProperty("webdriver.chrome. driver","C:\\Users\\16308\\drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
	
	}
}