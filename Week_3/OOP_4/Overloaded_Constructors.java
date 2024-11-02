//import javax.swing.JOptionPane;
//import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.Random;

public class Overloaded_Constructors {

	public static void main(String[] args) {


		pizza piz = new pizza();
		
		pizza piz2 = new pizza("Pineapples");
		pizza piz3 = new pizza("juiceeee","mama miaaa","mozarella","NAGAAA");
		
		
		System.out.println(piz2.name);
		System.out.println(piz2.topping);
		System.out.println(piz2.Spice_levels);
		
		System.out.println("----------------------");
		
		System.out.println(piz.Spice_levels);
		System.out.println(piz.Da_Sauceee);
		
		System.out.println("-------------------------");
		
		System.out.println(piz3.Da_Sauceee);
		System.out.println(piz3.topping);
		System.out.println(piz3.name);
		System.out.println(piz3.Spice_levels);
		
		
	}
	
}
