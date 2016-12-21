package homework1219;
import java.util.Scanner;

import pro.TestColorEnum;
import pro.testcolorEnu;

public class TestNume {
	private void mian() {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		testnume(new testcolorEnu(testcolorEnu.BLUE));//老师这儿怎么传值啊？
	}
	public static void testnume (testcolorEnu type){
		switch (type) {
		case BLUE:
			System.out.println("是蓝色");
			break;
		case RED:
			System.out.println("是红色");
			break;
		default:
			System.out.println("输入错误");
			break;
		}
	}
}