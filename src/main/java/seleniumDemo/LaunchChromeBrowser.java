package seleniumDemo;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args)throws InterruptedException, IOException {
		// TODO Auto-generated method stub


		//launch Chrome browser
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\16308\\drivers\\chromedriver.exe");
		
		//Object of ChromeDriver class 
		ChromeDriver driver = new ChromeDriver();
		
		//Explicitly wait
		Thread.sleep(3000);
		
		//Maximize window
		driver.manage().window().maximize();
		
		// load url
		driver.get("http://leaftaps.com/opentaps");
						
		//Print Title of the page
		driver.getTitle();
		System.out.println(driver.getTitle());
		
		 
		 //Implicitly wait
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		 //enter username
		driver.findElementById("username").sendKeys("DemoSalesManager");
		//driver.findElementById("username").sendKeys("DemoSalesManager");
		 
		//enter password
		 driver.findElementById("password").sendKeys("crmsfa");
		//driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		 
		 //click login btn
		 driver.findElementByClassName("decorativeSubmit").click();
		// driver.findElementByClassName("decorativeSubmit").click();
		 
		 //click CRM/SFA
		 driver.findElementByLinkText("CRM/SFA").click();
		 //driver.findElementByLinkText("CRM/SFA").click();
		 
		 //Click Leads link
		 driver.findElementByLinkText("Leads").click();
		 // screen shot for eclip
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snap/img.png");
		FileUtils.copyFile(src, dest);
		
		 // screen shot for desktop
		//File src1 = driver.getScreenshotAs(OutputType.FILE);
		//File dest1 = new File("C:\\Users\\16308\\eclipse-workspace\\SeleniumLearning\\snap1\\img.png");
		//FileUtils.copyFile(src1, dest1);
		
		File src1 = driver.getScreenshotAs(OutputType.FILE);
		File dest1 = new File("C:\\Users\\16308\\OneDrive\\Desktop\\Snapshot\\img.png");
	   FileUtils.copyFile(src1, dest1);
			
		
		
		 Thread.sleep(3000); 			 
		 //close browser
		driver.close();		
		
	}





	
	
	}



