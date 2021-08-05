package Tests;

import Pages.FooterPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FooterTest extends BaseTest {

    @Test
    public void locatingFooter() {
        FooterPage footerPage = new FooterPage(driver);
        footerPage.openHomePage();
        Assertions.assertTrue(footerPage.isElementPresent(footerPage.footerContainer));
    }

    @Test
    public void locatingNewsletterAndSocialMediaInFooter() {
        FooterPage footerPage = new FooterPage(driver);
        footerPage.openHomePage();
        Assertions.assertTrue(footerPage.isElementPresent(footerPage.newsletterBlockContainerInFooter));
        Assertions.assertTrue(footerPage.isElementPresent(footerPage.socialBlockContainerInFooter));
    }

    @Test
    public void locatingElementsNewsletterInFooter() {
        FooterPage footerPage = new FooterPage(driver);
        footerPage.openHomePage();
        if (footerPage.isElementPresent(footerPage.newsletterBlockContainerInFooter)) {
            Assertions.assertTrue(footerPage.isElementPresent(footerPage.textEementInNewsletter));
            Assertions.assertTrue(footerPage.isElementPresent(footerPage.inputEementInNewsletter));
        }
    }

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

    @Test
    public void locatingElementsCategoriesInFooter() {
        FooterPage footerPage = new FooterPage(driver);
        footerPage.openHomePage();
        if (footerPage.isElementPresent(footerPage.categoriesContainerInFooter)) {
            Assertions.assertTrue(footerPage.isElementPresent(footerPage.headerCategoriesContainer));
            Assertions.assertTrue(footerPage.isElementPresent(footerPage.womenElementCategoriesContainer));
        }
    }

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
