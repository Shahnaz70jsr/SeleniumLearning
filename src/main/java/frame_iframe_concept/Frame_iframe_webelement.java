package frame_iframe_concept;

import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_iframe_webelement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Step1:How to find/check iframe or frame in a web page?
//way-1.Go to DOM and type Ctrl + F -> type iframe or //iframe
//way-2.Right click on the desire element and check it has ->-view Frame source,-Reload frame, 
//if you found these two, that means your desire elements inside the Frame.
// To enter( three ways) and exit from frame
   System.setProperty("webdriver.Chrome.driver","C:\\Users\\16308\\drivers\\chromedriver.exe");		
   ChromeDriver driver = new ChromeDriver();
   driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
		//
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//iframe[@id='iframeResult']");
		
		
		
		
		
		
	}

}
