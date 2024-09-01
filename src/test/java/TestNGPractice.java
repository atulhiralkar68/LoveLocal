/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;


/**
 *
 * @author Hp
 */


public class TestNGPractice {
    public static WebDriver driver;

    @Test
    public void sample(){
        ChromeOptions options = new ChromeOptions();
           // Disable notifications
        options.addArguments("--disable-notifications");

       // WebDriverManager.chromedriver.setup(); 
       driver =  new ChromeDriver();
       Reporter.log("Chrome Driver launch Susccessfully",true);
    driver.manage().window().maximize();
    Reporter.log("Browser window is maximized succefully");
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    driver.get("https://b2c-frontend-release.lovelocal.in/");

    }
}
