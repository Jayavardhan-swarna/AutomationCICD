package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws InterruptedException, MalformedURLException {

        ChromeOptions browserOptions = new ChromeOptions();
        browserOptions.setPlatformName("Windows 10");
        browserOptions.setBrowserVersion("126");
        HashMap<String, Object> ltOptions = new HashMap<String, Object>();
        ltOptions.put("username", "jayavardhanswarna341");
        ltOptions.put("accessKey", "v0TnWKgC1GeLiwhlfhxwiFEgsq6HMTt2A9el01fz5U1Mpf0lv5");
        ltOptions.put("build", "JV_B2");
        ltOptions.put("project", "JV2");
        ltOptions.put("smartUI.project", "JV2");
        ltOptions.put("name", "JV_T2");
        ltOptions.put("w3c", true);
        ltOptions.put("plugin", "java-testNG");
        browserOptions.setCapability("LT:Options", ltOptions);

        WebDriver driver=new RemoteWebDriver(new URL("https://hub.lambdatest.com/wd/hub"), browserOptions);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("rahul");
        driver.findElement(By.name("inputPassword")).sendKeys("hello123");
        driver.findElement(By.className("signInBtn")).click();
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(1000);//
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");
        driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
        driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("9864353253");
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        System.out.println(driver.findElement(By.cssSelector("form p")).getText());
        driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
        driver.quit();

    }
}