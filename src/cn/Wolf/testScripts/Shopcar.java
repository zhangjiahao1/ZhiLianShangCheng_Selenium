package cn.Wolf.testScripts;

import java.io.UnsupportedEncodingException;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;
import cn.Wolf.cores.BaseTest;
import cn.Wolf.utils.PropertiesUtil;
import cn.Wolf.utils.SwitchWindows;
/**
 * 
 * @author 吕晓锋
 *
 */

public class Shopcar extends BaseTest {
	


	@BeforeMethod
	public void Shopcar() throws InterruptedException, UnsupportedEncodingException{
		
		
		front.open("http://localhost:8032/zl_shop/index.php");
		front.click(PropertiesUtil.getStrings("login", "conf/Shopcar.properties"));
		front.type(PropertiesUtil.getStrings("user", "conf/Shopcar.properties"), "zhangjiahao1");
		front.type(PropertiesUtil.getStrings("pswd", "conf/Shopcar.properties"), "123456789");
		front.click(PropertiesUtil.getStrings("loginButton", "conf/Shopcar.properties"));
	
	}
	
	public void AddShopcar(){
//	     front.click(PropertiesUtil.getStrings("ShopcarButton", "conf/Shopcar.properties"));
//	 
//	     front.alertAccept();
	}
	

	@Test
	public void ShopcarColour() throws InterruptedException, UnsupportedEncodingException{
	
		front.click(PropertiesUtil.getStrings("ShopButton", "conf/Shopcar.properties"));//选择商品
		SwitchWindows.switchToWindow("京东", front.getDriver());
		front.click(PropertiesUtil.getStrings("ColorButton", "conf/Shopcar.properties"));//选择颜色
		
		
		this.AddShopcar();
	}
	
	
	@Test
	public void ShopcarSize() throws InterruptedException, UnsupportedEncodingException{
		front.click(PropertiesUtil.getStrings("ShopButton", "conf/Shopcar.properties"));//选择商品
		SwitchWindows.switchToWindow("京东", front.getDriver());
		front.click(PropertiesUtil.getStrings("SizeButton", "conf/Shopcar.properties"));//选择尺寸
		this.AddShopcar();
		
	}
	
	@Test  //选择商品
	 
	public void ShopcarAddnum() throws InterruptedException, UnsupportedEncodingException{
		front.click(PropertiesUtil.getStrings("ShopButton", "conf/Shopcar.properties"));
		SwitchWindows.switchToWindow("京东", front.getDriver());
		front.click(PropertiesUtil.getStrings("Add", "conf/Shopcar.properties"));
	  
	}
	
	
	
@Test   //点击输入商品数量
	
	public void ShopcarInputnum() throws InterruptedException, UnsupportedEncodingException{
	
		front.click(PropertiesUtil.getStrings("ShopcarButton", "conf/Shopcar.properties"));
		SwitchWindows.switchToWindow("京东", front.getDriver());
		front.type(PropertiesUtil.getStrings("Inputnum", "conf/Shopcar.properties"), "111111");
	
	
	
}


	
@Test   //点击删除商品
	
	public void ShopcarCut() throws InterruptedException, UnsupportedEncodingException {
	
	   	front.click(PropertiesUtil.getStrings("ShopcarButton", "conf/Shopcar.properties"));
		SwitchWindows.switchToWindow("京东", front.getDriver());
		front.click(PropertiesUtil.getStrings("ShopcarCut", "conf/Shopcar.properties")); 
}



@Test  //点击选中商品

public void ShopcarChoose() throws InterruptedException, UnsupportedEncodingException {
	front.click(PropertiesUtil.getStrings("ShopcarButton", "conf/Shopcar.properties"));
	SwitchWindows.switchToWindow("京东", front.getDriver());
	front.click(PropertiesUtil.getStrings("ShopcarChoose", "conf/Shopcar.properties")); 


}


@Test   //点击去结算

public void Shopcarbalance() throws InterruptedException, UnsupportedEncodingException {
	front.open("http://localhost:8032/zl_shop/index.php");
	front.click(PropertiesUtil.getStrings("login", "conf/Shopcar.properties"));
	front.type(PropertiesUtil.getStrings("user", "conf/Shopcar.properties"), "zhangjiahao1");
	front.type(PropertiesUtil.getStrings("pswd", "conf/Shopcar.properties"), "123456789");
	front.click(PropertiesUtil.getStrings("loginButton", "conf/Shopcar.properties"));
	front.click(PropertiesUtil.getStrings("ShopcarButton", "conf/Shopcar.properties"));	
	SwitchWindows.switchToWindow("京东", front.getDriver());
	front.click(PropertiesUtil.getStrings("ShopcarChoose", "conf/Shopcar.properties"));
	front.click(PropertiesUtil.getStrings("Shopcarbalance", "conf/Shopcar.properties")); 


}


}


