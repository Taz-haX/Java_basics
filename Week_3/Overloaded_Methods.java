//import javax.swing.JOptionPane;
//import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.Random;

public class Overloaded_Methods {

	public static void main(String[] args) {
		
		System.out.println(add(3.66,4.4,8.3,6.55));
		
	
	}
	
	
	static int add(int x, int y) {
		System.out.println("Method 1");
		return x+y;
	}
	static int add(int x, int y, int z) {
		System.out.println("Method 2");
		return x+y+z;
	}
	static double add(double x, double y, double z, double p) {
		System.out.println("Method 3");
		return x+y+z+p;
	}
	

}
