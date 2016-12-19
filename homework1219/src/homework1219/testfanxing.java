package homework1219;

import java.util.ArrayList;
import java.util.List;


public class testfanxing {
public static void main(String[] args) {
	List<Student> list1 = new ArrayList<Student>();
	Student stu=new Student("Anndy",20);
	list1.add(new Student("Alice",19));
	list1.add(new Student("Tom",18));
	list1.add(new Student("Anndy",20));
	list1.add(stu);
	List<Student> list2= new ArrayList<Student>();
	list2.add(new Student("张三",21));
	list1.addAll(list2);
	int index=list1.indexOf(new Student("Anndy",20));//这个是新建的，所以就返回的时-1吗？；
	System.out.println(index);
	index=list1.indexOf(stu);
	System.out.println(index);
	for (Student obj : list1) {
		obj.ToString();
		System.out.println(obj); //老师这是在调用String里的toString函数吗？
	}
	Student stu1=new Student("Anndy",20);
	Student stu2=new Student("Anndy",20);
	System.out.println(stu1.equals(stu2));
	


	
}
}
