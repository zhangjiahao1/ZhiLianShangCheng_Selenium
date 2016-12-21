package cn.Wolf.testScripts;

import org.testng.annotations.Test;

import cn.Wolf.cores.BaseTest;
import cn.Wolf.pageObjects.BackAnnouncementPage;
import cn.Wolf.pageObjects.LoginBackPage;
/**
 *@author 杨晨  
*/
public class BackAnnouncementTest extends BaseTest{
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
//公告列表	
	@Test(priority=1)
	public void addAnnouncementTest() throws InterruptedException{
		BackAnnouncementPage  a = new BackAnnouncementPage (back.getDriver());
		back.click(a.button1);
		Thread.sleep(2000);
		back.click(a.button2);
		Thread.sleep(2000);	
	}
//发布新闻	
	@Test(priority=2)
	public void addTest() throws InterruptedException {
		BackAnnouncementPage  a = new BackAnnouncementPage (back.getDriver());
		back.click(a.addbutton1 );
		Thread.sleep(2000);
		back.type(a.addtitle,"11");
		back.click(a.addbutton2);
		Thread.sleep(1000);
		back.type(a.addtextarea,"京东商城");
		Thread.sleep(1000);
		back.click(a.addbutton3);
	}
//修改新闻
	@Test(priority=3)
	public void changeTest()  {
		BackAnnouncementPage  a = new BackAnnouncementPage (back.getDriver());
		back.click(a.changebutton1);
		back.typeAndClear(a.changetitle,"双11 京东");
		back.click(a.changebutton2);
        //����
		back.click(a.rewritebutton);
		back.typeAndClear(a.changetitle,"京东商城 商城");
		back.click(a.changebutton2);
		back.typeAndClear(a.changetextarea,"京东商城 商城京东");
		back.click(a.changebutton3);
		back.click(a.changebutton4);
	}
//复选框
	@Test(priority=4)
	public void checkboxTest() throws InterruptedException {
		BackAnnouncementPage  a = new BackAnnouncementPage (back.getDriver());
		back.click(a.checkboxbutton);
		Thread.sleep(2000);
	}	
//页码
	@Test(priority=5)
	public void nextPageTest() throws InterruptedException {
		BackAnnouncementPage  a = new BackAnnouncementPage (back.getDriver());
		back.click(a.nextbutton);
		Thread.sleep(2000);
	}
//删除新闻
	@Test(priority=6)
	public void deleteTest() throws InterruptedException {
		BackAnnouncementPage  a = new BackAnnouncementPage (back.getDriver());
		back.click(a.deletebutton);
		robot.pressEnterKey();
		Thread.sleep(2000);
	}
}
