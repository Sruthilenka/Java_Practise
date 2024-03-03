package SeleniumDemo;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class StaticDropDowns {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/slenka/Documents/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        //dropdown with select tag
        WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropdown = new Select(staticDropdown);
        dropdown.selectByIndex(1);
        System.out.println(dropdown.getFirstSelectedOption().getText());

        dropdown.selectByVisibleText("AED");
        dropdown.selectByValue("INR");




    }
}
