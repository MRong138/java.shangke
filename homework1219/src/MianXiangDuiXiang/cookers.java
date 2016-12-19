package MianXiangDuiXiang;
import java.util.Scanner;

 interface Cooker {
	public void Cook();
}

class ChuJiCooker implements Cooker{
	public void Cook() {
	System.out.println("恭喜你！你是初级厨师，你会做蛋炒饭啦");		
	}
	
}
class GaoJiCooker implements Cooker{
	public void Cook() {
	System.out.println("恭喜你！你是高级厨师，你什么都会做啦");		
	}
	
}
class ZhongJiCooker implements Cooker{
	public void Cook() {
	System.out.println("恭喜你！你是中级厨师，你会做蛋炒饭和鱼香肉丝啦");		
	}
	
}
public class cookers {

	public static void main(String[] args) {
		System.out.println("请输入你的学费：");
		Scanner sc=new Scanner(System.in);
		int money=sc.nextInt();
		Cooker c=null;
		switch (money) {
		case 1000:
			c=new ChuJiCooker(); 
		
			break;
		case 2000:
			c=new ZhongJiCooker(); 
			break;
		case 3000:
			c=new GaoJiCooker(); 
			break;

		default:
			System.out.println("输入错误！");
			break;
		}
		c.Cook();

	}

}
