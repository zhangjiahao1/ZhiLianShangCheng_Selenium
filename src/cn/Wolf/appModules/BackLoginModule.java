package cn.Wolf.appModules;

import cn.Wolf.cores.BaseTest;
import cn.Wolf.pageObjects.LoginBackPage;

public class BackLoginModule extends BaseTest{
	
	//后台登录模块
	public static void backLoginModule() throws InterruptedException{
		LoginBackPage h1 = new LoginBackPage(back.getDriver());
		back.open("http://localhost:8032/zl_shop/admin.php/Login");
		back.type(h1.username,"admin");
		back.type(h1.password,"admin");
		back.click(h1.button);
		Thread.sleep(2000);
	}
	
}
