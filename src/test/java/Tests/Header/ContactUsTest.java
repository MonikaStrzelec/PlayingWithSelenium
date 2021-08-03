package Tests.Header;

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
            headerPage.clickByElementBy(headerPage.concactInNav);
            headerPage.assertEqualsForExpectedUML(headerPage.concactUML);
        }
    }


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

    @Test
    public void sendingEmailWithValidDataForWebmaster() {
        locatingConcactInNav();
        ContactUsPage contactUsPage = new ContactUsPage(driver);
        Assertions.assertTrue(contactUsPage.isElementPresent(contactUsPage.attachFileallElement));
        Assertions.assertTrue(contactUsPage.isElementPresent(contactUsPage.textAttachFileallElement));
        Assertions.assertTrue(contactUsPage.isElementPresent(contactUsPage.buttonAttachFileallElement));
        contactUsPage.addAttachFileselect(contactUsPage.testEmailExpectedFileName);
        contactUsPage.selectItemFromSubjectHeading(contactUsPage.webmasterInSubjectHeading);
        contactUsPage.contactUsDetails(contactUsPage.goodEmail, contactUsPage.goodOrderReference, contactUsPage.goodMessage);
        contactUsPage.assertEqualsForExpectedUML(contactUsPage.concactUsWithGoodDataUML);
        Assertions.assertTrue(contactUsPage.isElementPresent(contactUsPage.alertSuccess));
        Assertions.assertEquals(contactUsPage.readText(contactUsPage.alertSuccess), "Your message has been successfully sent to our team.");
    }

    @Test
    public void sendingEmailWithNoData() {
        locatingConcactInNav();
        ContactUsPage contactUsPage = new ContactUsPage(driver);
        //Assertions.assertTrue(contactUsPage.isElementPresent(contactUsPage.attachFileallElement));
        //Assertions.assertTrue(contactUsPage.isElementPresent(contactUsPage.textAttachFileallElement));
        //Assertions.assertTrue(contactUsPage.isElementPresent(contactUsPage.buttonAttachFileallElement));
        contactUsPage.contactUsDetails(contactUsPage.emptyEmail, contactUsPage.emptyOrderReference, contactUsPage.emptyMessage);
        Assertions.assertTrue(contactUsPage.isElementPresent(contactUsPage.alertDanger));
        Assertions.assertEquals(contactUsPage.readText(contactUsPage.alertDanger), "Invalid email address.");
    }

    @Test
    public void sendingEmailWithNoSubjectHeading() {
        locatingConcactInNav();
        ContactUsPage contactUsPage = new ContactUsPage(driver);
        Assertions.assertTrue(contactUsPage.isElementPresent(contactUsPage.attachFileallElement));
        Assertions.assertTrue(contactUsPage.isElementPresent(contactUsPage.textAttachFileallElement));
        Assertions.assertTrue(contactUsPage.isElementPresent(contactUsPage.buttonAttachFileallElement));
        contactUsPage.addAttachFileselect(contactUsPage.testEmailExpectedFileName);
        contactUsPage.contactUsDetails(contactUsPage.goodEmail, contactUsPage.goodOrderReference, contactUsPage.goodMessage);
        Assertions.assertTrue(contactUsPage.isElementPresent(contactUsPage.alertDanger));
        Assertions.assertEquals(contactUsPage.readText(contactUsPage.alertDanger), "Please select a subject from the list provided.");
    }

    @Test
    public void sendingEmailWithNoEmail() {
        locatingConcactInNav();
        ContactUsPage contactUsPage = new ContactUsPage(driver);
        Assertions.assertTrue(contactUsPage.isElementPresent(contactUsPage.attachFileallElement));
        Assertions.assertTrue(contactUsPage.isElementPresent(contactUsPage.textAttachFileallElement));
        Assertions.assertTrue(contactUsPage.isElementPresent(contactUsPage.buttonAttachFileallElement));
        contactUsPage.addAttachFileselect(contactUsPage.testEmailExpectedFileName);
        contactUsPage.selectItemFromSubjectHeading(contactUsPage.customerServiceInSubjectHeading);
        contactUsPage.contactUsDetails(contactUsPage.emptyEmail, contactUsPage.goodOrderReference, contactUsPage.goodMessage);
        contactUsPage.assertEqualsForExpectedUML(contactUsPage.concactUsWithGoodDataUML);
        Assertions.assertTrue(contactUsPage.isElementPresent(contactUsPage.alertDanger));
        Assertions.assertEquals(contactUsPage.readText(contactUsPage.alertDanger), "Invalid email address.");
    }

    @Test
    public void sendingEmailWithNoOrderReference() {
        locatingConcactInNav();
        ContactUsPage contactUsPage = new ContactUsPage(driver);
        Assertions.assertTrue(contactUsPage.isElementPresent(contactUsPage.attachFileallElement));
        Assertions.assertTrue(contactUsPage.isElementPresent(contactUsPage.textAttachFileallElement));
        Assertions.assertTrue(contactUsPage.isElementPresent(contactUsPage.buttonAttachFileallElement));
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

    @Test
    public void sendingEmailWithNoAttachFile() {
        locatingConcactInNav();
        ContactUsPage contactUsPage = new ContactUsPage(driver);
        Assertions.assertTrue(contactUsPage.isElementPresent(contactUsPage.attachFileallElement));
        Assertions.assertTrue(contactUsPage.isElementPresent(contactUsPage.textAttachFileallElement));
        Assertions.assertTrue(contactUsPage.isElementPresent(contactUsPage.buttonAttachFileallElement));
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

    @Test
    public void sendingEmailWithNoMessage() {
        locatingConcactInNav();
        ContactUsPage contactUsPage = new ContactUsPage(driver);
        Assertions.assertTrue(contactUsPage.isElementPresent(contactUsPage.attachFileallElement));
        Assertions.assertTrue(contactUsPage.isElementPresent(contactUsPage.textAttachFileallElement));
        Assertions.assertTrue(contactUsPage.isElementPresent(contactUsPage.buttonAttachFileallElement));
        contactUsPage
                .addAttachFileselect(contactUsPage.testEmailExpectedFileName)
                .selectItemFromSubjectHeading(contactUsPage.customerServiceInSubjectHeading)
                .contactUsDetails(contactUsPage
                        .goodEmail, contactUsPage
                        .goodOrderReference, contactUsPage
                        .emptyMessage)
                .assertEqualsForExpectedUML(contactUsPage.concactUsWithGoodDataUML);
        Assertions.assertTrue(contactUsPage.isElementPresent(contactUsPage.alertSuccess));
        Assertions.assertEquals(contactUsPage.readText(contactUsPage.alertSuccess), "Your message has been successfully sent to our team.");
    }
}
