package testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjectModels.CentersPage;
import tests.BaseClass;

public class TC004_GetServiceCenters extends BaseClass
{
	@Test(priority=3,groups={"regression"})
	public void getServiceCenters() throws InterruptedException, IOException
	{
		
		CentersPage cp = new CentersPage(driver);
		cp.clickOurCenters();
		cp.getCenters();
		
		
		
		
	}

}
