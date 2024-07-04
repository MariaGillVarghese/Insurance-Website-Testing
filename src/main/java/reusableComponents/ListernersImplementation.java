package reusableComponents;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

import testBase.ObjectsRepo;

public class ListernersImplementation extends ObjectsRepo  implements ITestListener{
	

	@Override
	public void onTestStart(ITestResult result) {
		test=extent.createTest(result.getMethod().getMethodName());
	}
	

	@Override
	public void onTestSuccess(ITestResult result) {
		
		test.log(Status.PASS, "TestCase : "+result.getMethod().getMethodName()+"is Passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, "TestCase : "+result.getMethod().getMethodName()+"is FAiled");
		test.log(Status.FAIL, result.getThrowable());
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyy HH-mm-ss");
		
		Date date =new Date(); 
		//System.out.println(date);
		String actualDate =format.format(date);
		String screenshotPath =  System.getProperty("user.dir")+"/Reports/Screenshots/"+actualDate+".jpeg";
		File destination= new File(screenshotPath);
		try {
			FileUtils.copyFile(src, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		test.addScreenCaptureFromPath(screenshotPath, "Test case failure");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	
	}

	@Override
	public void onStart(ITestContext context) {
		//setup method  call
		extent =ExtentSetups.setupExtendReport();
	}

	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
	}
 
}
