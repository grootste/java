package com.company;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");

        // chromedriver.exe
        System.setProperty("webdriver.chrome.driver", "D:\\ProgramData\\projects\\java\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://login.salesforce.com/");
        driver.findElement(By.id("username")).sendKeys("hello");
        driver.findElement(By.name("pw")).sendKeys("hello");
        // driver.findElement(By.className("button r4 wide primary")).click();
        driver.findElement(By.id("Login")).click();
        System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
    }
}
