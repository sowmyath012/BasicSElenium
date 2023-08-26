package allocate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Block {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		   driver.findElement(By.xpath("//button[text()='✕']")).click();
		   WebElement data = driver.findElement(By.name("q"));
		   data.sendKeys("iphone13");
		   data.submit();
		   WebElement data1 = driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Pink, 128 GB)']"+"/ancestor::div[@class='_3pLy-c row']"+"/descendant::div[text()='₹64,999']"));
         String value = data1.getText();
         System.out.println(value);
         //1st push
         //2nd push
		 
	}

}
