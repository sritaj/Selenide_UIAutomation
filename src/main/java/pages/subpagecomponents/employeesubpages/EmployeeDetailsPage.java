package pages.subpagecomponents.employeesubpages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byTagName;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

public class EmployeeDetailsPage {

    private static final SelenideElement HEADER = $$(byTagName("h6")).get(1);
    private static final SelenideElement PERSONAL_DETAILS_TAB = $(byXpath("//a[normalize-space()='Personal Details']"));

    public void checkIfPageIsLoaded() {
        Wait().until(webDriver -> PERSONAL_DETAILS_TAB.shouldBe(visible));
    }

    public void verifyEmployeeDetails(String employeeFullName) {
        checkIfPageIsLoaded();
        HEADER.shouldBe(visible).shouldHave(text(employeeFullName));
    }
}
