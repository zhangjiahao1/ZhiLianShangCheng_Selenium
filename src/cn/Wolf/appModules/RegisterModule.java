package cn.Wolf.appModules;

import java.io.UnsupportedEncodingException;

import cn.Wolf.cores.BaseTest;
import cn.Wolf.utils.PropertiesUtil;
/**
 * 
 * @author 张佳浩
 *
 */
public class RegisterModule extends BaseTest {
	
	//注册模块
	public static void registerTest(String username, String password, 
			String password2, String email) throws InterruptedException, UnsupportedEncodingException{
		front.open("http://localhost:8032/zl_shop/index.php");
		front.click(PropertiesUtil.getStrings("fastRegister", "conf/RegisterPageObjects.properties"));
		front.type(PropertiesUtil.getStrings("username", "conf/RegisterPageObjects.properties"), username);
		front.type(PropertiesUtil.getStrings("password", "conf/RegisterPageObjects.properties"), password);
		front.type(PropertiesUtil.getStrings("password2", "conf/RegisterPageObjects.properties"), password2);
		front.type(PropertiesUtil.getStrings("email", "conf/RegisterPageObjects.properties"), email);
		front.click(PropertiesUtil.getStrings("registerButton", "conf/RegisterPageObjects.properties"));
	}
}
