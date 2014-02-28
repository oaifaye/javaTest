package threadTest;

public class Entity implements Runnable{

	private int s;
	
	public Entity(int s){
		this.s=s;
	}

	@Override
	public void run() {
		System.out.println(s);
	}
}
