package cn.Wolf.testScripts;
//����Ϊ�����
import org.testng.annotations.AfterMethod;

import cn.Wolf.pageObjects.BackPresentationDiagramPage;

public class NewAddTest extends PresentationDiagramTest{
	@AfterMethod
	public void newAddTest() throws InterruptedException {
		BackPresentationDiagramPage  p = new BackPresentationDiagramPage (back.getDriver());
		back.click(p.newbutton);
		Thread.sleep(2000);
	}
}
