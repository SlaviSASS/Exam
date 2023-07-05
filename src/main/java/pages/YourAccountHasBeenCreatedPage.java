package pages;

import core.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;

public class YourAccountHasBeenCreatedPage extends BasePage {
    private static final By ASSERTTEXT = By.xpath("//div[@id=\"content\"]//h1");






    public static void assertCorrectMessage(){
        String assertedText = driver.findElement(ASSERTTEXT).getText();
        Assert.assertEquals(assertedText, "Your Account Has Been Created!");
    }
}
