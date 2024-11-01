//import javax.swing.JOptionPane;
//import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.Random;

public class constructors_java {

	public static void main(String[] args) {	
		
		human hman = new human("Gari",29,76.2);	
		human humn = new human("Pudri",22,110.5);
		
		System.out.println(hman.age);
		System.out.println(humn.weight);
		
		humn.run();
		hman.sleep();
		
	}
	
}
