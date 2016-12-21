package cn.Wolf.testScripts;
import org.testng.annotations.Test;
import cn.Wolf.cores.BaseTest;
import cn.Wolf.pageObjects.Authority;
import cn.Wolf.utils.NSDataProvicer;

public class BackAuthorityTest extends BaseTest{
	
	public void test(){	//��¼����Ȩ�޹���
		Authority h = new Authority(back.getDriver());
		String url="http://localhost:8032/zl_shop/admin.php/Login/";  
		back.open(url);//����ҳ
		back.type(h.name,"admin" ); 
		back.type(h.password, "admin");
		back.click(h.submit);
		back.click(h.quanxianguanli);
		
	}
	
	@Test
	public void testone(){//1.�鿴Ȩ������
		Authority h = new Authority(back.getDriver());
		this.test();	
		back.click(h.list);
		back.click(h.xiangqing);
	}
	@Test
	public void testtwo(){//2.ɾ��Ȩ����
		Authority h = new Authority(back.getDriver());
		this.test();	
		back.click(h.list);
		back.click(h.delate);
		back.alertAccept();
	}
	@Test
	public void testthree(){//3.����Ȩ�����б�ҳ��
		Authority h = new Authority(back.getDriver());
		this.test();
		back.click(h.list);
		back.click(h.pagination);
	}
	@Test
	public void testfour(){//4.���Ȩ������
		Authority h = new Authority(back.getDriver());
		this.test();
		back.click(h.add);
		back.type(h.listname,"caoshuo");
	}
	@Test
	public void testfive(){//5.ѡ�������
		Authority h = new Authority(back.getDriver());
		this.test();
		back.click(h.add);
		back.click(h.control);
	}
	@Test
	public void testsix(){//6.ѡ�񷽷�
		Authority h = new Authority(back.getDriver());
		this.test();
		back.click(h.add);
		back.click(h.way);
	}
	@Test
	public void testseven(){//7.���Ȩ����
		Authority h = new Authority(back.getDriver());
		this.test();
		back.click(h.add);
		back.type(h.listname, "caoshuo");
		back.click(h.control);
		back.click(h.way);
		back.click(h.button);
	}
	@Test
	public void testeight(){//8.���Ȩ���鲻�������
		Authority h = new Authority(back.getDriver());
		this.test();
		back.click(h.add);		
		back.click(h.control);
		back.click(h.way);
		back.click(h.button);
	}
	@Test
	public void testnine(){//9.���Ȩ���鲻ѡ�������
		Authority h = new Authority(back.getDriver());
		this.test();
		back.click(h.add);
		back.type(h.listname, "caoshuo");		
		back.click(h.way);
		back.click(h.button);
	}
	@Test
	public void testten(){//10.���Ȩ���鲻ѡ�񷽷�
		Authority h = new Authority(back.getDriver());
		this.test();
		back.click(h.add);
		back.type(h.listname, "caoshuo");
		back.click(h.control);		
		back.click(h.button);
	}
	@Test
	public void testeleven(){//11.���Ȩ����ֻ�������
		Authority h = new Authority(back.getDriver());
		this.test();
		back.click(h.add);
		back.type(h.listname, "caoshuo");
		back.click(h.button);
	}
	@Test
	public void testtwelve(){//12.���Ȩ����ֻѡ�������
		Authority h = new Authority(back.getDriver());
		this.test();
		back.click(h.add);
		back.click(h.control);
		back.click(h.button);
	}
	@Test
	public void testfourteen(){//14.���Ȩ����ֻѡ�񷽷�
		Authority h = new Authority(back.getDriver());
		this.test();
		back.click(h.add);
		back.click(h.way);
		back.click(h.button);
	}
	@Test
	public void testfiveteen(){//15.���Ȩ���鲻�������
		Authority h = new Authority(back.getDriver());
		this.test();
		back.click(h.add);
		back.click(h.control);
		back.click(h.way);
		back.click(h.button);
	}
	@Test
	public void testsixteen(){//16.���Ȩ���鲻ѡ�������
		Authority h = new Authority(back.getDriver());
		this.test();
		back.click(h.add);
		back.type(h.control, "caoshuo");
		back.click(h.way);
		back.click(h.button);
	}
	@Test
	public void testseventeen(){//17.���Ȩ���鲻ѡ�񷽷�
		Authority h = new Authority(back.getDriver());
		this.test();
		back.click(h.add);
		back.type(h.listname, "caoshuo");
		back.click(h.way);
		back.click(h.button);
	}
	@Test(dataProvider = "Authority", dataProviderClass=NSDataProvicer.class)
	public void testeighteen(String z){//18.���Ȩ������������
		Authority h = new Authority(back.getDriver());
		this.test();
		back.click(h.add);
		back.type(h.listname, z);
		back.click(h.control);
		back.click(h.way);
		back.click(h.button);
	}
	@Test
	public void testnineteen(){//19.���Ȩ������������
		Authority h = new Authority(back.getDriver());
		this.test();
		back.click(h.add);
		back.type(h.listname, "c");
		back.click(h.control);
		back.click(h.way);
		back.click(h.button);		
	}
	@Test
	public void testtwenty(){//20.���Ȩ�����������зǷ��ַ�
		Authority h = new Authority(back.getDriver());
		this.test();
		back.click(h.add);
		back.type(h.listname, "cao@#@#��shuo");
		back.click(h.control);
		back.click(h.way);
		back.click(h.button);
	}
	@Test
	public void testtwentyone(){//21.ѡ���������ѡ����з���
		Authority h = new Authority(back.getDriver());
		this.test();
		back.click(h.add);
		back.type(h.listname, "caoshuo");
		back.click(h.control);
		back.click(h.way);
		back.click(h.button);
	}
}


