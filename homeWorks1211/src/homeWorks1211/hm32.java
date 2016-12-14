package homeWorks1211;


public class hm32 {
	public static void main(String []arsg){
		String S="abcdefghijk";
		delete(S,3,5);	
	}
	public static void delete(String S,int a,int b){
		  char[] s=S.toCharArray();
		  int j,i;
		  System.out.println("数组信息"+S);
		  System.out.println("删除的位置"+a);
		  System.out.println("需要删除数组的元素个数"+b);

		  try{
			  if(a<=0||a>s.length){
				  System.out.println("输入错误！   删除位置超出数组范围");
			      System.out.println("请再次运行并输入符合要求的位置。");
			      return ;
			  };
			  if(b>s.length-a){
				  System.out.println("输入错误！    删除数组个数超出范围");
			      System.out.println("请再次运行并输入符合要求的位置。");
			      return ;				  
			  }
			 
		  }catch(Exception e){
			}
		  for (j=0, i = 0; i < a; i++,j++) {
			   s[j]=s[i];
		}
		  for (j=a-1, i = a+b-1; i < s.length; j++,i++) {
			   s[j]=s[i];
		}
		  System.out.println("输出结果是");
		  for ( i = 0; i <s.length; i++) {
			    System.out.print(s[i]);
			}

	}
	
	

}
