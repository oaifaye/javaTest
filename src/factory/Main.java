package factory;

/**
 * 工厂模式
 * 定义一个用于创建对象的接口，让子类决定实例化哪一个类。FactoryMethod使一个类的实例*延迟到其子类。
 * 
 适用性

    1.当一个类不知道它所必须创建的对象的类的时候。

    2.当一个类希望由它的子类来指定它所创建的对象的时候。

    3.当将创建对象的职责委托给多个帮助类中的某一个，并且希望将哪一个帮助子类是代理者这一信息局部化的时候。
 */
public class Main {

	public static void main(String[] args) {
		Factory1 factory1 = new Factory1();
		factory1.getReal().eat();
		factory1.getReal().play();
		
		Factory2 factory2 = new Factory2();
		factory2.getReal().eat();
		factory2.getReal().play();
	}
}
