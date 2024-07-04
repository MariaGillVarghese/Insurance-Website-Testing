package reusableComponents;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CommonMethods {
	
	public List<String> getDropDown(WebElement element)
	{
		Select os = new  Select(element);
		 
		 List<WebElement> list_webElement_model=os.getOptions();
		 List<String> actualContents =new ArrayList<String>();
		 for (WebElement ref : list_webElement_model) {
			 actualContents.add(ref.getText());
				
		}
		return actualContents;
	}
	
	public void selectDropDownOption(WebElement element, String valueToSelect) {
		Select os = new  Select(element);
		os.selectByVisibleText(valueToSelect);
		
	}
	
	public void selectRadioButton(List<WebElement> element, String valueToBeSelected) throws InterruptedException
	{
		Thread.sleep(3000);
		for (WebElement webElement : element) {
			Thread.sleep(3000);
			if(webElement.getText().equalsIgnoreCase(valueToBeSelected)) {
				webElement.click();
				break;
			}
			
 		}
	}
	public void selectCheckBoxes(List<WebElement> element, String checks)
	{
		String[] checksArray = checks.split(",");
		for (String str : checksArray) 
	{
		for (WebElement ele : element) 
		{
			String e=ele.getText();
			if(e.equalsIgnoreCase(str));
			{
				ele.click();
				break;
			}
		}	
		
			
	}
	
}	
}
