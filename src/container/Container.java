package container;

public interface Container {
	
	<T> void ingect(Class<T> i);
	
}
