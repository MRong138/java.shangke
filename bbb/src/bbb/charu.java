package bbb;


public class charu {
	public static void main(String []s){
		String s1="1234567";
		String add="qq";
		int a=4;
		String res=s1+add;
		char[] S1=s1.toCharArray();
		char[] re=res.toCharArray();
		char[] ad=add.toCharArray();
		for (int i = a, j =0 ; i < add.length(); i++,j++) {
			re[i]=ad[j];	
			add.toCharArray();
		}
		for(int i=a+add.length(),j=a;i<res.length();i++,j++){
			re[i]=S1[j];
		}
	}
}