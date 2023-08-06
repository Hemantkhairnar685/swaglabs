package swaglabPageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class productPage {
	
	public productPage(WebDriver driver)
	{
	  PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[@id='item_4_title_link']")
	private WebElement saucelabs;
	
	@FindBy(xpath="//a[@id='item_0_title_link']")
	private WebElement swab_labs_bike_light;
	
	
	public void click()
	{
		saucelabs.click();
	}
	
	public void click2()
	{
		swab_labs_bike_light.click();
	}
	
}