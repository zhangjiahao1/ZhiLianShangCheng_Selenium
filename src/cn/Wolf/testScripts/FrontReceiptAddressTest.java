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
public class FrontReceiptAddressTest extends BaseTest{
//登录
	@Test(priority=0)
	public void frontLoginTest() throws InterruptedException, UnsupportedEncodingException {
		LoginModule.loginTest("zhangjiahao1","123456789");
	}
	
//删除收货地址
	@Test(priority=1)
	public void deleteAddress() throws UnsupportedEncodingException {
		front.click(PropertiesUtil.getStrings("PersonalButton", "conf/PersonalInformationPageObject.properties"));
		front.click(PropertiesUtil.getStrings("AddressButton", "conf/ReceiptAddressPageObject.properties"));
		front.click(PropertiesUtil.getStrings("DeleteButton", "conf/ReceiptAddressPageObject.properties"));
		
	}
//添加收货地址
	@Test(priority=2,dataProvider="Address",dataProviderClass=NSDataProvicer.class)
	public void addAddressTest(String linkname,String province,String city,String country,String address,String phone,String code) throws UnsupportedEncodingException{	
		front.click(PropertiesUtil.getStrings("AddButton", "conf/ReceiptAddressPageObject.properties"));
		front.type(PropertiesUtil.getStrings("Name", "conf/ReceiptAddressPageObject.properties"),linkname);
		front.type(PropertiesUtil.getStrings("Province", "conf/ReceiptAddressPageObject.properties"),province);
		front.type(PropertiesUtil.getStrings("City", "conf/ReceiptAddressPageObject.properties"),city);
		front.type(PropertiesUtil.getStrings("Country", "conf/ReceiptAddressPageObject.properties"),country);
		front.type(PropertiesUtil.getStrings("Address", "conf/ReceiptAddressPageObject.properties"),address);
		front.type(PropertiesUtil.getStrings("Phone", "conf/ReceiptAddressPageObject.properties"),phone);
		front.type(PropertiesUtil.getStrings("Code", "conf/ReceiptAddressPageObject.properties"),code);
		front.click(PropertiesUtil.getStrings("SaveButton", "conf/ReceiptAddressPageObject.properties"));
		robot.pressEnterKey();
	}
}
