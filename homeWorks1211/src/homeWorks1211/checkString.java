package homeWorks1211;
//6、分别在控制台输入字符串和子字符串，并计算字符串中子字符串出现的次数
public class checkString {
	public static void main(String []args){
		String s="22232224222322254322262227222";
		String c="222";
		check(s,c);
		
	}
	public static void check(String S,String A){
		char[]s=S.toCharArray();
		char[]a=A.toCharArray();
		int sum=0,j,i=0,n=0;
      for(i=0;i<s.length;n=0,i++)
	        for ( j = 0; j <a.length; j++) {
	        	if(i+j>=s.length)
	        		break;
				if(s[i+j]==a[j]){  
					n++;
				    if(n==a.length) 
					    sum++;
				}
			}
		System.out.println("一共出现了"+sum+"次");
	}
}


