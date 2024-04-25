package pageObjectModels;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import utils.ExcelUtils;

public class ServicePage extends BasePage
{
	
	//Constructor
		public ServicePage(WebDriver driver) {
			super(driver);
		}
		
	//Locators
		@FindBy(xpath="//div[@class='caption']//b")
		List<WebElement>services;
		
		@FindBy(xpath="(//li[@class='login-register'])[4]")
		WebElement register;
		
		//Actions
		public void getServices()
		{
			List<String>ServicesList = new ArrayList<String>();
			for(WebElement s :services)
			{
				String service=s.getText();
				
				ServicesList.add(service);		
				
			}
			System.out.println(ServicesList);
			try {
				ExcelUtils.writeExcelServices(ServicesList);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		public void clickRegister() throws InterruptedException
		{
			Thread.sleep(3000);
			Actions act = new Actions(driver);
			act.moveToElement(register).click().perform();
			
		}

}
