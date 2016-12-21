package zuoye1219;

public class zifuchuan3 {

	public static void main(String[] args) {
		String str = "3242~@~...CfxdXBg3Aasdf4";//
		int shuzi = 0;
		int xz = 0;
		int dz = 0;
		int other = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c >= 'a' && c <= 'z') {
			xz++;
		} else if (c >= 'A' && c <= 'Z') {
			dz++;
		} else if (c >= '0' && c <= '9') {
			shuzi++;
		} else {
			other++;
		}
		}
		System.out.println("输出字符串是"+str);
		System.out.println("字符串中含有的数字个数是"+shuzi);
		System.out.println("字符串中含有的大写字母个数是"+dz);
		System.out.println("字符串中含有的小写个数是"+xz);
		System.out.println("字符串中含有的其他个数是"+other);

	}

}
