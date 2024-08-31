package Pages;

import Base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;

public class ProductsManagement extends TestBase {

    public ProductsManagement() throws IOException {
        PageFactory.initElements(driver, this);
    }

    JavascriptExecutor js =( (JavascriptExecutor) driver);
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

    @FindBy(xpath = "//*[@id=\"#kt_app_sidebar_menu\"]/div[3]/a")
    WebElement productsManagementOption;

    public void clickProductsManagementOption() {
        productsManagementOption.click();
    }
    @FindBy(xpath = "//*[@id=\"#kt_app_sidebar_menu\"]/div[3]/div/div[2]/a")
    WebElement UnitsOfMeasurement;
    public void clickUnitsOfMeasurement() {
        UnitsOfMeasurement.click();
    }
    @FindBy(xpath = "//*[@id=\"kt_app_content\"]/div[2]/div/div/div[2]/div/div/button[1]")
    WebElement AddNewUnitOfMeasurement;
    public void clickAddNewUnitOfMeasurement() {
        AddNewUnitOfMeasurement.click();
    }
    @FindBy(xpath = "//*[@id=\"primarydata\"]/div/div/div/div[1]/div/input")
    WebElement UnitName;
    @FindBy(xpath = "//*[@id=\"primarydata\"]/div/div/div/div[2]/div/input")
    WebElement UnitCode;
    @FindBy(xpath = "//*[@id=\"primarydata\"]/div/div/div/div[3]/div/textarea")
    WebElement Description;
    @FindBy(xpath = "//*[@id=\"kt_app_content\"]/div[2]/div/div/div[1]/div/div/button[1]")
    WebElement Save;
    @FindBy(xpath = "//*[@id=\"kt_app_content\"]/div[2]/div/div/div[1]/div/div/button[2]")
    WebElement Cancel;
    @FindBy(xpath = "//*[@id=\"kt_app_content\"]/div[2]/div/div/div[1]/div/div/button[3]")
    WebElement Copy;
    public void sendUnitName(String UnitName) {
        this.UnitName.sendKeys(UnitName);
    }
    public void sendUnitCode(String UnitCode) {
        this.UnitCode.sendKeys(UnitCode);
    }
    public void sendDescription(String Description) {
        this.Description.sendKeys(Description);
    }
    public void clickSave() {
        Save.click();
    }
    public void clickCancel() {
        Cancel.click();
    }
    public void clickCopy() {
        Copy.click();
    }

    @FindBy(xpath = "//a[@title='عرض الجدول الزمني للتعديلات على البيان']")
    WebElement ShowTable;
    public void clickShowTable() {
        ShowTable.click();
    }

    //*[@id="kt_app_body"]/div[3]/div/div[3]/div[1]/button
    @FindBy(className = "bm-close")
    WebElement Close;
    public void clickClose() {
        Close.click();
    }

    @FindBy(xpath = "//a[@title='حذف']")
    WebElement DeleteUnit;
    public void clickDeleteUnit() {
        DeleteUnit.click();
    }

    @FindBy(xpath = "//*[@id=\"kt_app_body\"]/div[3]/div/div[3]/div[2]/div/div/button[2]")
    WebElement Delete;
    public void clickDelete() {
        Delete.click();
    }

    @FindBy(xpath = "//*[@id=\"kt_app_content\"]/div[2]/div/div/div[3]/table/thead/tr/th[1]/div/input")
    WebElement SelectAll;
    public void clickSelectAll() {
        SelectAll.click();
    }
    @FindBy(xpath = "//*[@id=\"kt_app_content\"]/div[2]/div/div/div[1]/div/div/div[2]/div/button")
    WebElement optionSelected;
    public void clickOptionSelected() {
        optionSelected.click();
    }
    @FindBy(xpath = "//*[@id=\"kt_app_content\"]/div[2]/div/div/div[1]/div/div/div[2]/div/ul/li[2]/a")
    WebElement DeleteSelected;
    public void clickDeleteSelected() {
        DeleteSelected.click();
    }
    @FindBy(xpath = "//*[@id=\"kt_app_content\"]/div[2]/div/div/div[3]/table/tbody/tr/td")
    WebElement nothingInUnitsTable;
    public String nothingInUnitsTable() {
        return nothingInUnitsTable.getText().trim();
    }

    @FindBy(xpath = "//*[@id=\"kt_app_content\"]/div[2]/div/div/div[1]/div/div/div[1]/label/select")
    WebElement showAllUnits;
    @FindBy(xpath = "//*[@id=\"kt_app_content\"]/div[2]/div/div/div[1]/div/div/div[1]/label/select/option[2]")
    WebElement displayMultipleUnits;
    public void clickShowAllUnits() {
        showAllUnits.click();
        displayMultipleUnits.click();
    }














}
