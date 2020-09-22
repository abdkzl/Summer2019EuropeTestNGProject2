package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class nameLocatorTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/sign_up");



        WebElement FullNameBox= driver.findElement(By.name("full_name"));
        FullNameBox.sendKeys("Mike Smith");

        WebElement EmailInputBox=driver.findElement(By.name("email"));
        EmailInputBox.sendKeys("email@gmail.com");

        WebElement SignUpButton=driver.findElement(By.name("wooden_spoon"));
        SignUpButton.click();

        String actualSignUpMessage= driver.findElement(By.name("signup_message")).getText();
        String expectedSignUpMessage= "Thank you for signing up. Click the button below to return to the home page.";

        if(actualSignUpMessage.equals(expectedSignUpMessage)){
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("expectedSignUpMessage = " + expectedSignUpMessage);
            System.out.println("actualSignUpMessage = " + actualSignUpMessage);

        }

        driver.quit();


    }
}
