package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
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
    @FindBy(id="htmlcontent_home") WebElement htmlContentHome; //mix zdjęć
    @FindBy(id="facebook_block") WebElement facebookBlock; //szare FB
    @FindBy(id="cmsinfo_block ") WebElement cmsinfoBlock; //szare po prawo
    @FindBy(id="editorial_block_center") WebElement editorialBlockCenter; //Automation Practice Website na dole i text


    @FindBy(xpath="//*[@id=\"home-page-tabs\"]/li[1]/a") //popular
    public WebElement popular;

    @FindBy(xpath="//*[@id=\"home-page-tabs\"]/li[2]/a") //best
    public WebElement bestSellers;



//    @FindBy(id="slider_row")
//    public WebElement mainSliderRowElement;
//
//    @FindBy(id="homefeatured")
//    public WebElement homeFeatured;
//
//    @FindBy(id="slider_row")
//    public WebElement mainSliderRowElement;
//
//    @FindBy(id="homefeatured")
//    public WebElement homeFeatured;
//
//    @FindBy(id="slider_row")
//    public WebElement mainSliderRowElement;
}
