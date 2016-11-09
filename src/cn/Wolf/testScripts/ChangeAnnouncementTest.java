package cn.Wolf.testScripts;
//修改新闻
import org.testng.annotations.AfterMethod;

import cn.Wolf.pageObjects.BackAnnouncementPage;

public class ChangeAnnouncementTest extends AnnouncementTest{
	
	@AfterMethod
	public void changeTest() throws InterruptedException {
		BackAnnouncementPage  a = new BackAnnouncementPage (back.getDriver());
		back.click(a.changebutton1);
		Thread.sleep(2000);
		back.typeAndClear(a.changetitle,"双11");
		back.click(a.changebutton2);
		back.typeAndClear(a.changetextarea,"双11 京东商城 商城京东 双11购物节 双11");
		back.click(a.changebutton3);
		back.click(a.changebutton4);
	}
}
