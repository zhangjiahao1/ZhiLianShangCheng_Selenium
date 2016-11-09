package cn.Wolf.testScripts;
//消息列表
import org.testng.annotations.Test;

import cn.Wolf.pageObjects.BackMessagePage;

public class MessageTest extends BackgroundLoginTest{
	@Test
	public void messageTest() throws InterruptedException {
		BackMessagePage  m = new BackMessagePage (back.getDriver());
		back.click(m.messagebutton1);
		Thread.sleep(2000);
		back.click(m.messagebutton2);
		Thread.sleep(2000);
	}
}
