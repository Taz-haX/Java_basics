//import javax.swing.JOptionPane;
//import java.util.Scanner;
import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		
		String[] names = {"Bangla","English","Math"};
		
		for(String i: names) {
			System.out.println(i);
		}
		
		System.out.println("-----------------------------------------");
		
		ArrayList<String> name = new ArrayList<String>();
		
		name.add("Lando");
		name.add("Verstappen");
		name.add("Hamilton");
		name.add("Senna");
		
		for(String i: name) {
			System.out.println(i);
		}
		
	}

}