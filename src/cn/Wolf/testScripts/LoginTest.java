package cn.Wolf.testScripts;

import org.testng.annotations.Test;
import cn.Wolf.cores.BaseTest;
import cn.Wolf.pageObjects.LoginBackPage;
import cn.Wolf.appModules.LoginModule;
import cn.Wolf.utils.NSDataProvicer;
import cn.Wolf.utils.SwitchWindows;

public class LoginTest extends BaseTest{
	
	@Test(dataProvider = "Login", dataProviderClass=NSDataProvicer.class)
	public void logintest(String username, String password) throws InterruptedException{
		LoginModule.loginTest(username, password);
		
	}

	
	@Test
	public void test1() throws InterruptedException{
		front.open("http://localhost:8032/zl_shop/index.php/index/index.html");
		front.click("link=韩都衣舍 韩版2015夏装新款女装青年时尚休闲宽松字母印花蝙蝠袖圆领短袖T恤GD5018肆");
		Thread.sleep(2000);
		SwitchWindows.switchToWindow("京东", front.getDriver());
		front.click("xpath=//*[@id='choose']/div[2]/div/a");//购物车按钮
		Thread.sleep(2000);
	}
	
	
	
	
	@Test(enabled = false)
	public void backTest(){
		LoginBackPage h = new LoginBackPage(back.getDriver());
		back.open("http://localhost:8032/zl_shop/admin.php/Login/");
		back.type(h.username, "admin");
		back.type(h.password, "admin");
		back.click(h.button);

	}
	//back.click(PropertiesUtil.getStrings("registerLink", "conf/LoginPageObjects.properties"));
}







