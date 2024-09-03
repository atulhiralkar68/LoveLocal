package Utility_Method;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
//import org.testng.annotations.BeforeClass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener{

    //public ExtentHtmlReporter htmlReporter;
     

//    // @BeforeClass
   

    public ExtentSparkReporter sparkReport ; //UI of the Report 
    private ExtentReports extent=  new ExtentReports();//Populate common info on report
    private ExtentTest test;  // Creating test cases entries in the report and update status of the test methods
    
    // public void setup() {
    //     // Initialize ExtentReports
    //     ExtentSparkReporter htmlReporter = new ExtentSparkReporter("extentReport.html");
    //     extent = new ExtentReports();
    //     extent.attachReporter(htmlReporter);
    // }

    public void onStart(ITestResult context ){

        sparkReport = new ExtentSparkReporter(System.getProperty("user.dir")+"report/myReport.html");
        
       // sparkReport = new ExtentSparkReporter("extentReport.html");

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
        System.out.println("On start Executed");
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
        System.out.println("Report generated successfuly");

    }
    
}
