import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    @BeforeSuite
    public void config(){
        Configuration.browserSize = "1920x1360";
        Configuration.baseUrl = "https://multiplex.ua";
    }
}
