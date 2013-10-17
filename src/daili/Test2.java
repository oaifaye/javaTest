package daili;

public class Test2 {
	public static void main(String[] a){
        new Proxy(new Real()).browser();
        
        new Proxy(new Real1()).browser();
    }
}
