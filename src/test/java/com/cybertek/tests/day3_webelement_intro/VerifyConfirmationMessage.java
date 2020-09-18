package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyConfirmationMessage {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        WebElement emailInputBox=driver.findElement(By.name("email"));
        String expectedEmail="email@gmail.com";
        emailInputBox.sendKeys(expectedEmail);
        String actualEmail=emailInputBox.getAttribute("value");
        if(actualEmail.equals(expectedEmail)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

        WebElement retrieveButton=driver.findElement(By.id("form_submit"));
        retrieveButton.click();

        String expectedConfirmationMessage="Your e-mail's been sent!";
        WebElement messageElement=driver.findElement(By.name("confirmation_message"));
        String actualMessage=messageElement.getText();

        if(expectedConfirmationMessage.equals(actualMessage)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

        driver.quit();
    }



}
