package swagLabsTestBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;

public class TestBase {
	public static WebDriver driver;

	
	
	@BeforeMethod
	//public void setup()
//	{
		
	
	// driver = new EdgeDriver();
//	 driver = new ChromeDriver();
//	driver.get("https://www.saucedemo.com/");
//	driver.manage().window().maximize();
//	driver.manage().deleteAllCookies();
	
	
	public void testbase() throws InterruptedException {
		  driver = new EdgeDriver();
		  Reporter.log("opening saucedemo", true);
		  driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
  		driver.manage().deleteAllCookies();
	//	  Thread.sleep(7000);
	//	  driver.close();
	  }
	
	
	}

	


