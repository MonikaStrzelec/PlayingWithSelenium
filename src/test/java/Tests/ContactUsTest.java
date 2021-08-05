package Tests;

import Pages.ContactUsPage;
import Pages.HeaderPage;
import Tests.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContactUsTest extends BaseTest {
    @Test
    public void locatingConcactInNav() {
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.openHomePage();
        if (headerPage.isElementPresent(headerPage.concactInNav)) {
            headerPage.waitForElementVisibility(headerPage.concactInNav);
            headerPage.clickByElementBy(headerPage.concactInNav);
            headerPage.assertEqualsForExpectedUML(headerPage.concactUML);
        }
    }

    //https://xray.tt.com.pl/browse/PRAK-84
    @Test
    public void sendingEmailWithValidDataForCustomerService() {
        locatingConcactInNav();
        ContactUsPage contactUsPage = new ContactUsPage(driver);
        Assertions.assertTrue(contactUsPage.isElementPresent(contactUsPage.attachFileallElement));
        Assertions.assertTrue(contactUsPage.isElementPresent(contactUsPage.textAttachFileallElement));
        Assertions.assertTrue(contactUsPage.isElementPresent(contactUsPage.buttonAttachFileallElement));
        contactUsPage.addAttachFileselect(contactUsPage.testEmailExpectedFileName);
        contactUsPage.selectItemFromSubjectHeading(contactUsPage.customerServiceInSubjectHeading);
        contactUsPage.contactUsDetails(contactUsPage.goodEmail, contactUsPage.goodOrderReference, contactUsPage.goodMessage);
        contactUsPage.assertEqualsForExpectedUML(contactUsPage.concactUsWithGoodDataUML);
        Assertions.assertTrue(contactUsPage.isElementPresent(contactUsPage.alertSuccess));
        Assertions.assertEquals(contactUsPage.readText(contactUsPage.alertSuccess), "Your message has been successfully sent to our team.");
    }

    //https://xray.tt.com.pl/browse/PRAK-53
    @Test
    public void sendingEmailWithValidDataForWebmaster() {
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.openHomePage();
        headerPage.clickByElementBy(headerPage.concactInNav);
        headerPage.assertEqualsForExpectedUML(headerPage.concactUML);

        ContactUsPage contactUsPage = new ContactUsPage(driver);
        contactUsPage.selectItemFromSubjectHeading(contactUsPage.webmasterInSubjectHeading);
        contactUsPage.addAttachFileselect(contactUsPage.testEmailExpectedFileName);
        contactUsPage.contactUsDetails(contactUsPage.goodEmail, contactUsPage.goodOrderReference, contactUsPage.goodMessage);
        contactUsPage.assertEqualsForExpectedUML(contactUsPage.concactUsWithGoodDataUML);
        Assertions.assertTrue(contactUsPage.isElementPresent(contactUsPage.alertSuccess));
        Assertions.assertEquals(contactUsPage.readText(contactUsPage.alertSuccess), "Your message has been successfully sent to our team.");
    }

    //https://xray.tt.com.pl/browse/PRAK-43
    @Test
    public void sendingEmailWithNoData() {
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.openHomePage();
        headerPage.clickByElementBy(headerPage.concactInNav);

        ContactUsPage contactUsPage = new ContactUsPage(driver);
        contactUsPage.waitForElementVisibility(contactUsPage.buttonMessage);
        contactUsPage.clickByElementBy(contactUsPage.buttonMessage);
        contactUsPage.waitForElementVisibility(contactUsPage.alertDanger);
        Assertions.assertTrue(contactUsPage.isElementPresent(contactUsPage.alertDanger));
        Assertions.assertEquals(contactUsPage.readText(contactUsPage.alertDanger), "There is 1 error\nInvalid email address.");
    }

    //https://xray.tt.com.pl/browse/PRAK-85
    @Test
    public void sendingEmailWithNoSubjectHeading() {
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.openHomePage();
        headerPage.clickByElementBy(headerPage.concactInNav);

        ContactUsPage contactUsPage = new ContactUsPage(driver);
        contactUsPage.addAttachFileselect(contactUsPage.testEmailExpectedFileName);
        contactUsPage.contactUsDetails(contactUsPage.goodEmail, contactUsPage.goodOrderReference, contactUsPage.goodMessage);
        Assertions.assertTrue(contactUsPage.isElementPresent(contactUsPage.alertDanger));
        Assertions.assertEquals(contactUsPage.readText(contactUsPage.alertDanger), "There is 1 error\nPlease select a subject from the list provided.");
    }

    //https://xray.tt.com.pl/browse/PRAK-86
    @Test
    public void sendingEmailWithNoEmail() {
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.openHomePage();
        headerPage.clickByElementBy(headerPage.concactInNav);

        ContactUsPage contactUsPage = new ContactUsPage(driver);
        contactUsPage.addAttachFileselect(contactUsPage.testEmailExpectedFileName);
        contactUsPage.selectItemFromSubjectHeading(contactUsPage.customerServiceInSubjectHeading);
        contactUsPage.contactUsDetails(contactUsPage.emptyEmail, contactUsPage.goodOrderReference, contactUsPage.goodMessage);
        Assertions.assertTrue(contactUsPage.isElementPresent(contactUsPage.alertDanger));
        Assertions.assertEquals(contactUsPage.readText(contactUsPage.alertDanger), "There is 1 error\nInvalid email address.");
    }

    //https://xray.tt.com.pl/browse/PRAK-87
    @Test
    public void sendingEmailWithNoOrderReference() {
        locatingConcactInNav();
        ContactUsPage contactUsPage = new ContactUsPage(driver);
        contactUsPage
                .addAttachFileselect(contactUsPage.testEmailExpectedFileName)
                .selectItemFromSubjectHeading(contactUsPage.customerServiceInSubjectHeading)
                .contactUsDetails(contactUsPage
                        .goodEmail, contactUsPage
                        .emptyOrderReference, contactUsPage
                        .goodMessage);
        contactUsPage.assertEqualsForExpectedUML(contactUsPage.concactUsWithGoodDataUML);
        Assertions.assertTrue(contactUsPage.isElementPresent(contactUsPage.alertSuccess));
        Assertions.assertEquals(contactUsPage.readText(contactUsPage.alertSuccess), "Your message has been successfully sent to our team.");
    }

    //https://xray.tt.com.pl/browse/PRAK-88
    @Test
    public void sendingEmailWithNoAttachFile() {
        locatingConcactInNav();
        ContactUsPage contactUsPage = new ContactUsPage(driver);
        contactUsPage
                .selectItemFromSubjectHeading(contactUsPage.customerServiceInSubjectHeading)
                .contactUsDetails(contactUsPage
                        .goodEmail, contactUsPage
                        .goodOrderReference, contactUsPage
                        .goodMessage)
                .assertEqualsForExpectedUML(contactUsPage.concactUsWithGoodDataUML);
        Assertions.assertTrue(contactUsPage.isElementPresent(contactUsPage.alertSuccess));
        Assertions.assertEquals(contactUsPage.readText(contactUsPage.alertSuccess), "Your message has been successfully sent to our team.");
    }

    //https://xray.tt.com.pl/browse/PRAK-89
    @Test
    public void sendingEmailWithNoMessage() {
        locatingConcactInNav();
        ContactUsPage contactUsPage = new ContactUsPage(driver);
        contactUsPage
                .addAttachFileselect(contactUsPage.testEmailExpectedFileName)
                .selectItemFromSubjectHeading(contactUsPage.customerServiceInSubjectHeading)
                .contactUsDetails(contactUsPage
                        .goodEmail, contactUsPage
                        .goodOrderReference, contactUsPage
                        .emptyMessage)
                .assertEqualsForExpectedUML(contactUsPage.concactUsWithGoodDataUML);
        Assertions.assertTrue(contactUsPage.isElementPresent(contactUsPage.alertDanger));
        Assertions.assertEquals(contactUsPage.readText(contactUsPage.alertDanger), "There is 1 error\nThe message cannot be blank.");
    }
}
