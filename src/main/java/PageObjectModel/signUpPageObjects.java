package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signUpPageObjects {

	WebDriver driver;

	By firstname = By.xpath("//input[@name='UserFirstName']");
	By lastname = By.xpath("//input[@name='UserLastName']");
	By jobTitle = By.xpath("//input[@name='UserTitle']");
	By UserEmail = By.xpath("//input[@name='UserEmail']");
	By UserPhone = By.xpath("//input[@name='UserPhone']");
	By employees = By.xpath("//select[@name='CompanyEmployees']");
	By company = By.xpath("//input[@name='CompanyName']");
	By country = By.xpath("//select[@name='CompanyCountry']");
	//div[@class='checkbox-ui'][1]
	By agree = By.xpath("//input[@id='SubscriptionAgreement']");

	public signUpPageObjects(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver = driver2;
	}

	public WebElement enterFirstname() {

		return driver.findElement(firstname);
	}

	public WebElement enterLastname() {

		return driver.findElement(lastname);
	}

	public WebElement enterjobTitle() {

		return driver.findElement(jobTitle);
	}

	public WebElement enterUserEmail() {

		return driver.findElement(UserEmail);
	}

	public WebElement enterUserPhone() {

		return driver.findElement(UserPhone);
	}

	public WebElement selectEmpolyee() {

		return driver.findElement(employees);
	}
	public WebElement enterCompanyName() {

		return driver.findElement(company);
	}
	public WebElement selectCompanyCountry() {

		return driver.findElement(country);
	}
	public WebElement checkAgree() {

		return driver.findElement(agree);
	}

}
