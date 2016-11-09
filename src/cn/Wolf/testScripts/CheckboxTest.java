package cn.Wolf.testScripts;
//¸´Ñ¡¿ò
import org.testng.annotations.AfterMethod;

import cn.Wolf.pageObjects.BackAnnouncementPage;

public class CheckboxTest extends AnnouncementTest{
	@AfterMethod 
	public void checkboxTest() throws InterruptedException {
		BackAnnouncementPage  a = new BackAnnouncementPage (back.getDriver());
		back.click(a.checkboxbutton);
		Thread.sleep(2000);
	}
}
