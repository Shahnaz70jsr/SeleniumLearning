package collections;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
public class WindowGHandles_Set2 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub				
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.w3schools.com/jsref/met_win_open.asp");
	String Window1 = driver.getWindowHandle();
	System.out.println("1st window  = "  + Window1);			
	driver.findElementByLinkText("Try it Yourself »").click();
	Set<String> allwindow = driver.getWindowHandles();
	System.out.println(allwindow);
	Thread.sleep(3000);
	for (String eachWindow : allwindow) {
	System.out.println(eachWindow);
	}
	driver.close();
	}										
}						
					
		