package pages;

import Utils.WaitTool;
import core.BasePage;
import org.openqa.selenium.By;

public class HomePage extends BasePage {

    private static final By MY_ACCOUNT = By.xpath("//li[@class=\"dropdown\"]//i[@class=\"fa fa-user\"]/ ..");
    private static final By REGISTER = By.xpath("//ul[@class=\"dropdown-menu dropdown-menu-right\"]//a[contains(text(), \"Register\")]");
    private static final String HOME_PAGE_URL = "http://shop.pragmatic.bg/index.php?route=common/home";


    public static void goToHomePage() {
        driver.get(HOME_PAGE_URL);
    }

public static void waitForMyAccountButton(){
        WaitTool.waitForElementVisibility(MY_ACCOUNT, 7);

}
    public static void clickOnMyAccount() {
        clickOnElementByLocator(MY_ACCOUNT);
    }

    public static void waitForRegisterButton(){
        WaitTool.waitForElementVisibility(REGISTER, 7);

    }
    public static void clickOnRegister(){
        clickOnElementByLocator(REGISTER);
    }
}
