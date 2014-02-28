package initTest.test2;

public class EntrySon extends Entry {
	
	static{
		System.out.println("儿子中静态块");
	}

	int i;

	{
		i = 1;
		System.out.println("儿子块中" + i);
	}

	EntrySon() {
		i = 2;
		System.out.println("儿子构造器中" + i);
	}
}
