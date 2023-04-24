package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private static final SelenideElement USERNAME = $(byCssSelector("input[placeholder='Username']"));
    private static final SelenideElement PASSWORD = $("input[placeholder='Password']");
    private static final SelenideElement LOGIN_BTN = $(byCssSelector("button[type='submit']"));

    public HomePage loginToApplication() {
        USERNAME.shouldBe(Condition.visible).setValue("Admin");
        PASSWORD.shouldBe(Condition.visible).setValue("admin123");
        LOGIN_BTN.shouldBe(Condition.enabled).click();
        return new HomePage();
    }

}
