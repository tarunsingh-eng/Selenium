import java.time.Duration;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetTitleTest {

    @Test
    public void verifyTitle() {
        WebDriver driver = new ChromeDriver ();
        
        driver.get("http://example.com");

        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.titleContains("Example"));

        String title = driver.getTitle();
        //Assert.assertTrue(title.contains("example"));
        Assert.assertEquals("Example Domain", title);
        driver.quit();
    }
}