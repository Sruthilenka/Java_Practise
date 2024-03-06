package SeleniumDemo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assesrtions {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/slenka/Documents/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='chk_friendsandfamily'")).isSelected());
        driver.findElement(By.cssSelector("input[id*='chk_friendsandfamily'")).click(); //regular expression- id is too long so used *
        Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='chk_friendsandfamily'")).isSelected());


        //num of passengers selected
        System.out.println(driver.findElement(By.id("divpaxinfo")).getSize()); // size of the field  which is not required here
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText()); // gives the value loaded in that field
        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "1 Adult");

    }
}
