package text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
@Test
public class Browser {

	public  void m3(){
		
		//Launching empty chromebrowser
   WebDriver driver=new ChromeDriver();
   
   
   
   /*	String key="webdriver.edge.driver";
	String value="C:\\Users\\Shobha\\Downloads\\edgedriver_win64 (6)\\msedgedriver.exe";
	System.setProperty(key, value);
	WebDriver driver=new EdgeDriver();*/
	
   
   /*This method is used for launching the application
   driver.get("https://www.facebook.com/");
   
   
  //This method is used to get the title of the webpage
   String data=driver.getTitle();
   System.out.println(data);
   
 //fetches current url of the application
   String data1=driver.getCurrentUrl();
   System.out.println(data1);
   
   //To get the code of the page
   String code=driver.getPageSource();
   System.out.println(code);
   
   driver.manage().window().maximize();
   Thread.sleep(5000);
   driver.manage().window().minimize();
  // Thread.sleep(5000);
   //driver.manage().window().fullscreen();
   
 //closes current focusing tab(one tab)
  //driver.close();
   
 //Closes all the tabs
   //driver.quit();*/
   
   driver.get("https://demo.actitime.com/login.do");
	driver.manage().window().maximize();
	/*
   //using id locator
	//driver.findElement(By.id("username")).sendKeys("admin");
	// using name locator
	//driver.findElement(By.name("username")).sendKeys("admin");
	using classname locator
	driver.findElement(By.className("textField")).sendKeys("admin");
	//using name locator
	driver.findElement(By.id("username")).sendKeys("admin");
	//using id locator
	//driver.findElement(By.id("loginButton")).click();
	//using classname
	driver.findElement(By.className("initial")).click();*/
	//xpath by attribute
	
	//driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
	//driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	//driver.findElement(By.xpath("//input[contains(@name,'us')]")).sendKeys("admin");
	//driver.findElement(By.xpath("//input[contains(@class,'p')]")).sendKeys("manager");
	
	
	/*driver.findElement(By.xpath("//*[.='Login ']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[contains(text(),'View')]")).click();*/
  
	}

}
