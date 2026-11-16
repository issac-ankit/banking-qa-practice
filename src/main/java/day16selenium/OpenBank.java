package day16selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class OpenBank {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://parabank.parasoft.com/parabank/index.htm");
            System.out.println(driver.getTitle()); // Expected: ParaBank | Welcome | Online Banking.

            driver.findElement(By.name("username")).sendKeys("issac");
            driver.findElement(By.name("password")).sendKeys("wrongpass");
            driver.findElement(By.cssSelector("input[value='Log In']")).click();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            WebElement errorElement = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.className("error")));
            String message = errorElement.getText();
            System.out.println("Error message: " + message);   // Expected: The username and password could not be verified.

            String actual = driver.getTitle();
            System.out.println("Title after login: " + actual);        // Expected: ParaBank | Error

            String expected = "ParaBank | Error";
            boolean result = actual.equalsIgnoreCase(expected);
            System.out.println("Title matches? " + result);            // Expected: true


            List<WebElement> menuLinks = driver.findElements(By.xpath("//ul[@class='leftmenu']//a"));
            System.out.println("Number of links: " + menuLinks.size());   // Expected: 5

            for (WebElement link : menuLinks) {
                System.out.println(link.getText());     // print the text of each link
                //About Us,Services, Products, Locations, Admin Page

            }
        } finally {
            driver.quit();
        }
    }
}
