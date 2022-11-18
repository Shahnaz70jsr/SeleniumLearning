package xpath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Dynamicwebelements_startswith_Xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//starts-with:
		//Syntax: //tagname[starts-with(@attribute,’start value of attribute’)]
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\16308\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("http://leaftaps.com/opentaps/control/main");
		driver.findElementsByXPath("(//a[starts-with(@id,'ext-gen')])[3]");
		Thread.sleep(3000);
		System.out.println("Automation is successful");
		driver.close();
	}
}
