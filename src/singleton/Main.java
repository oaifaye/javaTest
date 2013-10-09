package singleton;

public class Main {

	public static void main(String[] args) {
		/*使用单例*/
		Real real = SingletonReal.getReal();
		real.play();
		real.setId("1");
		System.out.println(real.getId());
		
		Real real1 = SingletonReal.getReal();
		System.out.println(real1.getId());
		
		/*不使用单例*/
		Real real2= new Real();
		real2.setId("22");
		System.out.println(real2.getId());
		
		Real real3= new Real();
		System.out.println(real3.getId());
	}
}
