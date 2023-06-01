package anhtester.keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.fpt.ivs.at.core.keywords.webkeyword.WaitForKeyword;
import com.fpt.ivs.at.core.object.UIObject;
import com.fpt.ivs.at.core.utilities.WebDriverUtilities;

public class SeleniumKeywords {

	public void loginCMS(String email, String password) {
		RemoteWebDriver driver = WebDriverUtilities.getDriver();

		driver.manage().window().maximize();
		driver.get("https://cms.anhtester.com/login");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}

	public void highLightObject(UIObject target) {
		RemoteWebDriver driver = WebDriverUtilities.getDriver();

		String borderDefault = target.convertToWebElement(driver).getCssValue("border");
		System.out.println(borderDefault);

		// Tô màu border ngoài chính element chỉ định - màu Đỏ (có thể đổi màu khác)
		if (driver instanceof JavascriptExecutor) {
			((JavascriptExecutor) driver).executeScript("arguments[0].style.border='2px solid red'",
					target.convertToWebElement(driver));
		}

		// Chờ đợi 1 giây
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// Trả lại border cũ mặc định
		((JavascriptExecutor) driver).executeScript("arguments[0].style.border='" + borderDefault + "'",
				target.convertToWebElement(driver));
	}

	public void clickObject(UIObject target) {

		// Chờ đợi Element visible
		WaitForKeyword waitForKeyword = new WaitForKeyword();
		waitForKeyword.waitForElementVisible(target, 10);

		RemoteWebDriver driver = WebDriverUtilities.getDriver();
		target.convertToWebElement(driver).click();

	}

	public void clickAndHighlight(UIObject target) {

		// Chờ đợi object visible
		WaitForKeyword waitForKeyword = new WaitForKeyword();
		waitForKeyword.waitForElementVisible(target, 10);

		// Highlight object
		highLightObject(target);

		RemoteWebDriver driver = WebDriverUtilities.getDriver();
		target.convertToWebElement(driver).click();

	}

	public void sendKeysAndHighlight(UIObject target, String value) {

		// Chờ đợi object visible
		WaitForKeyword waitForKeyword = new WaitForKeyword();
		waitForKeyword.waitForElementVisible(target, 10);

		// Highlight object
		highLightObject(target);

		RemoteWebDriver driver = WebDriverUtilities.getDriver();
		target.convertToWebElement(driver).sendKeys(value);

	}

}