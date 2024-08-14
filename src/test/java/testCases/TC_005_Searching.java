package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;


import pageObjects.HomePage;
import pageObjects.Search_result_page;
import testBase.BaseClass;

public class TC_005_Searching extends BaseClass{

	
	@Test
	public void searchtest() {
		
		logger.info("Started_TC05");
		
		HomePage hm= new HomePage(driver);
		hm.search("iMac");
		hm.searchbtn();
		
		Search_result_page sr= new Search_result_page(driver);
		String results=sr.searchrs();
		
		if(results.contains("iMac")) {
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
}
