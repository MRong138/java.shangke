package zuoye1;
class play {
	private static int sum=0;

	public play(){
		if(sum<11)
	        System.out.println("������һ������");
		else
			System.out.println("�Բ����Ѿ�������11�����󣬲����ڴ���������");
			
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
