package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.UtilityMethods;

/**
 *
 * @author Atul
 */

public class LoginPage extends UtilityMethods {

   //UtilityMethods util = new UtilityMethods();
    //    public static WebDriver driver;
    //private WebDriver driver;

    public LoginPage(WebDriver driver){
        UtilityMethods.driver = driver;
        PageFactory.initElements(driver, this);
    }

    //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
    @FindBy(xpath="//span[text()='Account']")
    WebElement account;
    public void clickOnAccount() throws InterruptedException
    {
        // WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Account']")));
        //driver.navigate().refresh();
        // wait.until(ExpectedConditions.elementToBeClickable(account));
        //WebElement ele=wait.until(ExpectedConditions.visibilityOf(account));
        Thread.sleep(3000);
        account.click();
    }

     @FindBy(xpath= "//button[text()=\"LOG IN\"]")
    WebElement logInButton;
    public void clickOnLoginButton()
    {
        logInButton.click();
    }

    @FindBy(xpath="//input[@placeholder=\"Enter mobile number\"]")
    WebElement enterMobileNumber;

    public void enterMobileNumber(String key) throws Throwable
    {
        String mobileNumber= UtilityMethods.getValueProperty(key);
        System.out.println("User Mobile Number is "+mobileNumber);
        enterMobileNumber.sendKeys(mobileNumber);
    }

    @FindBy(xpath="//button[text() = \"Next\"]")
    WebElement nextButton;

    public void clickOnNextBUtton()
    {
        nextButton.click();
    }

    @FindBy(xpath="//input[@placeholder=\"Enter OTP\"]")
    WebElement enterOtp;

    public void enterOtp(String key) throws Throwable
    {
        String otp = UtilityMethods.getValueProperty(key);
        enterOtp.sendKeys(otp);
    }

    @FindBy(xpath="//span[@class=\"text-truncate\"]")
    WebElement closeAccountPopUp;
    public void closeAccountPopUp () throws InterruptedException
    {
        Thread.sleep(10000);
        closeAccountPopUp.click();
        
    }
   
}
