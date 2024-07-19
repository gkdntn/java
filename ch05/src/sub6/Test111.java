package sub6;

public class Test111 {
	
	
	
	
	public static void main(String[] args) {
		
		Dog a1 = new Dog();
		Cat a2 = new Cat();
		
	
		printSound(a1);
		printSound(a2);
		
		
		
	}
	public static void printSound(Pet a) {
		a.makeSound();
	}
}
