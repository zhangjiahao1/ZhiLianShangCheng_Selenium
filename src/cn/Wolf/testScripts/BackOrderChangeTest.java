package cn.Wolf.testScripts;
import org.testng.annotations.AfterMethod;

import cn.Wolf.pageObjects.BackOrderListPage;

public class BackOrderChangeTest extends BackOrderListTest{
	@AfterMethod
	public void orderchange(){
		BackOrderListPage oc = new BackOrderListPage(back.getDriver());
		back.click(oc.changebutton);
		back.typeAndClear(oc.name, "yf");
		back.typeAndClear(oc.address, "河北省石家庄市");
		back.click(oc.refillbutton);
		back.typeAndClear(oc.name, "yf");
		back.typeAndClear(oc.address, "河北省石家庄市");
		back.typeAndClear(oc.zipcode, "050000");
		back.typeAndClear(oc.tel, "15230185857");
		back.typeAndClear(oc.price, "499");
		back.click(oc.commitbutton);
	}
}
