import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Entah a anumbah: ");
		int value = scanner.nextInt();
		
		if (value>=80) {
			
			System.out.println("Dam. Hight stuff");
		}
		
		else if (value>70 && value<80) {
			System.out.println("Dam not that great");
		}
		
		else {
			
			System.out.println("Lmfao. whad manh.");
			
		}
		
		
		scanner.nextLine();
		
		
		System.out.println("WHat the next word: \nCOntinue or nah?(PRess y or Y)--");
		String dec = scanner.nextLine();
		
		if (dec.equals("y")||dec.equals("Y")) {
			
			System.out.println("REally lifeless. Ain't yah.");
		}
		
		else {
			System.out.println("Not a great decision really.");
		}
		
		
		System.out.println("Seriously, please quit.");
		String ples = scanner.nextLine();
		
		if (!ples.equals("y")&&!ples.equals("Y")) {
			
			System.out.println("Hah. Gotcha biss");
		}
		
		else {
			System.out.println("oh BROTHER!");
		}
		
	}

}