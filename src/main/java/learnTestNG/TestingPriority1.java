	package learnTestNG;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	public class TestingPriority1 {

	public ChromeDriver driver;
		
		@BeforeMethod
		public void login() throws InterruptedException  {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\16308\\drivers\\chromedriver.exe");
			 driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("http://leaftaps.com/opentaps");
			driver.findElementById("username").sendKeys("DemoSalesManager");
			driver.findElementById("password").sendKeys("crmsfa");
			driver.findElementByClassName("decorativeSubmit").click();
			driver.findElementByLinkText("CRM/SFA").click();
			Thread.sleep(2000);
		}
		@Test(priority = 1)
		public void editLead() {
			
			driver.findElementByLinkText("Leads").click();
			driver.findElementByLinkText("Find Leads").click();
			driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Hema");
			driver.findElementByXPath("//button[text()='Find Leads']").click();
		}

		@Test(priority = 0)
		public void createLead() throws InterruptedException {
			
			driver.findElementByLinkText("Leads").click();
			driver.findElementByLinkText("Create Lead").click();
			driver.findElementById("createLeadForm_companyName").sendKeys("TCS");
			driver.findElementByCssSelector("input#createLeadForm_firstName").sendKeys("Hema");
			driver.findElementByCssSelector("#createLeadForm_lastName").sendKeys("Ma");
			Thread.sleep(3000);
			driver.findElementByXPath("//input[@name='submitButton']").click();
		}
		@Test(priority = 2)
		public void deleteLead() {
			driver.findElementByLinkText("Leads").click();
			driver.findElementByLinkText("Find Leads").click();
			driver.findElementByXPath("//span[text()='Phone']").click();
			driver.findElementByXPath("//input[@name='phoneAreaCode']").sendKeys("201");
			driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("1234567");
		}
		@Test
		public void mergeLead() {
			System.out.println("mergeLead");
		}
		
		@AfterMethod
		public void closeBrowser() {
			driver.close();
		}

	}















