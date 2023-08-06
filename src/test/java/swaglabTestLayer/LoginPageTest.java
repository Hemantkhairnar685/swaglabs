package swaglabTestLayer;

import java.io.IOException;

import org.testng.annotations.Test;

import SwagLab.Utillities.UtilClass;
import swagLabsTestBase.TestBase;
import swaglabPageLayer.InventoryPage;
import swaglabPageLayer.LoginPage;
import swaglabPageLayer.productPage;

public class LoginPageTest extends TestBase {
  @Test
  
		public void VerifyLoginfunctionality() throws IOException
		{
	//		String expected_output = "https://www.saucedemo.com/inventory.html";
			LoginPage obj = new LoginPage( driver);
	//		UtilClass obj2 = new UtilClass();
			obj.enterUserName("problem_user");
			obj.enterPassword("secret_sauce");
			obj.clickLogin_btn();
//			String actual_output = obj2.getWebPageUrl();
	//		Assert.assertEquals(actual_output, expected_output);
			UtilClass obj1 = new UtilClass();
            obj1.test1(driver);
            productPage obj3 = new productPage(driver);
            obj3.click();
           InventoryPage obj4 = new InventoryPage(driver);
          obj4.click_back_toproducts();
            		
			
			
	
}
}
