package Pages;

import Base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;

public class LoginPage extends TestBase {

    public LoginPage() throws IOException {
        PageFactory.initElements(driver, this);
    }

    JavascriptExecutor js =( (JavascriptExecutor) driver);
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));


    @FindBy(xpath = "//*[@id=\"_signup-button_dp4vo_1\"]")
    WebElement subButton;
    public void clickOnSubButton(){
        randomDelay();
        subButton.click();
    }
    @FindBy(xpath = "//*[@id=\"document-body\"]/div[2]/section/div[2]/div[2]/a")
    WebElement ContinueButtonPaypal;
    public void clickOnContinueButtonPaypal(){
        randomDelay();
        wait.until(ExpectedConditions.visibilityOf(ContinueButtonPaypal));
        js.executeScript("arguments[0].scrollIntoView(true);", ContinueButtonPaypal);
        js.executeScript("arguments[0].click()", ContinueButtonPaypal);
        //ContinueButton.click();
    }

    @FindBy(xpath = "//*[@id=\"paypalAccountData_email\"]")
    WebElement EmailInputPaypal;
    public void sendKeys_EmailPaypal(String email){
        randomDelay();
        wait.until(ExpectedConditions.visibilityOf(EmailInputPaypal));
        EmailInputPaypal.sendKeys(email);
    }

    // Example method to click an element with a random delay
    public static void clickElementWithDelay(WebElement element) {
        randomDelay();
        element.click();
    }

    // Example method to send keys with a random delay
    public static void sendKeysWithDelay(WebElement element, String keys) {
        randomDelay();
        element.sendKeys(keys);
    }

    @FindBy(xpath = "//*[@id=\"paypalAccountData_submit\"]")
    WebElement ContinueButtonPaypal2;
    public void clickOnContinueButtonPaypal2(){
        randomDelay();
        ContinueButtonPaypal2.click();
    }
    @FindBy(xpath = "//*[@id=\"dropdownMenuButton_paypalAccountData_phoneCountryCode\"]")
    WebElement PhoneInputPaypal;

    public boolean PhoneInputPaypalExist(){
        randomDelay();
        wait.until(ExpectedConditions.visibilityOf(PhoneInputPaypal));
        return PhoneInputPaypal.isDisplayed();
    }

    public void clickOnChangeCode(){
        randomDelay();
        wait.until(ExpectedConditions.visibilityOf(PhoneInputPaypal));
        PhoneInputPaypal.click();
    }

    @FindBy(xpath = "//*[@id=\"smenu_item_380\"]")
    WebElement code;

    public void selectCode(){
        randomDelay();
        wait.until(ExpectedConditions.visibilityOf(PhoneInputPaypal));
        code.click();
    }

    @FindBy(xpath = "//*[@id=\"paypalAccountData_phone\"]")
    WebElement sendDataToPhone;
    public void sendKeys_Phone(String phone){
        //randomDelay();
        sendDataToPhone.click();
        sendDataToPhone.clear();
        sendDataToPhone.sendKeys(phone);
    }

    @FindBy(xpath = "//*[@id=\"checkbox\"]")
    WebElement checkbox;

    public boolean isCheckBoxDisplay(){
        try {
            // Check if the checkbox is displayed
            return checkbox.isDisplayed();
        } catch (NoSuchElementException e) {
            // Element not found, return false
            return false;
        } catch (Exception e) {
            // Handle any other exceptions that may occur and return false
            e.printStackTrace();
            return false;
        }
    }



    @FindBy(xpath = "//*[@id=\"app-element-mountpoint\"]/div/div/div[1]/main/div/div/div[1]/div")
    WebElement alert;

    public boolean isAlertDisplay(){
        try {
            // Check if the checkbox is displayed
            return alert.isDisplayed();
        } catch (NoSuchElementException e) {
            // Element not found, return false
            return false;
        } catch (Exception e) {
            // Handle any other exceptions that may occur and return false
            e.printStackTrace();
            return false;
        }
    }

    @FindBy(xpath = "//*[@id=\"paypalAccountData_submit\"]")
    WebElement ContinueButtonPaypal3;

    public void clickOnContinueButtonPaypal3(){
        //randomDelay();
        ContinueButtonPaypal3.click();
    }
    @FindBy(xpath = "/html/body/div[3]/div/div[2]/article/header/div[3]/button")
    WebElement cancelButton;
    public void clickOnCancelButton(){
        //randomDelay();
        //wait.until(ExpectedConditions.visibilityOf(cancelButton));
        cancelButton.click();
    }

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")
    WebElement signup_login;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]")
    WebElement NameInput;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")
    WebElement EmailInput;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[3]/div/form/button")
    WebElement SignUpButton;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div/div[1]/h2/b")
    WebElement EnterIsVisible;

    @FindBy(id = "id_gender1")
    WebElement TitleCheckBox;

    @FindBy(xpath = "//*[@id=\"password\"]")
    WebElement PasswordFieldSendKeys;

    @FindBy(id = "days")
    private WebElement dayDropdown;

    @FindBy(id = "months")
    private WebElement monthDropdown;

    @FindBy(id = "years")
    private WebElement yearDropdown;

    @FindBy(xpath = "//*[@id=\"newsletter\"]")
    WebElement NewsletterCheckBox;

    @FindBy(xpath = "//*[@id=\"optin\"]")
    WebElement ReceiveCheckBox;


    @FindBy(xpath = "//*[@id=\"first_name\"]")
    WebElement FirstName;

    @FindBy(xpath = "//*[@id=\"last_name\"]")
    WebElement LastName;

    //*[@id="company"]
    @FindBy(xpath = "//*[@id=\"company\"]")
    WebElement Company;

    @FindBy(xpath = "//*[@id=\"address1\"]")
    WebElement Address1;

    @FindBy(xpath = "//*[@id=\"address2\"]")
    WebElement Address2;

    @FindBy(xpath = "//*[@id=\"country\"]")
    private WebElement CountryDropDown;

    @FindBy(xpath = "//*[@id=\"state\"]")
    WebElement State;

    @FindBy(xpath = "//*[@id=\"city\"]")
    WebElement City;

    @FindBy(xpath = "//*[@id=\"zipcode\"]")
    WebElement ZipCode;

    @FindBy(xpath = "//*[@id=\"mobile_number\"]")
    WebElement MobileNumber;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div/div[1]/form/button")
    WebElement CreateAccountButton;

    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")
    WebElement LogOut;


    public void clicksignup_login() throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(signup_login));
        //js.executeScript("arguments[0].scrollIntoView(true);", signup_login);
        js.executeScript("arguments[0].click()", signup_login);
    }

    public void sendKeys_name(String name) throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(NameInput));
        //js.executeScript("arguments[0].scrollIntoView(true);", NameInput);
        NameInput.sendKeys(name);
    }

    public void sendKeys_email(String email) throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(EmailInput));
        //js.executeScript("arguments[0].scrollIntoView(true);", EmailInput);
        EmailInput.sendKeys(email);
    }

    public void sendKeys_Password(String password) throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(PasswordFieldSendKeys));
        //js.executeScript("arguments[0].scrollIntoView(true);", PasswordFieldSendKeys);
        PasswordFieldSendKeys.sendKeys(password);
    }

    public void ClickSignUpButton() throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(SignUpButton));
        js.executeScript("arguments[0].scrollIntoView(true);", SignUpButton);
        js.executeScript("arguments[0].click()", SignUpButton);
    }

    public void TitleCheckBoxClick() throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(TitleCheckBox));
        js.executeScript("arguments[0].scrollIntoView(true);", TitleCheckBox);
        js.executeScript("arguments[0].click()", TitleCheckBox);
    }

    public void BirthDate(String day, String month, String year) throws InterruptedException{
        Select daySelect = new Select(dayDropdown);
        daySelect.selectByVisibleText(day);

        Select monthSelect = new Select(monthDropdown);
        monthSelect.selectByVisibleText(month);

        Select yearSelect = new Select(yearDropdown);
        yearSelect.selectByVisibleText(year);
    }

    public void NewsLetterCheckBox() throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(NewsletterCheckBox));
        //js.executeScript("arguments[0].scrollIntoView(true);", NewsletterCheckBox);
        js.executeScript("arguments[0].click()", NewsletterCheckBox);
    }

    public void ReceiveOfferCheckBox() throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(ReceiveCheckBox));
        js.executeScript("arguments[0].scrollIntoView(true);", ReceiveCheckBox);
        js.executeScript("arguments[0].click()", ReceiveCheckBox);
    }

    public void sendKeys_FName(String FName) throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(FirstName));
        js.executeScript("arguments[0].scrollIntoView(true);", FirstName);
        FirstName.sendKeys(FName);
    }
    public void sendKeys_LName(String LName) throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(LastName));
        js.executeScript("arguments[0].scrollIntoView(true);", LastName);
        LastName.sendKeys(LName);
    }
    public void sendKeys_Company(String comp) throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(Company));
        js.executeScript("arguments[0].scrollIntoView(true);", Company);
        Company.sendKeys(comp);
    }

    public void sendKeys_Address1(String address) throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(Address1));
        //js.executeScript("arguments[0].scrollIntoView(true);", Address1);
        Address1.sendKeys(address);
    }

    public void sendKeys_Address2(String address2) throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(Address2));
        //js.executeScript("arguments[0].scrollIntoView(true);", Address2);
        Address2.sendKeys(address2);
    }

    public void CountryDropDown(String country) throws InterruptedException{
        Select countrySelect = new Select(CountryDropDown);
        countrySelect.selectByVisibleText(country);
    }

    public void sendKeys_State(String state) throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(State));
        js.executeScript("arguments[0].scrollIntoView(true);", State);
        State.sendKeys(state);
    }

    public void sendKeys_City(String city) throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(City));
        js.executeScript("arguments[0].scrollIntoView(true);", City);
        City.sendKeys(city);
    }

    public void sendKeys_ZipCode(String zipcode) throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(ZipCode));
        //js.executeScript("arguments[0].scrollIntoView(true);", ZipCode);
        ZipCode.sendKeys(zipcode);
    }

    public void sendKeys_MobileNumber(String mobile) throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(MobileNumber));
        //js.executeScript("arguments[0].scrollIntoView(true);", MobileNumber);
        MobileNumber.sendKeys(mobile);
    }

    public void ClickCreateAccountButton() throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(CreateAccountButton));
        //js.executeScript("arguments[0].scrollIntoView(true);", CreateAccountButton);
        js.executeScript("arguments[0].click()", CreateAccountButton);
    }



    public boolean EnterAccountIsExist(){
        return EnterIsVisible.isDisplayed();
    }

    public String EnterAccountTitle(){
        return EnterIsVisible.getText();
    }


    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div/h2/b")
    WebElement AccountCreatedVisible;

    public boolean AccountCreatedVisibleExist(){
        return AccountCreatedVisible.isDisplayed();
    }

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div/div/a")
    WebElement ContinueButton;

    public void ClickContinueButton() throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(ContinueButton));
        //js.executeScript("arguments[0].scrollIntoView(true);", ContinueButton);
        js.executeScript("arguments[0].click()", ContinueButton);
    }


    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a")
    WebElement DeleteAccount;

    public void ClickDeleteAcount() throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(DeleteAccount));
        //js.executeScript("arguments[0].scrollIntoView(true);", DeleteAccount);
        js.executeScript("arguments[0].click()", DeleteAccount);
    }

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div/div/a")
    WebElement DeleteAccountContinueButton;

    public void ClickDeleteAccountContinueButton() throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(DeleteAccountContinueButton));
        //js.executeScript("arguments[0].scrollIntoView(true);", DeleteAccountContinueButton);
        js.executeScript("arguments[0].click()", DeleteAccountContinueButton);
    }

    public void ClickLogOutAccountContinueButton() throws InterruptedException{
        wait.until(ExpectedConditions.visibilityOf(LogOut));
        //js.executeScript("arguments[0].scrollIntoView(true);", LogOut);
        js.executeScript("arguments[0].click()", LogOut);
    }


    @FindBy(xpath = "//input[@placeholder='Username']")
    WebElement userName;
    @FindBy(id = "passwordInput")
    WebElement password;
    @FindBy(id = "passwordControl")
    WebElement passwordControl;
    @FindBy(xpath = "//input[@type='checkbox']")
    WebElement rememberMe;
    @FindBy(id = "login-submit")
    WebElement loginButton;

    public void loginToMyPortal(String name, String pass){
        userName.click();
        userName.sendKeys(name);
        password.click();
        password.sendKeys(pass);
        passwordControl.click();
        rememberMe.click();
        loginButton.click();
    }

    @FindBy(id = "kt_header_user_menu_toggle")
    WebElement userMenuToggle;
    @FindBy(xpath = "//div[contains(@class, 'fw-bold') and contains(@class, 'd-flex') and contains(@class, 'align-items-center') and contains(@class, 'fs-5')]")
    WebElement UserNameLogged;

    public boolean userMenuToggleExist(){
        wait.until(ExpectedConditions.visibilityOf(userMenuToggle));
        return userMenuToggle.isDisplayed();
    }
    public void clickOnUserMenuToggle(){
        userMenuToggle.click();
    }
    public String getUserNameLogged(){
        wait.until(ExpectedConditions.visibilityOf(UserNameLogged));
        return UserNameLogged.getText();
    }

    @FindBy(xpath = "//span[@class='menu-title']")
    WebElement MainPage;
    public void clickOnMainPage(){
        MainPage.click();
    }




}
