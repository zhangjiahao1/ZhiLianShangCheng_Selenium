package cn.Wolf.appModules;
/**
 * 刘子正
 * 结算模块的模块化调用
 */
import cn.Wolf.cores.BaseTest;
import cn.Wolf.utils.SwitchWindows;

public class BalanceModule extends BaseTest{
	public static void GotoBalance() throws InterruptedException {
		front.open("http://localhost:8032/zl_shop/index.php/Index");
		front.click("link=我的购物车");
		SwitchWindows.switchToWindow("京东", front.getDriver());
		front.click("class=box_check");
		front.click("link=去 结 算"); 
		front.click("xpath=//a[contains(.,'提 交 订 单')]");
		Thread.sleep(3000);
	}
}