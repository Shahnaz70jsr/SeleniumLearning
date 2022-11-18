package xpath;
import org.openqa.selenium.chrome.ChromeDriver;
public class AbsoluteXpath {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Absolute xpath start from root node and ends with desired descent element’s node
		// It is the direct way to find the element, It, contains the complete path from the Root Element to the desire element. But the disadvantage of the Absolute Xpath is that if there are any changes made in the path of the element then that Xpath gets failed that means code will not work.
		// Start with top HTML node and ends with input node
		// Start with single slash
		// Absolute Xpath:-/html/body/div[2]/div[2]/div/form/p[1]/input--username
		System.setProperty("webdriver.chrome.driver","C:\\Users\\16308\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("http://leaftaps.com/opentaps/control/main");
		driver.findElementByXPath("/html/body/div[2]/div[2]/div/form/p[1]/input").sendKeys("DemoSalesManager");
		driver.findElementByXPath("/html/body/div[2]/div[2]/div/form/p[2]/input").sendKeys("crmsfa");
		driver.findElementByXPath("//*[@id=\"login\"]/p[3]/input").click();
		System.out.println("Successful Automation done by AbsoluteXpath");
		driver.close();
		
		}
	
	
	}


