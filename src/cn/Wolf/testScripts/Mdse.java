package cn.Wolf.testScripts;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import cn.Wolf.cores.BaseTest;
import cn.Wolf.pageObjects.MdsePage;
import cn.Wolf.utils.NSDataProvicer;
import cn.Wolf.appModules.BackLoginModule;;
/**
 * 
 * @author 吕晓锋
 *
 */

public class  Mdse extends BaseTest {

	@BeforeMethod
	
	
	public void login() throws InterruptedException {
        BackLoginModule.backLoginModule();
		MdsePage h = new MdsePage(back.getDriver());
		
		back.click(h.inmanage);//进入商品管理
		
	}

	                  //商品类别

	@Test   //商品类别添加子类

	public void category() throws InterruptedException{
		MdsePage h = new MdsePage(back.getDriver());
		back.click(h.inlei);
		back.click(h.click);
		//back.click(h.c);;
		back.type(h.addlei, "室内");//添加子类
		back.click(h.tijiao);
		back.wait(1000);

	}
	
	
	
	@Test     //商品类别重新输入序号
	public void category3() throws InterruptedException{
		MdsePage h = new MdsePage(back.getDriver());
		back.click(h.inlei);
		back.typeAndClear(h.reinput,"2");//重新输入序号
	
	}
	
    	
	                  // 商品品牌
	
	
	@Test    //商品品牌修改子类
	public void Brandreise() throws InterruptedException{
		MdsePage h = new MdsePage(back.getDriver());
		back.click( h.inBrand);
		back.click(h.Bxclick);
		back.type(h.xiugailei, "室内");//修改子类
		back.type(h.xiugaipin, "2");
		back.click(h.tijiao);
	}
	
	@Test   //翻页
	public void Brandjump() throws InterruptedException{
		MdsePage h = new MdsePage(back.getDriver());
		back.click(h.inBrand);
		back.click(h.fanye);

	}
	
	
	
	
	                      //商品属性
	 
	@Test(dataProvider = "MDSG", dataProviderClass=NSDataProvicer.class)   // 商品属性添加属性
	public void qualityadd(String quaname,String quavalue) throws InterruptedException{
		MdsePage h = new MdsePage(back.getDriver());
		back.click(h.inquality);
		back.click(h.addquality);
		back.type(h.quaname, quaname);
		back.type(h.quavalue, quavalue);
		back.click(h.tijiao);
		back.wait(1000);

	}
	
	
	/*@Test    //  商品属性修改属性

	public void qualityreise() throws InterruptedException{
		MdsePage h = new MdsePage(back.getDriver());
		back.click(h.inquality);
		back.click(h.xiugai);
		back.typeAndClear(h.quaname, "张三");
		back.typeAndClear(h.quavalue, "好");//  商品属性修改属性
		back.click(h.tijiao);
		back.wait(1000);

	}*/
	
	
	
	@Test   //翻页
	public void qualityjump() throws InterruptedException{
		MdsePage h = new MdsePage(back.getDriver());
		back.click(h.inquality);
		back.click(h.fanye);

	}
	
	
	
	
}
