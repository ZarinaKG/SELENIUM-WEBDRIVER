import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.By.*;


public class Zadanie3 {

    private WebDriver driver;


    @Before
    public void start(){
        driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
    }

    @Test
     public void TestForLoginPage(){
        driver.get("http://localhost/litecart/admin/.");
       WebElement username =  driver.findElement(name("usern"));
       username.sendKeys("admin");
    }

    @After
     public void stop(){
        driver.quit();
        driver= null;
    }

}
