package zuoye2;

public class Vehicle {
     private String  brand;
     private String  color;
     private double speed;
     public Vehicle(String b,String c){
    	 brand=b;
    	 color=c;
    	 speed=0.0;
     }
    public void run(){
        System.out.print("һ��"+this.brand+"��"+this.color);	 
        System.out.print("С����������"+this.speed+"���ٶ���ʻ");	 
        System.out.println("");  	
     }
	public String getBrand() {
		return brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
     
    
}
