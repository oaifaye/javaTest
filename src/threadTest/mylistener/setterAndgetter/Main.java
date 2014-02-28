package threadTest.mylistener.setterAndgetter;

public class Main {

	public static void main(String[] args) {
		Entity en = new Entity("a");
		
		new Setter(en,"a").start();
		new Getter(en).start();
	}
}
