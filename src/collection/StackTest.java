package collection;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		for (int i = 0; i < 100000; i++) {
			s.push(i);
		}
		long l = System.currentTimeMillis();
		
		for (int i = 0; i < s.size(); i++) {
			Integer ss = s.get(i);
			s.remove(i);
		}
		System.out.println("耗时："+(System.currentTimeMillis() - l));
		
		l = System.currentTimeMillis();
		while (!s.empty()) {
			s.pop();
		}
		System.out.println("耗时："+(System.currentTimeMillis() - l));
	}
	
}
