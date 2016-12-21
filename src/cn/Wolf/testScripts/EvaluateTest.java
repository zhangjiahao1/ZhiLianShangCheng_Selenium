package cn.Wolf.testScripts;

import java.io.UnsupportedEncodingException;
import cn.Wolf.appModules.LoginModule;
import org.testng.annotations.Test;

import cn.Wolf.appModules.LoginModule;
import cn.Wolf.appModules.Shopcar;
import cn.Wolf.appModules.BalanceModule;

import cn.Wolf.cores.BaseTest;
import cn.Wolf.utils.PropertiesUtil;
import cn.Wolf.utils.SwitchWindows;
import cn.Wolf.utils.PropertiesUtil;
public class EvaluateTest extends BaseTest{
	public void test() throws UnsupportedEncodingException, InterruptedException{
		
		LoginModule.loginTest("zhangjiahao1", "123456789");

		Shopcar.ShopcarTest();
		BalanceModule.GotoBalance();
		
		front.click(PropertiesUtil.getStrings("pingjiashouhou", "conf/Evalute.properties"));
		front.click(PropertiesUtil.getStrings("pingjia", "conf/Evalute.properties"));
		
		}
		@Test
		public void cs() throws UnsupportedEncodingException, InterruptedException{
			this.test();
		}
	
		@Test
		public void testone() throws UnsupportedEncodingException, InterruptedException{//1.选择评分
			this.test();
			front.click(PropertiesUtil.getStrings("pingfen", "conf/Evalute.properties"));
		}
		@Test
		public void testtwo() throws UnsupportedEncodingException, InterruptedException{//2.添加描述
			this.test();
			front.type(PropertiesUtil.getStrings("miaoshu", "conf/Evalute.properties"), "csacacs");
		}
		@Test
		public void testthree() throws UnsupportedEncodingException, InterruptedException{//3.选择图片
			this.test();
			front.type(PropertiesUtil.getStrings("photo", "conf/Evalute.properties"), "C:\\Users\\lenovo\\Pictures\\asd.jpg");
		}
		@Test
		public void testfour() throws UnsupportedEncodingException, InterruptedException{//4.不选择评分
			this.test();
			front.type(PropertiesUtil.getStrings("miaoshu", "conf/Evalute.properties"), "csacacs");
			front.type(PropertiesUtil.getStrings("photo", "conf/Evalute.properties"), "C:\\Users\\lenovo\\Pictures\\asd.jpg");
			front.click(PropertiesUtil.getStrings("tijiao", "conf/Evalute.properties"));
		}
		@Test
		public void testfive() throws UnsupportedEncodingException, InterruptedException{//5.不添加描述
			this.test();
			front.click(PropertiesUtil.getStrings("pingfen", "conf/Evalute.properties"));
			front.type(PropertiesUtil.getStrings("photo", "conf/Evalute.properties"), "C:\\Users\\lenovo\\Pictures\\asd.jpg");
			front.click(PropertiesUtil.getStrings("tijiao", "conf/Evalute.properties"));
		}
		@Test
		public void testsix() throws UnsupportedEncodingException, InterruptedException{//6.不选择照片
			this.test();
			front.click(PropertiesUtil.getStrings("pingfen", "conf/Evalute.properties"));
			front.click(PropertiesUtil.getStrings("miaoshu", "conf/Evalute.properties"));
			front.click(PropertiesUtil.getStrings("tijiao", "conf/Evalute.properties"));
		}
		@Test
		public void testseven() throws UnsupportedEncodingException, InterruptedException{//7.提交
			this.test();
			front.click(PropertiesUtil.getStrings("pingfen", "conf/Evalute.properties"));
			front.type(PropertiesUtil.getStrings("miaoshu", "conf/Evalute.properties"), "csacacs");
			front.type(PropertiesUtil.getStrings("photo", "conf/Evalute.properties"), "C:\\Users\\lenovo\\Pictures\\asd.jpg");
			front.click(PropertiesUtil.getStrings("tijiao", "conf/Evalute.properties"));
		}
		@Test
		public void testeight() throws UnsupportedEncodingException, InterruptedException{//8.只选择评分
			this.test();
			front.click(PropertiesUtil.getStrings("pingfen", "conf/Evalute.properties"));
			front.click(PropertiesUtil.getStrings("tijiao", "conf/Evalute.properties"));
		}
		@Test
		public void testnine() throws UnsupportedEncodingException, InterruptedException{//9.只添加描述
			this.test();			
			front.type(PropertiesUtil.getStrings("miaoshu", "conf/Evalute.properties"), "csacacs");
			front.click(PropertiesUtil.getStrings("miaoshu", "conf/Evalute.properties"));
		}
		@Test
		public void testten() throws UnsupportedEncodingException, InterruptedException{//10.只选择照片
			this.test();
			front.type(PropertiesUtil.getStrings("photo", "conf/Evalute.properties"), "C:\\Users\\lenovo\\Pictures\\asd.jpg");
			front.click(PropertiesUtil.getStrings("tijiao", "conf/Evalute.properties"));
			
		}
		@Test
		public void testeleven() throws UnsupportedEncodingException, InterruptedException{//11.商品描述过长
			this.test();			
			front.type(PropertiesUtil.getStrings("miaoshu", "conf/Evalute.properties"), "csacasdasdasdasdasdsadasdsacs");
			front.click(PropertiesUtil.getStrings("tijiao", "conf/Evalute.properties"));
		}
		@Test
		public void testtwelve() throws UnsupportedEncodingException, InterruptedException{//12.商品描述过短
			this.test();			
			front.type(PropertiesUtil.getStrings("miaoshu", "conf/Evalute.properties"), "c");
			front.click(PropertiesUtil.getStrings("tijiao", "conf/Evalute.properties"));
		}
		@Test
		public void testthirteen() throws UnsupportedEncodingException, InterruptedException{//13.商品描述含有非法字符
			this.test();			
			front.type(PropertiesUtil.getStrings("miaoshu", "conf/Evalute.properties"), "@#￥c");
			front.click(PropertiesUtil.getStrings("tijiao", "conf/Evalute.properties"));
		}
}
