package testCases;

import org.testng.annotations.Test;

import pageObjectModels.NavigateClass;
import tests.BaseClass;

public class TC003_NavigateToHomePage extends BaseClass
{   
	
	@Test(priority=2,groups={"regression"})
	public void navigateHomePage() 
	{
		
		
	NavigateClass nc = new NavigateClass(driver);
	nc.navigateToSevicePage();
	nc.navigateToHomePage();
	
	
}
}
