package zuoye2;

public class car  extends Vehicle {
    private int loader;
    public car(String b,String c,int l){
    	super(b,c);
    	loader=l;   	
    }
    
    public int getLoader() {
		return loader;
	}

	public void setLoader(int loader) {
		this.loader = loader;
	}

	public void run(){
        System.out.print("һ��"+super.getBrand()+super.getColor()+"С����������");	 
        System.out.print(super.getSpeed()+"���ٶ���ʻ��");	 
        System.out.print("������"+this.getLoader());  	
        System.out.println("");  	
    }
}
