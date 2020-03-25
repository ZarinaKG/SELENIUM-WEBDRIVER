import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class MyFirstTest {
    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void start(){
        System.setProperty("webdriver.chrome.driver","C:\\Tools\\chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,10);
    }

    @Test

    public void MyFirstTest(){
        driver.get("http:\\www.google.com");
        driver.findElement(By.name("q")).sendKeys("Webdriver");
        driver.findElement(By.name("btnG")).click();
        wait.until(titleIs("webdriver -Google"));


    }
    
    @After

    public void stop(){
        driver.quit();
        driver = null;
    }
}
