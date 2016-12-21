package cn.Wolf.testScripts;

import org.testng.annotations.Test;
import cn.Wolf.utils.SendMail;

public class SendMail1 {
	@Test
	public void sendMail(){
		SendMail.sendmessage("a1257524459@163.com",
							 "abc9544257521",
							 "smtp.163.com",
							 "25",
							 "a1257524459@163.com",
							 "a1257524459@163.com",
							 "张小某的测试",
							 "test-output\\emailable-report.html");
	}
}
//"test-output\\emailable-report.html"
//<class name="cn.Wolf.testScripts.LoginTest"></class>