package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Search_result_page extends BasePage {

	public Search_result_page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath =  "//h1[normalize-space()='Search - iMac']")  
	WebElement searchrs;
	
	public String searchrs() {
		return searchrs.getText();
	}
}
