package DemoQA.Test.ElementsTest;

import DemoQA.BasePage.BasePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TextBoxTest extends BasePage {

    @BeforeMethod
    public void pageSetUp() {
        driver.manage().window().maximize();
        driver.navigate().to(homeURL);
    }

    @Test
    public void VerifyThatMessageAppearsWhenValidParametersInAllTextBoxesAreInputedWhenSubmited() {
        homePage.clickElements();
        elementsSideBar.clickOnTextBox();
        for (int i = 1; i <= excelReader.getLastRow("Inputs"); i++) {
            String name = excelReader.getStringData("Inputs", i, 0);
            String email = excelReader.getStringData("Inputs", i, 1);
            String curentAddress = excelReader.getStringData("Inputs", i, 2);
            String permanentAddress = excelReader.getStringData("Inputs", i, 2);

            textBoxPage.inputFullName(name);
            textBoxPage.inputEmail(email);
            textBoxPage.inputCurrentAddress(curentAddress);
            textBoxPage.inputPermanentAddress(permanentAddress);
            textBoxPage.clickSubmit();

            Assert.assertTrue(textBoxPage.getMessage().isDisplayed());
        }
    }

    @Test
    public void VerifyThatMessageDontAppearWhenInvalidParametersAreInputedWhenSubmited(){
        homePage.clickElements();
        elementsSideBar.clickOnTextBox();
        for (int i = 1; i <= excelReader.getLastRow("Inputs"); i++){
            String name = excelReader.getStringData("Inputs", i, 0);
            String email = excelReader.getStringData("Inputs", i, 3);
            String curentAddress = excelReader.getStringData("Inputs", i, 2);
            String permanentAddress = excelReader.getStringData("Inputs", i, 2);

            textBoxPage.inputFullName(name);
            textBoxPage.inputEmail(email);
            textBoxPage.inputCurrentAddress(curentAddress);
            textBoxPage.inputPermanentAddress(permanentAddress);
            textBoxPage.clickSubmit();

            Assert.assertTrue(textBoxPage.getErrorForm().isEnabled());
        }
    }
}