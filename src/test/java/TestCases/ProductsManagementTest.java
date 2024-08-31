package TestCases;

import Base.ProductsManagementTestProvider;
import Base.TestBase;
import Pages.ProductsManagement;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ProductsManagementTest extends TestBase {

    public ProductsManagementTest() throws IOException {
        super();
    }

    ProductsManagement productsManagement ;

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
        Allure.addAttachment("Test Output", "text/plain", "Page Data Found Is: " + unitName);
        productsManagement.sendUnitCode(unitCode);
        Allure.addAttachment("Test Output", "text/plain", "Page Data Found Is: " + unitCode);
        productsManagement.sendDescription(description);
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
}
