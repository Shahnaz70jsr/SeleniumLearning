package AUI_AdvanceUserInteraction;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class TAB_ENTER {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\16308\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");	
		driver.findElementByXPath("//input[@id='email']").sendKeys("abc@yahoo.com");
		Thread.sleep(4000);
		Actions action = new Actions (driver);
		action.sendKeys(Keys.TAB).sendKeys("abc@yahoo.com").perform();
		Thread.sleep(3000);
		action.sendKeys(Keys.ENTER).perform();
		driver.close();}}
