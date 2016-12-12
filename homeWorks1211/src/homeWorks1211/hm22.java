package homeWorks1211;

public class hm22 {
	public static void main(String[]  args){
		int[]a={1,2,3,4,5,6,7,8,9};
		int[]b={1,2,3,4,5,6,7,8,9};
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j <=i; j++) {
				 System.out.print(a[i]+"*"+a[j]+"="+a[i]*a[j]+", ");			
			}
			System.out.println("");
			
		}
	}

}