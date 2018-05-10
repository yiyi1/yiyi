package page;

import org.openqa.selenium.By;

/**
 * Created by admin on 2018/5/8.
 */
public class PageDelArticle {


    //发帖——默认板块
    public static final By DELETE_LINKTEXT_MODEL=By.linkText("默认版块");

    //选中要删除的帖子
    public static final By DELETE_INPUT_DELETE=By.xpath("//*[@id=\"normalthread_38\"]/tr/td[2]/input");

    //删除
    public static final By DELETE_LINKTEXT_DELE=By.linkText("删除");

    //输入删除原因
    public static final  By DELETE_INPUT_RESON=By.id("reason");

    //删除确定按钮
    public static  final  By DELETE_BUTTON_ACCPECT=By.name("modsubmit");
}
