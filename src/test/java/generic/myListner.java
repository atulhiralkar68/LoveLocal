package generic;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class myListner implements  ITestListener {

    public void onTestStart(ITestResult result) {
      System.out.println("On Test start");
    // not implemented
  }

  public void onTestSuccess(ITestResult result) {
    System.out.println("on Test Success");
    // not implemented
  }

  public void onTestFailure(ITestResult result) {
    System.out.println("on Test Failure");
    // not implemented
  }

  public void onTestSkipped(ITestResult result) {
    System.out.println("on Test Skipped");
    // not implemented
  }

  public void onFinish(ITestContext context) {
    System.out.println("on Finish");
    // not implemented
  }

  public void onStart(ITestContext context) {
    System.out.println("on Start");
    // not implemented
  }


}
