package page;

import org.openqa.selenium.By;

/**
 * Created by admin on 2018/5/9.
 */
public class PageSendVote {
    //默认板块
    public static final By SENDVOTE_LINKTEXT_SEND=By.linkText("默认版块");


    //发帖按钮
    public static  final By SENDVOTE_IMG_SEND=By.xpath("//*[@id=\"newspecial\"]/img");

    //发起投票
    public static final By SENDVOTE_LINKTEXT_VOTE=By.linkText("发起投票");

    //输入标题
    public static final By SENDVOTE_INPUT_TITLE=By.id("subject");

    //选项一
    public static final By SENDVOTE_INPUT_SELECT1=By.xpath("//*[@id=\"pollm_c_1\"]/p[1]/input");

    //选项二
    public static  final By SENDVOTE_INPUT_SELECT2=By.xpath("//*[@id=\"pollm_c_1\"]/p[2]/input");

    //内容
    public static final By SENDVOTE_INPUT_CONTENT=By.xpath("/html/body");

    //提交
    public static  final By SENDVOTE_BUTTON_SUBMIT=By.id("postsubmit");
}
