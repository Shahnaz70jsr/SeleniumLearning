package xpath;
import org.openqa.selenium.chrome.ChromeDriver;
public class AttributeBaseXpath {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Syntext; tagname[@attribute= 'value']
	//(website: http://leaftaps.com/opentaps/control/main[element=username] )
	System.setProperty("webdriver.chrome.driver","C:\\Users\\16308\\drivers\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.navigate().to("http://leaftaps.com/opentaps/control/main");
	driver.findElementByXPath("(//input[@class='inputLogin'])[1]").sendKeys("DemoSalesManager");
	//driver.findElementByXPath("//input[@id='username'] ").sendKeys("DemoSalesManager");
	driver.findElementByXPath("//input[@id='password'] ").sendKeys("crmsfa");
	driver.findElementByXPath("//input[@class='decorativeSubmit'] ").click();
	System.out.println("Successful Automation done by AttributeBaseXpath");
	driver.close();
	
	}
}
