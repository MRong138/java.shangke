package zuoye1219;

import homework1219.Student;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {
	public static void main(String[] args) {
		Set<Student> stu=new HashSet<Student>();
		Student []s=new Student[6];
		s[0]=new Student ("Tom",1);
		s[1]=new Student ("Alice",2);
		s[2]=new Student ("Anndy",3);
		s[3]=new Student ("Lucy",4);
		s[4]=new Student ("Petter",5);
		s[5]=s[4];
//		s[6]=s[4];	   //旭哥，这里多写了一个s[6]，怎么就超出数组范围了？
		
		for (int i = 0; i < s.length; i++) {
			for (int j = i+1; j < s.length; j++) {
				if(s[j].equals(s[i])&&s[j].hashCode()==s[i].hashCode())
					s[j]=null;
			}		
		}
		for (int i = 0; i < s.length; i++) {
			if(s[i]!=null)
				stu.add(s[i]);
		}
		
		for(Object obj:stu)
			System.out.println(obj);

	}

}
