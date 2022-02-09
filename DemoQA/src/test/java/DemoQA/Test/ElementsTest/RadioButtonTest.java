package DemoQA.Test.ElementsTest;

import DemoQA.BasePage.BasePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RadioButtonTest extends BasePage {

    @BeforeMethod
    public void pageSetUp() {
        driver.manage().window().maximize();
        driver.navigate().to(homeURL);
        homePage.clickElements();
        elementsSideBar.clickOnRadioButton();
    }

    @Test
    public void VerifyThatYessRadioButtonCanBeSelectedAndMessageApearsThatYesIsSelected() {
        radioButtonPage.clickYesRadioButton();
        Assert.assertTrue(radioButtonPage.getMessage().isDisplayed());
        Assert.assertEquals(radioButtonPage.message(), excelReader.getStringData("Messages", 0, 1));
    }

    @Test
    public void VerifyThatImpressiveRadioButtonCanBeSelectedAndMessageApearsThatImpressiveIsSelected() {
        radioButtonPage.clickImpressiveRadioButton();
        Assert.assertTrue(radioButtonPage.getMessage().isDisplayed());
        Assert.assertEquals(radioButtonPage.message(), excelReader.getStringData("Messages", 0, 2));
    }

    @Test
    public void VerifyThatNoRadioButtonCanBeSelectedAndMessageApearsThatNoIsSelected() {
        radioButtonPage.clickNoRadioButton();
        Assert.assertFalse(radioButtonPage.getMessage().isDisplayed());
        Assert.assertEquals(radioButtonPage.message(), excelReader.getStringData("Messages", 0, 3));
    }
}
