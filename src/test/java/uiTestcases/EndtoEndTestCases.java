package uiTestcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import testBase.CommonTestBase;

public class EndtoEndTestCases extends CommonTestBase{
	
	
	
	
	@Test
	public void insuranceCalculater() throws IOException, InterruptedException {
		
		homepage.clickOnMotorCycleLink();
		vechData.enterVechicleData();
		vechData.clickOnNextButton();
		insData.enterInsurantData();
		insData.clickOnNextButton();
		proData.enterProductData();
		proData.clickOnNextButton();
		vechData.enterVechicleData();
	}
	
	
	}


