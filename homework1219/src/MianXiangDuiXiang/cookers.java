package MianXiangDuiXiang;
import java.util.Scanner;

 interface Cooker {
	public void Cook();
}

class ChuJiCooker implements Cooker{
	public void Cook() {
	System.out.println("我是初级厨师，我会做蛋炒饭");		
	}
	
}
class GaoJiCooker implements Cooker{
	public void Cook() {
	System.out.println("我是高级厨师，我会什么都会做");		
	}
	
}
class ZhongJiCooker implements Cooker{
	public void Cook() {
	System.out.println("我是中级厨师，我会做蛋炒饭和鱼香肉丝");		
	}
	
}
public class cookers {

	public static void main(String[] args) {
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
