package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class xpath {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","/Users/slenka/Documents/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.linkText("Forgot your password?")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//input[@type='text' and @placeholder='Name']")).sendKeys("Sruthi");
        driver.findElement(By.xpath("//input[@type='text' and @placeholder='Email']")).sendKeys("slenka@go.com");
        //Index in xpath
        driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("9110573357");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();


    }
}
