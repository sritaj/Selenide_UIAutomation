package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.$;

public class EmployeeInformationPage {

    private static final SelenideElement ADD_EMPLOYEE_LINK = $(byTagAndText("a", "Add Employee"));

    public void addNewEmployee() {
        ADD_EMPLOYEE_LINK.shouldBe(visible).click();
    }
}
