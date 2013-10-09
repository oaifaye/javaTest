package singleton;

public class SingletonReal {

	private static Real real;
	
	private SingletonReal(){}
	
	public static Real getReal(){
		if(real==null){
			real = new Real();
			System.out.println("实例化一个！！");
		}
		return real;
	}
	
}
