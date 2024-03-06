package SeleniumAddToCartProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class AddToCart {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/slenka/Documents/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/seleniumPractise/#/");
      /*  List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
        for (int i = 0; i < products.size(); i++) {
            String name = products.get(i).getText();
            if (name.contains("Cucumber")) {
                driver.findElements(By.xpath("//button[text()='Add To cart")).get(i).click();
                break;
            }
        }*/

        //say I want to add multiple veggies, then decalre an array.
      /*  String[] veggies = {"Cucucmber", "Brocolli"};
        List veggiesselected = Arrays.asList(veggies);
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
        for (int i = 0; i < products.size(); i++) {
            String name = products.get(i).getText();
            if (veggiesselected.contains(name)) {
                driver.findElements(By.xpath("//button[text()='Add To cart")).get(i).click();
            }

        }*/

        //We gave veggies as Cucumber, brocolli but the webelements fetched are Cucumber - 1 kg,Brocolli - 1 kg. So for that we use split

        String[] veggies = {"Cucucmber", "Brocolli"};
        List veggiesselected = Arrays.asList(veggies);
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
        int count=0;
        for (int i = 0; i < products.size(); i++) {
            String[] name = products.get(i).getText().split("-"); // split would return an array of elements
       String formattedName= name[0].trim();// to remove that extra space
        if(veggiesselected.contains(formattedName)){
         driver.findElements(By.xpath("//button[text()='Add To cart']")).get(i).click();
         count++;
         if(count==veggies.length)
             break;  // When they ask u include break as soon as all the itemas mentioned in the list are added. So we can keep a count on the number of times the condition met and execution went inside the loop.
            }
        }


    }
}

