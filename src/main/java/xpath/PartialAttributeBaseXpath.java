package xpath;

import org.openqa.selenium.chrome.ChromeDriver;

public class PartialAttributeBaseXpath {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//Syntax://tagname[contains(@attribute,'partialValue')]
		System.setProperty("webdriver.chrome.driver","C:\\Users\\16308\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("http://leaftaps.com/opentaps/control/main");
		driver.findElementByXPath("//input[contains(@id,'u')]").sendKeys("DemoSalesManager");
		driver.findElementByXPath("//input[contains(@id,'p')]").sendKeys("crmsfa");
		driver.findElementByXPath("//input[contains(@class,'d')]").click();
		System.out.println("Successful Automation done by partialAttributeBaseXpath");
		Thread.sleep(3000);
		driver.close();
		
		}

}
	
	
	
	
	
	


