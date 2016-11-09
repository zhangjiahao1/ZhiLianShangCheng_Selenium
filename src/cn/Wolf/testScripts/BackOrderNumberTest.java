package cn.Wolf.testScripts;

import org.testng.annotations.AfterMethod;

import cn.Wolf.pageObjects.BackOrderListPage;

public class BackOrderNumberTest extends BackOrderListTest{
	@AfterMethod
	public void ordernumber(){
		BackOrderListPage on = new BackOrderListPage(back.getDriver());
		back.click(on.numberbutton1);
		back.click(on.numberbutton2);
	}
}
