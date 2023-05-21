package anhtester.keywords;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

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

}