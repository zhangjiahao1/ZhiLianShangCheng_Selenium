package cn.Wolf.testScripts;

import org.testng.annotations.Test;

import cn.Wolf.cores.BaseTest;
import cn.Wolf.pageObjects.BackPresentationDiagramPage;
import cn.Wolf.pageObjects.LoginBackPage;
/**
 *@author 杨晨  
*/
public class BackPresentationDiagramTest extends BaseTest{
//登录
	@Test(priority=0)
	public void loginTest() throws InterruptedException{
		LoginBackPage h1 = new LoginBackPage(back.getDriver());
		back.open("http://localhost:8032/zl_shop/admin.php/Login");
		back.type(h1.username,"admin");
		back.type(h1.password,"admin");
		back.click(h1.button);
		Thread.sleep(2000);
	}
//展示图列表
	@Test(priority=1)
	public void presentationDiagramTest() throws InterruptedException {
		BackPresentationDiagramPage  p = new BackPresentationDiagramPage (back.getDriver());
		back.click(p.pdbutton1);
		Thread.sleep(2000);
		back.click(p.pdbutton2);
		Thread.sleep(2000);
	}
//设置为已过期
	@Test(priority=2)
	public void expiredTest() throws InterruptedException {
		BackPresentationDiagramPage  p = new BackPresentationDiagramPage (back.getDriver());
		back.click(p.expiredbutton);
		Thread.sleep(2000);
	}
//设置为新添加
	@Test(priority=3)
	public void newAddTest() throws InterruptedException {
		BackPresentationDiagramPage  p = new BackPresentationDiagramPage (back.getDriver());
		back.click(p.newbutton);
		Thread.sleep(2000);
	}
//设置为已发布
	@Test(priority=4)
	public void alreadyReleasedTest() throws InterruptedException {
		BackPresentationDiagramPage  p = new BackPresentationDiagramPage (back.getDriver());
		back.click(p.releasedbutton);
		Thread.sleep(2000);
	}
//添加展示图
	@Test(priority=5)
	public void addPresentationDiagramTest() throws InterruptedException {
		BackPresentationDiagramPage  p = new BackPresentationDiagramPage (back.getDriver());
		back.click(p.addpdbutton1);
		Thread.sleep(1000);
		back.type(p.pdtitle,"˫11");
		back.type(p.pdlink,"http://localhost:8032/zl_shop/admin.php");
		back.type(p.pdpicture,"E:\\1\\1.jpg");
		back.click(p.addpdbutton2);
		Thread.sleep(2000);
	}

}
