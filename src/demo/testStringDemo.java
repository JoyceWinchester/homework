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
 assertEquals("һ����ĸ��Сд",str.smallString("A"),"a");

 assertEquals("һ����ĸ���д",str.smallString("a"),"A");

 assertEquals("�ַ���ȫ�Ǵ�д",str.smallString("ABC"), "abc");

 assertEquals("����Сд���ַ���",str.smallString("aBc"), "abc");

 assertEquals("�������ֵ��ַ���",str.smallString("A1C"), "a1c");
 
 assertEquals("ȫ�����ֵ��ַ���",str.smallString("123"), "123");
 
 assertEquals("���������ַ��Ĵ���",str.smallString(",Adc"), ",adc");
 
 assertEquals("ȫ�������ַ��Ĵ���",str.smallString(",,."), ",,."); 
 
 assertEquals("�쳣����",str.smallString(""),"error");
}
}                            
