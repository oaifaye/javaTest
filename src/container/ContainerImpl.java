package container;

public class ContainerImpl implements Container {

	@Override
	public <T> void ingect(Class<T> i) {
		System.out.println("成功！！");
	}

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws ClassNotFoundException {
		ContainerImpl c = new ContainerImpl();
		
		Class<Entity> i = (Class<Entity>) Class.forName("container.Entity");
		c.ingect(i);
	}
}
