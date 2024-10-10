package TestCases;

import Base.ProductsManagementTestProvider;
import Base.TestBase;
import GoooBigListener.TestListener;
import Pages.ProductsManagement;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;

@Listeners(TestListener.class)
public class ProductsManagementTest extends TestBase {

    public ProductsManagementTest() throws IOException {
        super();
    }

    public String UniteNameValue;
    ProductsManagement productsManagement ;
    public boolean previousTestFailed;

    @BeforeMethod
    public void beforeMethod() throws IOException {
        productsManagement = new ProductsManagement();
    }

    @Test(priority = 1)
    public void testProductsManagement() throws IOException {
        productsManagement.clickProductsManagementOption();
        productsManagement.clickUnitsOfMeasurement();
    }
    @Test(priority = 2, dataProvider = "unitDataProvider", dataProviderClass = ProductsManagementTestProvider.class) // Reference the data provider class
    public void testUnitsOfMeasurement(String unitName, String unitCode, String description) throws IOException {
        productsManagement.clickAddNewUnitOfMeasurement();
        productsManagement.sendUnitName(unitName);
        System.out.println(unitName);
        Allure.addAttachment("Test Output", "text/plain", "Page Data Found Is: " + unitName);
        productsManagement.sendUnitCode(unitCode);
        System.out.println(unitCode);
        Allure.addAttachment("Test Output", "text/plain", "Page Data Found Is: " + unitCode);
        productsManagement.sendDescription(description);
        System.out.println(description);
        Allure.addAttachment("Test Output", "text/plain", "Page Data Found Is: " + description);
        productsManagement.clickSave();
    }

    @Test(priority = 3)
    public void DeleteUnitOfMeasurement() throws IOException, InterruptedException {
        Allure.addAttachment("Screenshot for Page After Adding.", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
        Thread.sleep(1000);
        productsManagement.clickSelectAll();
        productsManagement.clickOptionSelected();
        productsManagement.clickDeleteSelected();
        productsManagement.clickDelete();
        Thread.sleep(3000);
        productsManagement.clickSelectAll();
        productsManagement.clickOptionSelected();
        productsManagement.clickDeleteSelected();
        productsManagement.clickDelete();
        Thread.sleep(3000);
        String extractedText = productsManagement.nothingInUnitsTable();
        System.out.println(extractedText);
        Assert.assertTrue(extractedText.contains("لا توجد بيانات متاحة للعرض"));
        Thread.sleep(2000);
        Allure.addAttachment("Screenshot for Page After Deletion.", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
        Thread.sleep(1000);
        Allure.addAttachment("Test Output", "text/plain", "Page Data Found Is: " + extractedText);
    }

    @Test(priority = 4)
    public void AddNewUnitOfMeasurement() throws IOException {
        productsManagement.clickAddNewUnitOfMeasurement();
        productsManagement.sendUnitName("حبة");
        productsManagement.sendUnitCode("7abah");
        productsManagement.sendDescription("هذا المنتج يباع بالحبة");
        productsManagement.clickSave();
        UniteNameValue = productsManagement.getUniteNameValue();
        System.out.println(UniteNameValue);
    }


    @Test(priority = 5, dataProvider = "categoryDataProvider", dataProviderClass = ProductsManagementTestProvider.class) // Reference the data provider class
    public void ProductsCategories(String categoryName, String categoryNameEn, String Description) throws IOException, InterruptedException {
        productsManagement.clickProductCategories();
        Thread.sleep(1000);
        productsManagement.clickAddNewProductCategory();
        Thread.sleep(1000);
        productsManagement.sendCategoryName(categoryName);
        System.out.println(categoryName);
        Allure.addAttachment("Test Output", "text/plain", "Page Data Found Is: " + categoryName);
        productsManagement.sendCategoryNameEnglish(categoryNameEn);
        System.out.println(categoryNameEn);
        Allure.addAttachment("Test Output", "text/plain", "Page Data Found Is: " + categoryNameEn);
        productsManagement.clickCreateCategoryCode();
        String Code = productsManagement.getCategoryCode();
        System.out.println(Code);
        productsManagement.sendCategoryDescription(Description);
        System.out.println(Description);
        Allure.addAttachment("Test Output", "text/plain", "Page Data Found Is: " + Description);
        productsManagement.clickSaveCategory();
    }

    @Test(priority = 6)
    public void DeleteAllCategories() throws IOException, InterruptedException {
        Allure.addAttachment("Screenshot for Page After Adding.", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
        Thread.sleep(1000);
        productsManagement.clickSelectAll();
        productsManagement.clickOptionSelected();
        productsManagement.clickDeleteSelected();
        productsManagement.clickDelete();
        Thread.sleep(3000);
        productsManagement.clickSelectAll();
        productsManagement.clickOptionSelected();
        productsManagement.clickDeleteSelected();
        productsManagement.clickDelete();
        Thread.sleep(3000);
        String extractedText = productsManagement.nothingInUnitsTable();
        System.out.println(extractedText);
        Assert.assertTrue(extractedText.contains("لا توجد بيانات متاحة للعرض"));
        Thread.sleep(2000);
        Allure.addAttachment("Screenshot for Page After Deletion.", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
        Thread.sleep(1000);
        Allure.addAttachment("Test Output", "text/plain", "Page Data Found Is: " + extractedText);
    }
    @Test(priority = 7)
    public void AddNewProductsCategories() throws IOException, InterruptedException {
        productsManagement.clickAddNewProductCategory();
        Thread.sleep(1000);
        productsManagement.sendCategoryName("مشروبات ساخنه");
        productsManagement.sendCategoryNameEnglish("Hot Drinks");
        productsManagement.clickCreateCategoryCode();
        productsManagement.sendCategoryDescription("Hot Drinks");
        productsManagement.clickSaveCategory();
    }

    @Test(priority = 8)
    public void AaddSubCategory() throws IOException, InterruptedException {
        productsManagement.clickProductSubCategories();
        Thread.sleep(1000);
        productsManagement.clickAddNewProductSubCategory();
        productsManagement.sendSubCategoryName("مكنسه");
        productsManagement.sendSubCategoryNameEnglish("Electronic");
        productsManagement.clickCreateSubCategoryCode();
        productsManagement.clickSelectCategory();
        String categoryName = productsManagement.getSelectCategoryName();
        productsManagement.clickSelectCategoryName();
        System.out.println(categoryName);
        productsManagement.sendSubCategoryTax("15");
        productsManagement.sendSubCategoryNote("Test Electronic");
        productsManagement.clickSaveSaveSubCategory();
    }

    @Test(priority = 9, dataProvider = "productDetailsDataProvider", dataProviderClass = ProductsManagementTestProvider.class) // Reference the data provider class
    public void AddProductDetails(String DetailName, String DetailDescription, boolean useFirstLevel, String TopData) throws IOException, InterruptedException {
        productsManagement.clickProductDetails();
        Thread.sleep(1000);
        productsManagement.clickAddNewProductDetail();
        productsManagement.sendDetailName(DetailName);
        Allure.addAttachment("Test Output", "text/plain", "Page Data Found Is: " + DetailName);
        System.out.println(DetailName);
        if (useFirstLevel) {
            productsManagement.clickIsFirstLevel();
            productsManagement.sendDetailDescription1(DetailDescription);
        } else {
            productsManagement.clickIsFirstLevel2();
            if (TopData != null) {
                productsManagement.sendTopField(TopData);
                productsManagement.sendDetailDescription2(DetailDescription);
            }
        }
        Allure.addAttachment("Test Output", "text/plain", "Page Data Found Is: " + DetailDescription);
        System.out.println(DetailDescription);
        productsManagement.clickSaveDetail();
    }

    @Test(priority = 10)
    public void clickOnPackageNotes() throws IOException, InterruptedException {
        productsManagement.scrollToPackagesSidebar();
        Thread.sleep(1000);
        productsManagement.clickPackagesNote();
        Thread.sleep(1000);
        productsManagement.clickAddNewPackageNote();
    }

    @Test(priority = 11)
    public void AddNewPackageDetailWithEmptyData() throws IOException, InterruptedException {
        productsManagement.clickSavePackageNote();
        Thread.sleep(1000);
        Assert.assertTrue(productsManagement.isErrorPopUp());
        String errorPopUp = productsManagement.getErrorPopUp();
        System.out.println(errorPopUp);
        Assert.assertTrue(errorPopUp.contains("يرجى إكمال الحقول"));
        productsManagement.clickCloseErrorPopUp();
        productsManagement.clickCancel();
    }

    @Test(priority = 12, dataProvider = "PackageDetails", dataProviderClass = ProductsManagementTestProvider.class) // Reference the data provider class
    public void AddNewPackagesDetailWithValidData(String Note) throws IOException, InterruptedException {
        productsManagement.clickAddNewPackageNote();
        productsManagement.sendPackagesNotes(Note);
        productsManagement.clickSavePackageNote();
    }

    @Test(priority = 13)
    public void PackagesGroup() throws IOException, InterruptedException {
        productsManagement.scrollToPackagesSidebar();
        productsManagement.clickGuaranteePlans();
    }

    @Test(priority = 14)
    public void AddNewGuaranteeGroupWithEmptyData() throws IOException, InterruptedException {
        productsManagement.clickAddNewGuaranteePlan();
        productsManagement.clickSaveGuaranteePlan();
        Thread.sleep(1000);
        Assert.assertTrue(productsManagement.isErrorPopUp());
        String errorPopUp = productsManagement.getErrorPopUp();
        System.out.println(errorPopUp);
        Assert.assertTrue(errorPopUp.contains("يرجى إكمال الحقول"));
        productsManagement.clickCloseErrorPopUp();
        productsManagement.clickCancelGuaranteePlan();
    }

    @Test(priority = 15)
    public void AddNewGuaranteeGroupWithInValidData() throws IOException, InterruptedException {
        try{
            productsManagement.clickAddNewGuaranteePlan();
            productsManagement.sendGuaranteePlanName("Guarantee Plan");
            productsManagement.clickSaveGuaranteePlan();
            Assert.assertTrue(productsManagement.isErrorPopUp(), "Should be an error pop up");
            previousTestFailed = false;
        }catch (AssertionError | Exception e) {
            previousTestFailed = true; // Test failed
            throw e;
        }
    }


}
