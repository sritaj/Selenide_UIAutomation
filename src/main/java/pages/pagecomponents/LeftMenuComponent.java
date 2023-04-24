package pages.pagecomponents;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class LeftMenuComponent {

    public void selectAMenuFromLeftMenuBar(String menuName) {
        $(byText(menuName)).shouldBe(Condition.enabled).click();
    }
}
