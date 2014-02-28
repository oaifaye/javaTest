package threadTest.mylistener.setter;

public class Main {

	public static void main(String[] args) {
		Entity en = new Entity();
		
		new Setter(en,"a","a").start();
		new Setter(en,"b","b").start();
	}
}
