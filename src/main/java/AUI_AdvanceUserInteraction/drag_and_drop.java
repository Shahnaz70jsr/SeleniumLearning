package AUI_AdvanceUserInteraction;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class drag_and_drop {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\16308\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com");
		driver.findElementByXPath("//a[text()='Droppable']").click();
		driver.switchTo().frame(driver.findElementByXPath("//iframe[@class='demo-frame']"));		
		WebElement src = driver.findElementByXPath("//div[@id='draggable']");
		WebElement dest = driver.findElementByXPath("//div[@id='droppable']");
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.dragAndDrop(src, dest).build().perform();
		System.out.println("Successful Automation done");
		//wait 3 seconds
		Thread.sleep(3000);
		driver.close();	}}

