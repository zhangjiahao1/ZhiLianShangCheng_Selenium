package cn.Wolf.testScripts;
//公告列表
import org.testng.annotations.Test;

import cn.Wolf.pageObjects.BackAnnouncementPage;

public class AnnouncementTest extends BackgroundLoginTest{
	
	@Test
	public void addAnnouncementTest() throws InterruptedException{
		BackAnnouncementPage  a = new BackAnnouncementPage (back.getDriver());
		back.click(a.button1);
		Thread.sleep(2000);
		back.click(a.button2);
		Thread.sleep(2000);
		
	}
}
