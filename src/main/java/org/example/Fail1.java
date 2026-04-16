package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Fail1 {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        WebElement userName = driver.findElement(By.id("user-name"));
        userName.sendKeys("anna");
        userName.clear();
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");
        WebElement loginBtn = driver.findElement(By.id("login-button"));
        loginBtn.click();
        WebElement errorMsg = driver.findElement(
                By.className("error-button")
        );

        String actualMsg = errorMsg.getText();
        System.out.println("Error message: " + actualMsg);

        String expectedMsg = "Epic sadface: Username is required";

        if (actualMsg.equals(expectedMsg)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
        driver.quit();
    }


}