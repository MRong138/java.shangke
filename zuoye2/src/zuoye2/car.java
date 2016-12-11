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
        System.out.print("一辆"+super.getBrand()+super.getColor()+"小车，正在以");	 
        System.out.print(super.getSpeed()+"的速度行驶，");	 
        System.out.print("载人数"+this.getLoader());  	
        System.out.println("");  	
    }
}
