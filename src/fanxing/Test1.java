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
		
		int a =2;
		int b =1;
		for(int i = 0 ; i<5 ; i++){
			//System.out.println("1111"+(++b>2));
			if((++a>2)&&(++b>2)){
				//a++;
				System.out.println(a++);
			}
			
		}
		System.out.println(a+".."+b);
		
		//128的问题
		Integer i = -128;
		Integer x = -128;
		System.out.println(i == x); //true

		Integer i1 = 128;
		Integer x1 = 128;
		System.out.println(i1 == x1); //false
		
	}
}