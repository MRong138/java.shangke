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
        System.out.print("一辆"+this.brand+"的"+this.color);	 
        System.out.print("小车，正在以"+this.speed+"的速度行驶");	 
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
