package testBase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.module.Browser;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;

import PageObjects.EnterInsurantData;
import PageObjects.EnterProductData;
import PageObjects.EnterVechicleDataPage;
import PageObjects.HomePageObjects;
import io.github.bonigarcia.wdm.WebDriverManager;
import reusableComponents.PropertiesOperations;

public class CommonTestBase extends ObjectsRepo {
	
	
	
	public void LaunchBrowserAndNavigate() throws IOException {
		
		//reading property file to get the browswer and url
		String browser= PropertiesOperations.getPropertyByValue("browser");
		String url= PropertiesOperations.getPropertyByValue("url");
		
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
		} 
		
		else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.chromedriver().setup();
			 driver = new FirefoxDriver();
			
			 
			
		}
		
		driver.manage().window().maximize();
		driver.navigate().to("https://sampleapp.tricentis.com/101/");
	}
		
		 
		 @BeforeTest
			public void setupMethod() throws IOException {
				LaunchBrowserAndNavigate();
				homepage =new HomePageObjects();
				vechicledatapage = new EnterVechicleDataPage();
				insData =new EnterInsurantData();
				proData = new EnterProductData();
				vechData= new EnterVechicleDataPage();
				//extent = new ExtentReports();
			}
		 
		 
		// @AfterMethod
			//public void close() {
				//driver.quit();
	//}

}
