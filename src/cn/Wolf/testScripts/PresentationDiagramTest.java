package cn.Wolf.testScripts;
//展示图列表
import org.testng.annotations.Test;

import cn.Wolf.pageObjects.BackPresentationDiagramPage;

public class PresentationDiagramTest extends BackgroundLoginTest{
	@Test
	public void presentationDiagramTest() throws InterruptedException {
		BackPresentationDiagramPage  p = new BackPresentationDiagramPage (back.getDriver());
		back.click(p.pdbutton1);
		Thread.sleep(2000);
		back.click(p.pdbutton2);
		Thread.sleep(2000);
	}
}
