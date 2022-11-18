package wrapper;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ProjectSpecificWrapper_CrmDvr {
public ChromeDriver driver;
@BeforeMethod
public void login() {
System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://leaftaps.com/opentaps");
driver.findElementById("username").sendKeys("DemoSalesManager");
driver.findElementById("password").sendKeys("crmsfa");
driver.findElementByClassName("decorativeSubmit").click();
driver.findElementByXPath("//a[contains(text(),'CRM/SFA')]").click();

}
@AfterMethod
public void logout() {
driver.close();	
}
}

