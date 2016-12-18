package homeWorks1211;

//1、邮箱校验
//解析一个邮箱地址是否合法，如果合法则打印
//出用户名部分和该邮箱所属的网站域名，如果邮
//箱地址不合法则显示不合法的原因 [选做题]
//• 提示：邮箱地址不合法的因素：
//• 邮箱地址中不包含@或.
//• 邮箱地址中含有多了@或.
//• 邮箱地址中.出现在@的前面
//• 用户名里有其他字符
public class mailCheck {
	public static void main(String[] args){
		String mail="1234567@qq.com";
		if(check(mail)&&checkduo(mail)&&checkorder(mail)&&checkorther(mail))
			System.out.println("校验通过");
		else
			System.out.println("校验未通过");
			
	}
	public static boolean check(String s){
		boolean flag1=false;
		boolean flag2=false;		
		char[] a=s.toCharArray();
		for (int i = 0; i < a.length; i++) {
			if(a[i]=='@')
				flag1=true;
			if(a[i]=='.')
				flag2=true;				
		}
		if(flag1==true&&flag2==true)
			return true;
		else
			return false;	
	}
	public static boolean checkduo(String s){
		if((s.indexOf('@')==s.lastIndexOf('@'))&&(s.indexOf('.')==s.lastIndexOf('.')))
			return true;
		else 
			return false;
		}
	public static boolean checkorder(String s){
		char[] a=s.toCharArray();
		if(s.indexOf('@')<s.indexOf('.'))
			return true;
		else
			return false;
	}
	public static boolean checkorther(String s){ 
		boolean flag1,flag2=true;		
		char[]a=s.toCharArray();
		for (int i = 0; i < a.length; i++) {
			if((a[i]>='a'&&a[i]<='z')||(a[i]>='A'&&a[i]<='Z')||(a[i]>='0'&&a[i]<='9')||a[i]=='@'||a[i]=='.')
				flag1=true;
			else
				flag2=false;
		}
		return flag2;
	}
	


}
