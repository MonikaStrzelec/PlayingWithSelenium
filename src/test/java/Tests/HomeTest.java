package Tests;

import Pages.HeaderPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeTest extends BaseTest{

    @Test
    public void locationOfThreeElementContainerWithPictures () {
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.openHomePage();
        HeaderPage homePage = PageFactory.initElements(driver, HeaderPage.class);
    }

    @Test
    public void locationOfPageCenterColumn () {
    }

    @Test
    public void  locationForPopularAndBestSellers () {

    }

    @Test
    public void locationOfProductsInAreaOfPopular () {
    }

    @Test
    public void LocatingTheRootContainerOfHomePage () {
    }

    @Test
    public void locationHomeContainer () {
    }

    @Test
    public void locatingHomeContainerItems1_2_3 () {
    }

    @Test
    public void locatingHomeContainerItems4_5 () {
    }

    @Test
    public void locationGrayItemBelowHomeContainer () {
    }

    @Test
    public void locatingWebsiteInformation () {
    }

    @Test
    public void displayOfInfoBlock () {
    }

    @Test
    public void locationOfEditorialBlock () {
    }

}
