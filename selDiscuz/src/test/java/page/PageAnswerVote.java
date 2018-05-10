package page;

import org.openqa.selenium.By;

/**
 * Created by admin on 2018/5/9.
 */
public class PageAnswerVote {

    //默认板块
    public static final By ANSWERVOTE_LINKTEXT_SEND=By.linkText("默认版块");

    //定位投票帖子
    public static final By ANSWERVOTE_LINKTEXT_ARTICLE=By.linkText("买一个电视机");

    //选择买按钮
    public static final By ANSWERVOTE_RADIO_BUY=By.xpath("//*[@id=\"option_1\"]");

    //提交投票
    public static  final By ANSWERVOTE_BUTTON_SUBMIT=By.name("pollsubmit");
}
