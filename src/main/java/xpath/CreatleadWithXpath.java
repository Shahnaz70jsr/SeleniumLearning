package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreatleadWithXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

				
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\16308\\drivers\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("http://leaftaps.com/opentaps/control/login");

				System.out.println("webpage open");
				driver.manage().window().maximize();
				driver.findElement(By.xpath("(//*[@class='inputLogin'])[1]")).sendKeys("DemoSalesManager");
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				driver.findElement(By.className("decorativeSubmit")).click();
				System.out.println("Uesr successfully login");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id='label']")).click();
				Thread.sleep(2000);
				driver.findElement(By.linkText("Create Lead")).click();
				System.out.println("Lead is created");
				Thread.sleep(1000);
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("NAZ");
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("KAMAL");
				System.out.println("lead login successful");
				WebElement src = driver.findElement(By.id("createLeadForm_dataSourceId"));
				Select dd1 = new Select(src);
				dd1.selectByIndex(7);
				System.out.println("dropdown selected");
				Thread.sleep(2000);
				driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Ms");
				Select dd2 = new Select	(driver.findElement(By.id("createLeadForm_industryEnumId")));
				dd2.selectByIndex(6);
				Select dd3 = new Select(driver.findElement(By.id("createLeadForm_ownershipEnumId")));
				dd3.selectByIndex(2);
				driver.findElement(By.id("createLeadForm_description")).sendKeys("TCS");
				driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("1");
				driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("682");
				driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("MKT");
				driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("100");
				driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("google.com");
				Select dd4 = new Select (driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
				dd4.selectByIndex(3);
				Select dd5 = new Select (driver.findElement(By.id("createLeadForm_generalCountryGeoId")));
				dd5.selectByIndex(10);
				driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("1234567890");
				driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("1234567890");
				driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc@gmail.com");		
		Thread.sleep(3000);
				driver.close();
			System.out.println("Successful Automation done");
			}
		
	
	
	}


