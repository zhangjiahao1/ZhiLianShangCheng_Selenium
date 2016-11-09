package cn.Wolf.testScripts;
//商城信息
import org.testng.annotations.Test;

import cn.Wolf.pageObjects.BackStorePage;

public class StoreTest extends BackgroundLoginTest{
	@Test
	public void presentationDiagramTest() throws InterruptedException {
		BackStorePage  s = new BackStorePage (back.getDriver());
		back.click(s.storebutton1);
		Thread.sleep(2000);
		back.click(s.storebutton2);
		Thread.sleep(2000);
	}
}
