package cn.Wolf.testScripts;

import org.testng.annotations.Test;

import cn.Wolf.pageObjects.BackOrderListPage;

public class BackOrderListTest extends YfLoginBackTest{
	@Test
	public void orderlist(){
		BackOrderListPage ol = new BackOrderListPage(back.getDriver());
		back.click(ol.managebutton);
		back.click(ol.listbutton);
	}
}
