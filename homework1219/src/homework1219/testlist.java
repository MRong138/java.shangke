package homework1219;

import java.util.ArrayList;
import java.util.List;

public class testlist {
	public static void main(String[] args) {
		List c = new ArrayList();
		c.add("tom");
		c.add(123);
		c.add(new Student());
		c.add(new Student("Alice",19));
		c.add(new String[] { "x", "x" });
		c.add(123);
		System.out.println("输出是：");
		for (int i = 0; i < c.size(); i++) {
			System.out.println(c.indexOf(c.get(i)));
		}
    	c.remove(3); //与数组一样，删除的是下标为3的索引，是4。
    	for (Object str : c) {
		System.out.println(str); //是因为new的对象，对象默认打印的都是地址，
		//如果对象重写了toString方法则，打印toString的返回值
	}
		System.out.println(c.contains(new String("tom")));//String是同一个，
		System.out.println(c.contains(new Student("Alice",19)));//new一个对象,新的地址，不是同一个。
		 String[] array = { "1", "x", "x2" };
		 for (String str : array) {
		 System.out.println(str);//String是final的，不能被重写，public final class String
		 }


	}

}
