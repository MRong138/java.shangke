package MianXiangDuiXiang;

import java.util.Scanner;

interface Play{
	void play();
}
class Play1 implements Play{
	public void play() {
        System.out.println("你能玩足球");
	}
	
}
class Play2 implements Play{
	public void play() {
        System.out.println("你能玩蓝球");
	}
	
}
class Play3 implements Play{
	public void play() {
        System.out.println("你能玩玻璃球球");
	}
	
}
public class players {

	public static void main(String[] args) {
		System.out.println("请输入你的身高：");
		Scanner sc=new Scanner(System.in);
		int height=sc.nextInt();
		Play p=null;    //老师，为什么这儿得是null?
		if(height>200)
			p=new Play1();
		else if(height<200&&height>150)
			p=new Play2();
		else
			p=new Play3();
		p.play();
		
	}

}
