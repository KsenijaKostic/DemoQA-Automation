package DemoQA.Test.ElementsTest;

import DemoQA.BasePage.BasePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckboxTest extends BasePage {

    @BeforeMethod
    public void pageSetUp(){
        driver.manage().window().maximize();
        driver.navigate().to(excelReader.getStringData("URL", 4, 1));
        elementsSideBar.clickOnCheckBox();
    }

    @Test
    public void verifyThatUserCanOpenAllParrentsInList(){
        checkBoxPage.clickOnArrow(1);
        checkBoxPage.clickOnArrow(2);
        checkBoxPage.clickOnArrow(3);
        checkBoxPage.clickOnArrow(4);
        checkBoxPage.clickOnArrow(5);
        checkBoxPage.clickOnArrow(6);

        Assert.assertEquals(checkBoxPage.openedArrow(1), excelReader.getStringData("Asserts", 0, 1));
        Assert.assertEquals(checkBoxPage.openedArrow(2), excelReader.getStringData("Asserts", 0, 1));
        Assert.assertEquals(checkBoxPage.openedArrow(3), excelReader.getStringData("Asserts", 0, 1));
        Assert.assertEquals(checkBoxPage.openedArrow(4), excelReader.getStringData("Asserts", 0, 1));
        Assert.assertEquals(checkBoxPage.openedArrow(5), excelReader.getStringData("Asserts", 0, 1));
        Assert.assertEquals(checkBoxPage.openedArrow(6), excelReader.getStringData("Asserts", 0, 1));

    }

    @Test
    public void verifyThatUserCanCheckHomeCheckBoxAndThatAllOtherCheckBoxesAreChecked(){
        checkBoxPage.clickOnHomeCheckbox();

        Assert.assertTrue(checkBoxPage.getResult().isDisplayed());
        Assert.assertEquals(checkBoxPage.textResult(), excelReader.getStringData("Messages", 1, 1));
    }

    @Test
    public void verifyThatUserCanCheckHomeCheckBoxAndThenClickOnDesktopToUncheckAllCheckboxesUnderDesktop(){
        checkBoxPage.clickOnHomeCheckbox();
        checkBoxPage.clickOnArrow(1);
        checkBoxPage.clickOnDesktopCheckbox();

        Assert.assertTrue(checkBoxPage.getResult().isDisplayed());
        Assert.assertEquals(checkBoxPage.textResult(), excelReader.getStringData("Messages", 1, 2));

    }
}
