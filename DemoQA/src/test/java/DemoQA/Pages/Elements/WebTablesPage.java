package DemoQA.Pages.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class WebTablesPage {
    public WebDriver driver;
    WebElement addButton;
    WebElement searchBar;
    WebElement edit;
    WebElement delete;
    WebElement selectRows;
    WebElement pageNumber;
    WebElement firstName;
    WebElement lastName;
    WebElement email;
    WebElement age;
    WebElement salary;
    WebElement department;
    WebElement submitButton;
    List<WebElement> rowsWithEmployed;

    public WebTablesPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getAddButton() {
        return driver.findElement(By.id("addNewRecordButton"));
    }

    public WebElement getSearchBar() {
        return driver.findElement(By.id("searchBox"));
    }

    public WebElement getEdit() {
        return driver.findElement(By.id("edit-record-1"));
    }

    public WebElement getDelete() {
        return driver.findElement(By.id("delete-record-1"));
    }

    public WebElement getSelectRows() {
        return driver.findElement(By.cssSelector("#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div.web-tables-wrapper > div.ReactTable.-striped.-highlight > div.pagination-bottom > div > div.-center > span.select-wrap.-pageSizeOptions > select"));
    }

    public WebElement getPageNumber() {
        return driver.findElement(By.className("-pageJump"));
    }

    public WebElement getFirstName() {
        return driver.findElement(By.id("firstName"));
    }

    public WebElement getLastName() {
        return driver.findElement(By.id("lastName"));
    }

    public WebElement getEmail() {
        return driver.findElement(By.id("userEmail"));
    }

    public WebElement getAge() {
        return driver.findElement(By.id("age"));
    }

    public WebElement getSalary() {
        return driver.findElement(By.id("salary"));
    }

    public WebElement getDepartment() {
        return driver.findElement(By.id("department"));
    }

    public WebElement getSubmitButton() {
        return driver.findElement(By.id("submit"));
    }

    public List<WebElement> getRowsWithEmployed() {
        return driver.findElements(By.className("rt-tr-group"));
    }

    //---------------------------------------------------------

    public void clickAdd() {
        getAddButton().click();
    }

    public void inputSearch(String name) {
        getSearchBar().sendKeys(name);
    }

    public void editRow() {
        getEdit().click();
    }

    public void deleteRow(int i) {
        getDelete().click();
    }

    public void selectNumberOfRowsToShow(String value) {
        Select rows = new Select(getSelectRows());
        rows.selectByValue(value);
    }

    public void inputPageNumber(String number) {
        getPageNumber().clear();
        getPageNumber().sendKeys(number);
    }

    public void inputFirstName(String name) {
        getFirstName().clear();
        getFirstName().sendKeys(name);
    }

    public void inputLastName(String lastname) {
        getLastName().clear();
        getLastName().sendKeys(lastname);
    }

    public void inputEmail(String email) {
        getEmail().clear();
        getEmail().sendKeys(email);
    }

    public void inputAge(String age) {
        getAge().clear();
        getAge().sendKeys(age);
    }

    public void inputSalary(String salary) {
        getSalary().clear();
        getSalary().sendKeys(salary);
    }

    public void inputDepartmant(String departmant) {
        getDepartment().clear();
        getDepartment().sendKeys(departmant);
    }

    public void clickSubmit() {
        getSubmitButton().click();
    }

    public int returnHowMuchRowsAreInTheTable() {
        int brojac = 0;
        for (int i = 0; i < getRowsWithEmployed().size(); i++) {
            if (!getRowsWithEmployed().get(i).getText().isBlank()) {
                brojac++;
            }
        }

        return brojac - 1;
    }
}