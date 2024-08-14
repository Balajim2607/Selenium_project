package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.Search_result_page;
import pageObjects.imac_product_page;
import testBase.BaseClass;

public class TC006_addtocart extends BaseClass{

	@Test
	public void addtocart() {
		
		HomePage hm = new HomePage(driver);
		hm.search("iMac");
		hm.searchbtn();
		
		Search_result_page sr= new Search_result_page(driver);
		sr.imacclick();
		
		imac_product_page im= new imac_product_page(driver);
		im.addtocartbtn();
		
		  String acut =im.successmsg();
		  String exp = "Success: You have added iMac to your shopping cart!";
		  System.out.println(acut);
		  
		  if(acut.contains(exp)) {
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}
		  }
	}

