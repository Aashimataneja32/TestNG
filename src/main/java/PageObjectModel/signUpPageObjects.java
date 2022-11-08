package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signUpPageObjects {

	WebDriver driver;

	public By firstname = By.xpath("//input[@name='UserFirstName']");
	private By lastname = By.xpath("//input[@name='UserLastName']");
	private By jobTitle = By.xpath("//input[@name='UserTitle']");
	private By UserEmail = By.xpath("//input[@name='UserEmail']");
	private By UserPhone = By.xpath("//input[@name='UserPhone']");
	private By employees = By.xpath("//select[@name='CompanyEmployees']");
	private By company = By.xpath("//input[@name='CompanyName']");
	private By country = By.xpath("//select[@name='CompanyCountry']");
	//div[@class='checkbox-ui'][1]
	private By agree = By.xpath("(//div[@class='checkbox-ui'])[1]");

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
