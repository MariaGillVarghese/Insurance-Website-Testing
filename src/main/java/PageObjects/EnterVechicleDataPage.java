package PageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import testBase.CommonTestBase;

public class EnterVechicleDataPage extends CommonTestBase{
	//WebDriver driver = new ChromeDriver();
	
	
	@FindBy(id="make")
	WebElement dropdown_make;
	
	@FindBy(id="model")
	WebElement dropdown_model;
	
	@FindBy(xpath="//input[@id='engineperformance']")
	WebElement engine_performanace;
			
	@FindBy(id="dateofmanufacture")
	WebElement date_manufacture;
	
	@FindBy(id="numberofseatsmotorcycle")
	WebElement number_seats;
	
	@FindBy(id="fuel")
	WebElement fuel_fill;
			
	@FindBy(id="listprice")
	WebElement list_price;
	
	@FindBy(id="nextenterinsurantdata")
	WebElement next_button;
	
	@FindBy(id="cylindercapacity")
	public WebElement cylindercapacity;
	
	@FindBy(id="annualmileage")
	public WebElement annual_mileage;
	
	
	
	@FindBy(xpath = "//input[@id=\"cylindercapacity\"]/following-sibling::span[@class='error']")
	public WebElement error_cylindermsg;
	
	//constructer to use init method

	public EnterVechicleDataPage() {
		PageFactory.initElements(driver, this);
	}    
	
	public void enterCylinderCapacity() {
		cylindercapacity.sendKeys("66666");
		
	}
	public String getErrorMsgCylinderCapacity() {
		
	 return	error_cylindermsg.getText();
	 
	}
	 public List<String> getDropDownOptions() {
		return cm.getDropDown(dropdown_model);
	 }
	 
	 public void enterVechicleData() {
		 cm.selectDropDownOption(dropdown_make,"BMW");
		 cm.selectDropDownOption(dropdown_model, "Scooter");
		 cylindercapacity.sendKeys("1234");
		 engine_performanace.sendKeys("55");
		 date_manufacture.sendKeys("12/5/2012");
		 cm.selectDropDownOption(number_seats, "3");
		 list_price.sendKeys("5000");
		 annual_mileage.sendKeys("300");
		 
	 }
	 public void clickOnNextButton() {
		 next_button.click();
	 }
	
}
