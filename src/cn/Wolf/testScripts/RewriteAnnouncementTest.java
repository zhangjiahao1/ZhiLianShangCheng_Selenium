package cn.Wolf.testScripts;
//新闻重填
import org.testng.annotations.AfterMethod;

import cn.Wolf.pageObjects.BackAnnouncementPage;

public class RewriteAnnouncementTest extends AnnouncementTest{
	@AfterMethod
	public void rewriteTest() throws InterruptedException {
		BackAnnouncementPage  a = new BackAnnouncementPage (back.getDriver());
		back.click(a.addbutton1);
		Thread.sleep(2000);
		back.type(a.addtitle,"双11京东");
		back.click(a.addbutton2);
		Thread.sleep(1000);
		back.type(a.addtextarea,"双11  京东商城");
		Thread.sleep(1000);
		back.click(a.rewritebutton);
		Thread.sleep(2000);
	}
	
}
