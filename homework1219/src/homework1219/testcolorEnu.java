package homework1219;
public enum testcolorEnu {
//	RED("红色"), YELLOW("黄色"), BLUE("蓝色");//还有没有构造方法前不能定义全局变量
	
	String name;
	RED("红色"), YELLOW("黄色"), BLUE("蓝色");//还有没有构造方法前不能定义全局变量

	testcolorEnu(String s){
		this.name=s;
	}

	public String getName() {
		return name;
	}
	

}
