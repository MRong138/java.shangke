package zuoye1219;

public class Student {
	private String name;
	private Integer number;
	public  Student(String name,int number){
		this.name=name;
		this.number=number;
	}
	public  Student(){
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public void ToString() {
		System.out.println("姓名是"+this.name+", 学号是"+this.number);
	}
	@Override
	public String toString() {
		return "姓名是"+this.name+", 学号是"+this.number;
	}

	public boolean equals(Student obj) {

		boolean flag;
		if(this.name==obj.getName()&&this.number==obj.getNumber())
			flag=true;
		else
			flag=false;
		return flag;
	}
	@Override
	public int hashCode() {
		return this.getNumber().hashCode()+this.getName().hashCode();
	}
}
