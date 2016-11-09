package cn.Wolf.testScripts;

import org.testng.annotations.AfterMethod;

import cn.Wolf.pageObjects.BackCommentListPage;

public class BackCommentDeleteTest extends BackCommentListTest{
	@AfterMethod
	public void commentdelete(){
		BackCommentListPage cd = new BackCommentListPage(back.getDriver());
		back.click(cd.deletebutton);	
		back.getAlert().accept();
		robot.pressEnterKey();
	}
}
