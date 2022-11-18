package AUI_AdvanceUserInteraction;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class MouseHoveron_moveToElement {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\16308\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://mrbool.com/");
		//Create object of Actions class and pass the driver'
		Actions action = new Actions(driver);
		//select Content element and store it in a variable
		WebElement content = driver.findElementByXPath("//a[@class='menulink']");
		//perform moveToElement (Mouse Hover On) action, pass the element and use perform() method
		action.moveToElement(content).perform();
		//click the Articles element
		driver.findElementByXPath("(//a[text()='Courses'])[2]").click();
		System.out.println("Successful Automation done");
		//wait 3 seconds
		Thread.sleep(3000);
		driver.close();	}}
