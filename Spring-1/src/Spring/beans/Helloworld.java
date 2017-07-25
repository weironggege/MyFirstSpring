package Spring.beans;

public class Helloworld {

	private String name;

	public void setName(String name) {
		System.out.println("setName:" + name);
		this.name = name;
	}
	
	public void hello() {
		System.out.println("hello:" + name);
	}
	
	public Helloworld() {
		System.out.println("Helloworld's Constructor.......");
	}
}
