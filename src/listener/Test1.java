package listener;

public class Test1 {
	public static void main(String[] args) throws InterruptedException {
		Listener listen = new Listener();
		listen.start();
		Thread.sleep(5000);// 5秒后唤醒
		listen.wakeUp();

	}
}
