package Tests.Header;

import Pages.HeaderPage;
import Tests.BaseTest;
import org.junit.jupiter.api.Test;

public class DressesTest extends BaseTest {

    @Test
    public void clikOnTheDresses() {
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.openHomePage();
        if (headerPage.isElementPresent(headerPage.dressesInCategories)) {
            headerPage.clickByElementBy(headerPage.dressesInCategories);
            headerPage.assertEqualsForExpectedUML(headerPage.dressesUML);
        }
    }
}
