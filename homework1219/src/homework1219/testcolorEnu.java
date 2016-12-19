package homework1219;
public enum testcolorEnu {//必须写成enume吗？
	RED("红色"), YELLOW("黄色"), BLUE("蓝色");//是不是一定得在写首行
	
	String name;
	RED("红色"), YELLOW("黄色"), BLUE("蓝色");//是不是一定得在写首行

	testcolorEnu(String s){
		this.name=s;
	}

	public String getName() {
		return name;
	}
	

}
