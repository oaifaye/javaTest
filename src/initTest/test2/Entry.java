package initTest.test2;

public class Entry {

	static{
		System.out.println("爹中静态块");
	}
	
	int i;
	
	{
		i=1;
		System.out.println("爹块中"+i);
	}
	
	Entry(){
		i=2;
		System.out.println("爹构造器中"+i);
	}
	
	public static void main(String[] args) {
		new EntrySon();
	}
}
