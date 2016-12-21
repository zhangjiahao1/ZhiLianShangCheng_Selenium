package cn.Wolf.testScripts;

import java.io.UnsupportedEncodingException;

import org.testng.annotations.Test;
import cn.Wolf.cores.BaseTest;
import cn.Wolf.utils.NSDataProvicer;
import cn.Wolf.appModules.RegisterModule;

public class RegisterTest extends BaseTest{
	
	//注册冒烟测试
	@Test(dataProvider = "Register", dataProviderClass=NSDataProvicer.class)
	public void registerTest(String username, 
							 String password, 
							 String password2, 
							 String email) throws InterruptedException, UnsupportedEncodingException{
		RegisterModule.registerTest(username, password, password, email);

	}
}
