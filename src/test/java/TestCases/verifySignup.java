package TestCases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import PageObjectModel.loginPageObjects;
import PageObjectModel.signUpPageObjects;
import Resources.CommonUtilities;
import Resources.Constant;
import Resources.baseClass;

public class verifySignup extends baseClass {
	
	@Test
	 public void signup() throws IOException, InterruptedException {
		 
		
		 
		 loginPageObjects LPO = new loginPageObjects(driver);
		  
	     LPO.tryForFree().click();
	     
	     signUpPageObjects  SPO=new signUpPageObjects (driver);
	     
	     Thread.sleep(5000);
	    // CommonUtilities.handlExplictWaithroughBy(10,SPO.firstname );
	     
	     SPO.enterFirstname().sendKeys(Constant.Firstname);
	     SPO.enterLastname().sendKeys(Constant.Lastname);
	     SPO.enterjobTitle().sendKeys(Constant.jobTitle);
	     SPO.enterUserEmail().sendKeys(Constant.UserEmail);
	     SPO.enterUserPhone().sendKeys(Constant.UserPhone);
	     Thread.sleep(5000);
			
	   //  CommonUtilities.handlExplictWait(10,SPO.selectEmpolyee());	  
	     
		CommonUtilities.handleStaticDropdown(SPO.selectEmpolyee(), 1);
			 
	     
	    SPO.enterCompanyName().sendKeys(Constant.CompanyName);
	     
	   
	    CommonUtilities.handleStaticDropdown(SPO.selectCompanyCountry(), 3);
			 
	     
	     SPO.checkAgree().click();
	 }

}
