import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Day Check. Entah code: ");
		
		String day = scanner.nextLine();
		
		switch(day) {
		
		case "Sunday": System.out.println("Yeyy its be Sunday");
		break;
		case "Monday": System.out.println("Yeyy its be Monday");
		break;
		case "Tuesday": System.out.println("Yeyy its be Tuesday");
		break;
		case "Wednesday": System.out.println("Yeyy its be Wednesday");
		break;
		case "Thursday": System.out.println("Yeyy its be Thursday");
		break;
		case "Friday": System.out.println("Yeyy its be Friday");
		break;
		case "Saturday": System.out.println("Yeyy its be Saturday");
		break;
		default: System.out.println("Okay intellectual");
		
		}
		
		
	}

}
