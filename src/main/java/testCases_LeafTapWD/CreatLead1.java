package testCases_LeafTapWD;

	import java.util.NoSuchElementException;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;
	import org.testng.annotations.Test;

	public class CreatLead1 {

			@Test
			public void createLead() throws InterruptedException {
				
				System.setProperty("webdriver.chrome.driver","C:\\Users\\16308\\drivers\\chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.get("http://leaftaps.com/opentaps");
				driver.findElementById("username").sendKeys("DemoSalesManager");
				driver.findElementById("password").sendKeys("crmsfa");
				driver.findElementByClassName("decorativeSubmit").click();
				driver.findElementByLinkText("CRM/SFA").click();
				driver.findElementByLinkText("Leads").click();
				driver.findElementByLinkText("Create Lead").click();
				driver.findElementById("createLeadForm_companyName").sendKeys("TCS");
				try {
					driver.findElementByCssSelector("input#createLeadForm_firstName").sendKeys("Gopi");
			} catch (NoSuchElementException e) {
					System.out.println("The element not found");
				}
				Thread.sleep(2000);
				
				driver.findElementByCssSelector("#createLeadForm_lastName").sendKeys("J");
				driver.findElementByCssSelector("input#createLeadForm_firstNameLocal").sendKeys("Gopi");
				driver.findElementByXPath("//input[@id='createLeadForm_lastNameLocal']").sendKeys("Jayakumar");
				driver.findElementByXPath("//input[@name='personalTitle']").sendKeys("Mr.");
				WebElement src = driver.findElementById("createLeadForm_dataSourceId");
				Select dd = new Select(src);
				dd.selectByVisibleText("Website");

				driver.findElementByXPath("//input[@name='generalProfTitle']").sendKeys("Mr.");
				driver.findElementByXPath("//input[@name='annualRevenue']").sendKeys("1000");
				WebElement element = driver.findElementById("createLeadForm_industryEnumId");
				Select dd1 = new Select(element);
				dd1.selectByVisibleText("Insurance");

				WebElement ele = driver.findElementByName("ownershipEnumId");
				Select dd2 = new Select(ele);
				dd2.selectByVisibleText("Sole Proprietorship");

	
				driver.findElementByXPath("//input[@name='sicCode']").sendKeys("1010");
				driver.findElementByXPath("//textarea[@name='description']").sendKeys("It is a Software Development company");
				driver.findElementByCssSelector("textarea#createLeadForm_importantNote").sendKeys("It's a trusted company");
				driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneCountryCode']").sendKeys("0088");
				driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneAreaCode']").sendKeys("682");
				driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneNumber']").sendKeys("2084048");;
				driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneExtension']").sendKeys("101");
				driver.findElementByXPath("//input[@id='createLeadForm_departmentName']").sendKeys("QA");

				WebElement ele1 = driver.findElementById("createLeadForm_currencyUomId");
				Select dd3 = new Select(ele1);
				dd3.selectByVisibleText("BDT - Bangladesh Taka");

		
				driver.findElementByXPath("//input[@id='createLeadForm_numberEmployees']").sendKeys("1000");
				driver.findElementByXPath("//input[@name='tickerSymbol']").sendKeys("Tk");
				driver.findElementByXPath("//input[@name='primaryPhoneAskForName']").sendKeys("Gopi");
	
				driver.findElementByXPath("//input[@name='primaryWebUrl']").sendKeys("www.google.com");
				driver.findElementByXPath("//input[@name='generalToName']").sendKeys("Gnath");
				driver.findElementByXPath("//input[@name='generalAddress1']").sendKeys("8821 Saddlehorn Dr");
				driver.findElementByXPath("//input[@name='generalAddress2']").sendKeys("APT 252");
			
				driver.findElementByXPath("//input[@id='createLeadForm_generalCity']").sendKeys("DAL");
				WebElement element3 = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
				Select dd4 = new Select(element3);
				dd4.selectByVisibleText("Texas");
				WebElement element4 = driver.findElementById("createLeadForm_generalCountryGeoId");
				Select dd5 = new Select(element4);
				dd5.selectByVisibleText("Bangladesh");
				driver.findElementByXPath("//input[@id='createLeadForm_generalPostalCode']").sendKeys("75061");
				driver.findElementByXPath("//input[@id='createLeadForm_generalPostalCodeExt']").sendKeys("111");
				WebElement element5 = driver.findElementById("createLeadForm_marketingCampaignId");
				Select dd6 = new Select(element5);
				dd6.selectByVisibleText("Car and Driver");

				driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("682-207-3636");
				driver.findElementById("createLeadForm_primaryEmail").sendKeys("mrc_77@gmail.com");
				driver.findElementByXPath("//input[@name='submitButton']").click();

				String firstName = driver.findElementById("viewLead_firstName_sp").getText();
				System.out.println(firstName);
				
				System.out.println("Element not found");

				if (firstName.equals("Gopi")) {
					System.out.println("Name is Matched");
				} else {
					System.out.println("Not Match");
				}
				driver.close();
			}
		}














