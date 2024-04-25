package pageObjectModels;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.ExcelUtils;

public class CentersPage extends BasePage
{
	Select select;
	
	
	
	
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
	JavascriptExecutor js = (JavascriptExecutor) driver;

	public CentersPage(WebDriver driver) 
	{
		super(driver);
		
	}
	
	//Locators
	@FindBy(xpath="(//a[text()=' Our Centers'])[2]")
	WebElement centers;
	
	@FindBy(xpath="//select[@id='typeeeee']")
	WebElement state;
	
	@FindBy(xpath="//select[@class='form-control CityId']")
	WebElement city;
	
	@FindBy(xpath="//button[normalize-space()='Search']")
	WebElement searchBtn;
	
	@FindBy(xpath="(//div[@id='sr2'])[1]//div//div[1]")
	List<WebElement>serviceCenters;
	
	//Action Methods
	
	public void clickOurCenters()
	{
		centers.click();
	}
	
	public void getCenters() throws InterruptedException
	{
		List<String>cityCenters=new ArrayList<String>();
		
		
		List<String>State=new ArrayList<String>();
		State.add("Jammu");
		State.add("Delhi");
		State.add("Goa");
		
		List<String> City = new ArrayList<String>();
		City.add("Udhampur");
		City.add("Rohini");
		City.add("Margoa");
		
		
		for(int i=0; i<3; i++) {
			
			Thread.sleep(2000);
			select = new Select(state);

			System.out.println(State.get(i));
			select.selectByVisibleText(State.get(i));
	    
	    if(city.isEnabled())
	    {
	    	Thread.sleep(2000);
	    	System.out.println(City.get(i));
	    	select = new Select(city);
			select.selectByVisibleText(City.get(i));
	    }else
	    {
	    	Thread.sleep(2000);
	    	js.executeScript("arguments[0].removeAttribute('disabled')", city);
		
		
		select = new Select(city);
		select.selectByVisibleText(City.get(i));
	    }
		
	    searchBtn.click();
	    js.executeScript("window.scrollBy(0,150)","");
		Thread.sleep(2000);

	
		for(WebElement j:serviceCenters )
		{
			String jservices=j.getText();
			
			cityCenters.add(jservices);
		}
		System.out.println(cityCenters);
		}

		
			try {
			ExcelUtils.writeExcelCenter(cityCenters);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	

}
		
	
	
	
	
	
	
	
	



