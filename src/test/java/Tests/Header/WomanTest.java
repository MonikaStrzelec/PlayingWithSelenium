package Tests.Header;

import Pages.HeaderPage;
import Tests.BaseTest;
import org.junit.jupiter.api.Test;

public class WomanTest extends BaseTest {

    @Test
    public void clikOnTheWoman(){
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.openHomePage();
        if(headerPage.isElementPresent(headerPage.womenInCategories)){
            headerPage.clickByElementBy(headerPage.womenInCategories);
            headerPage.assertEqualsForExpectedUML(headerPage.womenUML);
        }
    }
}
