package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FooterPage extends BasePage {
    public FooterPage(WebDriver driver) {
        super(driver);
    }

    public By footerContainer = By.id("footer");

    //Newsletter
    public By newsletterBlockContainerInFooter = By.id("newsletter_block_left");
    public By textEementInNewsletter = By.xpath("//*[@id=\"newsletter_block_left\"]/h4");
    public By inputEementInNewsletter = By.id("newsletter-input");

    //Social media
    public By socialBlockContainerInFooter = By.id("social_block");
    public By textInsocialBlock = By.xpath("//*[@id=\"social_block\"]/h4");
    public By facebookInsocialBlock = By.xpath("//*[@id=\"social_block\"]/ul/li[1]");
    public By twitterInsocialBlock = By.xpath("//*[@id=\"social_block\"]/ul/li[2]");
    public By youtubeInsocialBlock = By.xpath("//*[@id=\"social_block\"]/ul/li[3]");
    public By googlePlusInsocialBlock = By.xpath("//*[@id=\"social_block\"]/ul/li[4]");

    //Categories:
    public By categoriesContainerInFooter = By.xpath("//*[@id=\"footer\"]/div/section[2]");
    public By headerCategoriesContainer = By.xpath("//*[@class=\"blockcategories_footer footer-block col-xs-12 col-sm-2\"]/h4");
    public By womenElementCategoriesContainer = By.xpath("//a[@title='Women']");

    //Information
    public By informationBlockWithVariousLinksInFooter = By.id("block_various_links_footer");
    public By headerInformationBlockWithVariousLinks = By.xpath("//*[@id=\"block_various_links_footer\"]/h4");

    public By specialsInformationBlockWithVariousLinks = By.xpath("//a[@title='Specials']");
    public By newProductsInformationBlockWithVariousLinks = By.xpath("//a[@title='New products']");
    public By bestSellersInformationBlockWithVariousLinks = By.xpath("//a[@title='Best sellers']");
    public By ourStoresInformationBlockWithVariousLinks = By.xpath("//a[@title='Our stores']");
    public By contactUsInformationBlockWithVariousLinks = By.xpath("//a[@title='Contact us']");
    public By termsAndConditionsOfUseInformationBlockWithVariousLinks = By.xpath("//a[@title='Terms and conditions of use']");
    public By aboutUsInformationBlockWithVariousLinks = By.xpath("//a[@title='About us']");
    public By sitemapInformationBlockWithVariousLinks = By.xpath("//a[@title='Sitemap']");

    //Signature with @:
    public By signatureOfPageInFooter = By.xpath("//*[@id=\"footer\"]/div/section[4]");
    public By yearSignatureOfPageInFooter = By.xpath("//*[contains(text(),'2014')]");
    public By textSignatureOfPageInFooter = By.xpath("//*[@id=\"footer\"]/div/section[4]/div/a");
    public String textYearSignatureOfPageInFooter = "© 2014 Ecommerce software by PrestaShop™";

    // My account:
    public By myAccountContainerInFooter = By.xpath("//*[@id=\"footer\"]/div/section[5]");
    public By headerMyAccountContainerInFooter = By.xpath("//a[@title='Manage my customer account']");
    
    public By myOrdersMyAccountContainer = By.xpath("//a[@title='My orders']");
    public By myCreditSlipsMyAccountContainer = By.xpath("//a[@title='My credit slips']");
    public By myAddressesMyAccountContainer = By.xpath("//a[@title='My addresses']");
    public By personalInformationMyAccountContainer = By.xpath("//a[@title='Manage my personal information']");

    //Store information
    public By storeInformationContainerInFooter = By.id("block_contact_infos");
    public By headerStoreInformationContainer = By.xpath("//*[contains(text(),'Store information')]");

    public By storeInformationContainer = By.xpath("//*[@id=\"block_contact_infos\"]/div/ul/li[1]");
    public By phoneElementsInStoreInformationContainer = By.xpath("//*[@id=\"block_contact_infos\"]/div/ul/li[2]");
    public String phoneNumberStoreInformationContainer = "(347) 466-7432";
    public By phoneNumberElementsStoreInformationContainer = By.xpath("//*[@id='block_contact_infos']/div/ul/li[2]/span");

    public By emailElementsInStoreInformationContainer = By.xpath("//*[@id=\"block_contact_infos\"]/div/ul/li[3]");
    public String emailStoreInformationContainer = "support@seleniumframework.com";
    public By emailTextInEmailStoreInformationContainer = By.xpath("//*[@id=\"block_contact_infos\"]/div/ul/li[3]/span/a");
}
