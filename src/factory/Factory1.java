package factory;

public class Factory1 implements IFactory {

	@Override
	public IReal getReal() {
		return new Real1();
	}

}
