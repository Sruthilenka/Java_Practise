package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class ChildWindows {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/slenka/Documents/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
        driver.findElement(By.cssSelector("a.blinkingText")).click();
        String emailId;
        Set<String> windows = driver.getWindowHandles(); //Parent id ,child id (here only 1 child window)
        Iterator<String> it = windows.iterator();
        // String parentid = it.next();
        // String childid = it.next();
        //  driver.switchTo().window(childid);
        // String emailId = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
        //  System.out.println(emailId);
        // driver.switchTo().window(parentid);
        //  driver.findElement(By.id("username")).sendKeys(emailId);

        //for the code to be more dynamic
        while (it.hasNext()) {
            String windowHandle = it.next();
            driver.switchTo().window(windowHandle);
            String Title = driver.getTitle();
            if (Title.equalsIgnoreCase("RS Academy")) {
                emailId = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
                System.out.println(emailId);
            }
        }
    }
    }
