package cn.Wolf.testScripts;

import org.testng.annotations.Test;

import cn.Wolf.cores.BaseTest;
import cn.Wolf.pageObjects.BackMessagePage;
import cn.Wolf.pageObjects.LoginBackPage;
/**
 *@author 杨晨  
*/
public class BackMessageTest extends BaseTest{
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
//消息列表
	@Test(priority=1)
	public void messageTest() throws InterruptedException {
		BackMessagePage  m = new BackMessagePage (back.getDriver());
		back.click(m.messagebutton1);
		Thread.sleep(2000);
		back.click(m.messagebutton2);
		Thread.sleep(2000);
	}
}
