package frame_iframe_concept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_iframe_webelement2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\16308\\drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		System.out.println(driver.switchTo().frame("iframeResult"));
		System.out.println("Successfully enter into the frame");
		driver.findElementByXPath("//input[@value='John']").clear();
		driver.findElementByXPath("//input[@value='John']").sendKeys("Shahnaz");
		Thread.sleep(3000);
		//driver.findElementByXPath("//input[@id='Doe']").clear();
		//enter last name
		//driver.findElementByXPath("//input[@id='Doe']").sendKeys("Begum");
		//click submit
		//driver.findElementByXPath("//input[@value='Submit']").click();
		Thread.sleep(3000);
		
	driver.switchTo().parentFrame();
	
	
	
	
	}

}
