import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestIE {

    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void start(){
        DesiredCapabilities caps = new DesiredCapabilities();
      //  caps.setCapability(InternetExplorerDriver.REQUIRE_WINDOW_FOCUS, true);
        caps.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
        driver = new InternetExplorerDriver(caps);
        wait = new WebDriverWait(driver,10);
    }

    @Test
    public void TestBrowserIE(){
        driver.get("https://www.google.com");
    }

    @After
    public void stop(){
        driver.quit();
        driver = null;
    }
}
