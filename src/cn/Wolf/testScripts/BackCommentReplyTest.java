package cn.Wolf.testScripts;

import org.testng.annotations.AfterMethod;

import cn.Wolf.pageObjects.BackCommentListPage;

public class BackCommentReplyTest extends BackCommentListTest{
	@AfterMethod
	public void commentreply(){
		BackCommentListPage cr = new BackCommentListPage(back.getDriver());
		back.click(cr.replybutton);
		back.type(cr.write, "лл�ݹ�");
		back.click(cr.refillbutton);
		back.type(cr.write, "лл�ݹ�");
		back.click(cr.commitbutton);
	}
}
