package SeleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/slenka/Documents/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com");

        driver.manage().window().fullscreen();
        driver.navigate().to("https://rahulshettyacademy.com");
    }

}
