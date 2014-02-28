/**
 * 
 */
package threadTest.mylistener.setterAndgetter;

/**
 * @author Administrator
 *
 */
public class Setter extends Thread {
	
	private Entity en;
	private String mess;
	
	Setter (Entity en,String mess) {
		this.en = en;
		this.mess = mess;
	}
	
	@Override
	public void run() {
		while (true) {
			en.set(mess);
//			if(!en.get().equals(mess)){
//				System.out.println(en.get()+".."+mess);
//			}
		}
		
	}
}
