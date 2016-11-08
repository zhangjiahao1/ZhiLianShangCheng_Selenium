package cn.Wolf.testScripts;

import org.testng.annotations.Test;
import cn.Wolf.cores.BaseTest;
import cn.Wolf.pageObjects.GoodsManagePage;
import cn.Wolf.pageObjects.LoginBackPage;
import cn.Wolf.utils.PropertiesUtil;

public class LoginTest extends BaseTest{
	
	@Test
	public void loginTest(){
		front.open("http://localhost:8032/zl_shop/index.php");
		front.click("link=µÇÂ¼");
		front.type("id=username", "zhangjiahao");
		front.type("id=password", "9544257521");
		front.click("class=sub");
		//back.click(PropertiesUtil.getStrings("registerLink", "conf/LoginPageObjects.properties"));
	}
	
	@Test
	public void backTest(){
		LoginBackPage h = new LoginBackPage(back.getDriver());
		back.open("http://localhost:8032/zl_shop/admin.php/Login/");
		back.type(h.username, "admin");
		back.type(h.password, "admin");
		back.click(h.button);

	}
	
}
