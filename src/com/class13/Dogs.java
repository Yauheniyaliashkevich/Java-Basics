package com.class13;

public class Dogs {
	
	public String breed;
	public String size;
	public String color;
	public int age;
	
	public void bark() {
		System.out.println("ruff ruff and wow wow wow");
	}
	
	public void sleep() {
		System.out.println("ZZZZZZZzzzzzzzz");
	}
	
	public void eat() {
		System.out.println("Omnomnom");
	}
	
	public void look () {
		System.out.println("Hi I am a "+breed+" my color is "+color);
	}
	
    public static void main(String[] args) {
		
		Dogs Husky =new Dogs();
		Husky.breed="Husky";
		Husky.size="Large";
		Husky.color="Grey";
		Husky.age=10;
		Husky.bark();
		Husky.sleep();
		Husky.eat();
		Husky.look();
		
		Dogs Bulldog =new Dogs();
		Bulldog.breed="American Bulldog";
		Bulldog.size="Medium";
		Bulldog.color="Black";
		Bulldog.age=8;
		Bulldog.bark();
		Bulldog.sleep();
		Bulldog.eat();
		Bulldog.look();
		
		Dogs Labrador =new Dogs();
		Labrador.breed="Labrador";
		Labrador.size="Large";
		Labrador.color="Beige";
		Labrador.age=5;
		Labrador.bark();
		Labrador.sleep();
		Labrador.eat();
		Labrador.look();
		
	}

}
