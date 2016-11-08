package cn.Wolf.testScripts;

import org.testng.annotations.Test;
import cn.Wolf.cores.BaseTest;
import cn.Wolf.pageObjects.LoginBackPage;
import cn.Wolf.appModules.LoginModule;


public class LoginTest extends BaseTest{
	
	@Test(enabled = false)
	public void logintest() throws InterruptedException{
		LoginModule.loginTest("zhangjiahao", "9544257521");
		
	}
	
	@Test()
	public void registerTest(){
		front.open("http://localhost:8032/zl_shop/index.php");
		front.click("link=快速注册");
		front.type("name=username", "zhangjiajia");
		front.type("name=password", "1234567890");
		front.type("name=password2", "1234567890");
		front.type("name=email", "1234@qq.com");
		front.click("xpath=//*[@id='regform']/div[7]/div[2]/input");
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
