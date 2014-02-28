package threadTest.wait;

public class Test1 extends Thread {

	public synchronized void m1() throws InterruptedException{
		System.out.println("开始");
		wait();
//		sleep(1000);
		notifyAll();
		System.out.println("结束");
	}
	
    public synchronized void getRequest() {
       
            try {                    
            	System.out.println("开始1");
                this.wait(1000);
                putRequest();
            } catch (InterruptedException e) {      
            }                                       
                                                  
      
    }
    public synchronized void putRequest() {
        this.notifyAll();
        System.out.println("结束1");
    }
	
	public void run(){
		//			m1();
		getRequest();
	}
	
	public static void main(String[] args) throws InterruptedException {
		new Test1().getRequest();
	}
}
