package longbeach;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Beach {

	public static void main(String[] args) throws IOException {
		
	System.setProperty("webdriver.chrome.driver","c:./driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.yahoo.com");	
		TakeScreeeShort.getScreeShot(driver, "Homepage");
		
		
	}

}
