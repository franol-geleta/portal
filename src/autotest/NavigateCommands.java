/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autotest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
/**
 *
 * @author franol
 */
public class NavigateCommands {
  public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver", "C:\\Gecko\\geckodriver.exe");
// Create a new instance of the FireFox driver
WebDriver driver = new FirefoxDriver();
// Open ToolsQA web site
String appUrl = "http://www.DemoQA.com";
driver.get(appUrl);
// Click on Registration link
driver.findElement(By.xpath(".//*[@id='menu-item-374']/a")).click();
// Go back to Home Page
driver.navigate().back();
// Go forward to Registration page
driver.navigate().forward();
// Go back to Home page
driver.navigate().to(appUrl);
// Refresh browser
driver.navigate().refresh();
// Close browser
driver.close();
}  
}
