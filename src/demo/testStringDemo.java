package demo.test;
import demo.StringDemo;
import junit.framework.TestCase;
public class testStringDemo extends TestCase {
private StringDemo str;
protected void setUp(){
str = new StringDemo();
}
public void testSmallString() {
 @Test
 assertEquals("一个字母变小写",str.smallString("A"),"a");

 assertEquals("一个字母变大写",str.smallString("a"),"A");

 assertEquals("字符串全是大写",str.smallString("ABC"), "abc");

 assertEquals("含有小写的字符串",str.smallString("aBc"), "abc");

 assertEquals("含有数字的字符串",str.smallString("A1C"), "a1c");
 
 assertEquals("全是数字的字符串",str.smallString("123"), "123");
 
 assertEquals("含有特殊字符的处理",str.smallString(",Adc"), ",adc");
 
 assertEquals("全是特殊字符的处理",str.smallString(",,."), ",,."); 
 
 assertEquals("异常处理",str.smallString(""),"error");
}
}                            
