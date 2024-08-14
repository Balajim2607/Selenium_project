package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class imac_product_page extends BasePage{

	public imac_product_page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath =  "//button[@id='button-cart']")  
	WebElement addtocartbtn ;
	@FindBy(xpath =  "//div[@class='alert alert-success alert-dismissible']")  
	WebElement successmg ;
	
	
	
	
	public void addtocartbtn() {
		addtocartbtn.click();
	}
	
	public String successmsg() {
		 return successmg.getText();
	}
}
