package cn.Wolf.testScripts;

import org.testng.annotations.AfterMethod;

import cn.Wolf.pageObjects.BackCommentListPage;

public class BackCommentNumberTest extends BackCommentListTest{
	@AfterMethod
	public void commentnumber(){
		BackCommentListPage cn = new BackCommentListPage(back.getDriver());
		back.click(cn.numberbutton1);
		back.click(cn.numberbutton2);
	}
}
