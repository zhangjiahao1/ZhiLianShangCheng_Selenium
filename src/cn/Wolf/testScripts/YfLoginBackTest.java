package cn.Wolf.testScripts;

import org.testng.annotations.BeforeMethod;

import cn.Wolf.cores.BaseTest;
import cn.Wolf.pageObjects.LoginBackPage;


public class YfLoginBackTest extends BaseTest{
	@BeforeMethod
	public void backlogin(){
		LoginBackPage bl = new LoginBackPage(back.getDriver());
		back.open("http://localhost:8032/zl_shop/admin.php/Login/index.html");
		back.type(bl.username,"admin");
		back.type(bl.password,"admin");
		back.click(bl.button);
	}
}
