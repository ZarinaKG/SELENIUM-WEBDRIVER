import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.HasCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class TestChrome {
    private WebDriver driver;
    private WebDriverWait wait;
    private ChromeOptions options;

    @Before
    public void start(){
        options = new ChromeOptions();
        options.addArguments("start-maximized");
    }

    @Test
    public void TestBrowserChrome(){

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("unexpectedAlertBehaviour", "dismiss");
        WebDriver driver = new ChromeDriver(caps);
        System.out.println(((HasCapabilities) driver).getCapabilities());
    }


    @After
    public void stop(){
        driver.quit();
        driver = null;
    }
}
