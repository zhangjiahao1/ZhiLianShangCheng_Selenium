package cn.Wolf.testScripts;

import org.testng.annotations.Test;

import cn.Wolf.cores.BaseTest;
import cn.Wolf.pageObjects.BackOrderListPage;
import cn.Wolf.pageObjects.LoginBackPage;
import cn.Wolf.utils.NSDataProvicer;


/**
 * 
 * 
 * @author 杨帆
 * 
 */

public class BackOrderTest extends BaseTest{
	
	//登录
	@Test(priority=0)
	public void backlogin(){
		LoginBackPage bl = new LoginBackPage(back.getDriver());
		back.open("http://localhost:8032/zl_shop/admin.php/Login/index.html");
		back.type(bl.username,"admin");
		back.type(bl.password,"admin");
		back.click(bl.button);
	}
	
	//订单管理->订单列表
	@Test(priority=1)
	public void orderlist(){
		BackOrderListPage ol = new BackOrderListPage(back.getDriver());
		back.click(ol.managebutton);
		back.click(ol.listbutton);
	}
	
	//修改
	@Test(priority=2,dataProvider="ChangeOrder",dataProviderClass=NSDataProvicer.class)
	public void orderchange(String name,String address,String zipcode,String tel,String price){
		BackOrderListPage oc = new BackOrderListPage(back.getDriver());
		back.click(oc.changebutton);
		back.typeAndClear(oc.name, name);
		back.typeAndClear(oc.address, address);
		back.typeAndClear(oc.zipcode, zipcode);
		back.typeAndClear(oc.tel, tel);
		back.typeAndClear(oc.price, price);
		back.click(oc.commitbutton);
	}
	
	//订单详情
	@Test(priority=3)
	public void orderdetail(){
		BackOrderListPage od = new BackOrderListPage(back.getDriver());
		back.click(od.detailbutton);
		back.click(od.backbutton);
	}
	
	//页码
	@Test(priority=4)
	public void ordernumber(){
		BackOrderListPage on = new BackOrderListPage(back.getDriver());
		back.click(on.numberbutton1);
		back.click(on.numberbutton2);
	}
		
	//删除订单
	@Test(priority=5)
	public void orderdelete(){
		BackOrderListPage odl = new BackOrderListPage(back.getDriver());
		back.click(odl.deletebutton);
	}
	
	
}
