package cn.Wolf.testScripts;

import org.testng.annotations.Test;

import cn.Wolf.pageObjects.BackCommentListPage;

public class BackCommentListTest extends YfLoginBackTest{
	@Test
	public void commentlist(){
		BackCommentListPage cl = new BackCommentListPage(back.getDriver());
		back.click(cl.managebutton);
		back.click(cl.listbutton);
	}
}
