package cn.Wolf.testScripts;

import org.testng.annotations.Test;
import cn.Wolf.cores.BaseTest;
import cn.Wolf.pageObjects.GoodsManagePage;
import cn.Wolf.testScripts.BackLoginTest;

public class GoodsManageTest extends BaseTest{
	

	
	//搜索出售中商品
	@Test
	public void searchStateGoodsTest(){
		GoodsManagePage a = new GoodsManagePage (back.getDriver());
		back.click(a.leftButton);
		back.click(a.sonButton);
		back.type(a.searchBox, "a");
		back.type(a.min, "1");
		back.type(a.max, "100");
		back.selectByVisibleText(a.searchKinds, "针织衫");
		back.click(a.state);
		back.click(a.searchButton);
	}
	
	//搜索推荐商品
	@Test
	public void searchBestGoodsTest(){
		GoodsManagePage a = new GoodsManagePage (back.getDriver());
		back.click(a.leftButton);
		back.click(a.sonButton);
		back.type(a.searchBox, "a");
		back.type(a.min, "1");
		back.type(a.max, "100");
		back.selectByVisibleText(a.searchKinds, "针织衫");
		back.click(a.state);
		back.click(a.searchButton);
	}
	
	//搜索热销商品
	@Test
	public void searchHotGoodsTest(){
		GoodsManagePage a = new GoodsManagePage (back.getDriver());
		back.click(a.leftButton);
		back.click(a.sonButton);
		back.type(a.searchBox, "a");
		back.type(a.min, "1");
		back.type(a.max, "100");
		back.selectByVisibleText(a.searchKinds, "针织衫");
		back.click(a.state);
		back.click(a.searchButton);
	}
	
	//查看
	@Test
	public void chakanTest(){
		GoodsManagePage a = new GoodsManagePage (back.getDriver());
		back.click(a.leftButton);
		back.click(a.sonButton);
		back.click(a.chakan);
	}
	
	//修改
	@Test
	public void xiugaiTest(){
		GoodsManagePage a = new GoodsManagePage (back.getDriver());
		back.click(a.leftButton);
		back.click(a.sonButton);
		back.click(a.xiugai);
	}
	
	//修改
	@Test
	public void tukuTest(){
		GoodsManagePage a = new GoodsManagePage (back.getDriver());
		back.click(a.leftButton);
		back.click(a.sonButton);
		back.click(a.tuku);
	}

}
