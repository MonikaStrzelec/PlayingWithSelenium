package Tests.Header;

import Pages.HeaderPage;
import Tests.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class SearchTest extends BaseTest {

    @Test
    public void clikOnSearch(){
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.openHomePage();
        if(headerPage.isElementPresent(headerPage.searchTextInContainer)) {
            headerPage.writeText(headerPage.searchTextInContainer, headerPage.text);
            headerPage.clickByElementBy(headerPage.searchButtonInContainer);
            headerPage.assertEqualsForExpectedUML(headerPage.serchWithTextUML);
            if (headerPage.isElementPresent(By.xpath("//*[@id=\"center_column\"]/p"))) //jeśli jest napis
            {
                Assertions.assertEquals(headerPage.readText(By.xpath("//*[@id=\"center_column\"]/p")), "No results were found for your search \"test\"");
            }
        }
    }
    @Test
    public void clikOnSearchButton() {
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.openHomePage();
        if (headerPage.isElementPresent(headerPage.searchButtonInContainer)) {
            headerPage.clickByElementBy(headerPage.searchButtonInContainer);
            headerPage.assertEqualsForExpectedUML(headerPage.serchIsEmptyUML);
            Assertions.assertTrue(headerPage.isElementPresent(By.xpath("//*[@id=\"center_column\"]/p")));
        }
    }
}
