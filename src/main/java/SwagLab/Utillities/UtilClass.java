package SwagLab.Utillities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import swagLabsTestBase.TestBase;

public class UtilClass extends TestBase{
	  String filename;
	public UtilClass()
	{
	  PageFactory.initElements(driver, this);	
	  
	}
	public  void test1( WebDriver driver) throws IOException
	{
	    
	//C:\Users\LENOVO\Desktop\ScreenshotC:\Users\LENOVO\Desktop\Screenshot
		
//		String path ="C:\\Users\\LENOVO\\Desktop\\Screenshot.png";
		TakesScreenshot ts = ((TakesScreenshot)driver);
		File source = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\LENOVO\\Desktop\\Screenshot\\swaglabs.png");
		FileHandler.copy(source, des);
		System.out.println("screenshot");
		
	
		
	}

}
