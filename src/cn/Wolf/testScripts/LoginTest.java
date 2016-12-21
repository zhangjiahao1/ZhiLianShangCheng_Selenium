package cn.Wolf.testScripts;

import java.io.UnsupportedEncodingException;
import org.testng.annotations.Test;
import cn.Wolf.cores.BaseTest;
import cn.Wolf.appModules.LoginModule;
import cn.Wolf.appModules.Shopcar;
import cn.Wolf.utils.NSDataProvicer;
import cn.Wolf.appModules.BalanceModule;
import cn.Wolf.cores.Checker;
/**
 * 
 * @author 张佳浩
 *
 */
public class LoginTest extends BaseTest{
	
	//登录冒烟测试
	@Test(dataProvider = "Login", dataProviderClass=NSDataProvicer.class)
	public void loginTest(String username, String passwd) throws UnsupportedEncodingException, InterruptedException{
		LoginModule.loginTest(username, passwd);
		front.click("link=退出");
	}
}







