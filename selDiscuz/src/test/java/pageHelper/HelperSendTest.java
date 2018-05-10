package pageHelper;

import Seleniumutil.SeleniumUtil;
import page.PageLogin;
import page.PageSend;

/**
 * Created by admin on 2018/5/8.
 */
public class HelperSendTest {

    //发帖——点击默认板块
    public static void model(SeleniumUtil seleniumUtil)
    {
        seleniumUtil.waitForElementLoad(PageSend.SEND_LINKTEXT_SEND,10);
        seleniumUtil.clickElement(PageSend.SEND_LINKTEXT_SEND);
    }


    //输入发帖标题
    public static  void sendTitle(SeleniumUtil seleniumUtil,String text){
        seleniumUtil.waitForElementLoad(PageSend.SEND_INPUT_TITLE,10);
        seleniumUtil.sendKeys(PageSend.SEND_INPUT_TITLE,text);
    }

    //输入发帖内容
    public static void sendContent(SeleniumUtil seleniumUtil,String text){
        seleniumUtil.waitForElementLoad(PageSend.SEND_INPUT_CONTENT,10);
        seleniumUtil.sendKeys(PageSend.SEND_INPUT_CONTENT,text);
    }

    //点击发帖按钮--发帖
    public static  void sendArticle(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(PageSend.SEND_BUTTON_SEND,10);
        seleniumUtil.clickElement(PageSend.SEND_BUTTON_SEND);
    }

    //发帖全过程
    public static void sendArticles(SeleniumUtil seleniumUtil,String title,String content){
             model(seleniumUtil);
        sendTitle(seleniumUtil,title);
        sendContent(seleniumUtil,content);
        sendArticle(seleniumUtil);

    }
}
