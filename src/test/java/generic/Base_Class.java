package generic;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;


/**
 *
 * @author Atul
 * 
 */

public class Base_Class implements FrameworkConstant {

public static WebDriver driver;

@Parameters("browser")
@BeforeClass (alwaysRun=true)

public void openApplication (@Optional("chrome") String browserName) throws Throwable {

    
    if (browserName.equalsIgnoreCase("chrome")){

         // Create ChromeOptions object
        ChromeOptions options = new ChromeOptions();
           // Disable notifications
        options.addArguments("--disable-notifications");

       // WebDriverManager.chromedriver.setup(); 
       driver =  new ChromeDriver(options);
       Reporter.log("Chrome Driver launch Susccessfully",true);

    }else if (browserName.equalsIgnoreCase("firefox")) {
         // Create a new Firefox profile
        FirefoxProfile profile = new FirefoxProfile();
        
        // Disable notifications
        profile.setPreference("permissions.default.desktop-notification", 1);

        // Assign the profile to FirefoxOptions
        FirefoxOptions options = new FirefoxOptions();
        options.setProfile(profile);

        driver = new FirefoxDriver(options);   

        Reporter.log("FireFox driver launch successfully");  

    }else {
        Reporter.log("Enter Valid BrowserName",true);
    }

    driver.manage().window().maximize();
    Reporter.log("Browser window is maximized succefully");
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    PropertyFileReader fileReader = new PropertyFileReader();
     String URL = fileReader.getValueProperty("URL");
     driver.get(URL);
}

@AfterClass(alwaysRun=true)
 public void closeAPp () throws InterruptedException{

    Thread.sleep(5000);
    driver.quit();
 }

}
