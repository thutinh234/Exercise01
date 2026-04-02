package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Main {
    static void main(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://serenity-bdd.github.io/");
        driver.manage().window().maximize();
    }
    public static void main(String[] args) {
        main();
    }
}