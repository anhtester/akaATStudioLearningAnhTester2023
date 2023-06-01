package anhtester.keywords.GeneralClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.fpt.ivs.at.core.utilities.KeywordAssertion;
import com.fpt.ivs.at.core.utilities.WebDriverUtilities;

public class Assertion {

    public void assertDemo() {

        //Kiểm tra BẰNG NHAU
        KeywordAssertion.assertEqual("Anh Tester", "Automation Testing");

        WebElement element = WebDriverUtilities.getDriver().findElement(By.xpath("//input[@id='email']"));
        //Kiểm tra Element tồn tại
        KeywordAssertion.assertElementExist(element);
    }

}