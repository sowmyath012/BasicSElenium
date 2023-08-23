package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class Flipkart {

	public  void m1()  {

		 WebDriver driver=new ChromeDriver();  
		   driver.get("https://www.flipkart.com/");
		   driver.findElement(By.xpath("//button[text()='✕']")).click();
		 WebElement  value=driver.findElement(By.xpath("//input[@type='text']"));
		 value.sendKeys("iphone14");
		 value.submit();
		//WebElement data= driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]"));
		//data.getText();
		 //driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
		 //driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
		// WebElement task= driver.findElement(By.xpath("//div[.='APPLE iPhone 14 (Midnight, 128 GB)']"));
		 //task.click();
		 //driver.findElement(By.xpath("//div[.='APPLE iPhone 14 (Midnight, 128 GB)']")).click();
		//WebElement store=driver.findElement(By.xpath("//div[text()='APPLE iPhone 14 (Midnight, 128 GB)']"));
		//store.click();\
		 //Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 (Green, 128 GB)']")).click();
	}

}
