package Pages;

import Base.TestBase;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;

public class ProductsManagement extends TestBase {

    public ProductsManagement() throws IOException {
        PageFactory.initElements(driver, this);
    }

    // Use Actions class to move to the element
    Actions actions = new Actions(driver);
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

    @FindBy(xpath = "//*[@id=\"kt_app_content\"]/div[2]/div/div/div[3]/table/tbody/tr/td[3]/p")
    WebElement UniteNameValue;
    public String getUniteNameValue() {
        return UniteNameValue.getText().trim();
    }

    ////////////////////////////////////////////////////////////////////////
    /* تصنيفات المنتجات */

    @FindBy(xpath = "//*[@id=\"#kt_app_sidebar_menu\"]/div[3]/div/div[4]/a")
    WebElement ProductCategories;
    public void clickProductCategories() {
        ProductCategories.click();
    }

    @FindBy(xpath = "//*[@id=\"kt_app_content\"]/div[2]/div/div/div[2]/div/div/button[1]")
    WebElement AddNewProductCategory;
    public void clickAddNewProductCategory() {
        AddNewProductCategory.click();
    }

    @FindBy(xpath = "//*[@id=\"primarydata\"]/div/div/div/div[1]/div/input")
    WebElement CategoryName;
    public void sendCategoryName(String CategoryName) {
        this.CategoryName.click();
        this.CategoryName.sendKeys(CategoryName);
    }

    @FindBy(xpath = "//*[@id=\"primarydata\"]/div/div/div/div[2]/div/input")
    WebElement CategoryNameEnglish;
    public void sendCategoryNameEnglish(String CategoryNameEnglish) {
        this.CategoryNameEnglish.click();
        this.CategoryNameEnglish.sendKeys(CategoryNameEnglish);
    }

    @FindBy(xpath = "//*[@id=\"primarydata\"]/div/div/div/div[3]/div/button")
    WebElement CreateCategoryCode;
    public void clickCreateCategoryCode() {
        CreateCategoryCode.click();
    }

    @FindBy(xpath = "//*[@id=\"primarydata\"]/div/div/div/div[3]/div/input")
    WebElement CategoryCode;
    public String getCategoryCode() {
        return CategoryCode.getText().trim();
    }

    @FindBy(xpath = "//*[@id=\"primarydata\"]/div/div/div/div[5]/div/textarea")
    WebElement CategoryDescription;
    public void sendCategoryDescription(String Description) {
        // Scroll down to the element using JavaScript
        js.executeScript("arguments[0].scrollIntoView(true);", CategoryDescription);
        // Now send keys to the element
        this.CategoryDescription.click();
        this.CategoryDescription.sendKeys(Description);
    }

    @FindBy(xpath = "//*[@id=\"kt_app_content\"]/div[2]/div/div/div[1]/div/div/button[1]")
    WebElement SaveCategory;
    public void clickSaveCategory() {
        // Scroll up to the element using JavaScript
        js.executeScript("window.scrollTo(0, -100);");  // Scroll to the top of the page

        // Now scroll to the element
        //js.executeScript("arguments[0].scrollIntoView(true);", SaveCategory);

        // Click the element
        SaveCategory.click();
    }

    /////////////////////////////////////////////////////////////////////////
    /* أقسام المنتجات */

    @FindBy(xpath = "//*[@id=\"#kt_app_sidebar_menu\"]/div[3]/div/div[5]/a")
    WebElement ProductSubCategories;
    public void clickProductSubCategories() {
        ProductSubCategories.click();
    }

    @FindBy(xpath = "//*[@id=\"kt_app_content\"]/div[2]/div/div/div[2]/div/div/button[1]")
    WebElement AddNewProductSubCategory;
    public void clickAddNewProductSubCategory() {
        AddNewProductSubCategory.click();
    }

    @FindBy(xpath = "//*[@id=\"primarydata\"]/div/div/div/div[1]/div/input")
    WebElement SubCategoryName;
    public void sendSubCategoryName(String SubCategoryName) {
        this.SubCategoryName.click();
        this.SubCategoryName.sendKeys(SubCategoryName);
    }

    @FindBy(xpath = "//*[@id=\"primarydata\"]/div/div/div/div[2]/div/input")
    WebElement SubCategoryNameEnglish;
    public void sendSubCategoryNameEnglish(String SubCategoryNameEnglish) {
        this.SubCategoryNameEnglish.click();
        this.SubCategoryNameEnglish.sendKeys(SubCategoryNameEnglish);
    }

    @FindBy(xpath = "//*[@id=\"primarydata\"]/div/div/div/div[4]/div/button")
    WebElement CreateSubCategoryCode;
    public void clickCreateSubCategoryCode() {
        CreateSubCategoryCode.click();
    }

    @FindBy(xpath = "//*[@id=\"primarydata\"]/div/div/div/div[6]/div/div[1]/div/div/div[2]")
    WebElement selectCategory;

    public void clickSelectCategory() {
        actions.moveToElement(selectCategory).perform();
        // Click the element
        selectCategory.click();
    }


    @FindBy(xpath = "//*[@id=\"primarydata\"]/div/div/div/div[6]/div/div[1]/div/div[2]/div[2]")
    WebElement selectCategoryName;
    public void clickSelectCategoryName() {
        selectCategoryName.click();
    }
    public String getSelectCategoryName() {
        return selectCategoryName.getText().trim();
    }

    @FindBy(xpath = "//*[@id=\"primarydata\"]/div/div/div/div[9]/div/input")
    WebElement SubCategoryTax;
    public void sendSubCategoryTax(String SubCatTax) {
        // Scroll down to the element using JavaScript
        js.executeScript("arguments[0].scrollIntoView(true);", SubCategoryTax);
        this.SubCategoryTax.click();
        this.SubCategoryTax.sendKeys(SubCatTax);
    }

    @FindBy(xpath = "//*[@id=\"primarydata\"]/div/div/div/div[11]/div/textarea")
    WebElement SubCategoryNote;
    public void sendSubCategoryNote(String SubCategoryNote) {
        this.SubCategoryNote.click();
        this.SubCategoryNote.sendKeys(SubCategoryNote);
    }

    @FindBy(xpath = "//*[@id=\"kt_app_content\"]/div[2]/div/div/div[1]/div/div/button[1]")
    WebElement SaveSubCategory;
    public void clickSaveSaveSubCategory() {
        // Scroll up to the element using JavaScript
        js.executeScript("window.scrollTo(0, -100);");  // Scroll to the top of the page

        // Now scroll to the element
        //js.executeScript("arguments[0].scrollIntoView(true);", SaveCategory);

        // Click the element
        SaveSubCategory.click();
    }

    ///////////////////////////////////////////////////////////////
    /* مواصفات */

    @FindBy(xpath = "//*[@id=\"#kt_app_sidebar_menu\"]/div[3]/div/div[6]/a/span[2]")
    WebElement ProductDetails;
    public void clickProductDetails() {
        actions.moveToElement(this.ProductDetails).perform();
        ProductDetails.click();
    }

    @FindBy(xpath = "//*[@id=\"kt_app_content\"]/div[2]/div/div/div[2]/div/div/button[1]")
    WebElement AddNewProductDetail;
    public void clickAddNewProductDetail() {
        AddNewProductDetail.click();
    }

    @FindBy(xpath = "//*[@id=\"primarydata\"]/div/div/div/div[1]/div/input")
    WebElement DetailName;
    public void sendDetailName(String DetailName) {
        this.DetailName.click();
        this.DetailName.sendKeys(DetailName);
    }

    @FindBy(id = "IsFirstLevelYes")
    WebElement IsFirstLevel;
    public void clickIsFirstLevel() {
        IsFirstLevel.click();
    }

    @FindBy(id = "IsFirstLevelNo")
    WebElement IsFirstLevel2;
    public void clickIsFirstLevel2() {
        IsFirstLevel2.click();
    }

    @FindBy(xpath = "//*[@id=\"primarydata\"]/div/div/div/div[4]/div/textarea")
    WebElement DetailDescription;
    public void sendDetailDescription(String DetailDescription) {
        js.executeScript("arguments[0].scrollIntoView(true);", this.DetailDescription);
        actions.moveToElement(this.DetailDescription).perform();
        this.DetailDescription.click();
        this.DetailDescription.sendKeys(DetailDescription);
    }

    @FindBy(xpath = "//*[@id=\"kt_app_content\"]/div[2]/div/div/div[1]/div/div/button[1]")
    WebElement SaveDetail;
    public void clickSaveDetail() {
        // Scroll up to the element using JavaScript
        js.executeScript("window.scrollTo(0, -100);");  // Scroll to the top of the page
        // Click the element
        SaveDetail.click();
    }

    @FindBy(xpath = "//*[@id=\"primarydata\"]/div/div/div/div[3]/div/div[1]/div/div/input")
    WebElement TopField;
    @FindBy(xpath = "//*[@id=\"primarydata\"]/div/div/div/div[3]/div/div[1]/div/div[2]/div[2]")
    WebElement Enter;
    public void sendTopField(String topFieldValue) {
        actions.moveToElement(this.TopField).perform();
        this.TopField.click();
        this.TopField.sendKeys(topFieldValue);
        Enter.click();
    }

}
