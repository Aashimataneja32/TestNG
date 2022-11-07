package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjectModel.loginPageObjects;
import Resources.baseClass;

public class VerifyLogin extends baseClass {

	@Test
	public void login() throws IOException {
		intializeDriver(); // called base class method
		driver.get("https://login.salesforce.com/"); // This driver have scope

		loginPageObjects LPO = new loginPageObjects(driver);
		LPO.enterUsername().sendKeys("test");

		LPO.enterPssword().sendKeys("test123");

		LPO.clickOnLogin().click();
		
	}

}
