package demo;

import demo.StringDemo;
import junit.framework.TestCase;

public class StringDemoTest extends TestCase 
{
	private StringDemo str;
	protected void setUp()
	{
		str = new StringDemo();
	}
	public void testSmallString() 
	{
		assertEquals("一个字母变小写",str.smallString("A"),"a");		
	}
	public void testLongString()
	{
		assertEquals("一串字符变小写",str.smallString("ABCDEFG"),"abcdefg");
	}
	public void testMixShortString()
	{
		assertEquals("大小写混合的短字符串变小写",str.smallString("Ab"),"ab");
	}
	public void testMixLongString()
	{
		assertEquals("大小写混合的长字符串变小写",str.smallString("AbCDefG"),"abcdefg");
	}
	public void testError()
	{
		assertEquals("测试错误",str.smallString(""),"error");
	}
	public void testAnyString()
	{
		assertEquals("测试一个任意字符串",str.smallString("13Acb32D"),"13acb32d");
	}
	public void testStringWithSpace()
	{
		assertEquals("测试一个带空格的字符串",str.smallString("13Acb 32D"),"13acb 32d");
	}
	public void testStringWithChineseComma()
	{
		assertEquals("测试一个带中文逗号的字符串",str.smallString("13Acb，32D"),"13acb，32d");
	}
	public void testStringWithEnglishComma()
	{
		assertEquals("测试一个带英文逗号的字符串",str.smallString("13Acb,32D"),"13acb,32d");
	}
	public void testChineseString()
	{
		assertEquals("测试一个中文字",str.smallString("哈"),"哈");
	}
}

