package MianXiangDuiXiang;

import java.util.Scanner;

interface fruit{
	void reap();
}
class apple implements fruit{

	public void reap() {
		System.out.println("太好了，你收获了苹果！");
	}
	
}
class pear implements fruit{

	public void reap() {
		System.out.println("太好了，你收获了大鸭梨");
	}
	
}
public class fruits {
   public static void main(String[] args) {
		System.out.println("你想收获苹果还是大鸭梨？");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		fruit f=null;
		switch (s) {
		case "苹果":
			f=new apple();
			break;
		case "大鸭梨":
			f=new apple();
			break;
		default:
			break;
		}
		f.reap();
}

}
