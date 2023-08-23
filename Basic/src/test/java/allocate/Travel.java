package allocate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class Travel {
	public void site() {
		WebDriver driver=new ChromeDriver();
		  driver.get("https://www.redbus.in/");
	}

}
