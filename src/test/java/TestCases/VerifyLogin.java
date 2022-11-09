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
	public void login() throws IOException, InterruptedException {
		

		loginPageObjects LPO = new loginPageObjects(driver);
		LPO.enterUsername().sendKeys(Constant.username);

		LPO.enterPssword().sendKeys(Constant.password);

		LPO.clickOnLogin().click();
		
		//System.out.println(Constant.expectedString);
		//System.out.println(LPO.errorMsg().getText());
		//System.exit(0);
		
		Thread.sleep(5000);
		CommonUtilities.handleAssertions(LPO.errorMsg().getText(), Constant.expectedString);
		
	}

}
