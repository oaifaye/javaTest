package threadTest.synch;

public class Test1 extends Thread{

	public static void m1(){
		
		synchronized (Test1.class) {
			
		}
	}
	
	public synchronized void m2(){
		
	}
}
