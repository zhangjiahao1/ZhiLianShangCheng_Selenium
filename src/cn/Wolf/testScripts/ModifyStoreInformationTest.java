package cn.Wolf.testScripts;
//修改商城信息
import org.testng.annotations.AfterMethod;

import cn.Wolf.pageObjects.BackStorePage;

public class ModifyStoreInformationTest extends StoreTest{
	@AfterMethod
	public void modifyTest() throws InterruptedException {
		BackStorePage  s = new BackStorePage (back.getDriver());
		back.click(s.modifybutton1);
		Thread.sleep(1000);
		back.typeAndClear(s.modifyname,"京东1");
		back.typeAndClear(s.modifybrief,"商城  京东商城");
		back.typeAndClear(s.modifyphone,"400-120-0000");
		back.click(s.modifybutton2);
		Thread.sleep(2000);
	}
}
