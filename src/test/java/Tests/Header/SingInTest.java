package Tests.Header;

import Pages.HeaderPage;
import Pages.SingInPage;
import Tests.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingInTest extends BaseTest {

    @Test
    public void locatingSingInInNav() {
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.openHomePage();
        if (headerPage.isElementPresent(headerPage.singInInNav)) {
            headerPage.clickByElementBy(headerPage.singInInNav);
            headerPage.assertEqualsForExpectedUML(headerPage.singInURL);
        }
    }
    @Test
    public void singInWithGoodData() {
        SingInPage singInPage = new SingInPage(driver);
        locatingSingInInNav();
        singInPage.userLogin(singInPage.goodEmail, singInPage.goodPassword);
        singInPage.assertEqualsForExpectedUML(singInPage.userAccountAfterSingIn);
    }

    @Test
    public void singInWithGoodEmailAndBadPassword() {
        SingInPage singInPage = new SingInPage(driver);
        locatingSingInInNav();
        singInPage.userLogin(singInPage.goodEmail, singInPage.badPassword);
        singInPage.assertEqualsForExpectedUML(singInPage.singInWitchBadDataUML);
        Assertions.assertTrue(singInPage.isElementPresent(singInPage.blockWithAlertElement));
        Assertions.assertEquals(singInPage.readText(singInPage.errorMesageTextElement), "Invalid password.");
    }

    @Test
    public void singInWithBadEmailAndGoodPassword() {
        SingInPage singInPage = new SingInPage(driver);
        locatingSingInInNav();
        singInPage.userLogin(singInPage.badEmail, singInPage.goodPassword);
        singInPage.assertEqualsForExpectedUML(singInPage.singInWitchBadDataUML);
        Assertions.assertTrue(singInPage.isElementPresent(singInPage.blockWithAlertElement));
        Assertions.assertEquals(singInPage.readText(singInPage.errorMesageTextElement), "Invalid email address.");
    }

    @Test
    public void singInWithBadData() {
        SingInPage singInPage = new SingInPage(driver);
        locatingSingInInNav();
        singInPage.userLogin(singInPage.badEmail, singInPage.badPassword);
        singInPage.assertEqualsForExpectedUML(singInPage.singInWitchBadDataUML);
        Assertions.assertTrue(singInPage.isElementPresent(singInPage.blockWithAlertElement));
        Assertions.assertEquals(singInPage.readText(singInPage.errorMesageTextElement), "Invalid email address.");

    }

    @Test
    public void singInWithEmptyData() {
        SingInPage singInPage = new SingInPage(driver);
        locatingSingInInNav();
        singInPage.userLogin(singInPage.emptyEmail, singInPage.emptyPassword);
        singInPage.assertEqualsForExpectedUML(singInPage.singInWitchBadDataUML);
        Assertions.assertTrue(singInPage.isElementPresent(singInPage.blockWithAlertElement));
        Assertions.assertEquals(singInPage.readText(singInPage.errorMesageTextElement), "An email address required.");
    }

    @Test
    public void singInWithGoodEmailAndEmptyPassword() {
        SingInPage singInPage = new SingInPage(driver);
        locatingSingInInNav();
        singInPage.userLogin(singInPage.goodEmail, singInPage.emptyPassword);
        singInPage.assertEqualsForExpectedUML(singInPage.singInWitchBadDataUML);
        Assertions.assertTrue(singInPage.isElementPresent(singInPage.blockWithAlertElement));
        Assertions.assertEquals(singInPage.readText(singInPage.errorMesageTextElement), "Password is required.");
    }

    @Test
    public void singInWithEmptyEmailAndGoodPassword() {
        SingInPage singInPage = new SingInPage(driver);
        locatingSingInInNav();
        singInPage.userLogin(singInPage.emptyEmail, singInPage.goodPassword);
        singInPage.assertEqualsForExpectedUML(singInPage.singInWitchBadDataUML);
        Assertions.assertTrue(singInPage.isElementPresent(singInPage.blockWithAlertElement));
        Assertions.assertEquals(singInPage.readText(singInPage.errorMesageTextElement), "An email address required.");
    }

    @Test
    public void singInWithForgotPassword() {
        SingInPage singInPage = new SingInPage(driver);
        locatingSingInInNav();
        singInPage.userLoginWithForgotPassword(singInPage.emptyEmail, singInPage.emptyPassword);
        singInPage.assertEqualsForExpectedUML(singInPage.forgotPasswordUML);
    }

    @Test
    public void locatingCreateAnAccount() {
        SingInPage singInPage = new SingInPage(driver);
        locatingSingInInNav();
        Assertions.assertAll(
                ()->Assertions.assertTrue(singInPage.isElementPresent(singInPage.createAnAccountContainer)),
                ()->Assertions.assertTrue(singInPage.isElementPresent(singInPage.textInCreateAnAccount)),
                ()->Assertions.assertTrue(singInPage.isElementPresent(singInPage.labelInCreateAnAccount)),
                ()->Assertions.assertTrue(singInPage.isElementPresent(singInPage.emailCreateElement)),
                ()->Assertions.assertTrue(singInPage.isElementPresent(singInPage.buttonCreateAnAccount))
        );

    }

    @Test
    public void locatingAlreadyRegisteredInSingInPage() {
        SingInPage singInPage = new SingInPage(driver);
        locatingSingInInNav();
        Assertions.assertAll(
                ()->Assertions.assertTrue(singInPage.isElementPresent(singInPage.AlreadyRegisteredContainer)),
                ()->Assertions.assertTrue(singInPage.isElementPresent(singInPage.emailLabelInAlreadyRegistered)),
                ()->Assertions.assertTrue(singInPage.isElementPresent(singInPage.emailInAlreadyRegistered)),
                ()->Assertions.assertTrue(singInPage.isElementPresent(singInPage.passwordLabelInAlreadyRegistered)),
                ()->Assertions.assertTrue(singInPage.isElementPresent(singInPage.passwordInAlreadyRegistered)),
                ()->Assertions.assertTrue(singInPage.isElementPresent(singInPage.forgotPasswordButton)),
                ()->Assertions.assertTrue(singInPage.isElementPresent(singInPage.loginButton))
        );
    }
}
