import java.util.Random;


public class Draw {
	
	int number;
	String name;
	
	Random random = new Random();
	
	Draw(String name, int number){
		this.name = name;
		this.number = number;
		
		System.out.println("Hello player: "+this.name+"\nYour chosen number is: "+this.number+
				"\n-----------------------------\nProceed to draw?(y or n)");
		
	}
	
	void roll(){
		
		int winning_number = random.nextInt(47);
		
		System.out.println("Your Chosen NUmber: "+this.number);
		System.out.println("The Draw Number: "+winning_number);
		
		if(winning_number==this.number) {
			System.out.println("YOU'VE WON THE LOTTERY!!");
		}
		else {
			System.out.println("Ahhh! Better luck next time");
		}
		
	}	

}
