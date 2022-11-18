package frame_iframe_concept;
import org.openqa.selenium.chrome.ChromeDriver;
public class Frame_iframe_jquary {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\16308\\drivers\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.navigate().to("https://jqueryui.com/");
	Thread.sleep(2000);
	driver.findElementByXPath("//a[text()='Selectable']").click();
	driver.switchTo().frame(driver.findElementByXPath("//iframe[@class='demo-frame']"));
	driver.findElementByXPath("//ol[@id='selectable']/li[1]").click();	
	driver.findElementByXPath("//ol[@id='selectable']/li[2]").click();
	driver.findElementByXPath("//ol[@id='selectable']/li[3]").click();
	driver.findElementByXPath("//ol[@id='selectable']/li[4]").click();
	driver.findElementByXPath("//ol[@id='selectable']/li[5]").click();
	driver.findElementByXPath("//ol[@id='selectable']/li[6]").click();
	driver.findElementByXPath("//ol[@id='selectable']/li[7]").click();
	driver.switchTo().parentFrame();
	Thread.sleep(3000);
	driver.findElementByXPath("//a[text()='Demos']").click();
	}}

