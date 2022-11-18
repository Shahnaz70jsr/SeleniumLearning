package AUI_AdvanceUserInteraction;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class KeyDown {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\16308\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/selectable");
		Thread.sleep(3000);
		//switch to frame
		WebElement Item1 = driver.findElementByXPath("//li[text()='Item 1']");
		WebElement Item2 = driver.findElementByXPath("//li[text()='Item 2']");
		WebElement Item3 = driver.findElementByXPath("//li[text()='Item 3']");
		WebElement Item4 = driver.findElementByXPath("//li[text()='Item 4']");
		WebElement Item5 = driver.findElementByXPath("//li[text()='Item 5']");
		WebElement Item6 = driver.findElementByXPath("//li[text()='Item 6']");
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		Thread.sleep(3000);	
		//action.keyDown(Keys.CONTROL).click(Item1).click(Item3).click(Item5).release().perform();
		action.keyDown(Keys.CONTROL).click(Item1).click(Item2).click(Item3).click(Item4).click(Item5).click(Item6).release().perform();
		driver.switchTo().frame(0);
		driver.close();}}
	
	


