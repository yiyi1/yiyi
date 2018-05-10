package pageHelper;

import Seleniumutil.SeleniumUtil;
import page.PageSend;
import page.PageSendVote;

/**
 * Created by admin on 2018/5/9.
 */
public class HelperSendVoteArticleTest {

    //发帖——点击默认板块
    public static void model(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(PageSendVote.SENDVOTE_LINKTEXT_SEND,10);
        seleniumUtil.clickElement(PageSendVote.SENDVOTE_LINKTEXT_SEND);
    }

    //点击发帖
    public static void clickSend(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(PageSendVote.SENDVOTE_IMG_SEND,10);
        seleniumUtil.clickElement(PageSendVote.SENDVOTE_IMG_SEND);
    }

    //选择发起投票
    public static void clickVote(SeleniumUtil seleniumUtil) {
        seleniumUtil.waitForElementLoad(PageSendVote.SENDVOTE_LINKTEXT_VOTE,10);
        seleniumUtil.clickElement(PageSendVote.SENDVOTE_LINKTEXT_VOTE);
    }
    //输入标题
    public static void inputTitle(SeleniumUtil seleniumUtil,String content){
        seleniumUtil.waitForElementLoad(PageSendVote.SENDVOTE_INPUT_TITLE,10);
        seleniumUtil.sendKeys(PageSendVote.SENDVOTE_INPUT_TITLE,content);
    }

    //输入选项一
    public static void inputSelect1(SeleniumUtil seleniumUtil,String content){
        seleniumUtil.waitForElementLoad(PageSendVote.SENDVOTE_INPUT_SELECT1,10);
        seleniumUtil.sendKeys(PageSendVote.SENDVOTE_INPUT_SELECT1,content);
    }

    //输入选项二
    public static void inputSelect2(SeleniumUtil seleniumUtil,String content){
        seleniumUtil.waitForElementLoad(PageSendVote.SENDVOTE_INPUT_SELECT2,10);
        seleniumUtil.sendKeys(PageSendVote.SENDVOTE_INPUT_SELECT2,content);
    }



    //提交按钮
    public static void clickSubmitVote(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(PageSendVote.SENDVOTE_BUTTON_SUBMIT,10);
        seleniumUtil.clickElement(PageSendVote.SENDVOTE_BUTTON_SUBMIT);
    }

    //总的流程
    public static void sendVote(SeleniumUtil seleniumUtil,String title,String content1,String content2,String content3){
        model(seleniumUtil);
        clickSend(seleniumUtil);
        clickVote(seleniumUtil);
        inputTitle(seleniumUtil,title);
        inputSelect1(seleniumUtil,content1);
        inputSelect2(seleniumUtil,content2);
        clickSubmitVote(seleniumUtil);

    }
}
