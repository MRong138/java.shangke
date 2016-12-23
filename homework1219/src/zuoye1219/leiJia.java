package zuoye1219;

public class leiJia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		leijia();
	}
	public static void leijia() {
		int a[] = new int[40];
		a[1] = a[0] = 1;
		for (int i = 2; i < 40; i++)
			a[i] = a[i - 1] + a[i - 2];
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
