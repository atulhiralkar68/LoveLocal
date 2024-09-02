/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package pom_scripts;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import generic.UtilityMethods;

/**
 *
 * @author Hp
 */
@Test
public class ShopFront extends UtilityMethods {

    private WebDriver driver;
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    public ShopFront(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="searchProduct") 
    private WebElement clickInSearch;

    public void clickAndSearchProductName(String key) throws Throwable
    {
        String productName = UtilityMethods.getValueProperty(key);
        clickInSearch.sendKeys(productName);
        System.out.println("Product name entered");
        clickInSearch.sendKeys(Keys.ENTER);
        System.out.println("Click on Enter");
    }
}
