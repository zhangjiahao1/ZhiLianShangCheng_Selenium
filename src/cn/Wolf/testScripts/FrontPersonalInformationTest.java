package cn.Wolf.testScripts;

import java.io.UnsupportedEncodingException;

import org.testng.annotations.Test;
import cn.Wolf.appModules.LoginModule;
import cn.Wolf.cores.BaseTest;
import cn.Wolf.utils.NSDataProvicer;
import cn.Wolf.utils.PropertiesUtil;
/**
 *@author 杨晨  
*/
public class FrontPersonalInformationTest extends BaseTest{
//登录
	@Test(priority=0)
	public void frontLogin() throws InterruptedException, UnsupportedEncodingException {
		LoginModule.loginTest("zhangjiahao1","123456789");
	}
//	@Test(priority=0,dataProvider="Login",dataProviderClass=NSDataProvicer.class)
//	public void frontLoginTest(String username,String passwd) throws InterruptedException, UnsupportedEncodingException {
//		LoginModule.loginTest(username,passwd);
//	}
	
//个人信息列表
	@Test(priority=1)
	public void personal() throws UnsupportedEncodingException {
		front.click(PropertiesUtil.getStrings("PersonalButton", "conf/PersonalInformationPageObject.properties"));
	}
//编辑个人信息
	@Test(priority=2,dataProvider="Information",dataProviderClass=NSDataProvicer.class)
	public void addInformation(String nickname,String email,String realname,String pwd,String upwd) throws InterruptedException, UnsupportedEncodingException {	
		front.typeAndClear(PropertiesUtil.getStrings("NickName", "conf/PersonalInformationPageObject.properties"),nickname);
		front.click(PropertiesUtil.getStrings("SexButton", "conf/PersonalInformationPageObject.properties"));
		front.typeAndClear(PropertiesUtil.getStrings("Email", "conf/PersonalInformationPageObject.properties"),email);
		front.typeAndClear(PropertiesUtil.getStrings("RealName", "conf/PersonalInformationPageObject.properties"),realname);
		front.typeAndClear(PropertiesUtil.getStrings("Password", "conf/PersonalInformationPageObject.properties"),pwd);
		front.typeAndClear(PropertiesUtil.getStrings("RePassword", "conf/PersonalInformationPageObject.properties"),upwd);
		front.click(PropertiesUtil.getStrings("InputButton", "conf/PersonalInformationPageObject.properties"));
	}
}

