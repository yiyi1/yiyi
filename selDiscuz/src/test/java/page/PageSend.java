package page;

import org.openqa.selenium.By;

/**
 * Created by admin on 2018/5/8.
 */
public class PageSend {

    //发帖——默认板块
    public static final By SEND_LINKTEXT_SEND=By.linkText("默认版块");

   /* //发帖img
    public static  final By SEND_IMG_SEND=By.id("newspecial");*/

    //发帖——输入内容标题
    public static  final By SEND_INPUT_TITLE=By.id("subject");

    //发帖——输入内容
    public static final By SEND_INPUT_CONTENT=By.xpath("//*[@id=\"fastpostmessage\"]");

    //发帖----按钮点击
    public static  final  By SEND_BUTTON_SEND=By.id("fastpostsubmit");
}


