/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package pom_scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import generic.Base_Class;

/**
 *
 * @author Hp
 */
public class AllPageObjects extends Base_Class{
    public void test(){
    WebDriver driver = new ChromeDriver();
    driver.findElement(By.id("test")).sendKeys("bsv");
    driver.findElement(By.name("test")).sendKeys("testgh");
    WebElement element = driver.findElement(By.xpath("//h3[contains(text(),'Discover Shops near You')]"));
    
    Actions action = new Actions(driver);
    action.moveToElement(element).click().perform();
    
    }
}
