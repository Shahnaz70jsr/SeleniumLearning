package xpath;
import org.openqa.selenium.chrome.ChromeDriver;
public class DynamicWebElement_Contains_Xpath {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	//Syntax: //tagname[contains(@attribute,’end value of attribute’)]
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\16308\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https;//www.target.com/");
		driver.findElementByXPath("(//span[contains(@class,'hoVCbd')])[2]").click();
		//driver.findElementByXPath("(//a[contains(@class,'down')])[1]").click();
		Thread.sleep(3000);
		System.out.println("Successful Automation done");
		driver.close();	
	
	
	}
}
