package anhtester.keywords.GeneralClass;

import com.fpt.ivs.at.core.keywords.mobilekeyword.ElementActionKeyword;
import com.fpt.ivs.at.core.object.UIObject;

public class ActionKeyword {

    public void demo_ElementActionKeyword(UIObject target){

        ElementActionKeyword elementActionKeyword = new ElementActionKeyword();

        elementActionKeyword.click(target, 5);
        
        elementActionKeyword.getText(target, 10);

    }

}