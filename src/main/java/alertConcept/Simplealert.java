package alertConcept;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Simplealert {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\16308\\drivers\\chromedriver.exe");
	//Create object of ChromeDriver Class
	ChromeDriver driver = new ChromeDriver();
	//Load URL
	driver.get("https://ksrtc.in/oprs-web/ticket/waitlist.do");
	System.out.println("webside open");
	//Maximize window
	driver.manage().window().maximize();
	//Implicitly wait
	driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
	//Click Submit 
	driver.findElement(By.id("searchBtn")).click();
	Alert alert = driver.switchTo().alert();
	driver.switchTo().alert().accept();
	driver.close();
	System.out.println("operation successfull");
	}
}

	

     





















