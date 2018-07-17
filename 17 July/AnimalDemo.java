class Animal{
	public void speak() {
		System.out.println("Animal");
	}
}

class Dog extends Animal{
	public void speak() {
		System.out.println("Dog");
	}
}

class Cat extends Animal{
	public void speak() {
		System.out.println("Cat");
	}
}

class Horse extends Animal{
	public void speak() {
		System.out.println("Horse");
	}
}


public class AnimalDemo {
	public static void main(String[] arsg) {
		String animalType = "Dog";
		initializeAnimal(animalType);
	}
	
	public static void initializeAnimal(String animalType) {
		Animal animalObj = null;;
		try{
			if(animalType.equalsIgnoreCase("Dog"))
			animalObj = new Dog();
			else if(animalType.equalsIgnoreCase("Cat"))
				animalObj = new Cat();
			else if(animalType.equalsIgnoreCase("Horse"))
				animalObj = new Horse();
			
			animalObj.speak();
		}
		catch(NullPointerException np) {
			np.printStackTrace();
		}

		
	}
}
