package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class csslocators {
        public static void main(String[] args){
            System.setProperty("webdriver.chrome.driver","/Users/slenka/Documents/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get("https://rahulshettyacademy.com/locatorspractice/");
            driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("rahul");
            driver.findElement(By.cssSelector("input[name='inputPassword']")).sendKeys("hello123");
            driver.findElement(By.cssSelector("button[type='submit']")).click();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
            System.out.println(driver.findElement(By.cssSelector("p[class='error']")).getText());
        }
    }

