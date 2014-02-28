package threadTest.mylistener.setter;

public class Entity {

	private String mess1;
	private String mess2;
	
//	Entity (String mess1,String mess2) {
//		this.mess1 = mess1;
//		this.mess2 = mess2;
//	}
	
	public void set (String mess1,String mess2) {
		this.mess1 = mess1;
		this.mess2 = mess2;
		validate();
		
	}
	
	private void validate(){
		if(!this.mess1.equals(this.mess2)){
			System.out.println("不相等");
		}else{
			System.out.println(1);
		}
	}
	
}
