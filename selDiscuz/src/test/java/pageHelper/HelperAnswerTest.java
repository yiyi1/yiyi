package pageHelper;

import Seleniumutil.SeleniumUtil;
import page.PageAnswer;
import page.PageSend;

/**
 * Created by admin on 2018/5/8.
 */
public class HelperAnswerTest {
    //点击默认板块
    public  static  void model(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(PageAnswer.ANSWER_LINKTEXT_SEND,10);
        seleniumUtil.clickElement(PageAnswer.ANSWER_LINKTEXT_SEND);
    }
    //点击查看已发送的帖
    public static void lookUp(SeleniumUtil seleniumUtil){
        seleniumUtil.clickElement(PageAnswer.ANSWER_LINKTEXT_CLICK);
    }
    //输入回复内容
    public static void inputContent(SeleniumUtil seleniumUtil,String content){
        seleniumUtil.sendKeys(PageAnswer.ANSWER_INPUT_CONTENT,content);
    }
    //2点击帖子
    public static void lookUp1(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(PageAnswer.ANSWER_TIEZI_CLICK,10);
        seleniumUtil.clickElement(PageAnswer.ANSWER_TIEZI_CLICK);
    }
    //2点击回复
    public static void inputContent2(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(PageAnswer.ANSWER_HUIFU_CLICK,10);
        seleniumUtil.clickElement(PageAnswer.ANSWER_HUIFU_CLICK);
    }
    //2回复内容
    public static void textAnswer2(SeleniumUtil seleniumUtil,String neirong){
        seleniumUtil.waitForElementLoad(PageAnswer.ANSWER_HUIFU_TEXT,10);
        seleniumUtil.sendKeys(PageAnswer.ANSWER_HUIFU_TEXT,neirong);
    }
    //2点击回复按钮
    public static void clickAnswer2(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(PageAnswer.ANSWER_HUIFU1_CLICK,10);
        seleniumUtil.clickElement(PageAnswer.ANSWER_HUIFU1_CLICK);
    }
    //2直接评论
    public static  void answerA2(SeleniumUtil seleniumUtil,String txt){

        model(seleniumUtil);
        lookUp1(seleniumUtil);
        inputContent2(seleniumUtil);
        textAnswer2(seleniumUtil,txt);
        clickAnswer2(seleniumUtil);

    }
    //点击回复按钮
    public static void clickAnswer(SeleniumUtil seleniumUtil){
        seleniumUtil.clickElement(PageAnswer.ANSWER_BUTTON_ANSWER);
    }

    //回复贴的全过程
    public static void answerArticle(SeleniumUtil seleniumUtil,String  text){
        model(seleniumUtil);
        lookUp(seleniumUtil);
        inputContent(seleniumUtil,text);
        clickAnswer(seleniumUtil);
    }

    //直接评论
    public static  void answerA(SeleniumUtil seleniumUtil,String txt){
        inputContent(seleniumUtil,txt);
        clickAnswer(seleniumUtil);

    }
}
