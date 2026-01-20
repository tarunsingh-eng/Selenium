import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SuccessfulLoginTest{
    @Test
    public void LoginTest(){
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.get("https://rahulshettyacademy.com/locatorspractice/");
            driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Rahul");
            driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.findElement(By.className("submit")).click();

             
    }
}