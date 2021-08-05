package Tests;

import Pages.FooterPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FooterTest extends BaseTest {

    //https://xray.tt.com.pl/browse/PRAK-22
    @Test
    public void locatingFooter() {
        FooterPage footerPage = new FooterPage(driver);
        footerPage.openHomePage();
        Assertions.assertTrue(footerPage.isElementPresent(footerPage.footerContainer));
    }

    //https://xray.tt.com.pl/browse/PRAK-51
    @Test
    public void locatingNewsletterAndSocialMediaInFooter() {
        FooterPage footerPage = new FooterPage(driver);
        footerPage.openHomePage();
        Assertions.assertTrue(footerPage.isElementPresent(footerPage.newsletterBlockContainerInFooter));
        Assertions.assertTrue(footerPage.isElementPresent(footerPage.socialBlockContainerInFooter));
    }

    //https://xray.tt.com.pl/browse/PRAK-52
    @Test
    public void locatingElementsNewsletterInFooter() {
        FooterPage footerPage = new FooterPage(driver);
        footerPage.openHomePage();
        if (footerPage.isElementPresent(footerPage.newsletterBlockContainerInFooter)) {
            Assertions.assertTrue(footerPage.isElementPresent(footerPage.textEementInNewsletter));
            Assertions.assertTrue(footerPage.isElementPresent(footerPage.inputEementInNewsletter));
        }
    }

    //https://xray.tt.com.pl/browse/PRAK-54
    @Test
    public void locatingElementsSocialMediaInFooter() {
        FooterPage footerPage = new FooterPage(driver);
        footerPage.openHomePage();
        if (footerPage.isElementPresent(footerPage.socialBlockContainerInFooter)) {
            Assertions.assertTrue(footerPage.isElementPresent(footerPage.textInsocialBlock));
            Assertions.assertTrue(footerPage.isElementPresent(footerPage.facebookInsocialBlock));
            Assertions.assertTrue(footerPage.isElementPresent(footerPage.twitterInsocialBlock));
            Assertions.assertTrue(footerPage.isElementPresent(footerPage.youtubeInsocialBlock));
            Assertions.assertTrue(footerPage.isElementPresent(footerPage.googlePlusInsocialBlock));
        }
    }

  //https://xray.tt.com.pl/browse/PRAK-55
    @Test
    public void locatingElementsCategoriesInFooter() {
        FooterPage footerPage = new FooterPage(driver);
        footerPage.openHomePage();
        if (footerPage.isElementPresent(footerPage.categoriesContainerInFooter)) {
            Assertions.assertTrue(footerPage.isElementPresent(footerPage.headerCategoriesContainer));
            Assertions.assertTrue(footerPage.isElementPresent(footerPage.womenElementCategoriesContainer));
        }
    }

    //https://xray.tt.com.pl/browse/PRAK-56
    @Test
    public void locatingElementsInformationInFooter() {
        FooterPage footerPage = new FooterPage(driver);
        footerPage.openHomePage();
        if (footerPage.isElementPresent(footerPage.informationBlockWithVariousLinksInFooter)) {
            Assertions.assertTrue(footerPage.isElementPresent(footerPage.headerInformationBlockWithVariousLinks));
            Assertions.assertTrue(footerPage.isElementPresent(footerPage.specialsInformationBlockWithVariousLinks));
            Assertions.assertTrue(footerPage.isElementPresent(footerPage.newProductsInformationBlockWithVariousLinks));
            Assertions.assertTrue(footerPage.isElementPresent(footerPage.bestSellersInformationBlockWithVariousLinks));
            Assertions.assertTrue(footerPage.isElementPresent(footerPage.ourStoresInformationBlockWithVariousLinks));
            Assertions.assertTrue(footerPage.isElementPresent(footerPage.contactUsInformationBlockWithVariousLinks));
            Assertions.assertTrue(footerPage.isElementPresent(footerPage.termsAndConditionsOfUseInformationBlockWithVariousLinks));
            Assertions.assertTrue(footerPage.isElementPresent(footerPage.aboutUsInformationBlockWithVariousLinks));
            Assertions.assertTrue(footerPage.isElementPresent(footerPage.sitemapInformationBlockWithVariousLinks));
        }
    }

    //https://xray.tt.com.pl/browse/PRAK-57
    @Test
    public void locatingElementsMyAccountInFooter() {
        FooterPage footerPage = new FooterPage(driver);
        footerPage.openHomePage();
        if (footerPage.isElementPresent(footerPage.myAccountContainerInFooter)) {
            Assertions.assertTrue(footerPage.isElementPresent(footerPage.headerMyAccountContainerInFooter));
            Assertions.assertTrue(footerPage.isElementPresent(footerPage.myOrdersMyAccountContainer));
            Assertions.assertTrue(footerPage.isElementPresent(footerPage.myCreditSlipsMyAccountContainer));
            Assertions.assertTrue(footerPage.isElementPresent(footerPage.myAddressesMyAccountContainer));
            Assertions.assertTrue(footerPage.isElementPresent(footerPage.personalInformationMyAccountContainer));
        }
    }

    //https://xray.tt.com.pl/browse/PRAK-165
    @Test
    public void locatingElementsStoreInformationInFooter() {
        FooterPage footerPage = new FooterPage(driver);
        footerPage.openHomePage();
        if (footerPage.isElementPresent(footerPage.storeInformationContainerInFooter)) {
            Assertions.assertTrue(footerPage.isElementPresent(footerPage.headerStoreInformationContainer));
            Assertions.assertTrue(footerPage.isElementPresent(footerPage.storeInformationContainer));
            Assertions.assertTrue(footerPage.isElementPresent(footerPage.phoneElementsInStoreInformationContainer));
            Assertions.assertEquals(footerPage.readText(footerPage.phoneNumberElementsStoreInformationContainer), footerPage.phoneNumberStoreInformationContainer);

            Assertions.assertTrue(footerPage.isElementPresent(footerPage.emailElementsInStoreInformationContainer));
            Assertions.assertEquals(footerPage.readText(footerPage.emailTextInEmailStoreInformationContainer), footerPage.emailStoreInformationContainer);
        }
    }

    //https://xray.tt.com.pl/browse/PRAK-58
    @Test
    public void locatingSignatureAndReservedSignInFooter() {
        FooterPage footerPage = new FooterPage(driver);
        footerPage.openHomePage();
        if (footerPage.isElementPresent(footerPage.signatureOfPageInFooter)) {
            Assertions.assertTrue(footerPage.isElementPresent(footerPage.yearSignatureOfPageInFooter));
            Assertions.assertTrue(footerPage.isElementPresent(footerPage.textSignatureOfPageInFooter));
            Assertions.assertEquals(footerPage.readText(footerPage.yearSignatureOfPageInFooter), footerPage.textYearSignatureOfPageInFooter);
        }
    }

    //https://xray.tt.com.pl/browse/PRAK-20
    @Test
    public void locatingWebsiteInformation () {
        FooterPage footerPage = new FooterPage(driver);
        footerPage.openHomePage();
        if (footerPage.isElementPresent(footerPage.storeInformationContainerInFooter)) {
            Assertions.assertTrue(footerPage.isElementPresent(footerPage.headerStoreInformationContainer)); //!
            Assertions.assertTrue(footerPage.isElementPresent(footerPage.storeInformationContainer));
            Assertions.assertTrue(footerPage.isElementPresent(footerPage.phoneElementsInStoreInformationContainer));
            Assertions.assertEquals(footerPage.readText(footerPage.phoneNumberElementsStoreInformationContainer), footerPage.phoneNumberStoreInformationContainer);

            Assertions.assertTrue(footerPage.isElementPresent(footerPage.emailElementsInStoreInformationContainer));
            Assertions.assertEquals(footerPage.readText(footerPage.emailTextInEmailStoreInformationContainer), footerPage.emailStoreInformationContainer);
        }
    }
}
