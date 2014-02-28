package threadTest.threadlocal;

public class ThreadLocalTest extends Thread {

	public void run(){
		for(int i = 0 ; i < 5 ; i++){
			System.out.println(Thread.currentThread().getName()+"..."+ (Counter.get()+i));
		}
	}
	
	public static void main(String[] args) {
		new ThreadLocalTest().start();
		new ThreadLocalTest().start();
		new ThreadLocalTest().start();
	}
}
