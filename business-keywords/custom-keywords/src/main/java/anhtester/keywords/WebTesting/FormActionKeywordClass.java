package anhtester.keywords.WebTesting;

import com.fpt.ivs.at.core.keywords.webkeyword.FormActionKeyword;
import com.fpt.ivs.at.core.object.UIObject;

public class FormActionKeywordClass {

    public void demo_FormActionKeyword(UIObject target){

        FormActionKeyword formActionKeyword = new FormActionKeyword();

        formActionKeyword.selectOptionByLabel(target, "Selenium");  // Select dropdown by Label for option

        formActionKeyword.selectOptionByValue(target, "Java");  // Select dropdown by Value for option

        formActionKeyword.selectOptionByIndex(target, 2); // Select dropdown by Index for option

        formActionKeyword.submit(target); //Nhấn Enter để Submit trong Form nhập liệu

    }

}