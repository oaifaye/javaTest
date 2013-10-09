package singleton;

public class Main1 {
	
	public static void main(String[] args) {
		Real real = SingletonReal.getReal();
		real.play();
		System.out.println(real.getId());
	}
}
