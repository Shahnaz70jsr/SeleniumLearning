package xpath;

import org.openqa.selenium.chrome.ChromeDriver;

public class ParentToChildNavigate2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\16308\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	    driver.navigate().to("https://www.google.co.in/");
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    driver.findElementByXPath("//div[@class='RNNXgb']/div/div[2]/input").sendKeys("naz");
	    System.out.println("Successful Automation done by AttributeBaseXpath");
	driver.close();
			
	
	}

}
