
public class Dog {
	
	private String name;
	private int age;
	
	public Dog (String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public int inPersonYears() {
		return age * 7;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog myDog = new Dog("Fido", 5);
		
		System.out.println("name = " + myDog.getName());
		System.out.println("age = " + myDog.getAge());
		System.out.println("inPersonyears = " + myDog.inPersonYears());
	}

}
