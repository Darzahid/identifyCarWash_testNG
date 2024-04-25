package pageObjectModels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends BasePage{
	
	//Constructor
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	//Locators
	@FindBy(xpath="(//select[@name='brand'])[1]")
	WebElement serviceType;
	
	@FindBy(xpath="//input[@id='phn_name']//preceding-sibling::select")
	WebElement subCategory;
	
	@FindBy(xpath="//div[@class='service-search-button col-md-3 col-sm-6']")
	WebElement goBtn;
	

	
	//Actions
	public void selectServiceType() 
	{
		Select select = new Select(serviceType);
		select.selectByVisibleText("Car");
		
	}
	
	public void selectSubCategory()
	{	
		Select select1 = new Select(subCategory);
		select1.selectByVisibleText("SUV");
		
	}
	
	public void clickGoBtn()
	{
		goBtn.click();
	}
	
}
