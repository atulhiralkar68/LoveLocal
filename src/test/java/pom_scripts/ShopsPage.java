/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package pom_scripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import generic.UtilityMethods;

/**
 *
 * @author Hp
 */
public class ShopsPage extends UtilityMethods{
    private WebDriver driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    public ShopsPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//h4[@title=\"Atul Hiralkar Fruits And Vegetables Supermarket\"]")
    WebElement clickOnShop;

    @FindBy(xpath = "//h4[@class='r__store_title']")
    WebElement FirstShop;

    public void clickOnShop()
    {
        try{
        wait.until(ExpectedConditions.visibilityOf(clickOnShop));
        clickOnShop.click();
        }catch(NullPointerException e){
            System.out.println("Atul Shop is not available selecting some other shop");
            FirstShop.click();
            
        }
    }

}
