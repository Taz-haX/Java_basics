//import javax.swing.JOptionPane;
//import java.util.Scanner;
import java.util.ArrayList;


public class ArrayList_2D {

	public static void main(String[] args) {
		
		ArrayList<ArrayList<String>> Cars = new ArrayList();
		
		ArrayList<String> MuscleCars = new ArrayList();
		
		MuscleCars.add("Ford Mustang");
		MuscleCars.add("Dodge Charger");
		MuscleCars.add("Corvette");
		
		ArrayList<String> F1Cars = new ArrayList();
		
		F1Cars.add("W11 AMG Petronous EQ Performance");
		F1Cars.add("RB 16B");
		F1Cars.add("SF2002");
		F1Cars.add("McLaren MP 4/4");
		
		ArrayList<String> HyperCars = new ArrayList();
		
		HyperCars.add("Mercedes AMG One");
		HyperCars.add("Aston Martin Valkyrie");
		HyperCars.add("Pagani Utopia");
		
		Cars.add(HyperCars);
		Cars.add(MuscleCars);
		Cars.add(F1Cars);
		
		
		System.out.println("Simple Array List: ");
		System.out.println(HyperCars);
		
		System.out.println("----------------------------------------------------------");
		
		System.out.println("2D ArrayList: ");
		System.out.println(Cars);
		
		System.out.println("----------------------------------------------------------");	
		
		System.out.println("Getting Simple ArrayList from 2D ArrayList: ");
		System.out.println(Cars.get(1));
		
		System.out.println("----------------------------------------------------------");
		
		System.out.println("Getting from 2D ArrayList: ");
		System.out.println(Cars.get(2).get(0));
		
		
	}

}
