package page;

import org.openqa.selenium.By;

/**
 * Created by admin on 2018/5/8.
 */
public class PageAnswer {
    //默认板块
    public static final By ANSWER_LINKTEXT_SEND=By.linkText("默认版块");
    //查看已发的帖
    public static final By ANSWER_LINKTEXT_CLICK=By.linkText("hello,");
    //回复内容框
    public static final By ANSWER_INPUT_CONTENT=By.xpath("//*[@id=\"fastpostmessage\"]");
    //回复按钮
    public static final By ANSWER_BUTTON_ANSWER=By.name("replysubmit");


    //帖子
    public static final By ANSWER_TIEZI_CLICK=By.xpath("//*[@id=\"normalthread_37\"]/tr/th/a[2]");
    //回复按钮
    public static final By ANSWER_HUIFU_CLICK=By.xpath("//*[@id=\"post_reply\"]/img");
    //回复框
    public static final By ANSWER_HUIFU_TEXT=By.id("postmessage");
    //点击回复按钮
    public static final By ANSWER_HUIFU1_CLICK=By.id("postmessage");
}
