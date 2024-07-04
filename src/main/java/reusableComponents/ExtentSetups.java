package reusableComponents;

import java.util.Date;
import java.text.SimpleDateFormat;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import testBase.ObjectsRepo;

public class ExtentSetups extends ObjectsRepo{
		
	public static ExtentReports setupExtendReport() {
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyy HH-mm-ss");
		
		Date date =new Date(); 
		//System.out.println(date);
		String actualDate =format.format(date);
		//System.out.println(actualDate);
		String reportPath =  System.getProperty("user.dir")+"/Reports/ExecutionReport_"+actualDate+".html";
		ExtentSparkReporter sparkReport = new ExtentSparkReporter(reportPath);
		extent = new ExtentReports();
		extent.attachReporter(sparkReport);
		
		
		sparkReport.config().setDocumentTitle("DocumentTitle");
		sparkReport.config().setTheme(Theme.DARK);
		
		return extent;
	}
}
