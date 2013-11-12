package fanxing;

public class Test1 {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		Class<Entity> EntityClass = Entity.class;
		Entity entity = new Entity();
		Entity entity1 = (Entity) Class.forName("fanxing.Entity").newInstance();
		Entity2 entity2 = new Entity2();
		
		System.out.println(entity1 instanceof Entity2);
		System.out.println(EntityClass instanceof Class);
		System.out.println(entity instanceof Entity2);
		
	}
}