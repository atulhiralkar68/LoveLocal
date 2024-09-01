/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package generic;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


/**
 *
 * @author Atul
 */
public class UtilityMethods  {

    public static WebDriver driver;

   
    public static String getValueProperty(String key) throws Throwable {

        FileInputStream file = new FileInputStream(FrameworkConstant.PROPERTIES_PATH);
        Properties properties = new Properties();
        properties.load(file);
        String value = properties.getProperty(key);
        return value;
    }

    public void getTitle()
    {
        String title = driver.getTitle();
        System.out.println(title);
    }

    public void getUrl()
    {
        String CurrentUrl = driver.getCurrentUrl();
        System.out.println(CurrentUrl);
    }        

    public void clickAction(WebElement element_To_Click)
    {
            element_To_Click.click();
    }

    public void enterValue(WebElement TextField, String value)
    {
        TextField.sendKeys(value);
    } 

    public Select select_classObject(WebElement dropDown)
    {
        Select select = new Select (dropDown);
        return select;
    }

    public Actions actions_classObject(WebDriver driver)
    {
        Actions action = new Actions(driver);
        return action;
    }

    public void switchToASpecificTitledWindow (String title)
    {
        String parentWindowId = driver.getWindowHandle();

        Set<String> allWindowIds = driver.getWindowHandles();
        allWindowIds.remove(parentWindowId);

        for(String windowId:allWindowIds)
        {
            driver.switchTo().window(windowId);
            if(driver.getTitle().equalsIgnoreCase(title)){
                break;
            }
        }  

    }

    public void switchToSpecificWindow(WebElement element)
    {
        String parentWindowId = driver.getWindowHandle();

        Set<String> allWindowIds = driver.getWindowHandles();
        allWindowIds.remove(parentWindowId);

        for(String SessionId : allWindowIds)
        {
            driver.switchTo().window(SessionId);
            if(element.isDisplayed())
            {
                break;
            }
        }
    }

}
