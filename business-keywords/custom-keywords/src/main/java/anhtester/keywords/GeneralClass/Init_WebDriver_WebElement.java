package anhtester.keywords.GeneralClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.fpt.ivs.at.core.object.UIObject;
import com.fpt.ivs.at.core.utilities.WebDriverUtilities;

public class Init_WebDriver_WebElement {

    public void getWebElementDemo(UIObject target) {
        // Get WebDriver
        RemoteWebDriver webDriver = WebDriverUtilities.getDriver();
        // Convert UIObject to WebElements
        WebElement element = target.convertToWebElement(webDriver);
        element.click();
    }

}