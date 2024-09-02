/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package test_scripts;

import org.testng.annotations.Test;

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
        homePage.clearCartContinue();
        //homePage.ClickOnSeeAll_discoverShopsNearYou();
        homePage.clickOnSeeAll_ShopByCategory();
        shopsPage.clickOnShop();
        shopFront.clickAndSearchProductName("PRODUCTNAME");
}
    
}
