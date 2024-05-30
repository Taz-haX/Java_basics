import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String name = "";
		
		while (name.isBlank()) {
			
			System.out.println("ENter yo bloody name ples: ");
			name = scanner.nextLine();
		}
		
		System.out.println("Well, hello "+name);
		
	}

}