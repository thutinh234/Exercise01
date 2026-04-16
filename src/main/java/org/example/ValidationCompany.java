package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ValidationCompany {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.get("https://saucelabs.com/request-demo");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement Email = driver.findElement(By.id("Email"));
        Email.sendKeys("tinh.tran@testcompany.vn");
        WebElement firstName = driver.findElement(By.name("FirstName"));
        firstName.sendKeys("Trần Thị");
        WebElement lastName = driver.findElement(By.xpath("//input[@id=\"LastName\"]"));
        lastName.sendKeys("Tình");

        WebElement phone= driver.findElement(By.xpath("//*[@id=\"Phone\"]"));
        phone.sendKeys("0965898789");
        WebElement country= driver.findElement(By.xpath("//*[@id=\"Country\"]"));
        country.click();
        WebElement elementVN= driver.findElement(By.xpath("//*[@id=\"Country\"]/option[194]"));
        elementVN.click();
        WebElement interest = driver.findElement(By.xpath("//select[@id=\"Solution_Interest__c\"]"));
        interest.click();
        WebElement optionInterest= driver.findElement(By.xpath("//*[@id=\"Solution_Interest__c\"]/option[2]"));
        optionInterest.click();
        WebElement elementComments= driver.findElement(By.xpath("//*[@id=\"Sales_Contact_Comments__c\"]"));
        elementComments.sendKeys("Điền thành công");
        WebElement checkbox= driver.findElement(By.xpath("//*[@id=\"LblmktoCheckbox_47709_0\"]"));
        checkbox.click();
        WebElement elementLetTalk= driver.findElement(By.xpath("//button[text()=\"Let's Talk\"]"));
        elementLetTalk.click();
        Thread.sleep(3000);

        // Kiểm tra message lỗi
        WebElement errorMessage = driver.findElement(
                By.xpath("//*[@id=\"ValidMsgCompany\"]")
        );

        if(errorMessage.isDisplayed()){
            System.out.println("Test Passed - Company validation works");
        }else{
            System.out.println("Test Failed");
        }

       // driver.quit();
    }
}
