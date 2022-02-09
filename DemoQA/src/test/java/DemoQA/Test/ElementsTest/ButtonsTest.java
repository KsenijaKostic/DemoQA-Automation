package DemoQA.Test.ElementsTest;

import DemoQA.BasePage.BasePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ButtonsTest extends BasePage {

    @BeforeMethod
    public void pageSetUp(){
        driver.manage().window().maximize();
        driver.navigate().to(homeURL);
        homePage.clickElements();
        elementsSideBar.clickOnButtons();
    }

    @Test
    public void performDuobleClickOnDoubleClickButton(){
        buttonsPage.dubleClickButton(1);

        Assert.assertTrue(buttonsPage.getMessage1().isDisplayed());
        Assert.assertEquals(buttonsPage.getMessageForDoubleClick(), excelReader.getStringData("Messages", 2, 1));
    }

    @Test
    public void performRightClickOnRightClickButton(){
        buttonsPage.rightClickButton(2);

        Assert.assertTrue(buttonsPage.getMessage2().isDisplayed());
        Assert.assertEquals(buttonsPage.getMessageForRightClick(), excelReader.getStringData("Messages", 2, 2));
    }

    @Test
    public void performClickOnClickButton(){
        buttonsPage.clickOnButton(3);

        Assert.assertTrue(buttonsPage.getMessage3().isDisplayed());
        Assert.assertEquals(buttonsPage.getMesageGorClick(), excelReader.getStringData("Messages", 2, 3));

    }
}
