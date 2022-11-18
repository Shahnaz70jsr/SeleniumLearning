package assertion_for_Varifications;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import multipuleBrowserSelenium.ChromeBrowser;

public class assertEquals_text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver","C:\\Users\\16308\\drivers\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	String text = driver.findElementByXPath("//label[text()='Username']").getText();
	Assert.assertEquals(text, "Username");
	}

}
