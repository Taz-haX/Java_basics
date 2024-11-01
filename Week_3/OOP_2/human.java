
public class human {
	
	String name;
	int age;
	double weight;

	human(String name, int age, double weight){
		this.name = name;
		this.weight = weight;
		this.age = age;
	}
	
	void run() {
		System.out.println("This idiot "+this.weight+" kilo "+this.name+" running for his life bratha");
	}
	
	void sleep() {
		System.out.println("No survival instincts. "+this.name+" Chaiiii");
	}	
}
