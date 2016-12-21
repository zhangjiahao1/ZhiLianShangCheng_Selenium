package cn.Wolf.testScripts;
import org.testng.annotations.Test;
import cn.Wolf.cores.BaseTest;
import cn.Wolf.pageObjects.Authority;
import cn.Wolf.utils.NSDataProvicer;

public class BackAuthorityTest extends BaseTest{
	
	public void test(){	//登录，打开权限管理
		Authority h = new Authority(back.getDriver());
		String url="http://localhost:8032/zl_shop/admin.php/Login/";  
		back.open(url);//打开网页
		back.type(h.name,"admin" ); 
		back.type(h.password, "admin");
		back.click(h.submit);
		back.click(h.quanxianguanli);
		
	}
	
	@Test
	public void testone(){//1.查看权限详情
		Authority h = new Authority(back.getDriver());
		this.test();	
		back.click(h.list);
		back.click(h.xiangqing);
	}
	@Test
	public void testtwo(){//2.删除权限组
		Authority h = new Authority(back.getDriver());
		this.test();	
		back.click(h.list);
		back.click(h.delate);
		back.alertAccept();
	}
	@Test
	public void testthree(){//3.测试权限组列表页码
		Authority h = new Authority(back.getDriver());
		this.test();
		back.click(h.list);
		back.click(h.pagination);
	}
	@Test
	public void testfour(){//4.添加权限组名
		Authority h = new Authority(back.getDriver());
		this.test();
		back.click(h.add);
		back.type(h.listname,"caoshuo");
	}
	@Test
	public void testfive(){//5.选择控制器
		Authority h = new Authority(back.getDriver());
		this.test();
		back.click(h.add);
		back.click(h.control);
	}
	@Test
	public void testsix(){//6.选择方法
		Authority h = new Authority(back.getDriver());
		this.test();
		back.click(h.add);
		back.click(h.way);
	}
	@Test
	public void testseven(){//7.添加权限组
		Authority h = new Authority(back.getDriver());
		this.test();
		back.click(h.add);
		back.type(h.listname, "caoshuo");
		back.click(h.control);
		back.click(h.way);
		back.click(h.button);
	}
	@Test
	public void testeight(){//8.添加权限组不添加组名
		Authority h = new Authority(back.getDriver());
		this.test();
		back.click(h.add);		
		back.click(h.control);
		back.click(h.way);
		back.click(h.button);
	}
	@Test
	public void testnine(){//9.添加权限组不选择控制器
		Authority h = new Authority(back.getDriver());
		this.test();
		back.click(h.add);
		back.type(h.listname, "caoshuo");		
		back.click(h.way);
		back.click(h.button);
	}
	@Test
	public void testten(){//10.添加权限组不选择方法
		Authority h = new Authority(back.getDriver());
		this.test();
		back.click(h.add);
		back.type(h.listname, "caoshuo");
		back.click(h.control);		
		back.click(h.button);
	}
	@Test
	public void testeleven(){//11.添加权限组只添加组名
		Authority h = new Authority(back.getDriver());
		this.test();
		back.click(h.add);
		back.type(h.listname, "caoshuo");
		back.click(h.button);
	}
	@Test
	public void testtwelve(){//12.添加权限组只选择控制器
		Authority h = new Authority(back.getDriver());
		this.test();
		back.click(h.add);
		back.click(h.control);
		back.click(h.button);
	}
	@Test
	public void testfourteen(){//14.添加权限组只选择方法
		Authority h = new Authority(back.getDriver());
		this.test();
		back.click(h.add);
		back.click(h.way);
		back.click(h.button);
	}
	@Test
	public void testfiveteen(){//15.添加权限组不添加组名
		Authority h = new Authority(back.getDriver());
		this.test();
		back.click(h.add);
		back.click(h.control);
		back.click(h.way);
		back.click(h.button);
	}
	@Test
	public void testsixteen(){//16.添加权限组不选择控制器
		Authority h = new Authority(back.getDriver());
		this.test();
		back.click(h.add);
		back.type(h.control, "caoshuo");
		back.click(h.way);
		back.click(h.button);
	}
	@Test
	public void testseventeen(){//17.添加权限组不选择方法
		Authority h = new Authority(back.getDriver());
		this.test();
		back.click(h.add);
		back.type(h.listname, "caoshuo");
		back.click(h.way);
		back.click(h.button);
	}
	@Test(dataProvider = "Authority", dataProviderClass=NSDataProvicer.class)
	public void testeighteen(String z){//18.添加权限组组名过长
		Authority h = new Authority(back.getDriver());
		this.test();
		back.click(h.add);
		back.type(h.listname, z);
		back.click(h.control);
		back.click(h.way);
		back.click(h.button);
	}
	@Test
	public void testnineteen(){//19.添加权限组组名过短
		Authority h = new Authority(back.getDriver());
		this.test();
		back.click(h.add);
		back.type(h.listname, "c");
		back.click(h.control);
		back.click(h.way);
		back.click(h.button);		
	}
	@Test
	public void testtwenty(){//20.添加权限组组名含有非法字符
		Authority h = new Authority(back.getDriver());
		this.test();
		back.click(h.add);
		back.type(h.listname, "cao@#@#￥shuo");
		back.click(h.control);
		back.click(h.way);
		back.click(h.button);
	}
	@Test
	public void testtwentyone(){//21.选择控制器不选择此行方法
		Authority h = new Authority(back.getDriver());
		this.test();
		back.click(h.add);
		back.type(h.listname, "caoshuo");
		back.click(h.control);
		back.click(h.way);
		back.click(h.button);
	}
}


