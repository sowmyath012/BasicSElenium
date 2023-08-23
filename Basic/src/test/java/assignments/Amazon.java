package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class Amazon {

	public void m4() {
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.amazon.in/");

			/*driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
			driver.findElement(By.name("email")).sendKeys("sowmyat14@gmail.com");
			driver.findElement(By.className("a-button-input")).click();
			driver.findElement(By.cssSelector("[id='ap_password']")).sendKeys("set111");
			driver.findElement(By.cssSelector("input[class='a-button-input']")).click();
			driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("iphone14",Keys.ENTER);*/
			

			//driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("iphone14");
			/*driver.findElement(By.id("nav-search-submit-button")).click();
			driver.manage().window().fullscreen();
			
			//to fetch the name of the item
			  WebElement data=driver.findElement(By.xpath("//span[text()='Apple iPhone 14 (128 GB) - Midnight']"));
			String name=  data.getText();
			System.out.println(name);
			//to fetch the cost of the item
			WebElement data1=driver.findElement(By.xpath("//span[@data-a-size='xl']"));
			String a=data1.getText();
			System.out.println(a);*/
			
			//BY USING KEYS CLASS
			driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
			driver.findElement(By.name("email")).sendKeys("sowmyat14@gmail.com",Keys.TAB);
			driver.findElement(By.className("a-button-input")).click();
			driver.findElement(By.cssSelector("[id='ap_password']")).sendKeys("set111");
			driver.findElement(By.cssSelector("input[class='a-button-input']")).click();
			driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("iphone14",Keys.ENTER);
			


	}

}
