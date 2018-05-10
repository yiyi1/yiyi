package Seleniumutil;

import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;
import java.util.Set;

/**
 * Created by admin on 2018/5/7.
 */
public class SeleniumUtil {
    WebDriver we =null;
    WebElement ele=null;
    public Logger logger = Logger.getLogger(SeleniumUtil.class);
    //启动webDriver
    public WebDriver getWebd(String driverName){

        if(driverName.equalsIgnoreCase("chrome")){
            we = new ChromeDriver();
            logger.info("启动chromedriver");
        }
        else if(driverName.equalsIgnoreCase("firefox")){
            we = new FirefoxDriver();
            logger.info("启动firefoxdriver");
        }
        else{
            logger.error("不能识别该驱动");
        }
        return we;
    }

    //打开网址
    public void urlOpean(String path){
        we.get(path);
        logger.info("获得网址:"+path);
    }

    //查询到具体元素的属性值
    public String getLocatorByElement(WebElement element, String a){
        String str = element.toString();
        try {
            String manager = str.substring(str.indexOf(a) + 1, str.length() - 1);
            logger.info("属性的值为："+manager);
            return manager;
        }catch (NoSuchElementException e){
            e.printStackTrace();
            logger.error("没有找到该元素的属性值");
            return  null;
        }
    }
    //查询WebElement
    public WebElement findElement(By by){
        try {
            ele = we.findElement(by);
            logger.error("成功定位到该元素:"+getLocatorByElement(ele,">"));
            return  ele;
        }catch (NoSuchElementException e ){
            e.printStackTrace();
            logger.error("没有定位到该元素:"+getLocatorByElement(ele,">"));
            return  null;
        }
    }

    //获取一组元素
    public List<WebElement> findElements(By by){

        try{
            List<WebElement> elements =(List<WebElement>) we.findElements(by);
            logger.info("获取到元素");
            return elements;
        }catch (NoSuchElementException e ){
            e.printStackTrace();
            logger.error("没有元素");
            return null;
        }

    }
    //清空内容
    public void clearContent(By by){
        ele=findElement(by);
        ele.clear();
        logger.info("已经清空该内容"+getLocatorByElement(ele,">"));
    }

    //点击元素
    public void clickElement(By by) {
        try {
            ele = findElement(by);
            ele.click();
            logger.info("点击" + getLocatorByElement(ele, ">") + "成功");
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            logger.error("点击" + getLocatorByElement(ele, ">") + "失败");
        }
    }

    //输入内容
    public void sendKeys(By by,String text){

        try{
            ele =findElement(by);
            ele.clear();
            ele.sendKeys(text);
            logger.info("输入:"+text+"成功true");
        }catch (NoSuchElementException e){
            e.printStackTrace();
            logger.error("输入:"+text+"失败false");
        }
    }

    //获取内容
    public String getText(By by){
        try{
            ele=findElement(by);
            String text=ele.getText();
            logger.info("获取到的内容为："+text);
            return text;
        }catch (NoSuchElementException e){
            e.printStackTrace();
            logger.error("获取不到内容");
            return null;
        }


        /*设置显示等待元素*/
     /*   public void waitForElementLoad(By by){
            logger.info("开始查找元素："+by);
            final String uiauText = "new UiSelector().text(\""+by+"\")";

            try{
                WebDriverWait wait = new WebDriverWait(we, 10, 1000);
                wait.until(new ExpectedCondition<Boolean>() {

                    public Boolean apply(WebDriver we) {
                        WebElement ele = we.findElement(uiauText);
                        return ele.isDisplayed();
                    }
                });
            } catch (TimeoutException e){
                logger.error("超时!! " + "10" + " 秒之后还没找到元素 [" + element + "]");
                Assert.fail("超时!! " + "10" + " 秒之后还没找到元素 [" + element + "]");
            }
            logger.info("找到了元素 [" + element + "]");
        }
*/

    }


    //对比页面，查看是否为预期页面
    public boolean getTitle(String atitle,String etitle){
        try {
            atitle = we.getTitle();
            Assert.assertEquals(atitle,etitle);
            logger.info("预期为"+etitle+"-----实际为："+atitle);
            return true;
        }catch (AssertionError e){
            e.printStackTrace();
            logger.error("预期为"+etitle+"-----实际为："+atitle);
            return false;
        }
    }

    //验证文本是否与预期一致
    public boolean isSameText(By by,String exception){
        String actually=null;
        try{
            ele=findElement(by);
            actually= ele.getText();
            Assert.assertEquals(actually,exception);
            logger.info("文本---"+actually+"与预期文本---"+exception+"一致");
            return true;
        }catch (NoSuchElementException e){
            e.printStackTrace();
            logger.error("文本---"+actually+"与预期文本---"+exception+"不一致");
            return false;
        }
    }

    //获得当前界面的window
    public  void getHandles(){
        Set<String> handles=we.getWindowHandles();
        for (String handle:handles ){
            if(!(we.getWindowHandle().equals(handle))){
                    we.switchTo().window(handle);
            }
            logger.info("获得当前句柄："+handle);
        }
    }

    //跳转到iframe模块
    public void getIframe(String name){

        we.switchTo().frame(name);
    }

    //返回主界面
    public void backHome(){
        we.switchTo().defaultContent();
    }

     //双击
    public void doublecilck(By by){

        ele=findElement(by);
       Actions ac = new Actions(we);
       ac.doubleClick(ele).perform();
}

    //等待元素加载
    public void waitForElementLoad(final By by, int timeOut){
        logger.info("开始查找元素："+by);
        try{
            WebDriverWait wait = new WebDriverWait(we, timeOut, 1000);
            wait.until(new ExpectedCondition<Boolean>() {

                public Boolean apply(WebDriver driver) {
                    WebElement element = driver.findElement(by);
                    return element.isDisplayed();
                }
            });
        } catch (TimeoutException e){
            logger.error("超时!! " + timeOut + " 秒之后还没找到元素 [" + by + "]");
            Assert.fail("超时!! " + timeOut + " 秒之后还没找到元素 [" + by + "]");
        }
        logger.info("找到了元素 [" + by + "]");
    }

}
