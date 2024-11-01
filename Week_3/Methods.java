//import javax.swing.JOptionPane;
//import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.Random;

public class Methods {

	public static void main(String[] args) {
		String name = "IDIOT";
		
		int age = 17;
		
		hello(name, age);
		
		System.out.println("--------------------------------------------");
		
		int a = 23;
		int b = 16;
		
		System.out.println(add(a,b));
		
	}
	
	static void hello(String args, int arg) {
		
		System.out.println("DO NOT DISTURB ME YOU "+arg+" years old "+args+"!!!");
	}
	
	static int add(int x, int y) {
		int z = x+y;
		return z;
	}

}
