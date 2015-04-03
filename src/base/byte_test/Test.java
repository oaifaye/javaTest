package base.byte_test;

/**
 * byte与char
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
//		String s = " ";
//		char d = ' ';
//		System.out.println((int)d);
		
//		char[] sc = s.toCharArray();
//		for (char c : sc) {
//			System.out.println(c);
//		}
//		System.out.println("/////////////////");
//		byte[] sb = d.getBytes();
//		for (byte b : sb) {
//			System.out.println(b);
//		}
		for (int i = 0; i < 31; i++) {
			System.out.println("<option value=\""+3600*24*i+"\">"+i+"天</option>");
		}
	}
	
}
