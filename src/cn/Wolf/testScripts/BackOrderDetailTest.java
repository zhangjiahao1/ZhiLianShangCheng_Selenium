package cn.Wolf.testScripts;

import org.testng.annotations.AfterMethod;

import cn.Wolf.pageObjects.BackOrderListPage;

public class BackOrderDetailTest extends BackOrderListTest{
	@AfterMethod
	public void orderdetail(){
		BackOrderListPage od = new BackOrderListPage(back.getDriver());
		back.click(od.detailbutton);
	}
}
