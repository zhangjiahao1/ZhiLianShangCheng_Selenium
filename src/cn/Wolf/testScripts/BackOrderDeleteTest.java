package cn.Wolf.testScripts;

import org.testng.annotations.AfterMethod;

import cn.Wolf.pageObjects.BackOrderListPage;

public class BackOrderDeleteTest extends BackOrderListTest{
	@AfterMethod
	public void orderdelete(){
		BackOrderListPage odl = new BackOrderListPage(back.getDriver());
		back.click(odl.deletebutton);
	}
}
