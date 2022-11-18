package CSSSelector;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","C:\\Users\\16308\\drivers\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	//driver.manage().timeouts().implicitlyWait(30, SECONDS);
	driver.navigate().to("http://leaftaps.com/opentaps/control/main");
	System.out.println("window Handle= "+driver.getWindowHandle());
	System.out.println("Page Title= "+driver.getTitle());
	System.out.println("Title Length= "+driver.getTitle().length());
	driver.getTitle().contains("Leaf");
	System.out.println("contains Leaf= "+driver.getTitle().contains("Leaf"));
	System.out.println("Page Title in Upper Case= "+driver.getTitle().toUpperCase());
	System.out.println("Page Title in Lower Case= "+driver.getTitle().toLowerCase());
	
	
	}

}
