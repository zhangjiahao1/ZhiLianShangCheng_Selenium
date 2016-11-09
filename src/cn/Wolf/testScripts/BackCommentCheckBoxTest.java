package cn.Wolf.testScripts;

import org.testng.annotations.AfterMethod;

import cn.Wolf.pageObjects.BackCommentListPage;

public class BackCommentCheckBoxTest extends BackCommentListTest{
	@AfterMethod
	public void checkbox(){
		BackCommentListPage cb = new BackCommentListPage(back.getDriver());
		back.click(cb.boxesbutton1);
		back.click(cb.boxesbutton2);
		back.click(cb.boxbutton1);
		back.click(cb.boxbutton2);
	}
}
