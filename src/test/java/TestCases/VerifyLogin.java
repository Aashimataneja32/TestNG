package TestCases;



import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.loginPageObjects;
import Resources.CommonUtilities;
import Resources.Constant;
import Resources.baseClass;


public class VerifyLogin extends baseClass {

	@Test
	public void login() throws IOException {
		

		loginPageObjects LPO = new loginPageObjects(driver);
		LPO.enterUsername().sendKeys(Constant.username);

		LPO.enterPssword().sendKeys(Constant.password);

		LPO.clickOnLogin().click();
		
		
		CommonUtilities.handleAssertions(LPO.errorMsg().getText(), Constant.expectedString);
		
	}

}
