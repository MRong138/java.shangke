package homeWorks1211;

class newplayer {
  public static int sum=0;
  public newplayer(){
		   sum++;
	}
}   

public class hm5 extends newplayer {
		public static void main(String[] args) {
			for(int i=0;i<13;i++){
				if(sum<11){
					new newplayer();
					System.out.println("创建了个第"+(i+1)+"对象");
				}
				else {
					System.out.println("已经创建了11个对象，不能再创建了");
					break;
				}
			}
		}
}