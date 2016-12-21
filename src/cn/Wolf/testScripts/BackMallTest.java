package cn.Wolf.testScripts;

import org.testng.annotations.Test;

import cn.Wolf.cores.BaseTest;
import cn.Wolf.pageObjects.BackMallPage;
import cn.Wolf.pageObjects.LoginBackPage;
/**
 *@author 杨晨  
*/
public class BackMallTest extends BaseTest{
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
//商城信息
	@Test(priority=1)
	public void presentationDiagramTest() throws InterruptedException {
		BackMallPage  s = new BackMallPage (back.getDriver());
		back.click(s.storebutton1);
		Thread.sleep(2000);
		back.click(s.storebutton2);
		Thread.sleep(2000);
	}
//修改商城信息
	@Test(priority=2)
	public void modifyTest() throws InterruptedException {
		BackMallPage  s = new BackMallPage (back.getDriver());
		back.click(s.modifybutton1);
		Thread.sleep(1000);
		back.typeAndClear(s.modifyname,"京东1");
		back.typeAndClear(s.modifybrief,"京东商城  商城");
		back.typeAndClear(s.modifyphone,"400-120-0000");
		back.click(s.modifybutton2);
		Thread.sleep(2000);
	}
}
