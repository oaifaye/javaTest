package threadTest.SingleThreadedExecution.ex1;

public class UserThread extends Thread {
	private String name;
	private String add;
	private Gate gate;
	
	UserThread(Gate gate,String name ,String add){
		this.gate = gate;
		this.name = name;
		this.add = add;
	}
	
	public  void run(){
		 while (true) {
			gate.pass(name,add);
		}
	}
}

