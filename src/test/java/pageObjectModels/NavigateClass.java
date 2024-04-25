package pageObjectModels;

import org.openqa.selenium.WebDriver;

public class NavigateClass extends BasePage
{

	public NavigateClass(WebDriver driver) {
		super(driver);
		
	}
	//Action Methods
	public void navigateToSevicePage()
	{
		driver.navigate().back();
		
	}
	public void navigateToHomePage()
	{
		driver.navigate().back();
	}
	

}
