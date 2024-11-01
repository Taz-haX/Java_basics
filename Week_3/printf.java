//import javax.swing.JOptionPane;
//import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.Random;

public class printf {

	public static void main(String[] args) {	
		
		int cost = -1000;
		double costs = 10000.05;
		
		System.out.printf("THis thing costs us about %,.4f",costs);
		
		System.out.println("\n---------------------------------------------");
		
		System.out.printf("THis thing costs us about %+010d",cost);
		
		System.out.println("\n---------------------------------------------");
		
		String ss = "Narnia";
		System.out.printf("You really wanna go to %s", ss);
		
		System.out.println("\n---------------------------------------------");
		
		boolean fb = true;
		System.out.printf("%b",fb);
			
	}
	
}
