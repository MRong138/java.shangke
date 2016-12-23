package zuoye1219;

public class digui {

	public static void main(String[] args) {
		System.out.println("5的阶乘是"+jicheng(5));
	}
	public static double jicheng(int n){
		double res;
		if(n==1||n==0)
			res=1;
		else
			res=n*jicheng(n-1);
		return res;
	}

}
