package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjectModels.HomePage;
import pageObjectModels.ServicePage;
import tests.BaseClass;

public class TC001_CaptureServices extends BaseClass
{
	
	@Test(priority=0,groups={"regression","functional"})
	public void captureServices() throws IOException
	{
		
		HomePage hm = new HomePage(driver);
		hm.selectServiceType();
		hm.selectSubCategory();
		hm.clickGoBtn();
		
		ServicePage sp =new ServicePage(driver);
		
		sp.getServices();
		
		
	}
}
	
	