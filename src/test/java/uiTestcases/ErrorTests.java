package uiTestcases;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import testBase.CommonTestBase;

public class ErrorTests extends CommonTestBase{
	private static final int String = 0;
	private static final int List = 0;
	@Test
	public void errorMeassage_Payeload() throws IOException, InterruptedException {
		//open browser and navigate--- done in before method
		//need to click on motorcycle in homepage
		homepage.clickOnMotorCycleLink();
		//enter data in cylinder capacity
		Thread.sleep(3000);
		vechicledatapage.enterCylinderCapacity();
		test.log(Status.PASS, "Cylinder capacity is filled with data: 3333");
		String actualErrorMeasage=vechicledatapage.getErrorMsgCylinderCapacity();
		String expectedErrorMessage="Must be a number between 1 and 2000";
		Assert.assertEquals(actualErrorMeasage, expectedErrorMessage,"Error msg is not same");
	}
	@Test
	public void errorMeassage_Payeload1() throws IOException, InterruptedException {
		//open browser and navigate--- done in before method
		//need to click on motorcycle in homepage
		homepage.clickOnMotorCycleLink();
		//enter data in cylinder capacity
		
		vechicledatapage.enterCylinderCapacity();
		test.log(Status.PASS, "Cylinder capacity is filled with data: 3333");
		String actualErrorMeasage=vechicledatapage.getErrorMsgCylinderCapacity();
		String expectedErrorMessage="dummy";
		Assert.assertEquals(actualErrorMeasage, expectedErrorMessage,"Error msg is not same");
	}
	@Test
	public void verifyDropDown() {
		homepage.clickOnMotorCycleLink();
		
		
		//get dropdown content
		List<String> actualValues= vechicledatapage.getDropDownOptions();
		test.log(Status.INFO, "Actual dropdown values are :" +actualValues)	;
		List<String> expectedValues = Arrays.asList( "– please select –","Scooter","Three-Wheeler","Moped","Motorcycle");
		test.log(Status.INFO, "Expected dropdown values are :" +expectedValues)	;
		Assert.assertEquals(actualValues, expectedValues, "Error in dropdown values");
		
	}
}
