package threadTest.mylistener.setterAndgetter;

public class Entity {

	private String mess;
	
	Entity (String mess) {
		this.mess = mess;
	}
	
	public synchronized String get () {
		if(mess == null){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		notify();
		if(mess == null){
			System.out.println("null...............");
		}else{
			//System.out.println("+++++++++++++++++++");
		}
		this.mess = null;
		return mess;
	}
	
	public synchronized void set (String mess) {
		
		while (null != this.mess) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		notify();
		this.mess = mess;
//		System.out.println(mess+"放入");
	}
	
}
