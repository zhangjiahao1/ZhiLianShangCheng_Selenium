package cn.Wolf.utils;

import org.testng.annotations.Test;

import cn.Wolf.utils.ZipCompressor;

public class TestZip {
	@Test
	 public void nihao(){  
	        ZipCompressor zc = new  ZipCompressor("D:\\java\\java\\DianShang\\test-output.zip");  
	        zc.compressExe("D:\\java\\java\\DianShang\\test-output");;  

	    }  
}
