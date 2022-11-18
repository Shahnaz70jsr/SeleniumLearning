package learnTestNGParameters;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TakeScreenshots1 {
		@Test
		public void createLead() throws InterruptedException, IOException   {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\16308\\drivers\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			// enter username
			driver.findElementById("username").sendKeys("DemoSalesManager");
			// enter password
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
			// click login button
			driver.findElement(By.xpath("//input[@value='Login']")).click();
			File src3 = driver.getScreenshotAs(OutputType.FILE);
	        File dest3 = new File("C:\\Users\\16308\\eclipse-workspace\\SeleniumLearning\\snap5/imag9.png");
	        FileUtils.copyFile(src3, dest3);
			// click CRM/SFA
			driver.findElement(By.linkText("CRM/SFA")).click();// click CRM/SFA link
			// click create lead link
			driver.findElement(By.linkText("Create Lead")).click();
			File src2 = driver.getScreenshotAs(OutputType.FILE);
	        File dest2 = new File("C:\\Users\\16308\\eclipse-workspace\\SeleniumLearning\\snap4/imag8.png");
	        FileUtils.copyFile(src2, dest2);
			//enter Company Name
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABC");
			//enter FirstName Name
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hema");
			System.out.println("FirstName entered");
			//enter LastName Name
			driver.findElementByXPath("//input[@id='createLeadForm_lastName']").sendKeys("Ma");
			System.out.println("Enter lastName successfully");
			File src1 = driver.getScreenshotAs(OutputType.FILE);
	        File dest1 = new File("C:\\Users\\16308\\eclipse-workspace\\SeleniumLearning\\snap3/imag7.png");
	        FileUtils.copyFile(src1, dest1);
			// click create lead
			driver.findElementByXPath("//input[@value='Create Lead']").click();
			//driver.getScreenshotAs(OutputType.FILE);
			File src = driver.getScreenshotAs(OutputType.FILE);
	        File dest = new File("./snap2/imag6.png");
	        FileUtils.copyFile(src, dest);
	        
			driver.close();

		}
		}








