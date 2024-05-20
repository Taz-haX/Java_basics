import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
//		double x = 4.20;
//		double y = 6.90;
//		
//		double z = Math.max(x,y);
//		double t = Math.min(x,y);
//		double p = Math.sqrt(x);
//		double r = Math.round(y);
//		double q = Math.ceil(x);
//		double s = Math.floor(y);
//		
//		
//		System.out.println(z);
//		System.out.println(t);
//		System.out.println(p);
//		System.out.println(r);
//
//		System.out.println(q);
//		System.out.println(s);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entah Perpendicular: ");
		int p = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Entah Base: ");
		int q = scanner.nextInt();
		
		double r = Math.sqrt((p*p) + (q*q));
		
		System.out.println("Them Hypotenuse: \n"+r);
		
		
		


				
	}

}