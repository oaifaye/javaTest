package threadTest;

public class ThreadPool {
	
	Thread thread;

	public void pool(int max) throws InterruptedException{
		Thread thread = new Thread();
		Entity e ;
		int size=2;
		for(int i = 0;i<max;i=i+0){
			Thread.sleep(1000);
			for(int j =0;j<size;j++){
				e = new Entity(i);
				thread = new Thread(e);
				thread.start();
				i++;
			}
//			Thread.sleep(1000);
			
		}
	}
	
	public void creatThread(Entity e){
		thread = new Thread();
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		new ThreadPool().pool(10);
	}
}
