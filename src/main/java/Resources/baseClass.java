package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass {

	public WebDriver driver;
	Properties prop;

	public void intializeDriver() throws IOException {

		// To read the data
		//FileInputStream fis = new FileInputStream("C:\\Users\\Chandan\\eclipse-workspace\\SeleniumProject\\src\\main\\java\\Resources\\data.properties");
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");
		// access the data.properties file-
		 prop = new Properties();
		// loading the readed file
		prop.load(fis);

		String browserName = prop.getProperty("browser"); // key from data properties
		/*System.out.println(browserName);
		System.exit(0);*/

		if (browserName.equalsIgnoreCase("chrome")) {
			//System.setProperty("webdriver.chrome.driver","C:\\Users\\Chandan\\Desktop\\Chrome Driver\\chromedriver.exe");
			WebDriverManager.chromedriver().setup(); //To run with latest browser
		//   WebDriverManager.chromedriver().browserVersion("79.0.9").setup(); //To run with specific version
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {

			// firefox code

		} else if (browserName.equalsIgnoreCase("edge")) {

			// edge code

		} else {

			System.out.println("please enter proper browser value");

		}

	}
	
	
	@BeforeMethod
	public void launchURL() throws IOException {
		intializeDriver(); // called base class method
		String url = prop.getProperty("url"); // This driver have scope
		driver.get(url);
	}

}
