package testBase;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import PageObjects.EnterInsurantData;
import PageObjects.EnterProductData;
import PageObjects.EnterVechicleDataPage;
import PageObjects.HomePageObjects;
import reusableComponents.CommonMethods;

public class ObjectsRepo {
	
	public static WebDriver driver ;
	public static HomePageObjects homepage ;
	public static EnterVechicleDataPage vechicledatapage ;
	public static ExtentReports extent ;
	public static ExtentTest test;
	public static CommonMethods cm= new CommonMethods();
	public static EnterInsurantData insData;
	public static EnterProductData proData;
	public static EnterVechicleDataPage vechData;
	
}
