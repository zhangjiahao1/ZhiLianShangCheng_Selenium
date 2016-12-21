package cn.Wolf.appModules;

import java.io.UnsupportedEncodingException;

import cn.Wolf.cores.BaseTest;
import cn.Wolf.utils.PropertiesUtil;
import cn.Wolf.utils.SwitchWindows;






public class Shopcar extends BaseTest {

	
	//加入购物车模块
  public static void ShopcarTest() throws UnsupportedEncodingException{
	 
	  //选中商品，加入购物车
	  front.click(PropertiesUtil.getStrings("ShopButton", "conf/Shopcar.properties"));//选择商品
	
	  SwitchWindows.switchToWindow("京东", front.getDriver());
	
	  front.click(PropertiesUtil.getStrings("ShopcarButton", "conf/Shopcar.properties"));
      front.alertAccept();
      
      
//      //选中商品去结算
//      front.click(PropertiesUtil.getStrings("GoShopcar", "conf/Shopcar.properties"));
//  	
//  	  SwitchWindows.switchToWindow("京东", front.getDriver());
//  	  front.click(PropertiesUtil.getStrings("ShopcarChoose", "conf/Shopcar.properties"));
//  	  front.click(PropertiesUtil.getStrings("Shopcarbalance", "conf/Shopcar.properties")); //点击去结算
//      
      
      
	}
}

