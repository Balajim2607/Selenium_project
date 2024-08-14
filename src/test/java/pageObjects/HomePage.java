package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
@FindBy(xpath="//span[normalize-space()='My Account']") 
WebElement lnkMyaccount;

@FindBy(xpath="//a[normalize-space()='Register']") 
WebElement lnkRegister;

@FindBy(linkText = "Login")   // Login link added in step5
WebElement linkLogin;

@FindBy(xpath =  "//input[@placeholder='Search']")  
WebElement search;



@FindBy(xpath =  "//button[@class='btn btn-default btn-lg']")  
WebElement searchbtn;

public void clickMyAccount()
{
	lnkMyaccount.click();
}

public void clickRegister()
{
	lnkRegister.click();
}


public void clickLogin()    // added in step5
{
	linkLogin.click();
}

public void search(String s) {
	search.sendKeys(s);
}


public void searchbtn()    // added in step5
{
	searchbtn.click();
}
}
