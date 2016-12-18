package homeWorks1211;
import java.io.IOException;
public class huiwen1 {

	public static void main(String[] args) {
		int i=0,n=0;
		boolean flag=true;
		char ch,a[]=new char[20];
		System.err.println("请输入字符串或数字（最多20个）：");
		try {
			ch=(char)System.in.read();
		
		while(ch!='\n'){
			a[n]=ch;
			n++;
			ch=(char)System.in.read();
		}
		}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		for (int j = 0; j <n/2; j++) {
			if(a[j]!=a[n-2-j])
				flag=false;
			break;
		}
		
		if(flag)
			System.out.println("这是回文");
		else
			System.out.println("不是回文");
	}

}

