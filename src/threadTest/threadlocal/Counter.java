package threadTest.threadlocal;

/**本类实现一个静态的ThreadLocal变量，变成了一个数据共享环境
 * 无论同时有多少线程在运行，返回值只与当前线程变量值有关，与其他线程无关
 * */

public class Counter {

	//新建一个静态的ThreadLocal变量，并通过get方法将其变成可访问的对象
	private static ThreadLocal<Integer> counterContext = new 
			ThreadLocal<Integer>(){
		protected synchronized Integer initialValue(){
			return 0;
		}
	};

	public static Integer get() {
		return counterContext.get();
	}

	public static void set(Integer value) {
		counterContext.set(value);
	}
	
}
