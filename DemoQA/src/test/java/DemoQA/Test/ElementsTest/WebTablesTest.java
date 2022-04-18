package DemoQA.Test.ElementsTest;

import DemoQA.BasePage.BasePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebTablesTest extends BasePage {

    @BeforeMethod
    public void pageSetUp() throws InterruptedException {
        driver.manage().window().maximize();
        driver.navigate().to(homeURL);
        homePage.clickElements();
        Thread.sleep(1000);
        elementsSideBar.clickOnWebTables();
    }

    @Test
    public void VerifyThatUserCanAddNewPersonToTheWeblist(){
            webTablesPage.clickAdd();
            webTablesPage.inputFirstName(excelReader.getStringData("Registration", 1, 1));
            webTablesPage.inputLastName(excelReader.getStringData("Registration", 2, 2));
            webTablesPage.inputEmail(excelReader.getStringData("Registration", 3, 3));
            webTablesPage.inputAge(String.valueOf(excelReader.getIntegerData("Registration", 4, 4)));
            webTablesPage.inputSalary(String.valueOf(excelReader.getIntegerData("Registration", 5, 5)));
            webTablesPage.inputDepartmant(excelReader.getStringData("Registration", 6, 6));
            webTablesPage.clickSubmit();
            int actualNumberOfRows = webTablesPage.returnHowMuchRowsAreInTheTable() + 1;
            int expectedNumberOfRows = 4;
            Assert.assertEquals(actualNumberOfRows, expectedNumberOfRows);
    }
}