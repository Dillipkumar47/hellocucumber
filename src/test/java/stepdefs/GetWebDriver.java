package stepdefs;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utils.WebDriverFactory;
public class GetWebDriver {
    public static WebDriver driver = null;
    @Before
    public void getDriver()
    {
         driver = utils.WebDriverFactory.createWebDriver();
    }
}
