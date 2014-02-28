/**
 * 
 */
package threadTest.mylistener.setter;

/**
 * @author Administrator
 *
 */
public class Setter extends Thread {
	
	private Entity en;
	private String mess1;
	private String mess2;
	
	
	Setter (Entity en,String mess1,String mess2) {
		this.en = en;
		this.mess1 = mess1;
		this.mess2 = mess2;
	}
	
	@Override
	public void run() {
		while (true) {
			en.set(mess1,mess2);
//			if(en.get().equals(mess)){
//				System.out.println(en.get()+".."+mess);
//			}
		}
		
	}
}
