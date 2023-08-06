package swaglabPageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage {
	
	public InventoryPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//button[@name='back-to-products']")
	private WebElement back_to_products;
	
    
	@FindBy(xpath="//button[@name='back-to-products']")
	private WebElement Add_to_cartshirt;
	
	
	public void click_back_toproducts()
	{
		back_to_products.click();
	}
	
	
	public void clicktoadd_tocartshirt()
	{
		Add_to_cartshirt.click();
	}
	
}
