package threadTest.mylistener.setterAndgetter;

public class Getter extends Thread {
	private Entity en;
	
	Getter (Entity en) {
		this.en = en;
	}
	
	@Override
	public void run() {
		while (true) {
			en.get();
		}
	}
}
