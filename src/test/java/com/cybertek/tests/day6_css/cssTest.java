package com.cybertek.tests.day6_css;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cssTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        WebElement dontClickButton= driver.findElement(By.cssSelector("#disappearing_button"));
        String MESSAGE=dontClickButton.getText();
        System.out.println("MESSAGE = " + MESSAGE);
        driver.findElement(By.cssSelector("ul a")).click();
        driver.navigate().back();
        Thread.sleep(3000);

        driver.findElement(By.cssSelector("button[id='disappearing_button']")).click();
        String result=driver.findElement(By.id("result")).getText();
        System.out.println("result = " + result);
        driver.quit();


    }



}
