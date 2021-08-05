package Pages;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

public class BasePage extends LinksToPages{
    public WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
    }

    public void openHomePage(){
        driver.get(baseURL);
    }


    //Wait Wrapper Method
    public WebElement waitForElementVisibility(By elementBy){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(elementBy));
        return element;
    }

    //Click Method
    public void clickByElementBy(By elementBy){
        waitForElementVisibility(elementBy).click();
    }

    //Write Text
    public void writeText(By elementBy, String text){
        waitForElementVisibility(elementBy);
        driver.findElement(elementBy).sendKeys(text);
    }

    //Read Text
    public String readText(By elementBy){
        waitForElementVisibility(elementBy);
        return driver.findElement(elementBy).getText();
    }

    //Assert
    public void assertEqualsForExpectedUML(String expectedText){
        Assertions.assertEquals(driver.getCurrentUrl(), expectedText);
    }

    //checking the existence of the element
    public boolean isElementPresent(By elementBy){
        waitForElementVisibility(elementBy);
        try {
            driver.findElement(elementBy).isDisplayed();
            return true;
        } catch (NoSuchElementException e){
            return false;
        }
    }

    //button
    public void radiobuttonCheckedOrUncheckedWithAssertTrue(By elementBy){
        waitForElementVisibility(elementBy);
        assertTrue(driver.findElement(elementBy).isSelected());
    }
}
