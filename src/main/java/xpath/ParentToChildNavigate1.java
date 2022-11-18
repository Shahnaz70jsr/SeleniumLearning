package xpath;

import org.openqa.selenium.chrome.ChromeDriver;

public class ParentToChildNavigate1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//writing Xpath base on parent basic Xpath and /(slash)child tagname
		//Syntax: Parent basic xpath/child tagname
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\16308\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to(" http://leaftaps.com/opentaps/control/main");
	    driver.findElementByXPath("//p[@class='top']/input").sendKeys("DemoSalesManager");
	    driver.findElementByXPath("//p[@class='top']/input").sendKeys("crmsfa");
	    driver.findElementByXPath("//p[@class='top']/input").click();
	   
	
	
	}

}
