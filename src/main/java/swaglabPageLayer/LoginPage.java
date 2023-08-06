package swaglabPageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	

		public LoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		@FindBy( xpath="//input[@id='user-name']")
		private WebElement user_name_txtbox;
		
		@FindBy(xpath="//input[@id='password']")
		private WebElement password_txtbox;

		@FindBy(xpath = "//input[@name='login-button']")
		private WebElement login_btn;
		
		public void enterUserName(String username)
		{
			user_name_txtbox.sendKeys(username);
		}
		public void enterPassword(String password)
		{
			password_txtbox.sendKeys(password);
		}
		public void clickLogin_btn()
		{
			login_btn.click();
		}
	
	}


