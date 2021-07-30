package longbeach;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class TakeScreeeShort {
	public static void getScreeShot(WebDriver driver,String picturename) throws IOException {
		File folder = new File("./target/Screen short");
		if (!folder.exists()) {
			folder.mkdir();
				
		}
		TakesScreenshot ts= (TakesScreenshot)driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		Files.copy(file, new File("./target/Screen short"+ picturename+".png"));
		
	}

}
