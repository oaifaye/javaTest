package threadTest.commentTest;

import java.util.Map;
import java.util.Map.Entry;

/**
 * 试试 Thread.getAllStackTraces()
 * @author Administrator
 *
 */
public class Test1 {

	public static void main(String[] args) {
		Map<Thread, StackTraceElement[]> stacks = Thread.getAllStackTraces();
		for (Entry<Thread, StackTraceElement[]> key : stacks.entrySet()) {
			StackTraceElement[] el = key.getValue();
			Thread thread = key.getKey();
			System.out.println(thread.getName());
		}
		
	}
	
}
