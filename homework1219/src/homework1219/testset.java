package homework1219;

import java.util.HashSet;
import java.util.Set;

public class testset {
	public static void main(String[] args) {
		Set list1=new HashSet();
		list1.add(new Student("Alice",19));
		list1.add(new Student("Tom",18));
		list1.add(new Student("Anndy",20));
		int index = list1.indexOf(new Student("Anndy",20));//为什么这个indexOf是错的？
        System.out.println(index);
		for (Object obj : list1) {
			System.out.println(obj);//这个也调用的是Student里的toString函数是不，
		}

	}

}
