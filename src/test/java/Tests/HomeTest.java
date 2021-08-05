package Tests;

import Pages.HomePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomeTest extends BaseTest{

    @Test
    public void locationOfThreeElementContainerWithPictures () {

    }

    @Test
    public void locationOfPageCenterColumn () {

    }

//https://xray.tt.com.pl/browse/PRAK-33
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

    //https://xray.tt.com.pl/browse/PRAK-45
    @Test
    public void locationHomeContent () {
        HomePage homePage = new HomePage(driver);
        homePage.openHomePage();
        homePage.visibleWebElement(homePage.homeContent);
    }

//https://xray.tt.com.pl/browse/PRAK-46
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

//https://xray.tt.com.pl/browse/PRAK-59
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

    //https://xray.tt.com.pl/browse/PRAK-47
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

//https://xray.tt.com.pl/browse/PRAK-49
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

//https://xray.tt.com.pl/browse/PRAK-50
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
