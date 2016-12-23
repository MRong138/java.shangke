package zuoye1219;

public class LinkedList {
	
	transient Object[] elementData;
	static int size=0;
	static Object[] obj= new Object[]{};
	public static void main(String[] args) {
		
        	LinkedList list =new LinkedList();
        	list.put('A');
        	list.put(3214);
        	list.put(new Student("Tom",1));
        	for (int i = 0; i < size; i++) {
        		list.get(i);
        	}
        	list.isEmpty();	        	
	}
	
	public boolean put(Object e) {
	        obj[size]=e;  
	        size++;
	        return true;
	}

	public Object get(int i) {
        System.out.println(obj[i]);
		return null;
	}
	public boolean isEmpty(){
		boolean flag;
        if(size!=0){
        	flag=true;
        	System.out.println("此List不为空。");
        }
        else{
        	flag=false;
        	System.out.println("此List为空。");
        }
		return flag;
	}

}
