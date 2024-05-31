package model;

public abstract class Person {
	protected String name;

	public Person(String name) {
		super();
		this.name = name;
	}
	
	public Person() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
