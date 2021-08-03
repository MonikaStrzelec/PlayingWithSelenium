package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LinksToPages {
    public WebDriver driver;
    public String baseURL = "http://automationpractice.com/index.php";

    public String singInURL = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
    public String text = "test";
    public String serchWithTextUML = "http://automationpractice.com/index.php?controller=search&orderby=position&orderway=desc&search_query=" + text + "&submit_search=";
    public String userAccountAfterSingIn= "http://automationpractice.com/index.php?controller=my-account";
    public String forgotPasswordUML = "http://automationpractice.com/index.php?controller=password";
    public String singInWitchBadDataUML = "http://automationpractice.com/index.php?controller=authentication";

    public String serchIsEmptyUML = "http://automationpractice.com/index.php?controller=search&orderby=position&orderway=desc&search_query=&submit_search=";
    public String concactUML = "http://automationpractice.com/index.php?controller=contact";
    public String concactUsWithGoodDataUML = "http://automationpractice.com/index.php?controller=contact";

    public String dressesUML = "http://automationpractice.com/index.php?id_category=8&controller=category";

    public String womenUML = "http://automationpractice.com/index.php?id_category=3&controller=category";

    public String tshirtsUML = "http://automationpractice.com/index.php?id_category=5&controller=category";

    public String cartUML = "http://automationpractice.com/index.php?controller=order";

    public String logoUML = "http://automationpractice.com/index.php";

    public String bannerUML = "http://automationpractice.com/index.php";


}
