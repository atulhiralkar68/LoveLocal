package Utility_Method;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener{

    public ExtentSparkReporter sparkReport ; //UI of the Report 
    public ExtentReports extent; //Populate common info on report 
    public ExtentTest test; // Creating test cases entries in the report and update status of the test methods
    
    public void onStart(ITestResult context ){
        sparkReport = new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/myReport.html");

        sparkReport.config().setDocumentTitle("Automation Report"); // Title of report
        sparkReport.config().setReportName("Funcatinal Testing"); //Name of report
        sparkReport.config().setTheme(Theme.DARK);

        extent=  new ExtentReports();
        extent.attachReporter(sparkReport);

        extent.setSystemInfo("computer name ", "Localhost");
        extent.setSystemInfo("Environment", "QA");
        extent.setSystemInfo("Tester Name", "Atul");
        extent.setSystemInfo("OS", "Wondows10");
        extent.setSystemInfo("Browser Name ", "Chrome");
    }

    public void onTestSuccess(ITestResult result){
        test = extent.createTest(result.getName());// Create new entry in report
        test.log(Status.FAIL, "Test case FAILED is "+ result.getName()); //Update status p/f/s  
        test.log(Status.FAIL, "Test case FAILED cause is" + result.getThrowable());
    }

    public void onTestSkipped (ITestResult result){
        test = extent.createTest(result.getName());
        test.log(Status.SKIP, "Test case SKIPPED is :" + result.getName()); 
    }

    public void onFinish(ITestContext context){
        extent.flush();

    }
    
}
