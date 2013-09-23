package stringTest;

public class Test1 {

	public static void main(String[] args) {
		String s1 = "aaa";
		String s2 = "aaa";
		System.out.println("s1==s2 is "+(s1==s2));
		String s3 = new String("aaa");
		System.out.println("s1==s3 is "+(s1==s3));
	}
}
