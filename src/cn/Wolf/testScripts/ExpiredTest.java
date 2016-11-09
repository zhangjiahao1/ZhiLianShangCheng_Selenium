package cn.Wolf.testScripts;
//设置为已过期
import org.testng.annotations.AfterMethod;

import cn.Wolf.pageObjects.BackPresentationDiagramPage;

public class ExpiredTest extends PresentationDiagramTest{
	@AfterMethod
	public void expiredTest() throws InterruptedException {
		BackPresentationDiagramPage  p = new BackPresentationDiagramPage (back.getDriver());
		back.click(p.expiredbutton);
		Thread.sleep(2000);
	}
}
