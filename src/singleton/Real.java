package singleton;

public class Real {

	private String id ;
	private String name ;
	
	public void play(){
		System.out.println("I am playing!!");
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
