package AUI_AdvanceUserInteraction;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class RightClick {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\16308\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		Thread.sleep(3000);
		WebElement rightclick = driver.findElementByXPath("//a[text()='Create Context Menu (asynchronous)']");
		Actions action = new Actions(driver);
		Thread.sleep(3000);
		action.contextClick(rightclick).perform(); 
		driver.close();}}
