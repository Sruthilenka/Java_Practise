package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class EnableOfWebElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/slenka/Documents/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        System.out.println(driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_view_date2\"]")).isEnabled());
        driver.findElement(By.xpath("//label[text()='Round Trip']")).click();
        System.out.println(driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_view_date2\"]")).isEnabled());

   //using getAttribute()
        driver.findElement(By.id("Div1")).getAttribute("style");
        driver.findElement(By.xpath("//label[text()='Round Trip']")).click();
        driver.findElement(By.id("Div1")).getAttribute("style");
        if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")){
            System.out.println("Its enabled");
        }

        Assert.assertTrue(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"));
   driver.quit();

    }
}
