package homeWorks1211;

//3、编写一端程序 ： 从控制台输入要插入的位子 和要插入的值根据位子把值插入到数组中 
//输出插入后的数组的全部信息

public class hm31 {
	public static void main(String [] args){
		String s="abcdefghijk";
		Insert(s,"234",8);
	}
	public static String Insert(String S,String A ,int n){
		  char[] s=S.toCharArray();
		  char[] a=A.toCharArray();
		  String Res=S+A;
		  int j,i;
		  System.out.println("数组信息"+S);
		  System.out.println("需要插入数组的信息"+A);
		  System.out.println("插入的位置"+n);
		  char[] res=Res.toCharArray();
		  
		  try{
			  if(n<=0||n>s.length){
				  System.out.println("输入错误！    插入位置超出数组范围");
			      System.out.println("请再次运行并输入符合要求的位置。");
				  return null;
			  };
		  }catch(Exception e){
			}
		  for ( i = 0,j=0; i < n; i++,j++) {
			  res[j]=s[i];
		  }
		  for ( i =0,j=n-1; i < a.length; i++,j++) {
			  res[j]=a[i];
		  }
		  for ( i=n-1,j=n+a.length-1; i < s.length; i++,j++) {
			  res[j]=s[i];
		  }
		  System.out.println("输出结果是");
		  for ( i = 0; i <res.length; i++) {
			    System.out.print(res[i]);
			}
		return Res;
		
	}

}
