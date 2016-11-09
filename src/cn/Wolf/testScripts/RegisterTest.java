package cn.Wolf.testScripts;

import org.testng.annotations.Test;
import cn.Wolf.cores.BaseTest;

public class RegisterTest extends BaseTest{
	
	@Test
	public void registerTest(){
		front.open("http://localhost:8032/zl_shop/index.php");
		front.click("link=快速注册");
		front.type("name=username", "zhangjiajia");
		front.type("name=password", "1234567890");
		front.type("name=password2", "1234567890");
		front.type("name=email", "1234@qq.com");
		front.click("xpath=//*[@id='regform']/div[7]/div[2]/input");
	}
	
}
