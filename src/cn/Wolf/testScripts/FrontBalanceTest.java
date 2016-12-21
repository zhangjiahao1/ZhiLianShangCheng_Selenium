
package cn.Wolf.testScripts;

import cn.Wolf.appModules.BalanceModule;
import cn.Wolf.cores.BaseTest;
import cn.Wolf.utils.NSDataProvicer;
import cn.Wolf.utils.SwitchWindows;

import java.io.UnsupportedEncodingException;

import org.testng.annotations.Test;
/**
 * 
 * @刘子正
 *前台结算模块测试
 *
 */
public class FrontBalanceTest extends BaseTest {
	public void test1() throws InterruptedException{
		front.open("http://localhost:8032/zl_shop/index.php/Index");
		front.click("link=登录");
		front.type("name=username", "zhangjiahao1");
		front.type("name=password", "123456789");
		front.click("xpath=//*[@id='contain']/div[2]/div[1]/form[1]/div[1]/div[5]/input");
		front.click("link=韩都衣舍 韩版2015夏装新款女装青年时尚休闲宽松字母印花蝙蝠袖圆领短袖T恤GD5018肆");
		SwitchWindows.switchToWindow("京东", front.getDriver());
		front.click("xpath=//label[contains(.,'黑色')]");
		front.click("xpath=//label[contains(.,'M')]");
		front.click("xpath=//*[@id='choose']/div[2]/div[1]/a");
		front.alertAccept();
		front.open("http://localhost:8032/zl_shop/index.php/Index");
		front.click("link=我的购物车");
		SwitchWindows.switchToWindow("京东", front.getDriver());
		front.click("class=box_check");
		front.click("link=去 结 算"); 
	}
	@Test
	//添加新地址
	public void test3() throws InterruptedException{
		this.test1();
		front.click("id=new_address"); 
		front.type("name=linkman", "lzz");
		front.type("name=phone", "15232101136");
		front.type("name=code", "071700");
		front.selectByValue("id=province", "河北省");
		front.selectByValue("id=city", "石家庄市");
		front.selectByValue("id=county", "裕华区");
		front.type("name=address2", "河北师大");
		front.click("class=box_btn");
		front.alertAccept();
		front.exit();
		
	}
	@Test(dataProvider = "Balance", dataProviderClass=NSDataProvicer.class)
	//数据驱动添加新地址
	public void DataDriven(String name, String passwd, String youbian, String sheng, String shi, String qu, String address) throws InterruptedException, UnsupportedEncodingException{
		this.test1();
		front.click("id=new_address"); 
		front.type("name=linkman", name);
		front.type("name=phone", passwd);
		front.type("name=code", youbian);
		front.selectByValue("id=province", sheng);
		front.selectByValue("id=city", shi);
		front.selectByValue("id=county", qu);
		front.type("name=address2", address);
		front.click("class=box_btn");
		front.alertAccept();
		front.exit();
	}
	@Test
	//设为默认地址
	public void test4() throws InterruptedException{
		this.test1();
		front.click("class=adds_btn");
		front.click("xpath=//a[@class='edit_main_address']");
		front.exit();
	}
	@Test
	//删除地址
	public void test5() throws InterruptedException{
		this.test1();
		front.click("class=adds_btn");
		front.click("xpath=//a[@class='del_address']");
		front.alertAccept();
		front.exit();
	}
	@Test
	//正常流程测试
	public void test6() throws InterruptedException{
		this.test1();
		front.click("class=adds_btn");
		front.click("class=settle_btn");
		front.exit();
	}
}
