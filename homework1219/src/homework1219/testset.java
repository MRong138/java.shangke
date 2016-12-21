package homework1219;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class testset {
	public static void main(String[] args) {
        List list1 =new ArrayList();
//		Set list1=new HashSet(); //set中的数据时乱序的，所以不能用indexOf
		list1.add(new Student("Alice",19));
		list1.add(new Student("Tom",18));
		list1.add(new Student("Anndy",20));
		int index = list1.indexOf(new Student("Anndy",20));
        System.out.println(index);
		for (Object obj : list1) {
			System.out.println(obj);
			System.out.println(obj);
		  //  默认不写toString方法，此时默认打出来的是一个地址，
			//而写完了toString方法，就是toString返回的值
		}

	}

}
