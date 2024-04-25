package pageObjectModels;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.ExcelUtils;

public class RegistrationPage extends BasePage
{
	//Constructor
	public RegistrationPage(WebDriver driver) 
	{
		super(driver);
	}
	
	//Locators
	
	
	@FindBy(xpath="//input[@id='signupname']")
	WebElement uname;
	
	@FindBy(xpath="//input[@id='signupemail']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='signuppass']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='signuppassconfirm']")
	WebElement cnfrPassword;
	
	@FindBy(xpath="//a[@class='button primary register-button']")
	WebElement signUp;
	
	@FindBy(xpath="//div[@class='alert alert-danger error-message']")
	WebElement errorMsg;
	
	@FindBy(xpath="//h2")
	WebElement title;
	
	
	
	
	
	public void registrationDetails() throws IOException
	{
		List<String>excelInputs=ExcelUtils.readExcel();
		uname.sendKeys(excelInputs.get(0));
		email.sendKeys(excelInputs.get(1));
		password.sendKeys(excelInputs.get(2));
		cnfrPassword.sendKeys(excelInputs.get(3));
		signUp.click();
		
	}
	
	public String getErrorMsg() throws IOException
	{   
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-150)","");
		String ErrorMsg =errorMsg.getText();
		System.out.println(ErrorMsg);
	    ExcelUtils.writeExcel1(ErrorMsg);
	    return ErrorMsg;
	    
 }
	
	
	
	
	
	
	

}
