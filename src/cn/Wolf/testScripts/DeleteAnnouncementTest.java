package cn.Wolf.testScripts;
//É¾³ýÐÂÎÅ
import org.testng.annotations.AfterMethod;

import cn.Wolf.pageObjects.BackAnnouncementPage;

public class DeleteAnnouncementTest extends AnnouncementTest{
	@AfterMethod
	public void deleteTest() throws InterruptedException {
		BackAnnouncementPage  a = new BackAnnouncementPage (back.getDriver());
		back.click(a.deletebutton);
		robot.pressEnterKey();
		Thread.sleep(2000);
	}
}
