package threadTest;

public class Test1 extends Thread {

	private String m;
	
	Test1(String s){
		this.m=s;
	}
	
	@Override
	public void run() {
		for(int i = 0 ; i<10 ; i++){
			System.out.println(m+i);
		}
	}
	
	public static void main(String[] args) {
		Test1 test1= new Test1("A");
		Test1 test2= new Test1("B");
		test1.start();
		test2.start();
	}
}
