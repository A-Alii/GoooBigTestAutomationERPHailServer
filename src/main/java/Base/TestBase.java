package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class TestBase {
    protected static WebDriver driver;

    public TestBase() throws IOException {
        // Default constructor
    }

    @BeforeSuite
    public void beforeSuite() throws IOException{
        initialization();
    }

    public static void initialization() {
        ChromeOptions options = new ChromeOptions();
        // Setting a custom user-agent
        options.addArguments("user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36");
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://erp.hailmpcs.sa/login");
        String title = driver.getTitle();
        System.out.println(title);

        // Set the zoom level to 70%
        ((JavascriptExecutor) driver).executeScript("document.body.style.zoom='70%'");

        // Introduce a random delay before interacting with the page
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    //@AfterSuite
    public static void tearDown() throws IOException {
        driver.quit();
    }

    // Utility method to introduce a random delay
    public static void randomDelay() {
        Random rand = new Random();
        int delay = rand.nextInt(5) + 1; // Delay between 1 and 5 seconds
        try {
            TimeUnit.SECONDS.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public WebDriver getDriver() {
        return driver;
    }
}
