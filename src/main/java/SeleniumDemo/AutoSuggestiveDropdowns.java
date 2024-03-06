package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class AutoSuggestiveDropdowns {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","/Users/slenka/Documents/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("autosuggest")).sendKeys("ind");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        List<WebElement> options = driver.findElements(By.xpath("//li[@class ='ui-menu-item']/a"));
        for(WebElement option:options) {
            if (option.getText().equalsIgnoreCase("India")) {
                option.click();
                break;
            }
        }
    }
}
