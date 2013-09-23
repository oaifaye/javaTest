package innerClass;

/**内部类*/

public class Inner1 {

	public class Inner11 implements Inteface1{
		@Override
		public void Inteface1Method() {
			
		}
	}
	public static void main(String[] args) {
		Inner1 inner1 = new Inner1();
		Inner11 inner11 = inner1.new Inner11();//内部类的实例化
		System.out.println(inner1 instanceof Inteface1);
		System.out.println(inner11 instanceof Inteface1);
	}
}
