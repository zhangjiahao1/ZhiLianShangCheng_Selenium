package cn.Wolf.testScripts;

import cn.Wolf.cores.BaseTest;
import cn.Wolf.utils.PropertiesUtil;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import cn.Wolf.appModules.LoginModule;;


/**
 * 
 * 
 * @author 杨帆
 * 
 */

public class FrontSearchTest extends BaseTest{
	
	//登录
	@BeforeMethod
	public void loginTest() throws InterruptedException, UnsupportedEncodingException{
		LoginModule.loginTest("zhangjiahao1", "123456789");
		
	}
	//搜索框
	@Test
	public void searchboxTest() throws InterruptedException, UnsupportedEncodingException{
		front.type(PropertiesUtil.getStrings("searchboxWriteName","conf/FrontSearch.properties"), "");
		front.click(PropertiesUtil.getStrings("searchboxButton","conf/FrontSearch.properties"));
	}
	
	//热门搜索
	@Test
	public void hotsearchTest() throws IOException{
		front.click(PropertiesUtil.getStrings("hotsearchButton","conf/FrontSearch.properties"));
	}
	
	//导航栏
	@Test
	public void navigationTest() throws IOException{
		front.click(PropertiesUtil.getStrings("navigationButton","conf/FrontSearch.properties"));
	}
		
	//今日推荐
	@Test
	public void recommendTest() throws IOException{
		front.click(PropertiesUtil.getStrings("recommendButton","conf/FrontSearch.properties"));
	}
		
	//猜你喜欢
	@Test
	public void likeTest() throws IOException{
		front.click(PropertiesUtil.getStrings("likeButton","conf/FrontSearch.properties"));
	}
		
	//京东特色购
	@Test
	public void specialTest() throws IOException{
		front.click(PropertiesUtil.getStrings("specialButton","conf/FrontSearch.properties"));
	}
		
	//潮流女士
	@Test
	public void fashionwomenTest() throws IOException{
		front.click(PropertiesUtil.getStrings("fashionwomenButton","conf/FrontSearch.properties"));
	}
		
	//品牌图标
	@Test
	public void brandTest() throws IOException{
		front.click(PropertiesUtil.getStrings("brandButton","conf/FrontSearch.properties"));
	}
		
	//今日抄底
	@Test
	public void huntersTest() throws IOException{
		front.click(PropertiesUtil.getStrings("huntersButton","conf/FrontSearch.properties"));
	}
		
	//友情链接
	@Test
	public void friendshiplinkTest() throws IOException{
		front.click(PropertiesUtil.getStrings("friendshiplinkButton","conf/FrontSearch.properties"));
	}
}
