import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("WHat yo dumbass age?");
		int age = scanner.nextInt();
		
		if (age==18) {
			System.out.println("Well, Well, how's life boyo");
		}
		
		else if (age>18) {
			
			System.out.println("How be the mess");
		}
		
		else {
			
			System.out.println("You still green boi");
			
		}
	}

}