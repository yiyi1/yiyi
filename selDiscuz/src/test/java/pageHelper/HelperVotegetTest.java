package pageHelper;

import Seleniumutil.SeleniumUtil;
import page.PageAnswerVote;
import page.PageVotegetText;

/**
 * Created by admin on 2018/5/9.
 */
public class HelperVotegetTest {
    //选择帖子
    public static void select(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(PageAnswerVote.ANSWERVOTE_LINKTEXT_ARTICLE,10);
        seleniumUtil.clickElement(PageAnswerVote.ANSWERVOTE_LINKTEXT_ARTICLE);
    }

    //获得买的标题和比例
    public static void getBuyTitle(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(PageVotegetText.GET_BUY_TITLE,10);
        seleniumUtil.getText(PageVotegetText.GET_BUY_TITLE);
        seleniumUtil.waitForElementLoad(PageVotegetText.GET_BUY_RATIO,10);
        seleniumUtil.getText(PageVotegetText.GET_BUY_RATIO);
    }

    //获得不买的标题和比例
    public static void getNoBuyTitle(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(PageVotegetText.GET_NOTBUY_TITLE,10);
        seleniumUtil.getText(PageVotegetText.GET_NOTBUY_TITLE);
        seleniumUtil.waitForElementLoad(PageVotegetText.GET_NOTBUY_RATIO,10);
        seleniumUtil.getText(PageVotegetText.GET_NOTBUY_RATIO);
    }


    //主题名称
    public static  void getThrome(SeleniumUtil seleniumUtil){
        seleniumUtil.waitForElementLoad(PageVotegetText.GET_THROME_TITLE,10);
        seleniumUtil.getText(PageVotegetText.GET_THROME_TITLE);
    }

   //获得投票页面的选项文字和对应的比例
    public static void getTitle(SeleniumUtil seleniumUtil){
        select(seleniumUtil);
        getBuyTitle(seleniumUtil);
        getNoBuyTitle(seleniumUtil);
        getThrome(seleniumUtil);
    }
}
