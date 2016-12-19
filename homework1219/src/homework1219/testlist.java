package homework1219;

import java.util.ArrayList;
import java.util.List;

public class testlist {
	public static void main(String[] args) {
		List c = new ArrayList();
		c.add("tom");// 添加
		c.add(123);
		c.add(new Student());
		c.add(new Student("Alice",19));
		c.add(new String[] { "x", "x" });
		c.add(123);//可以插入重复的对象
//    	c.remove(3);  老师  是删除按顺序排的第4个吗？
		for (Object str : c) {
		System.out.println(str);//老师，这里的输出是怎么回事？怎么有的输得出，有的输不出
	}
		System.out.println(c.contains(new String("tom")));//String是同一个，
		System.out.println(c.contains(new Student("Alice",19)));//new一个对象不是同一个，老师是不？
//		 String[] array = { "1", "x", "x2" };
//		 for (String str : array) {
//		 System.out.println(str);//如果要重写这个输出，老师，在哪儿改呢？
//		 }


	}

}
