package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.CommonTestBase;

public class HomePageObjects extends CommonTestBase {

	
	
	
	@FindBy(id="nav_automobile")
	WebElement link_automobile;
	
	@FindBy(id="nav_truck")
	WebElement nav_truck;
	
	@FindBy(id="nav_motorcycle")
	WebElement nav_motorcycle;
	
	@FindBy(id="nav_camper")
	WebElement nav_camper;
	
	
	public HomePageObjects() {
		PageFactory.initElements(driver, this);
	}

	public void clickOnMotorCycleLink () {
		nav_motorcycle.click();
	}
}
