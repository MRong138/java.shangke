package homework1219;

import java.util.HashSet;
import java.util.Set;

public class tsetSet2 {
	public static void main(String[] args) {
		Set set=new HashSet();
		set.add("tom");// 无序且不能重复
		set.add("123");
		set.add("todm");
		for(Object obj:set){
			System.out.println(obj);
		}

	}

}
