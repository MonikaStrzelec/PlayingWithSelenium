package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderPage extends BasePage {
        public HeaderPage(WebDriver driver) {
                super(driver);
        }

        public By headerContainer = By.id("header");
        public By bannerInContainer = By.xpath("//*[@id=\"header\"]/div[1]");
        public By navInContainer = By.xpath("//*[@id=\"header\"]/div[2]");
        public By containerInContainer = By.xpath("//*[@id=\"header\"]/div[3]");

        //elements in 1 container: banner
        public By hrefBannerInContainer = By.xpath("//*[@id=\"header\"]/div[1]/div/div/a");

        //elements in 2 container: nav
        public By singInInNav = By.xpath("//*[@class=\"header_user_info\"]");
        public By concactInNav = By.id("contact-link");
        public By shopPhoneInNav = By.xpath("//*[@class=\"shop-phone\"]");

        public By textInShopPhone = By.xpath("//*[@class=\"shop-phone\"]");
        public By iconInShopPhone = By.xpath("//*[@class=\"shop-phone\"]/i");
        public By phoneNumberInShopPhone = By.xpath("//*[@class=\"shop-phone\"]/strong");

        //elements in 3 container: container
        //LOGO
        public By logoInContainer = By.id("header_logo");

        //SEARCH
        public By searchBoxInContainer = By.id("searchbox");
        public By searchTextInContainer = By.id("search_query_top");
        public By searchButtonInContainer = By.name("submit_search");

        //CART
        public By hrefCartContainerInContainer = By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a");
        public By cartTextInContainer = By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a/b");
        public By cartStatusTextInContainer = By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a/span[5]");

        //CLOTHING CATEGORIES:
        public By categoriesContainerInContainer = By.id("block_top_menu");
        //DRESSES
        public By dressesInCategories = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]");
        public By casualDressesElementInDresses = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[1]");
        public By eveningDressesElementInDresses = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[2]");
        public By summerDressesElementInDresses = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[3]");

        //T-SHIRTS
        public By tshirtsInCategories = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]");
        //WOMEN
        public By womenInCategories = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]");
        public By topsInWomen = By.xpath("//a[@title='Tops']");
        public By tshirtsElementInTopsInWomen = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[1]");
        public By blousesElementInTopsInWomen = By.xpath("//a[@title='Blouses']");
        public By dressesInWomen = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[2]");
        public By casualDressesElementDressesInWomen = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[2]/ul/li[1]");
        public By eveningDressesElementDressesInWomen = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[2]/ul/li[2]");
        public By summerDressesElementDressesInWomen = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[2]/ul/li[3]");
    }
