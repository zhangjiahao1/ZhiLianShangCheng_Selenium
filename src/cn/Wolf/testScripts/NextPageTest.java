package cn.Wolf.testScripts;
//обр╩рЁ
import org.testng.annotations.AfterMethod;

import cn.Wolf.pageObjects.BackAnnouncementPage;

public class NextPageTest extends AnnouncementTest{
	@AfterMethod
	public void nextPageTest() throws InterruptedException {
		BackAnnouncementPage  a = new BackAnnouncementPage (back.getDriver());
		back.click(a.nextbutton);
		Thread.sleep(2000);
	}
}
