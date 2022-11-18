package testCases_LeafTapWD;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import wrapper.ProjectSpecificWrap_Webdriver;

public class CreateLead extends ProjectSpecificWrap_Webdriver{
	
	@Test
	public void creatLead() {
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		
		driver.findElement(By.cssSelector("a[href*='createLeadForm']")).click();
		driver.findElement(By.cssSelector("#createLeadForm_companyName")).sendKeys("TCS");
		driver.findElement(By.cssSelector("#createLeadForm_firstName")).sendKeys("Hema");
		driver.findElement(By.cssSelector("#createLeadForm_lastName")).sendKeys("Ma");
		
		WebElement Sou = driver.findElement(By.cssSelector("Select[name='dataSourceId']"));
		Select dd = new Select (Sou);
		dd.selectByValue("LEAD_OTHER");
		
		driver.findElement(By.cssSelector("#createLeadForm_generalProfTitle")).sendKeys("Ms.");
		
		WebElement ind = driver.findElement(By.cssSelector("select[name='industryEnumId']"));
		Select dd1= new Select(ind);
		dd1.selectByIndex(5);
		
		WebElement own = driver.findElement(By.cssSelector("select[name='ownershipEnumId']"));
		Select dd2 = new Select(own);
		dd2.selectByValue("OWN_PARTNERSHIP");
		
		driver.findElement(By.cssSelector("#createLeadForm_primaryPhoneAreaCode")).sendKeys("123");
		driver.findElement(By.cssSelector("input[name='primaryPhoneExtension']")).sendKeys("12");
		driver.findElement(By.cssSelector("input[name='departmentName']")).sendKeys("MKT");
		driver.findElement(By.cssSelector("input[name='numberEmployees']")).sendKeys("100");
	
		WebElement url = driver.findElement(By.cssSelector("#createLeadForm_primaryWebUrl"));
		url.sendKeys("google.com");
		System.out.println("Tag name for current element= "+url.getTagName());
		System.out.println("location for current element= "+url.getLocation());
		System.out.println("   ");
		driver.findElement(By.cssSelector("input[name='generalCity']")).sendKeys("Detroit");
		
		WebElement st = driver.findElement(By.cssSelector("select[name='generalStateProvinceGeoId']"));
		Select dd3 = new Select (st);
		dd3.selectByVisibleText("Indiana");
		
		WebElement cou = driver.findElement(By.cssSelector("select[onchange^='o']"));
		Select dd4 = new Select (cou);
		dd4.selectByValue("AUS");
		
		driver.findElement(By.cssSelector("input[name='generalPostalCode']")).sendKeys("75061");
		
		WebElement mar = driver.findElement(By.cssSelector("#createLeadForm_marketingCampaignId"));
		Select dd5 = new Select (mar);
		dd5.selectByVisibleText("Pay Per Click Advertising");
		
		driver.findElement(By.cssSelector("#createLeadForm_primaryPhoneNumber")).sendKeys("123456");
		driver.findElement(By.cssSelector("#createLeadForm_primaryEmail")).sendKeys("abc@gmail.com");
		driver.findElement(By.cssSelector(".smallSubmit")).click();
		
		String tl = driver.getTitle();
		System.out.println("View Lead Page Title= "+tl);
		if (tl.contains("View")) {
			System.out.println("Verification successful ");
		}else {System.out.println("Verification failed");
		}
		
		System.out.println("   ");
		
		WebElement fname = driver.findElement(By.cssSelector("#viewLead_firstName_sp"));
		System.out.println(fname.getText());
	     if ((fname.getText().equals("Hema"))){
			System.out.println("Verification result pass");
		}else {
			System.out.println("Verification failed");
		}
	     
		System.out.println("    ");
		
		WebElement lname = driver.findElement(By.cssSelector("#viewLead_lastName_sp"));
		System.out.println("Verify entry match with Last name= "+ lname.getText());
		System.out.println("Last name and first name are same = "+lname.equals(fname));
	    System.out.println("Last name and first name are same = "+(lname==fname));
	    
		System.out.println("   ");
		System.out.println("Current page title= "+driver.getTitle());
		System.out.println("Window handle= "+ driver.getWindowHandles());
		System.out.println("Page title Hash code= "+ System.identityHashCode(driver.getTitle()));
		
		driver.findElement(By.cssSelector(".subMenuButtonDangerous")).click();
		
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys("55555");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		

/*ment(By.cssSelector(".label+td>textarea")).sendKeys("TCS");
		driver.findElement(By.cssSelector("input[size='6']")).sendKeys("1");



}

	private WebElement ment(By cssSelector) {
		// TODO Auto-generated method stub
		return null;
	}
*/

	}}