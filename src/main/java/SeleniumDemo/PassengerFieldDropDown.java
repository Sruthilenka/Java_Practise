package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class PassengerFieldDropDown {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/slenka/Documents/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("divpaxinfo")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        int i=1;
        while(i<5){
            driver.findElement(By.id("hrefIncAdt")).click();
            i++;
        }

        driver.findElement(By.id("btnclosepaxoption")).click();
        System.out.println( driver.findElement(By.id("divpaxinfo")).getText());
    }
}
