package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SingInPage extends BasePage {
    public SingInPage(WebDriver driver) {
        super(driver);
    }

    public String goodEmail = "bartek@gmail.com";
    public String goodPassword = "praktyki";
    public String badEmail = "test";
    public String badPassword = "test";
    public String emptyEmail = "";
    public String emptyPassword = "";

    public By AlreadyRegisteredContainer = By.id("login_form");
    public By emailLabelInAlreadyRegistered = By.xpath("//*[@id=\"login_form\"]/div/div[1]/label");
    public By emailInAlreadyRegistered = By.id("email");
    public By passwordLabelInAlreadyRegistered = By.xpath("//*[@id=\"login_form\"]/div/div[2]/label");
    public By passwordInAlreadyRegistered = By.id("passwd");

    public By userName = By.id("email");
    public By password = By.id("passwd");
    public By loginButton = By.id("SubmitLogin");
    public By forgotPasswordButton = By.xpath("//a[@title='Recover your forgotten password']");
    public By blockWithAlertElement = By.xpath("//*[@class=\"alert alert-danger\"]");
    public By errorMesageTextElement = By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li");

    public By createAnAccountContainer = By.id("create-account_form");
    public By textInCreateAnAccount = By.xpath("//*[@id=\"create-account_form\"]/div/p");
    public By labelInCreateAnAccount = By.xpath("//*[@id=\"create-account_form\"]/div/div[2]/label");
    public By emailCreateElement = By.id("email_create");
    public By buttonCreateAnAccount = By.id("SubmitCreate");

    public SingInPage userLogin (String userEmail, String userPassword){
        writeText(userName, userEmail);
        writeText(password, userPassword);
        clickByElementBy(loginButton);
        return this;
    }

    public SingInPage userLoginWithForgotPassword (String userEmail, String userPassword){
        writeText(userName, userEmail);
        writeText(password, userPassword);
        clickByElementBy(forgotPasswordButton);
        return this;
    }
}