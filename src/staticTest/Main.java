package staticTest;

public class Main {
	public static int i;

	public static void change(int i) {
		Main.i++;
		System.out.println("change中的i：" + Main.i);
	}

	public static void change1(int i) {
		i++;
		System.out.println("change1中的i：" + i);
	}

	public static void main(String[] args) {
		change(i);
		// change1(i);
		System.out.println("main中的i：" + Main.i);

	}
}
