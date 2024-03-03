package SeleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDowns {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/slenka/Documents/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");


    }
    }
