package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class ListTest {

	public static void main(String[] args) {
//		List<Integer> l = new ArrayList<Integer>();
		List<Integer> l = new LinkedList<Integer>();
		for (int i = 0; i < 100000; i++) {
			l.add(i);
		}
		Iterator<Integer> i = l.iterator();
		long t = System.currentTimeMillis();
		while (i.hasNext()) {
			Integer n = i.next();
			if(n % 2 == 0){
				i.remove();
			}
		}
		System.out.println(System.currentTimeMillis() - t);
		
//		for (Integer l1 : l) {
//			System.out.println(l1);
//		}
		
	}
	
}
