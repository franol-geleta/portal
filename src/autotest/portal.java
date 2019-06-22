/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autotest;

import com.google.common.io.Files;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.io.Writer;
/**
 *
 * @author franol
 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Helen
 */
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class portal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException, IOException {
        
        System.setProperty("webdriver.gecko.driver", "C:\\Gecko\\geckodriver.exe");
        WebDriver driver;
        driver = new FirefoxDriver();

        driver.get("https://portal.aait.edu.et/");

        System.out.println("Successfully opened the website localhost");

        driver.findElement(By.id("UserName")).sendKeys("ATE/5351/09");
        driver.findElement(By.id("Password")).sendKeys("8446");
        driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/div[2]/div[2]/div[2]/form/div[4]/div/button")).click();
        driver.navigate().refresh();
        driver.findElement(By.xpath("//*[@id=\"ml2\"]")).click();
        // driver.findElement(By.id("m12")).click();

        String output = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]")).getText();
        // File DestFile= new File("Desktop/grade.doc");

        try {
            FileWriter aa = new FileWriter("grade.doc");
            aa.write(output);
            aa.close();
        }catch(IOException e){
            
            
        }
//        List<WebElement> unreademail = driver.findElements(By.className("zE"));
//        System.out.println("Total No. of Unread Mails: " + unreademail.size());
    }
}

//import java.io.IOException;
//
//import org.openqa.selenium.*;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//public class portal {
//
//    public static void main(String[] args) {
//
//        System.setProperty("webdriver.firefox.marionette", "C:\\geckodriver.exe");
//        String baseUrl = "http://demo.guru99.com/test/yahoo.html";
//        WebDriver driver = new FirefoxDriver();
//
//        driver.get(baseUrl);
//        WebElement downloadButton = driver.findElement(By
//                .id("messenger-download"));
//        String sourceLocation = downloadButton.getAttribute("href");
//        String wget_command = "cmd /c C:\\Wget\\wget.exe -P D: --no-check-certificate " + sourceLocation;
//
//        try {
//            Process exec = Runtime.getRuntime().exec(wget_command);
//            int exitVal = exec.waitFor();
//            System.out.println("Exit value: " + exitVal);
//        } catch (InterruptedException | IOException ex) {
//            System.out.println(ex.toString());
//        }
//        driver.close();
//    }
//
//}
