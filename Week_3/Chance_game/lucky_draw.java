//import javax.swing.JOptionPane;
import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.Random;

public class lucky_draw {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Play the Draw Game?(Press y/Y to continue): ");
		String ans = scanner.nextLine();
		
		while(ans.equalsIgnoreCase("y")) {
			play_draw();
			System.out.print("Play the Draw Game?(Press y/Y to continue): ");
			ans = scanner.nextLine();
		}
		System.out.println("Gonna see you around Gambler.");
			
	}
	
	static void play_draw() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String name = scanner.nextLine();
		System.out.println("----------------------------------");
		System.out.print("Please enter your Chosen number(Between 1 and 47): ");
		int number=scanner.nextInt();
		
		while (number>47||number<1) {
			System.out.println("----------------------------------");
			System.out.println("\nChosen number must be within 1 and 47:");
			number = scanner.nextInt();
		}
		scanner.nextLine();
		
		Draw draw = new Draw(name, number);
		
		String affirm = scanner.next();
		if(affirm.equalsIgnoreCase("y")) {
			draw.roll();
		}
		else {
			System.out.println("OKay brotha have a nice day.");
		}
		
	}
	
}
