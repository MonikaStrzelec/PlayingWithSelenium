package Tests;

import Pages.HeaderPage;
import Pages.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class HomeTest extends BaseTest{

    @Test
    public void locationOfThreeElementContainerWithPictures () {

    }

    @Test
    public void locationOfPageCenterColumn () {

    }

    @Test
    public void  locationForPopularAndBestSellers () {
        HomePage homePage = new HomePage(driver);
        homePage.openHomePage();
        Assertions.assertAll(
                ()->homePage.visibleWebElement(homePage.popular),
                ()->homePage.visibleWebElement(homePage.bestSellers)
        );
    }

    @Test
    public void locationOfProductsInAreaOfPopular () {
        HomePage homePage = new HomePage(driver);
        homePage.openHomePage();
        homePage.visibleWebElement(homePage.allElementWithPhoto);
        homePage.visibleWebElement(homePage.photoInAllElementInAllElementWithPhoto);
        homePage.visibleWebElement(homePage.allTextBelowPhotoInAllElementWithPhoto);
        homePage.visibleWebElement(homePage.photoCaptionWithProduct);
        homePage.visibleWebElement(homePage.priceForProductInAllElementWithPhoto);

        //homePage.visibleWebElement(homePage.buttonAddToCardInAllElementWithPhoto);
        //homePage.visibleWebElement(homePage.buttonMoreInAllElementWithPhoto);

    }

    @Test
    public void LocatingTheRootContainerOfHomePage () {

    }

    @Test
    public void locationHomeContent () {
        HomePage homePage = new HomePage(driver);
        homePage.openHomePage();
        homePage.visibleWebElement(homePage.homeContent);
    }

    @Test
    public void locatingHomeContentWithItems1_2_3 () {
        HomePage homePage = new HomePage(driver);
        homePage.openHomePage();
        Assertions.assertAll(
                ()->homePage.visibleWebElement(homePage.homeContent),
                ()->homePage.visibleWebElement(homePage.firstElementInHomeContent),
                ()->homePage.visibleWebElement(homePage.secondElementInHomeContent),
                ()->homePage.visibleWebElement(homePage.thirdElementInHomeContent)
        );
    }

    @Test
    public void locatingHomeContentWithItems4_5 () {
        HomePage homePage = new HomePage(driver);
        homePage.openHomePage();
        Assertions.assertAll(
                ()->homePage.visibleWebElement(homePage.homeContent),
                ()->homePage.visibleWebElement(homePage.fourthElementInHomeContent),
                ()->homePage.visibleWebElement(homePage.fifthElementInHomeContent)
        );
    }

    @Test
    public void locationGrayItemBelowHomeContainer () {
        HomePage homePage = new HomePage(driver);
        homePage.openHomePage();
        Assertions.assertAll(
                ()->homePage.visibleWebElement(homePage.facebookBlock),
                ()->homePage.visibleWebElement(homePage.cmsinfoBlock),

                ()->homePage.visibleWebElement(homePage.inTheLeftBlock),
                ()->homePage.visibleWebElement(homePage.comeVisitUsBlock),
                ()->homePage.visibleWebElement(homePage.callUsBlock),
                ()->homePage.visibleWebElement(homePage.howToPayDuesBlock),

                ()->homePage.visibleWebElement(homePage.customerBlock)
        );
    }

    @Test
    public void displayOfInfoBlock () {
        HomePage homePage = new HomePage(driver);
        homePage.openHomePage();
        Assertions.assertAll(
                ()->homePage.visibleWebElement(homePage.facebookBlock),

                ()->homePage.visibleWebElement(homePage.cmsinfoBlock),

                ()->homePage.visibleWebElement(homePage.inTheLeftBlock),
                ()->homePage.visibleWebElement(homePage.comeVisitUsBlock),
                ()->homePage.visibleWebElement(homePage.iconTruck),
                ()->homePage.visibleWebElement(homePage.headerComeVisitUs),//text porównać

                ()->homePage.visibleWebElement(homePage.callUsBlock),
                ()->homePage.visibleWebElement(homePage.iconPhone),
                ()->homePage.visibleWebElement(homePage.headerCallUs), //text porównać
                ()->homePage.visibleWebElement(homePage.buttonSeleniumFramework),

                ()->homePage.visibleWebElement(homePage.howToPayDuesBlock),
                ()->homePage.visibleWebElement(homePage.iconCreditCard),
                ()->homePage.visibleWebElement(homePage.headerHowToPayDues),//text porównać

                ()->homePage.visibleWebElement(homePage.customerBlock) //text
        );
    }

    @Test
    public void locationOfEditorialBlock () {
        HomePage homePage = new HomePage(driver);
        homePage.openHomePage();
        Assertions.assertAll(
                ()->homePage.visibleWebElement(homePage.editorialBlockCenter),
                ()->homePage.visibleWebElement(homePage.headerInAutomationPracticeWebsite)
        );
    }
}
