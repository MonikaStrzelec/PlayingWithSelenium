package Tests.Header;

import Pages.HeaderPage;
import Tests.BaseTest;
import org.junit.jupiter.api.Test;

public class CartTest extends BaseTest {
    @Test
    public void clikOnCart(){
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.openHomePage();
        headerPage.clickByElementBy(headerPage.hrefCartContainerInContainer);
        headerPage.assertEqualsForExpectedUML(headerPage.cartUML);
    }

}
