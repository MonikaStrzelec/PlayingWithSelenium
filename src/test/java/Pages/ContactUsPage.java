package Pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactUsPage extends BasePage{

    public ContactUsPage(WebDriver driver) {
        super(driver);
    }

    public By contactUsContainer = By.id("columns");

    public By breadcrumbClearfix = By.xpath("//*[@id=\"columns\"]/div[1]"); //nazwa...
    public By ReturnToHomeElement = By.xpath("//a[@title='Return to Home']");

    public By centerColumnInContactsUs = By.id("center_column");

    public By containerInContainer = By.xpath("//*[@id=\"center_column\"]/h1");
    public By headreSendAMessege = By.xpath("//*[@id=\"center_column\"]/form/fieldset/h3");


    public By headerSubjectHeadingElement = By.id("id_contact");
    public By subjectHeadingElement = By.id("uniform-id_contact");

    public By chooseInSubjectHeading = By.xpath("//*[@id='id_contact']/option[1]");
    public By customerServiceInSubjectHeading = By.xpath("//*[@id='id_contact']/option[2]");
    public By webmasterInSubjectHeading = By.xpath("//*[@id='id_contact']/option[3]");


    public By emailElement = By.id("email");

    public By orderReferenceElement = By.id("id_order");

    public By attachFileallElement = By.id("uniform-fileUpload");
    //public By header1 = By.id("fileUpload");
    public By textAttachFileallElement = By.xpath("//*[@id=\"uniform-fileUpload\"]/span[1]");
    public By buttonAttachFileallElement = By.xpath("//*[@id=\"uniform-fileUpload\"]/span[2]");

    public By messageElement = By.id("message");
    public By buttonMessage = By.id("submitMessage");


    public String goodEmail = "bartek@gmail.com";
    public String goodOrderReference = "test";
    public String goodMessage = "Test wysyłania e-maila.";

    public String badEmail = "test";

    public String emptyEmail = "";
    public String emptyOrderReference = "";
    public String emptyMessage = "";


//    public By placeholderInSubjectHeading = By.id("desc_contact0");
//    public By firstSubjectHeading = By.id("desc_contact2");
//    public By secondtSubjectHeading = By.id("desc_contact1");

    public By alertDanger = By.xpath("//*[@id=\"center_column\"]/div");
    public By alertSuccess = By.xpath("//*[@id=\"center_column\"]/p");

    public WebElement uploadFileInput = driver.findElement(By.cssSelector("input[type='file']"));
    public String testEmailExpectedFileName = "testEmail.txt";


    public ContactUsPage addAttachFileselect(String expectFileName){
        String inputFile = "D:\\PageAutomationpractice\\src\\main\\resources\\" + expectFileName;
        uploadFileInput.sendKeys(inputFile);
        String actualFileNameElement = driver.findElement(By.cssSelector("span[class='filename']")).getText();
        Assertions.assertEquals(expectFileName, actualFileNameElement);
        return this;
    }

    public ContactUsPage selectItemFromSubjectHeading (By elementBy){
        //isElementPresent(headerSubjectHeadingElement);
        isElementPresent(subjectHeadingElement);
        clickByElementBy(subjectHeadingElement);
        waitForElementVisibility(elementBy);
        clickByElementBy(elementBy);
        return this;
    }

    public ContactUsPage contactUsDetails (String userEmail, String userOrderReference, String userMessage){
        writeText(emailElement, userEmail);
        writeText(orderReferenceElement, userOrderReference);
        writeText(messageElement, userMessage);
        clickByElementBy(buttonMessage);
        return this;
    }
}
