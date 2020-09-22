package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TagNameTest {

    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement fullNameBox=driver.findElement(By.tagName("input"));
        fullNameBox.sendKeys("Mike Smith");

        WebElement emailBox=driver.findElement(By.name("email"));
        emailBox.sendKeys("email@gmail.com");

        WebElement SignUpButton=driver.findElement(By.tagName("button"));
        SignUpButton.click();

        WebElement messageElement=driver.findElement(By.tagName("h3"));
        String actualSignUpMessage=messageElement.getText();
        String expectedSignUpMessage="Than you for signing up. Click the button below to return to the home page.";

        if(actualSignUpMessage.equals(expectedSignUpMessage)) {
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("expectedSignUpMessage = " + expectedSignUpMessage);
            System.out.println("actualSignUpMessage = " + actualSignUpMessage);
        }


        driver.quit();
    }
}
