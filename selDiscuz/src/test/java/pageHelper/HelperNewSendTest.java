package pageHelper;

import Seleniumutil.SeleniumUtil;
import page.PageNewSend;
import page.PageSend;

/**
 * Created by admin on 2018/5/8.
 */
public class HelperNewSendTest {

    //点击新模板
    public static void clickNew(SeleniumUtil seleniumUtil){
        seleniumUtil.clickElement(PageNewSend.ADD_LINKTEST_NEWMODEL);
    }

    //输入发帖标题
    public static  void sendTitle(SeleniumUtil seleniumUtil,String text){
        seleniumUtil.waitForElementLoad(PageNewSend.SEND_INPUT_TITLE,10);
        seleniumUtil.sendKeys(PageNewSend.SEND_INPUT_TITLE,text);
    }

    //输入发帖内容
    public static void sendContent(SeleniumUtil seleniumUtil,String text){
        seleniumUtil.waitForElementLoad(PageNewSend.SEND_INPUT_CONTENT,10);
        seleniumUtil.sendKeys(PageNewSend.SEND_INPUT_CONTENT,text);
    }

    //点击发帖按钮--发帖
    public static  void sendArticle(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(PageNewSend.SEND_BUTTON_SEND,10);
        seleniumUtil.clickElement(PageNewSend.SEND_BUTTON_SEND);
    }

    //发帖全过程
    public static void sendArticles(SeleniumUtil seleniumUtil,String title,String content){
         clickNew(seleniumUtil);
        sendTitle(seleniumUtil,title);
        sendContent(seleniumUtil,content);
        sendArticle(seleniumUtil);

    }
}
