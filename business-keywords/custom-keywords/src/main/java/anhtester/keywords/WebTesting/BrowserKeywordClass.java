package anhtester.keywords.WebTesting;

import com.fpt.ivs.at.core.keywords.webkeyword.BrowserKeyword;
import com.fpt.ivs.at.core.keywords.webkeyword.BrowserWindowKeyword;
import com.fpt.ivs.at.core.object.UIObject;

public class BrowserKeywordClass {

    public void demo_BrowserKeyword() {

        BrowserKeyword browserKeyword = new BrowserKeyword();

        browserKeyword.openBrowser("https://anhtester.com"); // to open browser with url
        browserKeyword.back(); // to back to previous screen
        browserKeyword.forward(); // to go to the next screen
        browserKeyword.refresh(); // to refresh page
        browserKeyword.quitBrowser(); // to quit browser

    }

    public void demo_BrowserWindowKeyword(UIObject target) {

        BrowserWindowKeyword browserWindowKeyword = new BrowserWindowKeyword();

        browserWindowKeyword.maximizeCurrentWindow(); // Maximize Window
        browserWindowKeyword.switchToFrame(target); // Switch to Frame
        browserWindowKeyword.openNewTab("https://anhtester.com"); // Open new Tab and navigate to URL
        browserWindowKeyword.openNewWindow("https://anhtester.com"); // Open new Window Popup and navigate to URL
        browserWindowKeyword.getWindowCount(); // Get total Window popup and Tab
        browserWindowKeyword.closeCurrentWindow(); // Close current Window popup on Browser
        
        //...

    }

}