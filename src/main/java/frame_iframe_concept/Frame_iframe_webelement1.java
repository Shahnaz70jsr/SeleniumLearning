package frame_iframe_concept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_iframe_webelement1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

				System.setProperty("webdriver.chrome.driver", "C:\\Users\\16308\\drivers\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.navigate().to("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				System.out.println(driver.getTitle());
				//way1 enter into the frame
				//driver.switchTo().frame("(//input[@type='text'])[1]").
				//driver.switchTo().frame("iframeResult").getTitle();
				//System.out.println(driver.switchTo().frame("iframeResult").getTitle());
				//driver.switchTo().frame("//iframe[@id='iframeResult']");
				//way-2
				driver.switchTo().frame("iframeResult");
				//way-3 switching to frame
				//driver.switchTo().frame(driver.findElementByXPath(null));
				System.out.println("Successfully enter into the frame");
				//Remove/clear john from first name field
				///driver.findElementByXPath("John").clear();
				///remove/clear John from first name field
				////driver.findElementByXPath("//input[@value='John']").clear();
				//enter first name
				//driver.findElementByXPath("//input[@value='John']").sendKeys("Shahnaz");
				//driver.findElementByXPath("//input[@value='John']").sendKeys("Shahnaz");
				Thread.sleep(3000);
				//driver.findElementByXPath("//input[@id='lname']").clear();
				//enter last name
				//driver.findElementByXPath("//input[@id='lname']").sendKeys("Begum");
				//click submit
				//driver.findElementByXPath("//input[@value='Submit']").click();
				//enter first name
				//driver.findElementByXPath("//input[@value='John']").sendKeys("shahanaz");
				//clear last name from last name field
				///driver.findElementByXPath("//input[@value='Doe']").clear();
				///driver.findElementByXPath("//input[@value='Doe']").sendKeys("Parin");
				//click submit
				///driver.findElementByXPath("//input[@value='Submit']").click();
				///Thread.sleep(3000);
				//back to main/parentFrame
				///driver.switchTo().parentFrame();
				
				///System.out.println("Successfully entered into the parent frame");
				///Thread.sleep(4000);
				///driver.close();
			}


	
	
	
	
	
	
	
	
	
	}


