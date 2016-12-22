package zuoye1219;

import homework1219.Student;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {
	public static void main(String[] args) {
		Set<Student> stu=new HashSet<Student>();
		Student s1=new Student ("Tom",1);
		Student s2=new Student ("Alice",2);
		Student s3=new Student ("Anndy",3);
		Student s4=new Student ("Lucy",4);
		Student s5=new Student ("Petter",5);
		stu.add(s1);
		stu.add(s2);
		stu.add(s3);
		stu.add(s4);
		stu.add(s5);
		stu.add(s5);		
		for(Object obj:stu)
			System.out.println(obj);

	}

}
