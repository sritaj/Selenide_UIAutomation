package base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import utils.CleanupImpl;

import java.io.File;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;
public class BaseTest {

    protected BaseTest() {

    }

    @BeforeAll
    public static void setup(){
        CleanupImpl.cleanUpDirectory("/build/reports/tests");
        open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        //browserSize = "1920*1080";
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }

    @AfterAll
    public static void teardown(){
        closeWebDriver();
    }
}
