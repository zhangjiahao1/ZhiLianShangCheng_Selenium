package cn.Wolf.appModules;

import cn.Wolf.cores.BaseTest;
import cn.Wolf.utils.PropertiesUtil;

public class LoginModule extends BaseTest{
	
	
	//登录模块
	public static void loginTest(String username, String passwd) throws InterruptedException{
		front.open("http://localhost:8032/zl_shop/index.php");
		front.click(PropertiesUtil.getStrings("LoginButton", "conf/LoginPageObjects.properties"));
		front.type(PropertiesUtil.getStrings("username", "conf/LoginPageObjects.properties"), username);
		front.type(PropertiesUtil.getStrings("password", "conf/LoginPageObjects.properties"), passwd);
		front.click(PropertiesUtil.getStrings("SubButton", "conf/LoginPageObjects.properties"));
		front.click(PropertiesUtil.getStrings("ExitButton", "conf/LoginPageObjects.properties"));
		Thread.sleep(3000);
	}
	
}
