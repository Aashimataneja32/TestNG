package TestCases;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.loginPageObjects;
import PageObjectModel.signUpPageObjects;
import Resources.baseClass;

public class verifySignup extends baseClass {
	
	@Test
	 public void signup() throws IOException, InterruptedException {
		 
		 intializeDriver();
		 driver.get("https://login.salesforce.com/");
		 
		 loginPageObjects LPO = new loginPageObjects(driver);
		  
	     LPO.tryForFree().click();
	     
	     signUpPageObjects  SPO=new signUpPageObjects (driver);
	     
	     Thread.sleep(5000);
	     SPO.enterFirstname().sendKeys("ram");
	     SPO.enterLastname().sendKeys("test");
	     SPO.enterjobTitle().sendKeys("ram");
	     SPO.enterUserEmail().sendKeys("test@gmail.com");
	     SPO.enterUserPhone().sendKeys("1234567890");
	     Thread.sleep(5000);
			
			  WebElement emp = SPO.selectEmpolyee();
			  
			  Select semp = new Select(emp); semp.selectByIndex(1);
			 
	     
	     SPO.enterCompanyName().sendKeys("Technogeeks");
	     WebElement country = SPO.selectCompanyCountry();
	     
			
			  Thread.sleep(5000); Select scountry = new Select(country);
			  scountry.selectByIndex(1);
			 
	     
	     SPO.checkAgree().click();
	 }

}
