package pageHelper;

import Seleniumutil.SeleniumUtil;
import page.PageDelArticle;

/**
 * Created by admin on 2018/5/8.
 */
public class HelperDeleteTest {
    //点击默认版块
    public static  void clickModel(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(PageDelArticle.DELETE_LINKTEXT_MODEL,10);
        seleniumUtil.clickElement(PageDelArticle.DELETE_LINKTEXT_MODEL);
    }

    //选中要删除的帖子
    public static void selectedArticle(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(PageDelArticle.DELETE_INPUT_DELETE,10);
        seleniumUtil.clickElement(PageDelArticle.DELETE_INPUT_DELETE);
    }

    //删除按钮
    public static void clickDele(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(PageDelArticle.DELETE_LINKTEXT_DELE,10);
        seleniumUtil.clickElement(PageDelArticle.DELETE_LINKTEXT_DELE);
    }

    //输入删除原因
    public  static  void inputReson(SeleniumUtil seleniumUtil,String reson){
        seleniumUtil.waitForElementLoad(PageDelArticle.DELETE_INPUT_RESON,10);
        seleniumUtil.sendKeys(PageDelArticle.DELETE_INPUT_RESON,reson);
    }

    //确定删除按钮
    public  static  void clickAccept(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(PageDelArticle.DELETE_BUTTON_ACCPECT,10);
        seleniumUtil.clickElement(PageDelArticle.DELETE_BUTTON_ACCPECT);
    }

    //删除帖子的整个流程
    public static  void deleteArticle(SeleniumUtil seleniumUtil,String reson){
        clickModel(seleniumUtil);
        selectedArticle(seleniumUtil);
        clickDele(seleniumUtil);
        inputReson(seleniumUtil,reson);
        clickAccept(seleniumUtil);
    }
}
