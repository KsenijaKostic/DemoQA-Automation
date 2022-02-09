package DemoQA.Test.FormsTest;

import DemoQA.BasePage.BasePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PracticeFormsTest extends BasePage {

    @BeforeMethod
    public void pageSetUp() {
        driver.manage().window().maximize();
        driver.navigate().to(excelReader.getStringData("URL", 13, 1));
        /*homePage.clickForms();  //pokusala sam preko lokatora, i izmenjala 10ak razlicitih i ni jedan od njih nece da radi da bi kliknuo
        formsSideBar.clickPracticeForms();*/
    }

    @Test
    public void inputValidEntriesInAllFields() throws InterruptedException {
        String validName = excelReader.getStringData("Registration", 1, 1);
        String validLastName = excelReader.getStringData("Registration", 1, 2);
        String validEmail = excelReader.getStringData("Registration", 1, 3);
        String validNumber = String.valueOf(excelReader.getIntegerData("Registration", 1, 8));
        String validSubject = excelReader.getStringData("Registration", 1, 9);
        String validPic = excelReader.getStringData("Upload", 0, 1);
        String validAddress = excelReader.getStringData("Inputs", 1, 2);
        String validState = excelReader.getStringData("Registration", 1, 10);

        practiceFormsPage.inputFirstName(validName);
        practiceFormsPage.inputLastName(validLastName);
        practiceFormsPage.inputEmail(validEmail);
        practiceFormsPage.selectFemaleGender();
        practiceFormsPage.inputPhoneNumber(validNumber);
        //practiceFormsPage.inputSubject(validSubject);
        practiceFormsPage.selectMusic();
        practiceFormsPage.uploadPicture(validPic);
        practiceFormsPage.inputCurrentAddress(validAddress);
        practiceFormsPage.chooseState();
        practiceFormsPage.chooseCity();
        practiceFormsPage.clickSubmit();
    }
}
