package pageHelper;

import Seleniumutil.SeleniumUtil;
import page.PageAnswer;
import page.PageAnswerVote;

/**
 * Created by admin on 2018/5/9.
 */
public class HelperAnswerVoteTest {

    //点击默认板块
    public  static  void model(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(PageAnswerVote.ANSWERVOTE_LINKTEXT_SEND,10);
        seleniumUtil.clickElement(PageAnswerVote.ANSWERVOTE_LINKTEXT_SEND);
    }

    //定位投票帖子
    public static void clickArticle(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(PageAnswerVote.ANSWERVOTE_LINKTEXT_ARTICLE,10);
        seleniumUtil.clickElement(PageAnswerVote.ANSWERVOTE_LINKTEXT_ARTICLE);
    }

    //选择买按钮
    public  static  void clickBuy(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(PageAnswerVote.ANSWERVOTE_RADIO_BUY,10);
        seleniumUtil.clickElement(PageAnswerVote.ANSWERVOTE_RADIO_BUY);
    }

    //提交投票
    public static  void  clickButtonSubmit(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(PageAnswerVote.ANSWERVOTE_BUTTON_SUBMIT,10);
        seleniumUtil.clickElement(PageAnswerVote.ANSWERVOTE_BUTTON_SUBMIT);
    }

    //投票全过程
    public static void  voteArticle(SeleniumUtil seleniumUtil){
        model(seleniumUtil);
        clickArticle(seleniumUtil);
        clickBuy(seleniumUtil);
        clickButtonSubmit(seleniumUtil);

    }
}
