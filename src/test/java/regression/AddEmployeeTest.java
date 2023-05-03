package regression;

import base.BaseTest;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import pages.EmployeeInformationPage;
import pages.LoginPage;

public class AddEmployeeTest extends BaseTest {

    Faker faker = new Faker();

    @Test
    void testAddEmployee() throws InterruptedException {
        String firstName = faker.name().firstName();
        String middleName = "Test";
        String lastName = faker.name().lastName();
        //open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        new LoginPage()
                .loginToApplication()
                .getLeftMenuComponent()
                .selectAMenuFromLeftMenuBar("PIM");
        new EmployeeInformationPage()
                .navigateToAddEmployeePage().createNewEmployee(firstName, middleName, lastName).saveEmployee(true).verifyEmployeeDetails(firstName + " " + lastName);
    }
}
