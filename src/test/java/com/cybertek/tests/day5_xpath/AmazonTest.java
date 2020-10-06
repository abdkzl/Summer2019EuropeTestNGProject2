package com.cybertek.tests.day5_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonTest {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("CHROME");
        driver.manage().window().maximize();
        driver.get("https://amazon.com");
        WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Selenium");
        WebElement searchButton= driver.findElement(By.xpath("//input[@value='Go']"));
        searchButton.click();

        String resultMessage=driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']/span[(contains(.,'for'))]")).getText();
        System.out.println("resultMessage = " + resultMessage);
        driver.quit();

    }
}
