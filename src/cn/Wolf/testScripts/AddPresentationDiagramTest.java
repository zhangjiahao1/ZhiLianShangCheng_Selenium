package cn.Wolf.testScripts;
//添加展示图
import org.testng.annotations.AfterMethod;

import cn.Wolf.pageObjects.BackPresentationDiagramPage;

public class AddPresentationDiagramTest extends PresentationDiagramTest{
	@AfterMethod
	public void addPresentationDiagramTest() throws InterruptedException {
		BackPresentationDiagramPage  p = new BackPresentationDiagramPage (back.getDriver());
		back.click(p.addpdbutton1);
		Thread.sleep(1000);
		back.type(p.pdtitle,"双11");
		back.type(p.pdlink,"http://localhost:8032/zl_shop/admin.php");
		back.type(p.pdpicture,"E:\\1\\1.jpg");
		back.click(p.addpdbutton2);
		Thread.sleep(2000);
	}
}
