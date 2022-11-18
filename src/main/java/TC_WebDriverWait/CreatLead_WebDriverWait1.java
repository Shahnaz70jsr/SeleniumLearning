package TC_WebDriverWait;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class CreatLead_WebDriverWait1 {
			public static void main(String[] args) throws InterruptedException  {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\16308\\drivers\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.getTitle();
			System.out.println(driver.getTitle());
			driver.manage().window().maximize();
			//Implicitly Wait		
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			try {
			driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");
			System.out.println("UserName enter successfully");
			}catch(Exception e) {
			System.err.println("UserName not enter successfully");
			}
			driver.findElementByXPath("//input[@name='PASSWORD']").sendKeys("crmsfa");
			driver.findElementByXPath("//input[@value='Login']").click();
			//Explicitly wait
			Thread.sleep(2000);
			driver.findElementByLinkText("CRM/SFA").click();
			driver.getTitle();
			System.out.println(driver.getTitle());
			driver.findElementByLinkText("Create Lead").click();
			driver.findElementById("createLeadForm_companyName").sendKeys("TCS");
			driver.findElementById("createLeadForm_firstName").sendKeys("Hema");
			driver.findElementById("createLeadForm_lastName").sendKeys("Mali");
			driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Mrs");
			driver.findElementById("createLeadForm_description").sendKeys("It's a Software company");		
			driver.findElementById("createLeadForm_departmentName").sendKeys("mkt");
			driver.findElementByName("submitButton").click();
			WebDriverWait wait = new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.elementToBeClickable(By.name("submitButton")));
			driver.close();

			}

		}











