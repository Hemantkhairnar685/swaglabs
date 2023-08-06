package swaglabTestLayer;

import java.io.IOException;

import org.testng.annotations.Test;

import SwagLab.Utillities.UtilClass;
import swagLabsTestBase.TestBase;
import swaglabPageLayer.InventoryPage;
import swaglabPageLayer.LoginPage;
import swaglabPageLayer.productPage;

public class InventoryPageTest extends TestBase{
  @Test
  public void verifyinventoryPage() throws IOException, InterruptedException 
  {

		
				LoginPage obj = new LoginPage( driver);
		
				obj.enterUserName("problem_user");
				obj.enterPassword("secret_sauce");
				obj.clickLogin_btn();
			
	
				UtilClass obj1 = new UtilClass();
	            obj1.test1(driver);
	            Thread.sleep(2000);
	            productPage obj3 = new productPage(driver);
	            obj3.click();
	            Thread.sleep(4000);
	            InventoryPage obj4 = new InventoryPage(driver);
	            obj4.click_back_toproducts();
	            obj1.test1(driver);
	            Thread.sleep(2000);
	            obj3.click2();
	            obj4.clicktoadd_tocartshirt();
	  
  }
}
