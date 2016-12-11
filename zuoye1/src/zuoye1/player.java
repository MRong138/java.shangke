package zuoye1;
class play {
	private static int sum=0;

	public play(){
		if(sum<11)
	        System.out.println("创建了一个对象");
		else
			System.out.println("对不起，已经创建了11个对象，不能在创建对象了");
			
	sum++;
	}
}
public class player {

public static void main(String[] args) {

    for (int i = 0; i < 12; i++) {
		new play();
	}
	}

}
