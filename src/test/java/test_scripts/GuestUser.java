/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package test_scripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import generic.Base_Class;
import pom_scripts.HomePage;
import pom_scripts.LoginPage;
import pom_scripts.ShopFront;
import pom_scripts.ShopsPage;


/**
 *
 * @author Hp
 */
@Test
public class GuestUser extends Base_Class{
    
    @Test

public void guestUser() throws InterruptedException, Throwable
{
    HomePage homePage = new HomePage(driver);
    ShopsPage shopsPage=new ShopsPage(driver);
    ShopFront shopFront= new ShopFront(driver);

    // homePage.clickOn_useCurrentLocationButton();
    // homePage.selectLocation();
        homePage.clickInSearchBoxAndEnterLocation("LOCATION");
        homePage.choseAddress();
        //homePage.clearCartContinue();
        //homePage.ClickOnSeeAll_discoverShopsNearYou();
        homePage.clickOnSeeAll_ShopByCategory();
        shopsPage.clickOnShop();
        
        shopFront.clickAndSearchProductName("PRODUCTNAME");
        
         // Initialize SoftAssert
        SoftAssert softAssert = new SoftAssert();

        // Simulate fetching the page heading from a web page
        String actualPageTitle = driver.getTitle(); // Replace with your method to get the page heading
        System.out.println("Actual Page Title is : " + actualPageTitle);
        String expectedPageTitle = "Atul Hiralkar Fruits And Vegetables Supermarket, colombo-10, colombo, | Online Groceries near me | LoveLocal";

        // Perform soft assertion
        softAssert.assertEquals(actualPageTitle, expectedPageTitle, "Page heading does not match please check");
        softAssert.assertAll();
       }
    
}
