package zuoye1219;

public class zifuchuan2 {


	public static void main(String[] args) {
		String str = "3242~@~...CfxdXBg3Aasdf4";//
		tong(str);
	}
	public static void tong(String S){
		System.out.println("字符串为"+S);
        char[]s=S.toCharArray();
		int shuzi = 0;
		int xz = 0;
		int dz = 0;
		int other = 0;
		for (int i = 0; i < s.length; i++) {
			if(s[i]>='0'&&s[i]<='9')
				shuzi++;
			else if((s[i]>='a'&&s[i]<='z'))
				xz++;
			else if((s[i]>='A'&&s[i]<='Z'))
			    dz++;
			else
				other++;
		}
		System.out.println("字符串中含有的数字个数是"+shuzi);
		System.out.println("字符串中含有的大写字母个数是"+dz);
		System.out.println("字符串中含有的小写个数是"+xz);
		System.out.println("字符串中含有的其他个数是"+other);
	}

}
