package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPageObjects {

	WebDriver driver; //This driver dont have scope
	
	 //driver.findElement(By.xpath("//hshsju")).sendKeys("test");

	private By username = By.xpath("//input[@id='username']");
	private By password = By.xpath("//input[@id='password']");
	private By logIn = By.xpath("//input[@id='Login']");
	private By errormsg = By.xpath("//div[@id='error']");
	
	private By tryForFree = By.xpath("//a[@id='signup_link']");
	
	public loginPageObjects(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver = driver2;
	}

	public WebElement enterUsername() {
		return driver.findElement(username);
	}

	public WebElement enterPssword() {
		return driver.findElement(password);
	}

	public WebElement clickOnLogin() {
		return driver.findElement(logIn);
	}
	
	public WebElement tryForFree() {
		return driver.findElement(tryForFree);
	}
	public WebElement errorMsg() {
		return driver.findElement(errormsg);
	}

}
