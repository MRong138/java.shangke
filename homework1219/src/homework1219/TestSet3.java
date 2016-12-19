package homework1219;

import java.util.HashSet;
import java.util.Set;


public class TestSet3 {

	public static void main(String[] args) {
		Set set = new HashSet();
		set.add("tom");// 无序且不能重复，
		set.add("123");
		set.add("tom");
		Student stu = new Student( "jack",12);
		Student stu2 = new Student("jack",11);
		set.add(stu);
		set.add(stu2);
		for (Object obj : set) {
			System.out.println(obj);
		}
		if (stu.equals(stu2) && stu.hashCode() == stu2.hashCode()) {
			//老师，在哪儿改这个HashCode的函数？
			System.out.println("对象相等");
		}else{
			System.out.println("不相等");
		}
	}

}