package PageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.CommonTestBase;

public class EnterProductData extends CommonTestBase {




	@FindBy(id="startdate")
	WebElement start_date;

	@FindBy(id="insurancesum")
	WebElement insurance_sum;

	@FindBy(id="meritrating")
	WebElement merit_rating;

	@FindBy(id="damageinsurance")
	WebElement damage_insurance;

	@FindBy(xpath="//input[@name='Optional Products[]']/parent::label ")
	List<WebElement> optional_products;

	@FindBy(id="courtesycar")
	WebElement courtesy_car;

	@FindBy(id="nextselectpriceoption")
	WebElement next_bttn;

	public EnterProductData() {
		PageFactory.initElements(driver, this);
	}

	public void enterProductData() throws InterruptedException {
		start_date.sendKeys("10/10/2024");
		cm.selectDropDownOption(insurance_sum, " 3.000.000,00");
		cm.selectDropDownOption(damage_insurance, "No Coverage");
		cm.selectRadioButton(optional_products, "Euro Protection");

	}
	public void clickOnNextButton() {
		next_bttn.click();
	}
}
