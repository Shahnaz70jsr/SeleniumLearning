package CSSSelector;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreatLead {

public static void main(String[] args) throws InterruptedException {
	//TODO Auto-generated method stub
	
	//Run with TestNG
	//@Test
	//public void cSS2() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\16308\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();	

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
						
		driver.get("http://leaftaps.com/opentaps");
		
		driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");
	
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");

		driver.findElementByXPath("//input[@value='Login']").click();

		driver.findElementByLinkText("CRM/SFA").click();

		driver.findElementByLinkText("Leads").click();
		
		driver.findElementByLinkText("Create Lead").click();

		driver.findElementById("createLeadForm_companyName").sendKeys("TCS");
		
		try {
			driver.findElementByCssSelector("input#createLeadForm_firstName").sendKeys("Hema");
		} catch (NoSuchElementException e) {
			System.out.println("The element not found");
		}
		Thread.sleep(2000);
		
		driver.findElementByCssSelector("#createLeadForm_lastName").sendKeys("Mali");
	
		WebElement src = driver.findElementById("createLeadForm_dataSourceId");
		Select dd = new Select(src);
		dd.selectByVisibleText("Website");
		
		WebElement ele = driver.findElementByName("ownershipEnumId");
		Select dd2 = new Select(ele);
		dd2.selectByVisibleText("Sole Proprietorship");
		driver.findElementByXPath("//input[@name='submitButton']").click();

		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.contains("View")) {
			System.out.println("Title matched and result is pass");
		} else {
			System.out.println("Title not Matched");
		}
				
		driver.close();
		
	}
		

}


