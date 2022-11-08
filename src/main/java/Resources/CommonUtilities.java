package Resources;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class CommonUtilities {
	
	public static WebDriver driver;
	
	// This method is for handling static dropdown
	public static void handleStaticDropdown(WebElement e,int index) {
		
		WebElement emp = e;
		Select semp = new Select(emp); 
		semp.selectByIndex(index);
	}
	
	// This method is for handle the assertions
	public static void handleAssertions(String ActualString,String expectedString  ) {
		SoftAssert sa = new SoftAssert();
		String ActualString1 = ActualString;
		String expectedString1 = expectedString;
		sa.assertEquals(ActualString1, expectedString1);
		sa.assertAll();
	}

	
	//To handle Explicit : webElement (This is used when we pass the webElement(driver.findElement(By.xpath())(usevisibilityOf))
	public static void handlExplictWait(int duration, WebElement element ) {
		  
	     WebDriverWait wb=new WebDriverWait(driver,Duration.ofSeconds(duration));
	     wb.until(ExpectedConditions.visibilityOf(element));
	 
	    }
	
	//To handle Explicit : By (This is used when we pass the By only xpath(By.xpath)(usevisibilityOf))
		public static void handlExplictWaithroughBy(int duration, By element ) {
			  
		     WebDriverWait wb=new WebDriverWait(driver,Duration.ofSeconds(duration));
		     wb.until(ExpectedConditions.visibilityOfElementLocated(element));
		 
		    }
}
