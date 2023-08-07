package SeleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Introduction {
    public static void main(String[] args){
        //Create object of ChromeDriver class
        ChromeDriver cd = new ChromeDriver();  // so here the driver object will have access to ChromeDriver methods too apart from methods implemented from WebDriver interface. So restrict that lets create object as follows:
        WebDriver driver = new ChromeDriver(); // Now driver can access only methods implemented from Web Driver interface
       //To set ChromeDriver path
        System.setProperty("webdriver.chrome.driver","/Users/slenka/Documents/chromedriver"); //invokes Chrome Browser
        driver.get("https://rahulshettyacademy.com");
        System.out.println(driver.getTitle());
        driver.close();
    }
}
