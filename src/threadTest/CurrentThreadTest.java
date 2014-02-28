package threadTest;

public class CurrentThreadTest {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		t.getId();
		System.out.println(t.getId());
	}
}
