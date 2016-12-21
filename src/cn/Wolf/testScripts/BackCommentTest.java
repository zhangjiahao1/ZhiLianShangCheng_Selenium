package cn.Wolf.testScripts;

import org.testng.annotations.Test;

import cn.Wolf.cores.BaseTest;
import cn.Wolf.pageObjects.BackCommentListPage;
import cn.Wolf.pageObjects.LoginBackPage;

/**
 * 
 * 
 * @author 杨帆
 * 
 */

public class BackCommentTest extends BaseTest{
	
	//登录
	@Test(priority=0)
	public void backlogin(){
		LoginBackPage bl = new LoginBackPage(back.getDriver());
		back.open("http://localhost:8032/zl_shop/admin.php/Login/index.html");
		back.type(bl.username,"admin");
		back.type(bl.password,"admin");
		back.click(bl.button);
	}
	
	//评论管理->评论列表
	@Test(priority=1)
	public void commentlist(){
		BackCommentListPage cl = new BackCommentListPage(back.getDriver());
		back.click(cl.managebutton);
		back.click(cl.listbutton);
	}
	
	//回复
	@Test(priority=2)
	public void commentreply(){
		BackCommentListPage cr = new BackCommentListPage(back.getDriver());
		back.click(cr.replybutton);
		back.type(cr.write, "谢谢");
		back.click(cr.refillbutton);
		back.type(cr.write, "谢谢");
		back.click(cr.commitbutton);
	}
	
	//删除
	@Test(priority=3)
	public void commentdelete() throws InterruptedException{
		BackCommentListPage cd = new BackCommentListPage(back.getDriver());
		back.click(cd.deletebutton);	
		back.getAlert().accept();
		robot.pressEnterKey();
		back.alertAccept();
		Thread.sleep(3000);
	}
	
	//复选框
	@Test(priority=4)
	public void checkbox(){
		BackCommentListPage cb = new BackCommentListPage(back.getDriver());
		back.click(cb.boxesbutton1);
		back.click(cb.boxbutton1);
		back.click(cb.boxesbutton2);
		back.click(cb.boxbutton2);
	}
}
