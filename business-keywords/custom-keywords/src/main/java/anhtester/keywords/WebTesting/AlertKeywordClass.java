package anhtester.keywords.WebTesting;

import com.fpt.ivs.at.core.keywords.webkeyword.AlertKeyword;

public class AlertKeywordClass {

    public void demo_AlertKeyword() {

        AlertKeyword alertKeyword = new AlertKeyword();

        alertKeyword.setTextOnAlert("Anh Tester");

        alertKeyword.acceptAlert();

    }

}