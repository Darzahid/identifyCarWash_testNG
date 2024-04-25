package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjectModels.RegistrationPage;
import pageObjectModels.ServicePage;
import tests.BaseClass;


public class TC002_GetErrorMsg extends BaseClass
{
	@Test(priority=1,groups={"regression","functional"})
	public void getErrorMessage() throws InterruptedException, IOException
	{
		
		ServicePage sp =new ServicePage(driver);

		try {
			sp.clickRegister();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		RegistrationPage rp = new RegistrationPage(driver);
		
		try {
			rp.registrationDetails();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		Thread.sleep(3000);
		String eMsg=rp.getErrorMsg();
		Assert.assertEquals(eMsg, "Please enter a valid Email Address.");
		
		
		
		
	}

}
