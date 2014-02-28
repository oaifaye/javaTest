package exeption;

/**
 * 运行时异常运行时无需处理; 检查时异常必须处理
 * */

public class Sun extends Parent {

	@Override
	public void p() throws ArithmeticException {
		System.out.println("son");
	}

	public void ks() throws ArithmeticException {

	}

	public static void main(String[] args) {
		// new Sun().ks();
		// new Parent().p();

		try {
			throw new ArithmeticException();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
