package Pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage{
//    public HomePage(WebDriver driver) {
//        super(driver);
//    }

    public HomePage(WebDriver driver){ //a gdyby funkcja zwracająca wszystkie klasy wyżej?
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="slider_row") //1/2 strony górna
    WebElement mainSliderRowElement;
    @FindBy(id="homepage-slider") //ruszający
    WebElement carouselOfPictures;
    @FindBy(id="htmlcontent_top") //małe komplet
    WebElement twoLittlePicturesInSliderRow;
    @FindBy(xpath="//*[@id=\"htmlcontent_top\"]/ul/li[1]") //1 mały
    WebElement firstLittlePicturesInSliderRow;
    @FindBy(xpath="//*[@id=\"htmlcontent_top\"]/ul/li[2]") //2  mały
    WebElement secondLittlePicturesInSliderRow;

    @FindBy(id="columns") //cała strona
    WebElement mainHomePageContainer;

    @FindBy(id="center_column") WebElement centerColumn; //1/2 strony dolna
    @FindBy(id="home-page-tabs") WebElement homePageTabs; //elemen na którym jest popular i best
    @FindBy(id="homefeatured") WebElement homeFeatured; //zbiera obrazki z ciuchami. spr czy lista ma 7 elementów
    @FindBy(id="blockbestsellers") public WebElement blockbestsellers; //zbiera obrazki bestsellers
    @FindBy(id="htmlcontent_home") public WebElement  homeContent; //mix zdjęć
    @FindBy(xpath="//*[@id=\"htmlcontent_home\"]/ul/li[1]") public WebElement firstElementInHomeContent;
    @FindBy(xpath="//*[@id=\"htmlcontent_home\"]/ul/li[2]") public WebElement secondElementInHomeContent;
    @FindBy(xpath="//*[@id=\"htmlcontent_home\"]/ul/li[3]") public WebElement thirdElementInHomeContent;
    @FindBy(xpath="//*[@id=\"htmlcontent_home\"]/ul/li[4]") public WebElement fourthElementInHomeContent;
    @FindBy(xpath="//*[@id=\"htmlcontent_home\"]/ul/li[5]") public WebElement fifthElementInHomeContent;


    @FindBy(id="facebook_block") public WebElement facebookBlock;
    @FindBy(id="cmsinfo_block") public WebElement cmsinfoBlock;
    @FindBy(xpath="//*[@id=\"cmsinfo_block\"]/div[1]/ul/li[1]") public WebElement inTheLeftBlock;
    @FindBy(xpath="//*[@id=\"cmsinfo_block\"]/div[1]") public WebElement comeVisitUsBlock;
    @FindBy(xpath="// *[@id=\"cmsinfo_block\"]/div[1]/ul/li[2]") public WebElement callUsBlock;
    @FindBy(xpath="//*[@id=\"cmsinfo_block\"]/div[1]/ul/li[3]") public WebElement howToPayDuesBlock;


    @FindBy(xpath="//*[@id=\"cmsinfo_block\"]/div[2]") public WebElement customerBlock;

    @FindBy(id="editorial_block_center") public WebElement editorialBlockCenter;

    @FindBy(xpath = "//*[@id=\"editorial_block_center\"]/h1") public WebElement headerInAutomationPracticeWebsite;
    @FindBy(id="icon-truck") public WebElement iconTruck;
    @FindBy(xpath = "//*[@id=\"cmsinfo_block\"]/div[1]/ul/li[1]/div/h3") public WebElement headerComeVisitUs;

    @FindBy(id="icon-phone") public WebElement iconPhone;
    @FindBy(xpath = "//*[@id=\"cmsinfo_block\"]/div[1]/ul/li[2]/div/h3") public WebElement headerCallUs;
    @FindBy(xpath = "//*[@id=\"cmsinfo_block\"]/div[1]/ul/li[2]/div/p/a ") public WebElement buttonSeleniumFramework;

    @FindBy(id="icon-credit-card") public WebElement iconCreditCard;
    @FindBy(xpath = "//*[@id=\"cmsinfo_block\"]/div[1]/ul/li[3]/div/h3") public WebElement headerHowToPayDues;


    @FindBy(xpath="//*[@id=\"home-page-tabs\"]/li[1]/a") //popular
    public WebElement popular;

    @FindBy(xpath="//*[@id=\"home-page-tabs\"]/li[2]/a") //best
    public WebElement bestSellers;

    public void visibleWebElement (WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
        Assertions.assertTrue(element.isDisplayed());
    }

    //Write Text
    public void writeTextForWebElement (WebElement element, String text){
        wait.until(ExpectedConditions.visibilityOf(element));
        driver.findElement((By)element).sendKeys(text);
    }

    //Read Text
    public String readTextForWebElement (WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
        return driver.findElement((By)element).getText();
    }
}
