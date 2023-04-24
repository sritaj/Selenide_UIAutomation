package pages;

import com.codeborne.selenide.SelenideElement;
import pages.subpagecomponents.employeesubpages.AddEmployeePage;
import pages.subpagecomponents.employeesubpages.EmployeeListPage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.$;

public class EmployeeInformationPage {

    private static final SelenideElement ADD_EMPLOYEE_LINK = $(byTagAndText("a", "Add Employee"));
    private static final SelenideElement EMPLOYEE_LIST_LINK = $(byTagAndText("a", "Employee List"));

    public AddEmployeePage navigateToAddEmployeePage() {
        ADD_EMPLOYEE_LINK.shouldBe(visible).click();
        return new AddEmployeePage();
    }

    public EmployeeListPage navigateToEmployeeListPage() {
        EMPLOYEE_LIST_LINK.shouldBe(visible).click();
        return new EmployeeListPage();
    }
}
