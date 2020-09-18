package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyUrlChanged {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        WebElement emailInput=driver.findElement(By.name("email"));
        emailInput.sendKeys("email@gmail.com");


        WebElement retrieveButton= driver.findElement(By.id("form_submit"));
        retrieveButton.click();

        String actualURL=driver.getCurrentUrl();
        String expectedURL="http://practice.cybertekschool.com/email_sent";

        if(actualURL.equals(expectedURL)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

        driver.quit();
    }




}
