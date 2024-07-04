package PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.CommonTestBase;

public class EnterInsurantData extends CommonTestBase{
	
//WebDriver driver = new ChromeDriver();
	
	
	@FindBy(id="firstname")
	WebElement first_name;
	
	@FindBy(id="lastname")
	WebElement last_name;
	
	@FindBy(id="birthdate")
	WebElement birth_date;
	
	@FindBy(xpath="//input[@name='Gender']/parent::label")
	List<WebElement> gender_radiobttn;
	
	@FindBy(id="country")
	WebElement country;
	
	@FindBy(id="zipcode")
	WebElement zip_code;
	
	@FindBy(id="occupation")
	WebElement occupation;
	
	@FindBy(xpath="//input[@name='Hobbies']/parent::label ")
	List<WebElement> hobbies;
	
	@FindBy(id="nextenterproductdata")
	WebElement next_bttn;
	
	
	
	public EnterInsurantData() {
		PageFactory.initElements(driver, this);
	}	
	public void enterInsurantData() throws InterruptedException
	{
		first_name.sendKeys("samuel");
		last_name.sendKeys("Joseph");
		birth_date.sendKeys("10/10/1996");
		cm.selectRadioButton(gender_radiobttn, "male");
		cm.selectDropDownOption(country, "India");
		zip_code.sendKeys("56328");
		cm.selectDropDownOption(occupation, "Employee");
		Thread.sleep(3000);
	
		cm.selectCheckBoxes(hobbies,"bungeejumping" );
		
	}
	public void clickOnNextButton() {
		next_bttn.click();
	 }
	
}
