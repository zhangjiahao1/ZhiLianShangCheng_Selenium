package cn.Wolf.testScripts;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.testng.annotations.Test;

import cn.Wolf.appModules.BalanceModule;
import cn.Wolf.appModules.LoginModule;
import cn.Wolf.appModules.Shopcar;
import cn.Wolf.cores.BaseTest;
import cn.Wolf.utils.PropertiesUtil;
import cn.Wolf.utils.SwitchWindows;


/**
 * 
 * 
 * @author 杨帆
 * 
 */

public class FrontMyOrderTest extends BaseTest{
	
	//登录
	@Test(priority=0)
	public void loginTest() throws UnsupportedEncodingException, InterruptedException{
		LoginModule.loginTest("zhangjiahao1", "123456789");	
	}
	
	//下单
	@Test(priority=1)
	public void shopTest() throws IOException, InterruptedException{
		Shopcar.ShopcarTest();
		BalanceModule.GotoBalance();
	}
	
	//订单详情
	@Test(priority=2)
	public void detailTest() throws IOException{
		front.click(PropertiesUtil.getStrings("myorderButton","conf/FrontMyOrder.properties"));
		front.click(PropertiesUtil.getStrings("detailButton","conf/FrontMyOrder.properties"));
	}
	
	//订单取消
	@Test(priority=3)
	public void deleteTest() throws IOException{
		front.click(PropertiesUtil.getStrings("myorderButton","conf/FrontMyOrder.properties"));
		front.click(PropertiesUtil.getStrings("deleteButton","conf/FrontMyOrder.properties"));
		SwitchWindows.switchToWindow("", front.getDriver());
		front.getAllWindowTitles();
		robot.pressEnterKey();
		front.alertAccept();
	}
}
