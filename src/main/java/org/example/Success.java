package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Success {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://saucelabs.com/request-demo");
        String url=driver.getCurrentUrl();
        System.out.println("String url là : "+url);
        WebElement email=driver.findElement(By.id("Email"));
        email.sendKeys("duyen.pham1@ntq-solution.com.vn");
        // WebElement firstName=driver.findElement(By.id("FirstName"));
        // firstName.sendKeys("Tinh");
        // WebElement lastName=driver.findElement(By.id("LastName"));
        // lastName.sendKeys("Tran");
        WebElement password=driver.findElement(By.id("Company"));
        password.sendKeys("Company01");
        WebElement phoneNumber=driver.findElement(By.id("Phone"));
        phoneNumber.sendKeys("0392047878");
        //WebElement dropdown = driver.findElement(By.id("Country"));
        // Select select = new Select(dropdown);
        //select.selectByVisibleText("Angola");

        WebElement dropdown1 = driver.findElement(By.id("Solution_Interest__c"));
        Select select1 = new Select(dropdown1);
        select1.selectByVisibleText("Sauce AI Agents");
        WebElement comment=driver.findElement(By.id("Sales_Contact_Comments__c"));
        comment.sendKeys("Tình tester");
        WebElement checkbox = driver.findElement(By.id("LblmktoCheckbox_47709_0"));

        if (!checkbox.isSelected()) {
            checkbox.click();
        }
        WebElement loginBtn = driver.findElement(By.className("mktoButton"));
        loginBtn.click();


    }
}
