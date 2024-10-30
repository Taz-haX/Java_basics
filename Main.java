//import javax.swing.JOptionPane;
//import java.util.Scanner;
import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		
		ArrayList<String> name = new ArrayList<String>();
		
		name.add("tall boi");
		name.add("Weird boi");
		name.add("LMfao manh");
		
		for (int i = 0; i<name.size();i++) {
			System.out.println(name.get(i));
		}
		
		System.out.println("\nN E W   A R R A Y L I S T\n");
		
		name.set(0, "Short Kimg");
		
		for (int i = 0; i<name.size();i++) {
			System.out.println(name.get(i));
		}
		
		System.out.println("\nN E W   A R R A Y L I S T\n");
		
		name.remove(1);
		
		for (int i = 0; i<name.size();i++) {
			System.out.println(name.get(i));
		}
		
		System.out.println("\nN E W   A R R A Y L I S T\n");
		
		name.clear();

	}

}