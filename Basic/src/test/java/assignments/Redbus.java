package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Redbus {

	public static void main(String[] args) {
		
		ChromeOptions option=new ChromeOptions();
		/* disable the permission based popups
		option.addArguments("disable-notifications");
		WebDriver driver=new ChromeDriver(option);*/
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.redbus.in/");
		//driver.findElement(By.xpath("//input[@data-message='Please enter a source city']")).sendKeys("Hyderabad");
				

	}

}
