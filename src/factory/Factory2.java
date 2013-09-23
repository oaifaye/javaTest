package factory;

public class Factory2 implements IFactory {

	@Override
	public IReal getReal() {
		return new Real2();
	}

}
