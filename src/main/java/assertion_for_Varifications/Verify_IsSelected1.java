package assertion_for_Varifications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Verify_IsSelected1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\16308\\drivers\\chromedriver.exe");	
		
		WebDriver driver = new ChromeDriver();
	
		//maximize the window
		driver.manage().window().maximize();
		//Load url	

				driver.get("https://secure.bankofamerica.com/login/sign-in/signOnV2Screen.go");

				//get title of the page
						//System.out.println(driver.getTitle());
						String title = driver.getTitle();
						System.out.println(title);

	
		//isSelected();-to do this validation we can use only-RadioButton,a CheckBox & Drop-down (true/false)
				//1st click on the "Save this online Id CheckBox"(select) then verify isSelected() otherwise else part will be work
				driver.findElement(By.xpath("//div[@class='remember-info']/input ")).click();
				boolean SaveThisOnlineIdCheckbox = driver.findElement(By.xpath("//div[@class='remember-info']/input ")).isSelected();
				System.out.println(SaveThisOnlineIdCheckbox);

				//Assertion
				Assert.assertTrue(SaveThisOnlineIdCheckbox, "SaveThisOnlineId CheckBox is selected");

				//Validation
				if(SaveThisOnlineIdCheckbox==true) {
					System.out.println("The checkbox is Selected");
				}else {
					System.out.println("The checkbox is not Selected");
				}

				//driver.quit();
			}

		

	
	
	
	}

