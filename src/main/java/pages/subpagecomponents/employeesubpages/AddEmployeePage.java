package pages.subpagecomponents.employeesubpages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class AddEmployeePage {

    private static final SelenideElement FIRST_NAME = $(byAttribute("placeholder", "First Name"));
    private static final SelenideElement MIDDLE_NAME = $(byAttribute("placeholder", "Middle Name"));
    private static final SelenideElement LAST_NAME = $(byAttribute("placeholder", "Last Name"));
    private static final SelenideElement EMPLOYEE_ID = $(byCssSelector("div[class='oxd-input-group oxd-input-field-bottom-space'] div input[class='oxd-input oxd-input--active']"));
    private static final SelenideElement SAVE_BTN = $(byAttribute("type", "submit"));
    private static final SelenideElement CANCEL_BTN = $(byXpath("//button[normalize-space()='Cancel']"));
    private static final SelenideElement SUCCESS_NOTIFICATION = $(byText("Success"));

    public AddEmployeePage createNewEmployee(String firstName, String middleName, String lastName) {
        FIRST_NAME.shouldBe(visible).setValue(firstName);
        MIDDLE_NAME.shouldBe(visible).setValue(middleName);
        LAST_NAME.shouldBe(visible).setValue(lastName);
        return new AddEmployeePage();
    }

    public EmployeeDetailsPage saveEmployee(boolean shouldSave) {
        if (shouldSave) {
            SAVE_BTN.shouldBe(visible).click();
            SUCCESS_NOTIFICATION.shouldHave(visible);
        } else {
            CANCEL_BTN.shouldBe(visible).click();
        }
        return new EmployeeDetailsPage();
    }
}
