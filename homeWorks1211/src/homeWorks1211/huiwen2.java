package homeWorks1211;

import java.util.Scanner;
public class huiwen2 {

	public static void main(String[] args) {
		boolean flag=true;
		System.out.println("请输入：");
	    Scanner sc=new Scanner(System.in);
	    String s=sc.next();
	    char[] h=s.toCharArray();
		for (int j = 0; j <h.length/2; j++) {
			if(h[j]!=h[h.length-1-j]){
				flag=false;
			    break;
			}
		}
		
		if(flag)
			System.out.println("这是回文");
		else
			System.out.println("不是回文");
	}
}

