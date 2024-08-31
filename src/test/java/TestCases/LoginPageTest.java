package TestCases;

import Base.TestBase;
import Pages.LoginPage;
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
    public void loginToMyPortal() throws IOException {
        signUpPage.loginToMyPortal("gooobig1@tp.net.sa", "Ad0147$#");
    }

}
