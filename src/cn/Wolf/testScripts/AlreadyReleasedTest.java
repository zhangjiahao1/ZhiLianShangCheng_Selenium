package cn.Wolf.testScripts;
//����Ϊ�ѷ���
import org.testng.annotations.AfterMethod;

import cn.Wolf.pageObjects.BackPresentationDiagramPage;

public class AlreadyReleasedTest extends PresentationDiagramTest{
	@AfterMethod
	public void alreadyReleasedTest() throws InterruptedException {
		BackPresentationDiagramPage  p = new BackPresentationDiagramPage (back.getDriver());
		back.click(p.releasedbutton);
		Thread.sleep(2000);
	}
}