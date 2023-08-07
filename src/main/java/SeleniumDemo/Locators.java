package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static java.time.Duration.*;

public class Locators {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","/Users/slenka/Documents/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("rahul");
        driver.findElement(By.name("inputPassword")).sendKeys("hello123");
        driver.findElement(By.className("submit")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
    }
}
