package SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class Alerts {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","/Users/slenka/Documents/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a name");
       String name = sc.nextLine();
       driver.findElement(By.name("enter-name")).sendKeys(name);
       driver.findElement(By.xpath("//input[@value='Alert']")).click();
        System.out.println(driver.switchTo().alert().getText());
       driver.switchTo().alert().accept(); // positive scebarios-> yes,accept etc

       //driver.switchTo().alert().dismiss(); //negative scenario--> cancel. no. close


    }
}
