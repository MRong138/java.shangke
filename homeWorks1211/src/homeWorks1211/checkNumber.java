package homeWorks1211;


public class checkNumber {

	public static void main(String[] args) {
		String s="324i字母325jj565汉字4tg数字tr";
		tong(s);
	}
	public static void tong(String S){
		System.err.println("字符串为"+S);
char[]s=S.toCharArray();
		int shu=0;
		int hanzi=0;
		int zimu=0;
		for (int i = 0; i < s.length; i++) {
			if(s[i]>='0'&&s[i]<='9')
				shu++;
			else if((s[i]>='a'&&s[i]<='z')||(s[i]>='A'&&s[i]<='Z'))
			    zimu++;
			else
				hanzi++;
		}
		System.out.println("字母个数为："+zimu);
		System.out.println("汉字个数为："+hanzi);
		System.out.println("数字个数为："+shu);
	}

}
