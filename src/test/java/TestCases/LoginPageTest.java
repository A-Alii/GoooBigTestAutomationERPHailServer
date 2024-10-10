package TestCases;

import Base.TestBase;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.IOException;

public class LoginPageTest extends TestBase {

    public LoginPageTest() throws IOException {
        super();
    }

    LoginPage signUpPage;


    @BeforeMethod
    public void beforeMethod() throws IOException {
        signUpPage = new LoginPage();
    }



    @Test
    public void loginToMyPortal() throws IOException, InterruptedException {
        signUpPage.loginToMyPortal("manager@gmail.com", "Zzz@123456");
        Thread.sleep(2000);
        Assert.assertTrue(signUpPage.userMenuToggleExist(), "User menu toggle not found");
        System.out.println("User menu toggle found");
        signUpPage.clickOnUserMenuToggle();
        String userMenuToggleText = signUpPage.getUserNameLogged();
        System.out.println("User menu toggle text: " + userMenuToggleText);
        Thread.sleep(2000);
        signUpPage.clickOnUserMenuToggle();
        Thread.sleep(2000);
        signUpPage.clickOnMainPage();
    }

}
