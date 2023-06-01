package anhtester.keywords.GeneralClass;

import com.fpt.ivs.at.core.keywords.webkeyword.WaitForKeyword;
import com.fpt.ivs.at.core.object.UIObject;

public class WaitKeyword {

    public void demo_WaitForKeyword(UIObject target){

        WaitForKeyword waitForKeyword = new WaitForKeyword();

        waitForKeyword.waitForElementClickable(target, 5);

        waitForKeyword.waitForElementVisible(target, 5);

    }

}