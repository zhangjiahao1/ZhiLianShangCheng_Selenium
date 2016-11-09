package cn.Wolf.testScripts;
//发布新闻
import org.testng.annotations.AfterMethod;

import cn.Wolf.pageObjects.BackAnnouncementPage;

public class AddAnnouncementTest extends AnnouncementTest{
	@AfterMethod
	public void addTest() throws InterruptedException {
		BackAnnouncementPage  a = new BackAnnouncementPage (back.getDriver());
		back.click(a.addbutton1 );
		Thread.sleep(2000);
		back.type(a.addtitle,"双11");
		back.click(a.addbutton2);
		Thread.sleep(1000);
		back.type(a.addtextarea,"双11 京东商城 京东商城");
		Thread.sleep(1000);
		back.click(a.addbutton3);
		Thread.sleep(1000);
		back.click(a.addbutton4);
	}
	
}
