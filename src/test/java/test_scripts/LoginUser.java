
package test_scripts;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import generic.Base_Class;
import pom_scripts.HomePage;
import pom_scripts.LoginPage;


/**
 *
 * @author Atul
 */

@Test
public class LoginUser extends Base_Class{
    //WebDriver driver = new ChromeDriver();
     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    public void login () throws InterruptedException, IOException, Throwable
    {
       // WebDriver driver = new ChromeDriver();
//LoginPage loginPage = new LoginPage(driver);

        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        
        homePage.clickOn_useCurrentLocationButton();
        loginPage.clickOnAccount();
        loginPage.clickOnLoginButton();
        loginPage.enterMobileNumber("MOBILE_NUMBER");
        loginPage.clickOnNextBUtton();
        loginPage.enterOtp("OTP");
        //Thread.sleep(100000);
        loginPage.clickOnNextBUtton();
        loginPage.closeAccountPopUp();
        homePage.selectLocation();
        homePage.clickInSearchBoxAndEnterLocation("LOCATION");
        homePage.choseAddress();
        homePage.clearCartContinue();

         System.out.println("Owhoo..! Test Pass");
    }

}
