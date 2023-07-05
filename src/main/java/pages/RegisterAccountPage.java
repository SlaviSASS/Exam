package pages;

import Utils.RandomEmailGenerator;
import Utils.WaitTool;
import core.BasePage;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;

public class RegisterAccountPage extends BasePage {

    private static final By FIRST_NAME_FIELD = By.xpath("//input[@id=\"input-firstname\"]");
    private static final By LAST_NAME_FIELD = By.xpath("//input[@id=\"input-lastname\"]");
    private static final By EMAIL_FIELD = By.xpath("//input[@id=\"input-email\"]");
    private static final By TELEPHONE_NUMBER = By.xpath("//input[@id=\"input-telephone\"]");
    private static final By PASSWORD_FIELD = By.xpath("//input[@id=\"input-password\"]");
    private static final By CONFIRM_PASSWORD_FIELD = By.xpath("//input[@id=\"input-confirm\"]");
    private static final By CHECKBOX = By.xpath("//input[@type=\"checkbox\"]");
    private static final By CONTINUE_BUTTON = By.xpath("//input[@type=\"submit\"]");

    private static final String RANDOM_PASSWORD = RandomStringUtils.randomAlphanumeric(8);


    public static void waitForVisibilityOfFirstNameField() {
        WaitTool.waitForElementVisibility(FIRST_NAME_FIELD, 10);
    }

    public static void writeInFirstNameField(String firstName) {
        driver.findElement(FIRST_NAME_FIELD).sendKeys(firstName);
    }

    public static void writeInLastNameField(String lastName) {
        driver.findElement(LAST_NAME_FIELD).sendKeys(lastName);
    }
    public static void writeInEmailField(){
        driver.findElement(EMAIL_FIELD).sendKeys(RandomEmailGenerator.randomEmailGenerator());
    }
    public static void writeInTelephoneNumber(String telephoneNumber){
        driver.findElement(TELEPHONE_NUMBER).sendKeys(telephoneNumber);
    }
    public static void writeInPasswordField(){
        driver.findElement(PASSWORD_FIELD).sendKeys(RANDOM_PASSWORD);
    }
    public static void writeInConfirmPasswordField(){
        driver.findElement(CONFIRM_PASSWORD_FIELD).sendKeys(RANDOM_PASSWORD);
    }
    public static void clickOnCheckbox(){
        clickOnElementByLocator(CHECKBOX);
    }
    public static void clickOnContinueButton(){
        clickOnElementByLocator(CONTINUE_BUTTON);
    }





}
