package tests;

import Utils.WaitTool;
import core.BasePage;
import core.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegisterAccountPage;
import pages.YourAccountHasBeenCreatedPage;

public class RegisterNewAccount extends BaseTest {


    @Test
    public static void registerNewAccount() {
        HomePage.goToHomePage();
        HomePage.clickOnMyAccount();
        HomePage.waitForRegisterButton();
        HomePage.clickOnRegister();
        RegisterAccountPage.waitForVisibilityOfFirstNameField();
        RegisterAccountPage.writeInFirstNameField("Slavi");
        RegisterAccountPage.writeInLastNameField("Boychev");
        RegisterAccountPage.writeInEmailField();
        RegisterAccountPage.writeInTelephoneNumber("0889932144");
        RegisterAccountPage.writeInPasswordField();
        RegisterAccountPage.writeInConfirmPasswordField();
        RegisterAccountPage.clickOnCheckbox();
        RegisterAccountPage.clickOnContinueButton();
        YourAccountHasBeenCreatedPage.assertCorrectMessage();
    }
}
