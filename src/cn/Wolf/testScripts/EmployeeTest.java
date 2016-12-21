package cn.Wolf.testScripts;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import cn.Wolf.cores.BaseTest;
import cn.Wolf.pageObjects.EmployeePage;
import cn.Wolf.appModules.BackLoginModule;

public class EmployeeTest extends BaseTest{
	
	@BeforeMethod
	public void openBrowser() throws InterruptedException{
		BackLoginModule.backLoginModule();
	}
	
	//测试搜索功能
	@Test
	public void searchTest(){
		EmployeePage a = new EmployeePage (back.getDriver());
		back.click(a.leftButton);
		back.click(a.sonButton);
		back.type(a.username_search, "hello");
		back.selectByVisibleText(a.state, "使用中");
		back.click(a.SearchButton);
	}
	
	//测试编辑功能
	@Test
	public void editTest(){
		EmployeePage a = new EmployeePage (back.getDriver());
		back.click(a.leftButton);
		back.click(a.sonButton);
		back.click(a.bianji);
		
	}
	
	//测试查看组功能
	@Test
	public void watchTest(){
		EmployeePage a = new EmployeePage (back.getDriver());
		back.click(a.leftButton);
		back.click(a.sonButton);
		back.click(a.chakanzu);
	}
	
	//测试查看组功能
	@Test
	public void xiugaiTest(){
		EmployeePage a = new EmployeePage (back.getDriver());
		back.click(a.leftButton);
		back.click(a.sonButton);
		back.click(a.xiugaimima);
	}

}
