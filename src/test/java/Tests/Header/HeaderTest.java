package Tests.Header;

import Pages.HeaderPage;
import Tests.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class HeaderTest extends BaseTest {

    public void assertTrue (By elementBY){
        HeaderPage headerPage = new HeaderPage(driver);
        Assertions.assertTrue(headerPage.isElementPresent(elementBY));
    }

    @Test
    public void locatingElementsInHeader(){
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.openHomePage();
        if (headerPage.isElementPresent(headerPage.headerContainer)) {
            assertTrue(headerPage.bannerInContainer);
            assertTrue(headerPage.navInContainer);
            assertTrue(headerPage.containerInContainer);
        }
    }

    //https://xray.tt.com.pl/browse/PRAK-60
    @Test
    public void locatingContainerInContainerAndClick(){
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.openHomePage();
        if(headerPage.isElementPresent(headerPage.hrefBannerInContainer)){
            headerPage.clickByElementBy(headerPage.hrefBannerInContainer);
            headerPage.assertEqualsForExpectedUML(headerPage.bannerUML);
        }
    }

    //https://xray.tt.com.pl/browse/PRAK-28
    @Test
    public void locatingElementsInNav() {
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.openHomePage();
        if (headerPage.isElementPresent(headerPage.singInInNav)) {
            if (headerPage.isElementPresent(headerPage.concactInNav)) {
                assertTrue(headerPage.iconInShopPhone);
                assertTrue(headerPage.textInShopPhone);
                assertTrue(headerPage.shopPhoneInNav);
                Assertions.assertEquals(headerPage.readText(headerPage.phoneNumberInShopPhone), "0123-456-789");
            }
        }
    }

    //https://xray.tt.com.pl/browse/PRAK-18
    @Test
    public void locatingSearchBoxInContainer(){
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.openHomePage();
        assertTrue(headerPage.searchBoxInContainer);
    }

    //https://xray.tt.com.pl/browse/PRAK-19
    @Test
    public void locatingLogoInContainer(){
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.openHomePage();
        assertTrue(headerPage.logoInContainer);
        headerPage.clickByElementBy(headerPage.logoInContainer);
        headerPage.assertEqualsForExpectedUML(headerPage.logoUML);
    }

    //https://xray.tt.com.pl/browse/PRAK-29
    @Test
    public void locatingTheElementsOfTheLowerContainerInHeader(){
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.openHomePage();
        if (headerPage.isElementPresent(headerPage.categoriesContainerInContainer)) {
            assertTrue(headerPage.womenInCategories);
            assertTrue(headerPage.dressesInCategories);
            assertTrue(headerPage.tshirtsInCategories);
            assertTrue(headerPage.hrefCartContainerInContainer);
            assertTrue(headerPage.logoInContainer);
            if(headerPage.isElementPresent(headerPage.searchTextInContainer)) {
                assertTrue(headerPage.searchButtonInContainer);
            }
        }
    }

    //https://xray.tt.com.pl/browse/PRAK-21
    @Test
    public void locatingElementInClothingCategories(){
        HeaderPage headerPage = new HeaderPage(driver);
        Actions action = new Actions(driver);
        headerPage.openHomePage();
        if(headerPage.isElementPresent(headerPage.womenInCategories)){
            action.moveToElement(driver.findElement(headerPage.womenInCategories)).perform();
            assertTrue(headerPage.topsInWomen);
            assertTrue(headerPage.tshirtsElementInTopsInWomen);
            assertTrue(headerPage.blousesElementInTopsInWomen);
            assertTrue(headerPage.dressesInWomen);
            assertTrue(headerPage.casualDressesElementDressesInWomen);
            assertTrue(headerPage.eveningDressesElementDressesInWomen);
            assertTrue(headerPage.summerDressesElementDressesInWomen);

            if (headerPage.isElementPresent(headerPage.dressesInCategories)) {
                action.moveToElement(driver.findElement(headerPage.dressesInCategories)).perform();
                assertTrue(headerPage.casualDressesElementInDresses);
                assertTrue(headerPage.eveningDressesElementInDresses);
                assertTrue(headerPage.summerDressesElementInDresses);

                if (headerPage.isElementPresent(headerPage.tshirtsInCategories)) {
                    action.moveToElement(driver.findElement(headerPage.tshirtsInCategories)).perform();
                }
            }
        }
    }
}
