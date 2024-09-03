/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package pom_scripts;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import generic.UtilityMethods;

/**
 *
 * @author Atul
 * 
 */

public class HomePage extends UtilityMethods {
     
    private WebDriver driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    // Initialize Page Factory
    public HomePage(WebDriver driver) 
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
   @FindBy(xpath="//span[text()=\"USE CURRENT LOCATION\"]")
    private WebElement useCurrentLocation;

    public void clickOn_useCurrentLocationButton() throws InterruptedException
    {
        wait.until(ExpectedConditions.elementToBeClickable(useCurrentLocation));
       // Thread.sleep(3000);
        useCurrentLocation.click();
    }

    @FindBy(xpath="//div[@class=\"py-0 pl-1 col-lg-auto col-auto\"]")
    private WebElement selectLocation;
    public void selectLocation()
    {
        selectLocation.click();
    }

    @FindBy(xpath="//input[@placeholder=\"Search Area or Apartment name\"]")
    private WebElement searchBox;

    public void clickInSearchBoxAndEnterLocation(String location) throws Throwable
    {
        String locationInput = UtilityMethods.getValueProperty(location);
        searchBox.sendKeys(locationInput);
    }

    @FindBy(xpath="//span[text()=\"Colombo\"]")
    private WebElement choseAddress;
    public void choseAddress() throws InterruptedException
    {
        Thread.sleep(3000);
        choseAddress.click();
    }

    // @FindBy(xpath="//button[text()='Continue']")
    // private WebElement clearCartContinueButtton;

    // @FindBy(xpath="//h3[text()='Clear Cart']")
    // private WebElement clearCartPopUp;
    
    public void clearCartContinue() throws InterruptedException
    {           
        try {
                WebElement clearCart = driver .findElement(By.xpath("//h3[text()='Clear Cart']"));
                WebElement tElement = wait.until(ExpectedConditions.visibilityOf(clearCart));
                // Perform actions on the element once it is visible
                if(tElement.isDisplayed())
                {
                    WebElement element = driver.findElement(By.xpath("//button[text()='Continue']"));
                    element.click();
                    //Thread.sleep(3000);
                    System.out.println("Cart cleared Location updated");
                }
                    
            } catch (NoSuchElementException e) 
            {
                // Handle the case when the element is not displayed within the specified time
                System.out.println("No Items present in Cart Location Updated");
            }
    }

    @FindBy(xpath="//h3[text()='Discover Shops near You']")
    private WebElement discoverShopsNearYou;

    @FindBy(xpath="//button[text()='See All']")
    private WebElement seeAll_discoverShopsNearYou ;

    public void clickOnSeeAll_discoverShopsNearYou()
    {
        seeAll_discoverShopsNearYou.click();
    }

    @FindBy(linkText="See All")
    private WebElement seeAll_ShopByCategory;

    public void clickOnSeeAll_ShopByCategory() throws InterruptedException
    {
       // seeAll_ShopByCategory.click();
       // WebElement element = driver.findElement(By.linkText("See All"));
       Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", seeAll_ShopByCategory);
       //((JavascriptExecutor) driver).executeScript("arguments[0].click();", seeAll_ShopByCategory);
     wait.until(ExpectedConditions.elementToBeClickable(seeAll_ShopByCategory));
    //Thread.sleep(3000);
    seeAll_ShopByCategory.click();

    }

   
}
