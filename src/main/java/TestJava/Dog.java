package TestJava;

public class Dog implements Animal {

	private int i;
	private String name;

	public Dog(int id, String name) {
		this.i = id;
		this.name = name;
		
	

	}

	@Override
	public int getIntValue() {
		
		return i;
	}
    
	
	
	
}
