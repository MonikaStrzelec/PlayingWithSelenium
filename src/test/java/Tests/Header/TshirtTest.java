package Tests.Header;

import Pages.HeaderPage;
import Tests.BaseTest;
import org.junit.jupiter.api.Test;

public class TshirtTest  extends BaseTest {
    @Test
    public void clikOnTheTshirt() {
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.openHomePage();
        if (headerPage.isElementPresent(headerPage.tshirtsInCategories)) {
            headerPage.clickByElementBy(headerPage.tshirtsInCategories);
            headerPage.assertEqualsForExpectedUML(headerPage.tshirtsUML);
        }
    }
}
