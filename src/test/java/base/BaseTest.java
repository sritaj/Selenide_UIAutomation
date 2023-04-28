package base;

import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.junit5.TextReportExtension;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.ExtendWith;
import utils.CleanupImpl;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

@ExtendWith({TextReportExtension.class})
public class BaseTest {

    protected BaseTest() {

    }

    @BeforeAll
    public static void setup() {
        CleanupImpl.cleanUpDirectory("/build/reports/tests");
        open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        //browserSize = "1920*1080";
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }

    @AfterAll
    public static void teardown() {
        closeWebDriver();
    }
}
